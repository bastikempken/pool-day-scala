val list = List(324,6,343,77,342,23,4)

/*-------------------------------
 Funktionale Programmierung
 Anwendungsfall Maxium bestimmen
 -------------------------------*/
var max = 0
for(zahl <- list){
  if(zahl > max){
    max = zahl
  }
}
println(max)

/*-------------------------------
 :)
 oder so
 -------------------------------*/

list.max



