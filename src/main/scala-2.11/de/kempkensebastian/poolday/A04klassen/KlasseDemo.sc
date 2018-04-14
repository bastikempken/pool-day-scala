/*----------------------------------------------
 Einfache Klassendefinition und Objekterstellung
 ----------------------------------------------*/

//class Mitarbeiter


/*----------------------------------------------
 Klassenparameter
 ----------------------------------------------*/
/*
class Mitarbeiter(pNr:String)

var ich = new Mitarbeiter("pd05848")

println(ich)
*/

/*----------------------------------------------
 Felder Variante 1
 ----------------------------------------------*/

/*
class Mitarbeiter(pNrParam:String){
  val pNr = pNrParam
}

var ich = new Mitarbeiter("pd05848")

println(ich.pNr)

*/
/*----------------------------------------------
 Felder Variante 2
 ----------------------------------------------*/

case class Mitarbeiter(var pNrParam:String)




