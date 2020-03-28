grammar SuffixCalculator; // definir a gramatica

program: stat* EOF; // zero ou mais repetições de stat

stat: expr? NEWLINE; //expressão escolhivel

expr:
	expr expr op = ('*' | '/' | '+' | '-')	# ExprSuffix
	| Number								# ExprNumber;

Number: [0-9]+ ('.' [0-9]+)?;
NEWLINE: '\r'? '\n';
WS: [ \t]+ -> skip;
