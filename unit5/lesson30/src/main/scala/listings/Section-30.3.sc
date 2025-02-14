List(1, 2, 3).max
// val res0: Int = 3

List(1.4, 2.5, 3.6).max
// val res1: Double = 3.6

List.empty[Float].max
// java.lang.UnsupportedOperationException: empty.max

List("scala", "hello").max
// val res3: String = scala
// By default, Scala compares strings in alphabetical order


List(1, 2, 3).min
// val res4: Int = 1

List(1.4, 2.5, 3.6).min
// val res5: Double = 1.4

List.empty[Float].min
// java.lang.UnsupportedOperationException: empty.min

List("hello", "scala").min
// val res7: String = hello
// By default, Scala sorts strings in alphabetical order


case class Foo(n: Int, text: String)
// defined case class Foo

List(Foo(1, "z"), Foo(9, "a")).maxBy(_.n)
// val res8: Foo = Foo(9,a)

List(Foo(1, "z"), Foo(9, "a")).maxBy(_.text)
// val res9: Foo = Foo(1,z)

List.empty[Foo].maxBy(_.n)
// java.lang.UnsupportedOperationException: empty.maxBy

List(Foo(1, "zz"), Foo(9, "a"), Foo(8, "aa")).maxBy { foo =>
  // ordering by the size of text
  // and then by its alphabetical order
  (foo.text.size, foo.text)
}
// val res11: Foo = Foo(1, "zz")


case class A(n: Int, text: String)
// defined case class A

List(A(1, "z"), A(9, "a")).minBy(_.n)
// val res12: A = A(1,z)

List(A(1, "z"), A(9, "a")).minBy(_.text)
// val res13: A = A(9,a)

List.empty[A].minBy(_.n)
// java.lang.UnsupportedOperationException: empty.minBy
