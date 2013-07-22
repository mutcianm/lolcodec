BTW no arguments
HOW DUZ I func1
    VISIBLE "func1"
    GTFO
IF U SAY SO

BTW one argument
HOW DUZ I func2 YR VAR1
    VISIBLE VAR1
    GTFO
IF U SAY SO

BTW more than one argument
HOW DUZ I func3 YR VAR1 N YR VAR2
    VISIBLE SUM OF VAR1 AN VAR2
    GTFO
IF U SAY SO

HAI
    I HAS A VAR1
    BTW I HAS A VAR1
    func1
    func2 "test"
    func3 123 321
    BTW complicated calls
    func2 SUM OF 123 AN 321
    func3 SUM OF 123 AN 321 BOTH OF BOTH SAEM "TRUE" AN "TRUE" AN DIFFRINT "THIS" AN "THAT"
    BTW func4 "this should fail"
    BTW func2 VAR8
    BTW func2 VAR1 323 "this should fail"
KTHXBYE