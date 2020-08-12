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
