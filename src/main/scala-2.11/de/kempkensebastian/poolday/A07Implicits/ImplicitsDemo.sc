/*-----------------------
 Implicit Parameter
 ------------------------*/

def potenziere(basis:Double)(implicit exponent:Double) = Math.pow(basis,exponent)
implicit val exponent = 2.0
//implicit val exponent2 = 4.0
potenziere(3)


/*-----------------
 Implicit Conversion
 View
 -----------------*/

//01 - Implicit Conversion zum Expected Type
class Mitarbeiter(var personalNr: String){
  override def toString() = s"Mitarbeiter: $personalNr"
}

implicit def stringToJoschi(x:String) = new Mitarbeiter(x)

val x = new Mitarbeiter("pd05848")
val joschka:Mitarbeiter = "007"

//02 - Implicit Converting des Receivers
val datum = "17.02.2016"
datum drop 3 //Java.lang.String kennt kein "drop" !!!!


