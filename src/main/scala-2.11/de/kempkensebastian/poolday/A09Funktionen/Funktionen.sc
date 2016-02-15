val list = List(65,66,67,68,69,70,71,72,73,74,75)

/*---------------
 Funktionen zu Fuß
 ---------------*/
//Als Klasse
val function:Function1[Int,Int] = new Function[Int,Int] {
  override def apply(v1:Int) = v1 * 2
}

list.map(function)

//Funktionsliteral
val lambdaFunctionLong:Int=>Int = x=> x * 2
val lambdaFunction = (x:Int) => x * 2
list.map(lambdaFunction)

//Lambda :)
list.map(x=>x * 2)

list.map(_*2)

/*-----
  map
 ------*/
list.map(x=>x.toChar)
    .map(_ toString)
    .map(_ toLowerCase())

/*--------
  forEach
 ---------*/
 list.foreach(println(_))

/*-----
 filter
 ------*/
list.filter(f => f % 2 == 0)

/*----
 span
 -----*/
list.partition(_ % 2 == 0)

/*-----
 forAll
 ------*/
list.forall(_<100)

/*-------
 foldLeft
 --------*/
list.foldLeft(0)((x,y)=>x+y)


