grammar SCPN ;

@header {
//N.B. Package is set in the build.gradle file

// DO NOT EDIT THIS .java FILE DIRECTLY, it will be overwritten! Edit the SCPN.g4 file only.

/*import gpal.*;
import gpal.parsers.ast.*;
import gpal.parsers.expr.*;
import java.util.*;*/
}

expressions :	(expression COLON? )*
			;

expression : inputInscription | outputInscription | mathematicalExpression | mathematicalExpression
		   ;	// TODO
placeRef
: HASH? subTransName* moduleName? placeName=IDENTIFIER
;

subTransName : IDENTIFIER LBRACK RBRACK DOT
			 ;

moduleName : IDENTIFIER DOT
		   ;

constant : numericalConstant |
		 | STRING_LITERAL
		 | DATETIME_LITERAL
		 | BOOLEAN_LITERAL
		 | NULL_LITERAL ;
		 
numericalConstant : INTEGER_LITERAL | DECIMAL_LITERAL;

mathematicalExpression : numericalConstant | 
mathematicalExpression (STAR|DIV) mathematicalExpression |
mathematicalExpression (PLUS|MINUS) mathematicalExpression;

inputInscription : IDENTIFIER | multiplicity=INTEGER_LITERAL APO IDENTIFIER | DECIMAL_LITERAL APO IDENTIFIER
				 ;

outputInscription : inputInscription
				  | (multiplicity=DECIMAL_LITERAL APO )? tokenCopy
				  | tokenNew
				  | tokenExtract	// |
				  ;

tokenTransfer
:
    tokenName=IDENTIFIER	( LPAREN attributeAssignList RPAREN )?
;

attributeAssignList
: attributeAssignment SEMI*
;

attributeAssignment :
    attr=IDENTIFIER ASSIGN tokenDescription
					;

tokenDescription : expression LCURLY attributeAssignment? RCURLY
				 ;

timeFunction :	(EXP | DET | UNI | DUNI | TRIANG | NORM | LONGNORM |WEI ) LPAREN expression RPAREN
			 ;

tokenCopy
: COPY tokenname=IDENTIFIER (LPAREN attributeAssignList RPAREN )?
;

tokenNew : NEW LPAREN tokenDescription RPAREN
		 ;

tokenExtract : EXTRACT tr=tokenReference
			 ;

tokenReference :
    tokenName=IDENTIFIER
			   ;

tokenAttributeReference : tokenReference DOT tokenAttribute=IDENTIFIER
						;

// TimeNET specific keywords
NOW		: 'now'		| 'NOW'	 ;
HASH	: '#'				 ;
APO		: '\''				 ;
COPY	: 'copy'	| 'COPY' ;
NEW		: 'new'		| 'NEW'	 ;
EXTRACT : 'extract' | 'EXTRACT'
							 ;

// Time functions distributions
// n.b. Currently, "exp" would not work on TimeNET, as that would get parsed to a variable.
// if it starts with a capital letter, it works.
EXP			: 'EXP' | 'Exp' ;
DET			: 'DET' | 'Det' ;
UNI			: 'UNI' ;
DUNI		: 'DUNI'	  | 'DUni'	 ;
TRIANG		: 'TRIANG'	  | 'Triang' ;
NORM		: 'NORM'	  | 'Norm'	 ;
LONGNORM	: 'LONGNORM' | 'Longnorm' | 'LongNorm' ;
WEI			: 'WEI' | 'Wei' ;

QUESTION	: '?' ;

// OPERATORS
COLON : ':'			  ;
ASSIGN : '='		  ;
EQUAL : '=='		  ;
LNOT : '!'			  ;
BNOT : '~'			  ;
NOT_EQUAL	 : '!='	  ;
DIV	: '/'			  ;
DIV_ASSIGN	 : '/='	  ;
PLUS : '+'			  ;
PLUS_ASSIGN	 : '+='	  ;
INC	: '++'			  ;
MINUS : '-'			  ;
MINUS_ASSIGN : '-='	  ;
DEC	: '--'			  ;
STAR : '*'			  ;
STAR_ASSIGN	 : '*='	  ;
MOD	: '%'			  ;
MOD_ASSIGN	 : '%='	  ;
SR : '>>'			  ;
SR_ASSIGN	 : '>>='  ;
BSR	: '>>>'			  ;
BSR_ASSIGN	 : '>>>=' ;
GE : '>='			  ;
GT : '>'			  ;
SL : '<<'			  ;
SL_ASSIGN	 : '<<='  ;
LE : '<='			  ;
LT : '<'			  ;
BXOR : '^'			  ;
BXOR_ASSIGN	 : '^='	  ;
BOR	: '|'			  ;
BOR_ASSIGN	 : '|='	  ;
LOR	: '||'			  ;
BAND : '&'			  ;
BAND_ASSIGN	 : '&='	  ;
LAND : '&&'			  ;

NULL_LITERAL :	('null' |'NULL' )
			 ;

// Separators
LPAREN : '(' ;
RPAREN : ')' ;
LCURLY : '{' ;
RCURLY : '}' ;
LBRACK : '[' ;
RBRACK : ']' ;
SEMI   : ';' ;
COMMA  : ',' ;
DOT	   : '.' ;
DOLLAR : '$' ;

IDENTIFIER :   [a-zA-Z_] [a-zA-Z_0-9]*
		   ;

// A parameter name
PARNAME	: DOLLAR IDENTIFIER ;

INTEGER_LITERAL
	:	'0'
	|   NON_ZERO_DIGIT	( DIGIT+ )?
	;

DECIMAL_LITERAL
	:	'0.0'
	| DIGIT+ DOT DIGIT+
	;

fragment
DIGIT
	:	'0'
	| NON_ZERO_DIGIT
	;

fragment
NON_ZERO_DIGIT
	:   [1-9]
	;

/** 
 * An attribute of the simulation's DateTime class. The supported string's format should be "hh:mm:ss@mm/dd/yyyy",
 * where the part before the '@' is the time, the one after it the date. valid values: for time:
 * hh : 00 - 23 mm : 00 - 59 ss : 00 - 59 for date: mm : 01 - 12 dd : 01 - 31 yyyy : 0000 - 9999
 */
DATETIME_LITERAL : TIME '@' MDA_DATE
				 ;

fragment MONTHS
: (	('0'[1-9] ) | ('1'[0-2]	) )	;
fragment DAYS
: (	('0'[1-9] ) | ([12][0-9] ) | ('3'[01] )	) ;
fragment YEARS	:   [0-9] [0-9] [0-9] [0-9] ;

fragment MDA_DATE : MONTHS '/' DAYS '/' YEARS
				  ;

fragment TIME	: HOURS ':' MINUTES ':' SECONDS ;

fragment
HOURS
: (	([01][0-9] ) | ('2'[0-3] ) ) ;

fragment
MINUTES :   [0-5] [0-9] ;

fragment SECONDS	:   [0-5] [0-9] ;

STRING_LITERAL	: '"' (ESC |~ ('"' |'\\' ) )* '"' ;

fragment
ESC
	:	'\\'
		(   'n'
		|   'r'
		|   't'
		|   'b'
		|   'f'
		|   '"'
		|   '\''
		|   '\\'
		)
	;

BOOLEAN_LITERAL
	:	TRUE
	|	FALSE
	;

fragment TRUE	: 'true' ;
fragment FALSE	: 'false'
						 ;


// Whitespace and comments

// NL : '\r'? '\n' ;

WS
	:  [ \t\r\n\u000C]+ -> skip
	;

COMMENT
	:   '/*' .*? '*/' -> skip
	;