grammar QuestionGenerator;

program: stat* EOF;

stat: questionBlock? NEWLINE;

questionBlock: header '{\n' body '}';
header: questionName = ID questionStat;
questionStat: '(' question ')';
body: answear+;
question: String;
answear: String ':' Integer ';\n';

Integer: [0-9]+;
ID: [a-zA-Z._0-9]+;
String: '"' (ESC | .)+? '"';
fragment ESC: '//"' | '////';
NEWLINE: '\r'? '\n';
WS: [ \t]+ -> skip;
COMMENT: '#' .*? '\n' -> skip;