#ifndef LOL_RUNTIME_H
#define LOL_UNTIME_H

#include<stdio.h>
#include<string.h>
#include<stdlib.h>
#include<error.h>

#define ERR_UNDEF_VAR       1
#define ERR_UNEXPECTED_TYPE 2
#define ERR_BADCAST         3
#define ERR_BAD_OP          4

enum lType{INT, FLOAT, BOOL, STRING, VOID, UNDEF};
struct lolvariable{
    enum lType type;
    union value{
        int intval;
        float floatval;
        char boolval;
        char* strval;
    } value;
};

void visible(struct lolvariable* var);

#endif
