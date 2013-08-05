CC=clang
LIBNAME=lol.so
CFLAGS=-Wall
TESTER=tester

all: runtime tests
	
runtime:
	$(CC) $(CFLAGS) -fPIC -shared -o $(LIBNAME) runtime.c

tests:
	$(CC) $(CFLAGS) $(LIBNAME) -o $(TESTER) test_runtime.c

clean:
	rm $(LIBNAME) $(TESTER)
