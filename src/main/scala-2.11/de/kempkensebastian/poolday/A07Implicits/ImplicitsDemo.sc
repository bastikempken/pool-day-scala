/*-----------------------
 Implicit Parameter
 ------------------------*/

def addiere(x:Int)(implicit y:Int) = x + y

implicit var istMirEgal = 5

addiere(4)(20)

/*-----------------
 Implicit Conversion
 View
 -----------------*/

//01 - Implicit Conversion zum Expected Type

class Mitarbeiter(var personalNr:String){
   override def toString() = s"Mitarbeiter $personalNr"
}


implicit def stringToMitarbeiter(x:String) = new Mitarbeiter(x)



val ich:Mitarbeiter = "pd05848"


//02 - Implicit Converting des Receivers

"17.02.2016" drop 2


