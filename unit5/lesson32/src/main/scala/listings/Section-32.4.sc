case class A(n: Int, text: String)
// defined case class A

List(A(1, "z"), A(9, "a")).groupBy(_.text)
// val res0: scala.collection.immutable.Map[String,List[A]] = Map(z -> List(A(1,z)), a -> List(A(9,a)))
// A dictionary with two keys: “z” and “a”

List("hello", "world", "scala").groupBy(_.length)
// val res1: scala.collection.immutable.Map[Int,List[String]] = Map(5 -> List(hello, world, scala))
// A dictionary containing the key 5

List("hello", "world", "scala").groupBy(_.contains('a'))
// val res2: scala.collection.immutable.Map[Boolean,List[String]] = Map(false -> List(hello, world), true -> List(scala))
// A dictionary with two keys: false and true

List.empty[String].groupBy(_.contains('a'))
// val res3: scala.collection.immutable.Map[Boolean,List[String]] = HashMap()
// The empty dictionary


"scala".max
// val res4: Char = s
// 's' is the char with the highest ASCII code

"scala".min
// val res5: Char = a
// 'a' is its char with the lowest ASCII code

Some(5).filter(_ < 3)
// val res6: Option[Int] = None

Some(5).size
// val res7: Int = 1
