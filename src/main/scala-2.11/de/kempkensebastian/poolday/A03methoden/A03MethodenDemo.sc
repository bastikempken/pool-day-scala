import de.kempkensebastian.poolday.A03methoden.SimpleLogger

import scala.math._

/*-----------------------
 Deklaration von Methoden
 ------------------------*/

def addiere(x:Int,y:Int):Int = {
  return x + y
}

/*----------------------------------
 Default Arguments & Names Arguments
 -----------------------------------*/

class Rechner {
  def potenziere(basis:Double, exponent:Double=2) = pow(basis,exponent)
}


val rechner = new Rechner
rechner.potenziere(3,2)
rechner.potenziere(3)
rechner.potenziere(basis = 3,exponent = 3)

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
//Bitte Auswerten res1: Unit = ()

/*-----------------
 Lokale Methoden
 ------------------*/

def methodeA: Unit = {
  def methodeB = ???
}

/*---------------------------------------
 Operatornotation & rechts Assozitivitaet
 ----------------------------------------*/

//Operatornotation
2 + 3
2.+(3)
2 + 3 * 5

//Rechts Assoziation
val liste = List("A","B","C","D")
val x = "E" :: liste

println(x)
println(liste)






