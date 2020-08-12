var myArr = Array(1,2,3,4,5,6)
println(myArr.length)
myArr.getClass
myArr(3)
myArr(myArr.length-1)

myArr.drop(1)
myArr.take(1)
myArr.last
myArr(3) = 9000
// overwriting the old array with the new array
myArr = myArr :+ 555
myArr
// we need an array of integers not strings
//myArr = Array("Valdis", "Pēteris", "Līga")
myArr = Array(3,32,52,2,-58585,6,1)
myArr :++ Array(5,9,7)
myArr.min
myArr.max
myArr.reverse
val newArr = myArr :+ 75756
newArr.slice(2,5)
val insertedArr = newArr.slice(0,6) :++ Array(10,20,30) :++ newArr.slice(6,9)
insertedArr
insertedArr.contains(10)
insertedArr.contains(11)
insertedArr.indexOf(10)
insertedArr(6)
insertedArr.dropRight(2)
insertedArr.sum
insertedArr.product
insertedArr(10)
val noZero = insertedArr.slice(0,10) :++ insertedArr.slice(11,12)
noZero.foreach(println)

val mySeq = Seq(1,2,3,4,5,6,6,77)
mySeq
mySeq.min
mySeq.getClass

import scala.collection.mutable
val myMutableSeq = mutable.ArrayBuffer(1,3,6,7,8,8,10)
myMutableSeq(0) = 1000
myMutableSeq.product
myMutableSeq += 5000
myMutableSeq ++= Array(3,5,6,30)

//lets copy this to immutable

val ImmutableSeq = myMutableSeq.toArray
ImmutableSeq.getClass
ImmutableSeq










