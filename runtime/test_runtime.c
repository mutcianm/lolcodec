#include"runtime.h"

struct lolvariable* f(int a, struct lolvariable* var){
    visible(var);
    /*int bsdsd;*/
    return var;
}
int main(int argc, char** argv){
    struct lolvariable var1;
    var1.type = INT;
    var1.value.intval = 128;
    sum(&var1, &var1, &var1);
    visible(&var1);
    var1.type = UNDEF;
    visible(&var1);
    return 0;
}
