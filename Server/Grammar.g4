grammar Grammar; 


options {
  tokenVocab = Lex;
}

@header {
    import "Server/Interfaces"
    import "Server/Environment"
    import "Server/Expression"
    import "Server/Instruction"
    import "strings"
}


s returns [[]interface{} code]
: block EOF {$code = $block.blk}
;

block returns [[]interface{} blk]
@init{
$blk = []interface{}{}
    var listInt []IInstructionContext
  }
: ins+=instruction+
    {
        listInt = localctx.(*BlockContext).GetIns()
        for _, e := range listInt {
            $blk = append($blk, e.GetInst())
            
        }
    }
;

instruction returns [interfaces.Instruction inst]
: printstmt { $inst = $printstmt.prnt}
| declarestmt {$inst = $declarestmt.dec}
| constantstmt {$inst = $constantstmt.const}
| assignationstmt {$inst = $assignationstmt.assign}
| increaseanddecreasestmt {$inst = $increaseanddecreasestmt.increasedecrease}
| ifstmt { $inst = $ifstmt.ift }
| whilestmt {$inst = $whilestmt.while}
| forstmt {$inst = $forstmt.for}
| switchstmt {$inst = $switchstmt.switch}
| guardstmt {$inst = $guardstmt.gua}
| transferstmt {$inst = $transferstmt.tran}
| declarevectorstmt {$inst = $declarevectorstmt.decvec}
| appendstmt    {$inst = $appendstmt.app}
| removelaststmt {$inst = $removelaststmt.removl}
| removestmt {$inst = $removestmt.remov}
| assignationvecstmt {$inst = $assignationvecstmt.assignvec}
| declarefuncstmt {$inst = $declarefuncstmt.decfunc}
| accessfuncinstruction {$inst = $accessfuncinstruction.accessfuncin}
| declarestructstmt     {$inst = $declarestructstmt.decstruct }
| assignationstructstmt {$inst = $assignationstructstmt.assignstruct}
;

printstmt returns [interfaces.Instruction prnt]
: PRINT PARIZQ listParams PARDER PTCOMA? { $prnt = instructions.NewPrint($PRINT.line, $PRINT.pos, $listParams.l)}
;
//declaracion de variables
//lin int, col int, id_var string, type_var environment.TipoExpresion, valor interfaces.Expression, constant bool
declarestmt returns [interfaces.Instruction dec]
: VAR ID DOUBLEPTS type IG expr PTCOMA? {$dec = instructions.NewTodeclare($VAR.line, $VAR.pos, $ID.text, $type.t, $expr.e, false)}//declaracion con tipo y valor
| VAR ID IG expr PTCOMA? {$dec = instructions.NewTodeclare($VAR.line, $VAR.pos, $ID.text, environment.NULL, $expr.e, false)}//declaracion con valor
| VAR ID DOUBLEPTS type QUESTION PTCOMA? {$dec = instructions.NewTodeclare($VAR.line, $VAR.pos, $ID.text, $type.t, nil, false)}//declaracion con tipo y sin valor
;
//declaracion de constantes
constantstmt returns [interfaces.Instruction const]
: LET ID DOUBLEPTS type IG expr PTCOMA? {$const = instructions.NewTodeclare($LET.line, $LET.pos, $ID.text, $type.t, $expr.e, true)} //declaracion con tipo y valor
| LET ID IG expr PTCOMA? {$const = instructions.NewTodeclare($LET.line, $LET.pos, $ID.text, environment.NULL, $expr.e, true)}//declaracion con valor
;

//(lin, col, exp_conditional, sentence, sentence else)

blockelifs returns [[]interface{} blkef]
@init{
$blkef = []interface{}{}
    var listifs []IIfstmtContext
    
  }
: elif+=ifstmt+

    {   
        listifs = localctx.(*BlockelifsContext).GetElif()
        for _, a := range listifs {
            $blkef = append($blkef, a.GetIft())
            
        }
    }
;

ifstmt  returns [interfaces.Instruction ift, []interface{} el, interfaces.Instruction else]
: IF expr  LLAVEIZQ ifb=block LLAVEDER { $ift = instructions.NewIf($IF.line, $IF.pos, $expr.e, $ifb.blk, nil); 
                                        $el = $ifb.blk}
| IF expr  LLAVEIZQ ifelseblck=block LLAVEDER ELSE LLAVEIZQ elseifblck=block LLAVEDER { $ift = instructions.NewIf($IF.line, $IF.pos, $expr.e, $ifelseblck.blk, $elseifblck.blk); 
                                                                                        $el = $ifelseblck.blk;
                                                                                        
                                                                                        }
| IF expr  LLAVEIZQ elif=block LLAVEDER ELSE  blockelifs { $ift = instructions.NewIf($IF.line, $IF.pos, $expr.e, $elif.blk, $blockelifs.blkef); }
;
/* 
ifstmt returns [interfaces.Instruction ift]
@init{
    var elif []interface{}
    var listElif []IElseifstmtContext
}
: IF expr LLAVEIZQ block LLAVEDER e+=elseifstmt* elsestmt
    {   
        
        listElif = localctx.(*IfstmtContext).GetE()
        for _, e := range listElif {
            elif = append(elif, e.GetElif())
            
        }
        $ift = instructions.NewIf($IF.line, $IF.pos, $expr.e, $block.blk, elif, $elsestmt.blkelse)
    }

;
elseifstmt returns [interfaces.Instruction elif]
@init{
    var elif, condelse []interface{}
}
: ELSE IF expr LLAVEIZQ block LLAVEDER {
    $elif = instructions.NewIf($ELSE.line, $ELSE.pos, $expr.e, $block.blk, elif, condelse); 
}
;

elsestmt returns [[]interface{} blkelse]
@init{
    var arr []interface{}
}
: ELSE LLAVEIZQ block LLAVEDER {$blkelse = $block.blk}
| {
    
    $blkelse = arr}
;*/


//lin int, col int, expc interfaces.Expression, exp interfaces.Expression,senten []interface{}, senten_deafult []interface{}
switchstmt returns [interfaces.Instruction switch]
: SWITCH expr LLAVEIZQ DEFAULT DOUBLEPTS block LLAVEDER { $switch = instructions.NewSwitch($SWITCH.line, $SWITCH.pos, $expr.e, nil,  nil, $block.blk);}
| SWITCH expr LLAVEIZQ  casestmt LLAVEDER  {$switch = instructions.NewSwitch($SWITCH.line, $SWITCH.pos, $expr.e, nil, $casestmt.cas, nil);}
;
casestmt returns [interfaces.Instruction cas]
: CASE expr DOUBLEPTS block blockcases { $cas = instructions.NewCase($CASE.line,$CASE.pos, $expr.e,$block.blk, $blockcases.blkcase)
                                }
| CASE expr DOUBLEPTS sen=block DEFAULT DOUBLEPTS def=block  { $cas = instructions.NewCase($CASE.line,$CASE.pos, $expr.e,$sen.blk, $def.blk)}
;
blockcases returns [[]interface{} blkcase]
@init{
    $blkcase = []interface{}{}
    var listcases []ICasestmtContext
  }
: casedef+=casestmt+
    {
        listcases = localctx.(*BlockcasesContext).GetCasedef()
        for _, a := range listcases {
            $blkcase = append($blkcase, a.GetCas())
      
        }
    }
;


assignationstmt returns [interfaces.Instruction assign]
: ID IG expr PTCOMA? {$assign = instructions.NewAssignation($ID.line, $ID.pos,  $ID.text, $expr.e)}
;

assignationstructstmt returns [interfaces.Instruction assignstruct]
: ID POINT second=ID IG expr PTCOMA? {$assignstruct = instructions.NewAssignationStruct($ID.line, $ID.pos, $ID.text, $second.text, $expr.e)}
;

whilestmt returns [interfaces.Instruction while]
: WHILE expr LLAVEIZQ block LLAVEDER {$while = instructions.NewWhile($WHILE.line, $WHILE.pos,  $expr.e, $block.blk)}
;

forstmt returns [interfaces.Instruction for]
: FOR ID IN  expr LLAVEIZQ block LLAVEDER {$for = instructions.NewFor($FOR.line, $FOR.pos, $ID.text, $expr.e, nil, $block.blk)}
| FOR ID IN first=expr POINT POINT second=expr LLAVEIZQ block LLAVEDER {$for = instructions.NewFor($FOR.line, $FOR.pos, $ID.text, $first.e, $second.e, $block.blk)}
;



guardstmt returns [interfaces.Instruction gua]
: GUARD expr ELSE LLAVEIZQ block LLAVEDER {$gua = instructions.NewGuard($GUARD.line, $GUARD.pos, $expr.e, $block.blk)}
; 

transferstmt returns [interfaces.Instruction tran]
: RETURN PTCOMA? {$tran = instructions.NewReturnIn($RETURN.line, $RETURN.pos, nil)}
| RETURN expr PTCOMA? {$tran = instructions.NewReturnIn($RETURN.line, $RETURN.pos, $expr.e)}
| CONTINUE PTCOMA? {$tran = instructions.NewContinue($CONTINUE.line, $CONTINUE.pos)}
| BREAK PTCOMA? {$tran = instructions.NewBreak($BREAK.line, $BREAK.pos)}
;
//-----------------VECTORES-----------------------------
declarevectorstmt returns [interfaces.Instruction decvec]
: VAR ID DOUBLEPTS CORCHETEIZQ type CORCHETEDER IG CORCHETEIZQ listParams CORCHETEDER PTCOMA? {$decvec = instructions.NewToDeclareVector($VAR.line, $VAR.pos, $ID.text, $type.t, $listParams.l, "")}
| VAR ID DOUBLEPTS CORCHETEIZQ type CORCHETEDER IG CORCHETEIZQ CORCHETEDER PTCOMA? {$decvec = instructions.NewToDeclareVector($VAR.line, $VAR.pos, $ID.text, $type.t, nil, "")}
| VAR ID IG CORCHETEIZQ type CORCHETEDER PARIZQ PARDER PTCOMA?//vector struct
| VAR F=ID DOUBLEPTS CORCHETEIZQ type CORCHETEDER IG S=ID PTCOMA? {$decvec = instructions.NewToDeclareVector($VAR.line, $VAR.pos, $F.text, $type.t, nil, $S.text)} //copia de vector
;

accessfuncinstruction returns [interfaces.Instruction accessfuncin]
: ID PARIZQ listParams PARDER PTCOMA {$accessfuncin = instructions.NewCallFunction($ID.line, $ID.pos, $ID.text, $listParams.l, 1)}
;

//vec1.append(100)
appendstmt returns [interfaces.Instruction app]
: ID POINT APPEND PARIZQ expr PARDER PTCOMA? {$app = instructions.NewAppend($ID.line, $ID.pos, $ID.text, $expr.e)}
;

removelaststmt returns [interfaces.Instruction removl]
: ID POINT REMOVELAST PARIZQ PARDER PTCOMA? {$removl = instructions.NewRemoveLast($ID.line, $ID.pos, $ID.text)}
;

//vec1.remove( at: 0);
removestmt returns [interfaces.Instruction remov]
: ID POINT REMOVE PARIZQ AT DOUBLEPTS expr PARDER PTCOMA? {$remov = instructions.NewRemove($ID.line, $ID.pos, $ID.text, $expr.e)}
;

emptvecstmt returns [interfaces.Expression emptyvec]
: ID POINT ISEMPTY  {$emptyvec = expressions.NewEmptyVector($ID.line, $ID.pos, $ID.text)}
;

countvecstmt returns [interfaces.Expression count]
: ID POINT COUNT {$count = expressions.NewCount($ID.line, $ID.pos, $ID.text)}
; 
 
accessvecstmt returns [interfaces.Expression accessvec]
: ID CORCHETEIZQ expr CORCHETEDER {$accessvec = expressions.NewAccessVector($ID.line, $ID.pos, $ID.text, $expr.e)}

;

assignationvecstmt returns [interfaces.Instruction assignvec]
: ID CORCHETEIZQ expprim=expr CORCHETEDER IG expsegundo=expr PTCOMA? {$assignvec = instructions.NewAssignationVector($ID.line, $ID.pos, $ID.text, $expprim.e, $expsegundo.e)}
;

//-------------------------MATRICES--------------------------------
declarematrixstmt returns [interfaces.Instruction decmatrix]
: VAR ID PARIZQ DOUBLEPTS type PARDER IG PTCOMA?
;

//-------------------------FUNCIONES-----------------------
declarefuncstmt returns [interfaces.Instruction decfunc]
: FUNC ID PARIZQ listParamsFunc PARDER SUB MAYOR type LLAVEIZQ block LLAVEDER {$decfunc = instructions.NewToDeclareFunction($ID.line, $ID.pos, $ID.text, $listParamsFunc.lf, $type.t, $block.blk, 1)}
| FUNC ID PARIZQ listParamsFunc PARDER LLAVEIZQ block LLAVEDER {
    
    $decfunc = instructions.NewToDeclareFunction($ID.line, $ID.pos, $ID.text, $listParamsFunc.lf, environment.NULL, $block.blk, 2);}
| FUNC ID PARIZQ PARDER SUB MAYOR type LLAVEIZQ block LLAVEDER {$decfunc = instructions.NewToDeclareFunction($ID.line, $ID.pos, $ID.text, nil, $type.t, $block.blk, 3)}
| FUNC ID PARIZQ PARDER LLAVEIZQ block LLAVEDER {
    if($block.blk!=nil){ 
         $decfunc = instructions.NewToDeclareFunction($ID.line, $ID.pos, $ID.text, nil, environment.NULL, $block.blk, 4)
    }
}
;
listParamsFunc returns[[]interface{} lf]
: listf=listParamsFunc COMA parameterfuncstmt  {
                    
                                var arrf []interface{}
                                arrf = append($listf.lf, $parameterfuncstmt.parameterfunc)
                                $lf = arrf
                            }   
| parameterfuncstmt {
    
            $lf = []interface{}{}
            $lf = append($lf, $parameterfuncstmt.parameterfunc)
        }
;
parameterfuncstmt returns[interfaces.Expression parameterfunc]

: exte=(ID|GUION_BAJO) ID DOUBLEPTS type {$parameterfunc = expressions.NewParameters($exte.line, $exte.pos, $type.t, $exte.text,  $ID.text, 1)}
| exte=(ID|GUION_BAJO) ID DOUBLEPTS INOUT? CORCHETEIZQ type CORCHETEDER {$parameterfunc = expressions.NewParameters($exte.line, $exte.pos, $type.t, $exte.text,  $ID.text,2);}
| ID DOUBLEPTS type  {$parameterfunc = expressions.NewParameters($ID.line, $ID.pos, $type.t, "_",  $ID.text, 1)}
;
//---------------------------------STRUCTS-------------------------
declarestructstmt returns [interfaces.Instruction decstruct]
: STRUCT ID LLAVEIZQ listStruct LLAVEDER { $decstruct = instructions.NewToDeclareStruct($STRUCT.line, $STRUCT.pos, $ID.text, $listStruct.l) }
;

listStruct returns [[]interface{} l]
: list =  listStruct  VAR ID DOUBLEPTS type {
                            var arr []interface{}
                            newParams := environment.NewStructType($ID.text, $type.t)
                            arr = append($list.l, newParams)
                            $l = arr

}
| VAR ID DOUBLEPTS type {
                        var arr []interface{}
                        newParams := environment.NewStructType($ID.text, $type.t)
                        arr = append(arr, newParams)
                        $l = arr
}
| { $l = []interface{}{} }
;




//----------------------------EXPRESIONES---------------------
expr returns [interfaces.Expression e]
: left=expr op=(MUL|DIV) right=expr { $e = expressions.NewOperation($left.start.GetLine(), $left.start.GetColumn(), $left.e, $op.text, $right.e) }
| left=expr op=(ADD|SUB|PERCENT) right=expr { $e = expressions.NewOperation($left.start.GetLine(), $left.start.GetColumn(), $left.e, $op.text, $right.e) }
| left=expr op=(MAY_IG|MAYOR) right=expr { $e = expressions.NewOperation($left.start.GetLine(), $left.start.GetColumn(), $left.e, $op.text, $right.e) }
| left=expr op=(MEN_IG|MENOR) right=expr { $e = expressions.NewOperation($left.start.GetLine(), $left.start.GetColumn(), $left.e, $op.text, $right.e) }
| left=expr op=(IG_IG|DIF) right=expr { $e = expressions.NewOperation($left.start.GetLine(), $left.start.GetColumn(), $left.e, $op.text, $right.e) }
| left=expr op=AND right=expr { $e = expressions.NewOperation($left.start.GetLine(), $left.start.GetColumn(), $left.e, $op.text, $right.e) }
| left=expr op=OR right=expr { $e = expressions.NewOperation($left.start.GetLine(), $left.start.GetColumn(), $left.e, $op.text, $right.e) }
| op= NOT   left=expr { $e = expressions.NewOperation($left.start.GetLine(), $left.start.GetColumn(), $left.e, $op.text, $left.e) }
| op = SUB  left=expr { $e = expressions.NewOperation($left.start.GetLine(), $left.start.GetColumn(), $left.e,  $op.text, nil)}
| PARIZQ expr PARDER { $e = $expr.e } 
| NUMBER                             
    {   
        
        if (strings.Contains($NUMBER.text,".")){
           
            $e = expressions.NewPrimitive($NUMBER.line,$NUMBER.pos,$NUMBER.text,environment.FLOAT)
        }else{
            num,err := strconv.Atoi($NUMBER.text)
            if err!= nil{
                fmt.Println(err)
            }
            $e = expressions.NewPrimitive($NUMBER.line,$NUMBER.pos,num,environment.INTEGER)
        }
    }
| STRING
    {
        str := $STRING.text
        $e = expressions.NewPrimitive($STRING.line, $STRING.pos, str[1:len(str)-1],environment.STRING)
    }                        
| TRUE { $e = expressions.NewPrimitive($TRUE.line, $TRUE.pos, true, environment.BOOLEAN) }
| FALSE { $e = expressions.NewPrimitive($FALSE.line, $FALSE.pos, false, environment.BOOLEAN) }
| NIL { $e = expressions.NewPrimitive($NIL.line, $NIL.pos, nil, environment.NULL) }
| accessstmt {$e = $accessstmt.access}
| emptvecstmt {$e = $emptvecstmt.emptyvec}
| countvecstmt {$e = $countvecstmt.count}
| accessvecstmt {$e = $accessvecstmt.accessvec}
| intfunctionstmt {$e = $intfunctionstmt.intfunc}
| floatfunctionstmt {$e = $floatfunctionstmt.floatfunc}
| stringfunctionstmt {$e = $stringfunctionstmt.stringfunc}
| accessfuncstmt     {$e = $accessfuncstmt.funcexp}
| ID (LLAVEIZQ|PARIZQ) listStructExp (LLAVEDER|PARDER) { $e = expressions.NewStructExp($ID.line, $ID.pos, $ID.text, $listStructExp.l ) }
| accessstructstmt {$e = $accessstructstmt.accessstruct}
;

accessstructstmt returns [interfaces.Expression accessstruct]
:list=ID POINT ID { $accessstruct = expressions.NewAccessStruct($list.line, $list.pos, $list.text, $ID.text, "nil")  }
| list=ID POINT ID POINT sec=ID  { $accessstruct = expressions.NewAccessStruct($list.line, $list.pos, $list.text, $ID.text, $sec.text)  }
;


accessfuncstmt returns [interfaces.Expression funcexp]
: ID PARIZQ listParams PARDER {$funcexp = expressions.NewAccessFunction($ID.line, $ID.pos, $ID.text, $listParams.l, 1)}
| ID PARIZQ PARDER 
;

intfunctionstmt returns [interfaces.Expression intfunc]
: INTS PARIZQ expr PARDER {$intfunc = expressions.NewFunctionInt($INTS.line, $INTS.pos, $expr.e)}
;

floatfunctionstmt returns [interfaces.Expression floatfunc]
: FLOATS PARIZQ expr PARDER {$floatfunc = expressions.NewFunctionFloat($FLOATS.line, $FLOATS.pos, $expr.e)}
;

stringfunctionstmt returns [interfaces.Expression stringfunc]
: STRINGS PARIZQ expr PARDER {$stringfunc = expressions.NewFunctionString($STRINGS.line, $STRINGS.pos, $expr.e)}
;



accessstmt returns [interfaces.Expression access]
: op=ID {$access = expressions.NewAccess($op.line, $op.pos, $op.text)}

;

increaseanddecreasestmt returns [interfaces.Instruction increasedecrease]
: ID IG_ADD expr PTCOMA?{$increasedecrease = instructions.NewIncreaseDecrease($ID.line, $ID.pos, $ID.text, $IG_ADD.text, $expr.e)}
| ID IG_SUB expr PTCOMA? {$increasedecrease = instructions.NewIncreaseDecrease($ID.line, $ID.pos, $ID.text, $IG_SUB.text, $expr.e)}
;


type returns [environment.TipoExpresion t]
  : STRINGS {$t = environment.STRING}      
  | INTS {$t = environment.INTEGER}         
  | FLOATS {$t = environment.FLOAT}  
  | BOOLS       {$t = environment.BOOLEAN }  
  | CHARACTERS    {$t = environment.CHARACTER}  
  | ID { $t = environment.STRUCT  }
;
listParams returns[[]interface{} l]
: list=listParams COMA (AND_SIMPLE| ID DOUBLEPTS)? expr {
                                var arr []interface{}
                                arr = append($list.l, $expr.e)
                                $l = arr
                            }   
| (AND_SIMPLE| ID DOUBLEPTS)? expr {
            $l = []interface{}{}
            $l = append($l, $expr.e)
        }
;
listStructExp returns[[]interface{} l]
: list=listStructExp COMA?  ID DOUBLEPTS expr {
                                            var arr []interface{}
                                            StrExp := environment.NewStructContent($ID.text, $expr.e)
                                            arr = append($list.l, StrExp)
                                            $l = arr
                                        }
| ID DOUBLEPTS expr{
                    var arr []interface{}
                    StrExp := environment.NewStructContent($ID.text, $expr.e)
                    arr = append(arr, StrExp)
                    $l = arr
                }
|   {
        $l = []interface{}{}
    }
;