package de.kempkensebastian.poolday.A05SingletonsUndCompanions

/**
  * Created by sebastiankempken on 14.02.16.
  */
object Zaehler{
  var stand:Int = 0
}

class Zaehler {
//  import Zaehler._
  def add(x:Int):Unit = Zaehler.stand += x
  def zeigeStand() = println(Zaehler.stand);
}
