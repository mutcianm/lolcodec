#include"runtime.h"

#define CAST_NOCAST 0
#define CAST_EXPAND 1
#define CAST_FAIL   2

char* strtype(int type){
    switch (type){
        case INT:
            return "INT";
        case FLOAT:
            return "FLOAT";
        case BOOL:
            return "BOOL";
        case STRING:
            return "STRING";
        case VOID:
            return "VOID";
        default:
            return "UNDEF";
    }
}

void visible(struct lolvariable* var){
    if(var->type == UNDEF) error(ERR_UNDEF_VAR, 0, "variable value id undefined\n");
    switch (var->type){
        case INT:
            printf("%d\n", var->value.intval);
            break;
        case FLOAT:
            printf("%f\n", var->value.floatval);
            break;
        case BOOL:
            if(var->value.boolval > 0)
                printf("WIN\n");
            else
                printf("FAIL\n");
            break;
        case STRING:
            printf("%s\n", var->value.strval);
            break;
        case VOID:
            printf("NOOB\n");
            break;
        default:
            error(ERR_UNEXPECTED_TYPE, 0, "unexpected type %d\n", var->type);
    }
}

/**
 * Casting rules:
 * (INT|FLOAT) op (INT|FLOAT) -> FLOAT
 * (BOOL|INT)  op (BOOL|INT)  -> INT
 */
int try_cast(struct lolvariable* lhs, struct lolvariable* rhs){
    if(lhs->type == rhs->type) return CAST_NOCAST;
    if(lhs->type == FLOAT && rhs->type == INT){
        rhs->type = FLOAT;
        rhs->value.floatval = (float)rhs->value.intval;
        return CAST_EXPAND;
    }
    if(lhs->type == INT && rhs->type == FLOAT){
        lhs->type = FLOAT;
        lhs->value.floatval = (float)lhs->value.intval;
        return CAST_EXPAND;
    }
    return CAST_FAIL;
}

void sum(struct lolvariable* result, struct lolvariable* lhs, struct lolvariable* rhs){
    if(try_cast(lhs, rhs) == CAST_FAIL) 
        error(ERR_BADCAST, 0, "cannot cast from %s to %s in runtime\n", strtype(lhs->type), strtype(rhs->type));
    switch (lhs->type){
        case INT:
            result->type = INT;
            result->value.intval = lhs->value.intval + rhs->value.intval;
            break;
        case STRING:
            result->type = STRING;
            result->value.strval = (char*)malloc(strlen(lhs->value.strval)+strlen(rhs->value.strval)+1);
            bzero(result->value.strval, strlen(result->value.strval));
            strcat(result->value.strval, lhs->value.strval);
            strcat(result->value.strval, rhs->value.strval);
            break;
        case FLOAT:
            result->type = FLOAT;
            result->value.floatval = lhs->value.floatval + rhs->value.floatval;
            break;
        case BOOL:
            result->type = BOOL;
            result->value.boolval = lhs->value.boolval | rhs->value.boolval;
            break;
        default:
            error(ERR_BAD_OP, 0, "sum cannot be applied to %s and %s in runtime", strtype(lhs->type), strtype(rhs->type));
    }
}
