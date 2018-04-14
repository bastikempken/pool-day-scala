import de.kempkensebastian.poolday.A05SingletonsUndCompanions.Zaehler

/*-----------------
 Singleton
 ------------------*/

object Logger{
  def display(message:String):Unit = println(s"$message")
}
Logger.display("Hallo statische Klasse")

/*-----------------------
 Companion Class + Object
 ------------------------*/

var x = new Zaehler
var y = new Zaehler

x add 4

y zeigeStand


