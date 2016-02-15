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
val x = new Zaehler
val y = new Zaehler

x.add(3);

y.zeigeStand()

