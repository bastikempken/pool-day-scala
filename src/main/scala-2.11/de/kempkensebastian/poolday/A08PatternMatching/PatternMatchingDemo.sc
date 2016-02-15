/*-----------------
 Constant Pattern
 -----------------*/

/*
teste("Frau")

val frau = "Frau"

def teste(x:String) = x match {
  case "Herr" => true
  case `frau` => true
  case _ => false
}
*/

/*-------------------------------
 Variable Pattern & Typed Pattern
 --------------------------------*/

/*
def teste(x:Int) = x match {
  case age:Int => if (age >= 50) "quasi alles vorbei"
}
*/

/*-----------------
 Tuple Pattern
 -----------------*/

/*
teste(("A",1))

def teste(x:(Any,Any)) = x match {
  case (e1,_) => s"Das erste Element war $e1"
}
*/


/*-----------------
 Constructor Pattern
 -----------------*/

/*
case class Mitarbeiter(personalNr:String,abteilung:String,alter:Int)

teste(Mitarbeiter("pd05848","VAO1",18))

def teste(x:Mitarbeiter) = x match {
  case Mitarbeiter(personalNr, abt, alter) => s"Mitarbeiter $alter"
}
*/

/*-----------------
 Sequence Pattern
 -----------------*/

/*
val seq = List("A","B","C","D")

def teste(x:List[Any]) = x match {
  case List("A","B") => "Fall 1"
  case List("A",_,"C") => "Fall 2"
  case List ("A",x,_*) => s"Fall 3 an 2. Stelle $x"
}

teste(seq)
*/
