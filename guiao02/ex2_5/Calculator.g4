grammar Calculator;

program: stat* EOF;

stat:
	expr? NEWLINE			# StatExpr
	| assignment? NEWLINE	# StatAssign;

assignment: VAR '=' expr;

expr:
	sig = ('-' | '+') expr				# ExprSig
	| expr op = ('*' | '/' | '%') expr	# ExprMultiDivMod
	| expr op = ('+' | '-') expr		# ExprAddSub
	| Integer							# ExprInteger
	| VAR								# ExprVar
	| '(' expr ')'						# ExprParent;

VAR: [a-zA-Z_]+;
Integer: [0-9]+;
NEWLINE: '\r'? '\n';
WS: [ \t]+ -> skip;
COMMENT: '#' .*? '\n' -> skip;