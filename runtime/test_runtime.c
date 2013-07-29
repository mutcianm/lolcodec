#include"runtime.h"

int main(int argc, char** argv){
    struct lolvariable var1;
    var1.type = INT;
    var1.value.intval = 128;
    visible(&var1);
    var1.type = UNDEF;
    visible(&var1);
    return 0;
}
