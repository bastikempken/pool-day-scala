/*-----------------------
 For Schleife
 ------------------------*/

val namen = List("Steehr","Kempken","Miskiw")
val namenBearbeitet = scala.collection.mutable.ListBuffer.empty[String]
for(name <-namen){
  namenBearbeitet += name.toUpperCase()
}
println(namenBearbeitet)

/*-----------------------
 For Ausdrücke
 ------------------------*/

for (n <- 1 to 3) yield n
for {n <- List(1,2,3)} yield n

//Ausgangssitiation
for(n <-namen) yield n toUpperCase


/*--------------------------
 For Ausdrücke mit Variablen
 ---------------------------*/

val zahlen = 1 to 3
for {
  zahl <- zahlen
  ergebnis = zahl * 2
} yield  ergebnis

/*-----------------------
 For Ausdrücke mit Filter
 ------------------------*/

for{
  zahl <- 1 to 25
  ergebnis = zahl * 2 if zahl % 2 == 0
} yield ergebnis

/*-------------------------------------
 For Ausdrücke mit mehreren Generatoren
 --------------------------------------*/

val y = 2
for {
  x <- 1 to y
  y <- 1 to x
} yield (x,y)
