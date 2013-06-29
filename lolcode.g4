/*
lolcode grammar with some extra thigs (deleted ofc) :D
function are declared inb4 everything else
because this is how i rule (tbh it's because i didn't have enough reasoning to do otherwise (tbch it just didn't work and i said fuck it)
no typecast included because fuck this too, can add later....maybe.....not
not sure about order of expr but i hope its fine
loops are funny, as in funny becauuse of syntax, not because they don't work....i hope
i hope nobody cares anouut "CAN HAS STDIO" shit because it actually never worked (AND NEVER WILL >:() )
The Defenitive ANTLR 4 Reference is DA BOOK
SERIALLY READ DAT SHIT
*/

grammar lolcode;

@header {
package com.lolcode;
}

file: (functionDecl)* main;

main: 'HAI' ENDST stat* 'KTHXBYE' ;

varDecl
    :   'I HAS A' ID ('ITZ' expr)? ENDST
    ;

functionDecl
    :   'HOW DUZ I' ID formalParameters? ENDST block 'IF U SAY SO' ENDST
    ;

formalParameters
    :   'YR' formalParameter ('N YR' formalParameter)*
    ;

formalParameter
    : type ID
    ;

type : 'YARN' | 'NUMBR' | 'NUMBAR' | 'TROOF' ;

block
    :   stat*
    ;

stat:   varDecl
    |   ifstat
    |   casestat
    |   loopstat
    |   assstat
    |   funcall
    |   visstat
    ;

ifstat
    :   expr ENDST 'ORLY' ENDST 'YRLY' ENDST stat ('MEBBE' expr ENDST stat)* ('NOWAI' ENDST stat)? 'OIC' ENDST
    ;

casestat
    :   expr ENDST 'WTF?' ENDST ('OMG' VALUE ENDST block ('GTFO' ENDST)?)* ('OMGWTF' ENDST block ('GTFO' ENDST)?)? 'OIC' ENDST
    ;

loopstat
    :   'IM IN YR' ID (('UPPIN' | 'NERFIN') 'YR' ID ('WILE'|'TIL') expr)? ENDST block ('GTFO' ENDST)? 'IM OUTTA YR' ID ENDST
    ;

assstat
    :   expr 'R' expr ENDST
    ;

funcall
    :   expr //fun call somehow, not sure wtf
    ;

visstat 
    :   'VISIBLE' expr ENDST
    ;

expr
    :   funexpr
    |   notexpr
    |   multexpr
    |   modexpr
    |   addexpr
    |   minmaxexpr
    |   bothofexpr
    |   eitherexpr
    |   oneofexpr
    |   equexpr
    |   ID
    |   VALUE
    ;

funexpr
    :   ID exprList? ENDST
    ;

notexpr
    :   'NOT' expr
    ;

multexpr
    :   ('PRODUKT OF' expr 'AN' expr | 'QUOSHUNT OF' expr 'AN' expr)
    ;

modexpr
    :   'MOD OF' expr 'AN' expr 
    ;

addexpr
    :   ('SUM OF' expr 'AN' expr | 'DIFF OF' expr 'AN' expr )
    ;

minmaxexpr
    :   ('BIGGR OF' expr 'AN' expr | 'SMALLR OF' expr 'AN' expr)
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
    :   ('BOTH SAEM' expr 'AN' expr | 'DIFFRINT' expr 'AN' expr )
    ;

exprList
    :   expr ('AN' expr)*;

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

ID : LETTER ( LETTER | [0-9_] )*;
fragment
LETTER : [a-zA-Z] ;

VALUE
    :   INT
    |   STRING
    |   FLOAT
    |   BOOL
    ;

INT : ('-')?[0-9]+ ;

STRING : '"' [\u0000-\u0021\u0023-\uFFFE]* '"';

FLOAT : (-)? [0-9]? '.' [0-9]+ ('f'|'F')? ;

BOOL : 'WIN' | 'FAIL' ;

ENDST
    :   '\n'+
    |   '\r\n'+
    |   ','
    ;

WS  :   [ \t]+ -> skip ;

SL_COMMENT
    :   'BTW' .*? '\n' -> skip
    ;