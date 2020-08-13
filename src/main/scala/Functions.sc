def print2() = {
  println("One line")
  println("Second line")
}
print2()

def add(a:Int, b:Int) = {
  val result = a+b
  println(result)
  result //return is implied
}

add(5,10)
add(500,10)

def mult(a:Int, b:Int) = {
  //in scala the last line is returned
  a*b
}

mult(6,10)+10+100

def multany(a:Double, b:Double): Int = {
  (a*b).toInt
}
multany(9.11, 3.14)

def addAndmult(a: Double, b: Double, c: Double) = {
  add(multany(a,b), multany(b, c))
}

val myResult = addAndmult(3,4,5)
println(myResult)

//anti-pattern: do not mutate outside variables

var myMutable = 10
// you can't tell if mutateOutside is correct or not
def mutateOutside() = {
  myMutable += 5
  println(myMutable)
}

mutateOutside()

// instead should do this
def add5(a: Int) = {
  a+5
}

myMutable
myMutable = add5(myMutable)
myMutable

// pure function is one without side effects modifying something

def getReversedUpper(text:String): String = {
  text.toUpperCase.reverse
}

getReversedUpper(text="Beer")

def getMax(a:Int, b:Int)= {
  val myName = "Eliza"
  var result = 0
  if (a>b) {
    result = a * myName.length
  } else {
    result = b * myName.length
  }
  result
}

getMax(10,20)

val a = 5
if (a==2*2) {
  println("A is 4")
} else {
  println("A is not 4")
}

def IsEqualTo4(a:Int): Boolean = {
  a == 2*2
}
IsEqualTo4(4)

5 > 2*2
4 >= 2*2
4 != 5

val myName = "Eliza"
if (myName == "Eliza") {
  println("That is my name too!")
}
println("This happens all the time")

def checkName(myName:String, friendName:String) = {
  if (myName == friendName) {
    println(s"Our names match, my dear $friendName!")
  } else {
    println(s"My name $myName is different from $friendName!")
  }
  println("Lets be friends no matter what!")
}

checkName(myName = "Eliza", friendName = "Evita")
checkName(myName = "Eliza", friendName = "Eliza")

// ifs in scala returns something always!

if (true) {
  // do this
} else {
  // do this
}