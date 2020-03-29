grammar QuestionGenerator;

program: stat* EOF;

stat:
	COMMENT? NEWLINE			# StatComment
	| questionBlock? NEWLINE	# StatQuestion;

questionBlock: header '{' body '}';
header: questionName = String questionStat;
questionStat: '("' question '")';
body: (answear)+;
question: String;
answear: '"' String '"' ':' Integer ';';

Integer: [0-9]+;
String: [a-zA-Z_0-9. ]+;
NEWLINE: '\r'? '\n';
WS: [ \t]+ -> skip;
COMMENT: '#' .*? '\n' -> skip;