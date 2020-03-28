grammar Hello;

main: top+;

top: greetings|bye
greetings: HELLO ID;

bye: BYE ID;

BYE: 'bye';
HELLO: 'hello';
ID: [a-zA-Z]+;
WS: [ \n\t\r]+ -> skip;