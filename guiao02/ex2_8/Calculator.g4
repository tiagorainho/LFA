grammar Calculator;

program: stat* EOF;

stat:
	expr? ';' NEWLINE			# StatExpr
	| assignment? ';' NEWLINE	# StatAssign
	| print? ';' NEWLINE		# StatPrint;

print: 'print ' expr;

assignment: expr '->' VAR;

expr:
	sig = ('-' | '+') expr				# ExprSig
	| expr op = ('*' | ':' | '%') expr	# ExprMultiDivMod
	| expr op = ('+' | '-') expr		# ExprAddSub
	| frac								# ExprFraction
	| '(' base = expr ')^' power = expr	# ExprPowers
	| Value								# ExprInteger
	| VAR								# ExprVar
	| '(' expr ')'						# ExprParent
	| 'reduce ' expr					# ExprReduce;

frac: value1 = Value op = '/' value2 = Value;
VAR: [a-zA-Z_]+;
Value: [0-9]+;
NEWLINE: '\r'? '\n';
WS: [ \t]+ -> skip;
COMMENT: '#' .*? '\n' -> skip;