/*----------------------------------------------
 Einfache Klassendefinition und Objekterstellung
 ----------------------------------------------*/

/*
class Mitarbeiter
val ich = new Mitarbeiter
*/

/*----------------------------------------------
 Klassenparameter
 ----------------------------------------------*/

/*
class Mitarbeiter(personalNr:String){
  override def toString = s"Personalnummer: $personalNr"
}

val ich = new Mitarbeiter("pd05848")
println(ich.personalNr)
*/


/*----------------------------------------------
 Felder Variante 1
 ----------------------------------------------*/

/*
class Mitarbeiter(personalNrParam:String){
  var personalNr:String = personalNrParam
}

val ich = new Mitarbeiter("309556")

println(ich.personalNr)

*/

/*----------------------------------------------
 Felder Variante 2
 ----------------------------------------------*/

/*
 class Mitarbeiter(val personalNr:String)
 val ich = new Mitarbeiter("309556")
 println(ich.personalNr)
 */



