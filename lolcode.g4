/*
    final draft for lolcode grammar
    array specification in 1.2 can't be found http://web.archive.org/web/20120908173209/http://lolcode.com/specs/1.2#arrays
*/

grammar lolcode;

@header {
package com.lolcode;
}

//functions must be declared inb4 main code
file:   (functionDecl)* main;

//main after function declarations
main: 'HAI' ENDST stat* 'KTHXBYE' ;

//var declaration, with assignment
varDecl
    :   'I HAS A' ID ('ITZ' expr)? ENDST
    ;


//declaring function
functionDecl
    :   'HOW DUZ I' ID formalParameters? ENDST block 'IF U SAY SO' ENDST
    ;

arrayDecl
    : 'I HAS A BOX' ID ENDST
    ;

arrayGet
    : 'TAKE FROM' ID 'LABELED' expr ENDST
    ;

arrayPut
    : PUT expr IN ID NLABEL expr ENDST
    ;

//function params
formalParameters
    :   'YR' formalParameter ('N YR' formalParameter)*
    ;

//1.2 don't has types
formalParameter
    :   ID
    //: type ID
    ;

//useless thingy
//type : 'YARN' | 'NUMBR' | 'NUMBAR' | 'TROOF' ;

//code block
block
    :   stat*
    ;

stat:   varDecl
    |   arrayDecl
    |   ifstat
    |   casestat
    |   loopstat
    |   assstat
    |   retpart
    |   visstat
    |   gimstat
    |   dummystmt
    ;

dummystmt
    :   expr ENDST
    ;

//if statement
ifstat
    :   expr ENDST 'ORLY' ENDST 'YRLY' ENDST block (MEBBE expr ENDST block)* (NOWAI ENDST block)? 'OIC' ENDST
    ;


//case statement
casestat
    :   expr ENDST 'WTF?' ENDST caseblock* (OMGWTF ENDST block)? 'OIC' ENDST
    ;

caseblock
    : OMG value ENDST block? ENDST?
    ;

//loop statement
loopstat
    :   'IM IN YR' ID ((UPPIN | NERFIN) 'YR' ID (WHILE|TIL) expr)? ENDST block 'IM OUTTA YR' ID ENDST
    ;

//assignment statement
//lhs cannot be expression ie. (SUM OF VAR1 AN VAR2 R 256) or (MOD OF 128 AN 4 R VAR1\<ENDST\>)
assstat
    :   ID 'R' expr ENDST
    ;


//visible (print)
visstat 
    :   'VISIBLE' expr ENDST
    ;

//gimme (scan) some strange things possible here
gimstat
    :   'GIMMEH' ID ENDST
    ;

expr
    :   funexpr
    |   arrayGet
    |   arrayPut
    |   notexpr
    |   multexpr
    |   divexpr
    |   modexpr
    |   addexpr
    |   subexpr
    |   maxexpr
    |   minexpr
    |   bothofexpr
    |   eitherexpr
    |   oneofexpr
    |   equexpr
    |   nequexpr
    |   ID
    |   value
    ;

//function call
funexpr
    :   ID exprList? MKAY ENDST?
    ;

notexpr
    :   'NOT' expr
    ;

multexpr
    :   'PRODUKT OF' expr 'AN' expr
    ;

divexpr
    :   'QUOSHUNT OF' expr 'AN' expr
    ;

modexpr
    :   'MOD OF' expr 'AN' expr 
    ;

addexpr
    :   'SUM OF' expr 'AN' expr
    ;

subexpr
    :   'DIFF OF' expr 'AN' expr
    ;

maxexpr
    :  'BIGGR OF' expr 'AN' expr
    ;

minexpr
    :   'SMALLR OF' expr 'AN' expr
    ;

bothofexpr
    :   'BOTH OF' expr 'AN' expr
    ;

eitherexpr
    :   'EITHER OF' expr 'AN' expr
    ;

oneofexpr
    :   'ONE OF' expr 'AN' expr
    ;

equexpr
    :   'BOTH SAEM' expr 'AN' expr
    ;

nequexpr
    :   'DIFFRINT' expr 'AN' expr
    ;

//expressions are without 'AN'
exprList
    :  'YR' expr
    |  'YR' expr ('N YR' expr)*;

retpart 
    :   'FOUND YR' expr ENDST //return EXPR
    |   'GTFO' ENDST //return NOOB
    ;   //if DOESN'T EXIST RETURN IT

WTF : 'WTF?';
WRK :   'WRK';
MAEK :  'MAEK';
A : 'A';
AN : 'AN';
BIGGROF : 'BIGGR OF';
HAI : 'HAI';
KTHXBYE : 'KTHXBYE';
WHILE : 'WILE';
TIL : 'TIL';
ORLY : 'ORLY';
YARLY : 'YRLY';
MEBBE : 'MEBBE';
NOWAI : 'NOWAI';
OIC : 'OIC';
OMG : 'OMG';
OMGWTF : 'OMGWTF';
YARN : 'YARN';
NUMBR : 'NUMBR';
NUMBAR : 'NUMBAR';
TROOF : 'TROOF';
NOOB : 'NOOB';
ITZ : 'ITZ';
BOTHSAEM : 'BOTH SAEM';
DIFFRINT : 'DIFFRINT';
SMALLROF : 'SMALLR OF';
PRODUKTOF : 'PRODUKT OF';
QUOSHUNTOF : 'QUOSHUNT OF';
MODOF : 'MOD OF';
SUMOF : 'SUM OF';
DIFFOF : 'DIFF OF';
SMOOSH : 'SMOOSH';
UPPIN : 'UPPIN';
NERFIN : 'NERFIN';
IMINYR : 'IM IN YR';
IMOUTTAYR : 'IM OUTTA YR';
ANYOF : 'ANY OF';
ONEOF : 'ONE OF';
ALLOF : 'ALL OF';
EITHEROF : 'EITHER OF';
BOTHOF : 'BOTH OF';
NOT : 'NOT';
GTFO : 'GTFO';
YR : 'YR';
NYR : 'N YR';
HOWDUZ : 'HOW DUZ I';
IFUSAY : 'IF U SAY SO';
R : 'R';
IHAS : 'I HAS A';
MKAY : 'MKAY';
VISIBLE : 'VISIBLE';
GIMMEH : 'GIMMEH';
FOUNDYR : 'FOUND YR';
PUT : 'PUT';
IN : 'IN';
NLABEL : 'N LABEL AS';

value
    :   INT 
    |   STRING
    |   FLOAT
    |   BOOL
    ;

INT : ('-')?[0-9]+  ;

STRING : '"' [\u0000-\u0021\u0023-\uFFFE]* '"';

FLOAT : ('-')? [0-9]* '.' [0-9]+ ('f'|'F')? ;

BOOL : 'WIN' | 'FAIL' ;

ID : LETTER ( LETTER | [0-9_] )*;
fragment
LETTER : [a-zA-Z] ;

ENDST
    :   '\n'+
    |   '\r\n'+
    |   ','
    ;

WS  :   [ \t]+ -> skip ;

SL_COMMENT
    :   'BTW' .*? '\n' -> skip
    ;