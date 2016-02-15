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


