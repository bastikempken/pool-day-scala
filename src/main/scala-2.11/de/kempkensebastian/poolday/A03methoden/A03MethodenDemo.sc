
/*-----------------------
 Deklaration von Methoden
 ------------------------*/
 def addiere(x:Int,y:Int) = x + y


/*----------------------------------
 Default Arguments & Named Arguments
 -----------------------------------*/

def potenziere(basis:Double,exponent:Double=2) = scala.math.pow(basis,exponent)

potenziere(basis=3,exponent = 4)

/*-----------------
 By-Name Parameters
 ------------------*/


class SimpleLogger(var aktiv:Boolean) {
  def display(message: => String) = if(aktiv) println(message)
}

val logger = new SimpleLogger(aktiv=true)

logger.display({println("Bitte Auswerten");"Klasse Vortrag"})
//Bitte Auswerten Klasse Vortrag  res0: Unit = ()
logger.aktiv = false

logger.display({println("Bitte Auswerten");"Klasse Vortrag"})
// res1: Unit = ()

/*-----------------
 Lokale Methoden
 ------------------*/

def außen: Unit = {
  def innen:Unit = ???
}



/*---------------------------------------
 Operatornotation & rechts Assozitivitaet
 ----------------------------------------*/

//Operatornotation

3 + 5

3.+(8)


3 + 5 * 8

//Rechts Assoziation

"Joschka" :: Nil






