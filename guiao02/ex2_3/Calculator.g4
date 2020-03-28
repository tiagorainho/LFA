grammar Calculator;

program: stat* EOF;

stat: expr? NEWLINE;

expr:
	expr op = ('*' | '/' | '%') expr	# ExprMultiDivMod
	| expr op = ('+' | '-') expr		# ExprAddSub
	| sig = Integer						# ExprInteger
	| sig = '-' Integer					# ExprIntegerMinus
	| sig = '+' Integer					# ExprIntegerPlus
	| '(' expr ')'						# ExprParent;

Integer: [0-9]+;
NEWLINE: '\r'? '\n';
WS: [ \t]+ -> skip;
COMMENT: '#' .*? '\n' -> skip;