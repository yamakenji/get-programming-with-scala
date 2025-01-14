// Consider the following class Person:

case class Person(name: String, age: Int)

// Define a default implementation for Show[Person] so that your function prettyPrintln
// can print the person's name followed by their age. For example, the expression
// prettyPrintln(Person("Jon Doe", 25)) should print "Jon Doe (25)" to the console.


trait Show[T] {

  def show(t: T): String
}


// ANSWER

object Person {

  // In Scala 2: implicit val show = new Show[Int] { ... }
  given show: Show[Person] with {
    override def show(p: Person): String = s"${p.name} (${p.age})"
  }

}
