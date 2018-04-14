val list = List(65,66,67,68,69,70,71,72,73,74,75)

/*---------------
 Funktionen zu Fuß
 ---------------*/
//Als Klasse



//Funktionsliteral

val function:Function[Int,Int] = new Function[Int,Int]{
  override def apply(v:Int) = v * 2
}

val liste = List(2,56,23,6,8,88,34,24)

liste.map(function)



//Lambda :)

liste.filter(x => x % 2 == 0).map(x => x * 2)

/*-----
  map
 ------*/



/*--------
  forEach
 ---------*/


/*-----
 filter
 ------*/


/*----
 span
 -----*/


/*-----
 forAll
 ------*/


/*-------
 foldLeft
 --------*/



