object Main extends App {
  // println("Hello, World!")
  // println("Hello, Kenji!!")

  for (i <- 1 to 7) println(categorizeDayOfWeek(i))

  for (i <- -3 to 3) println(label(i))

  // Quick Check 5.1
  for (i <- 1 to 10) evenOrOdd(i)

  // 5.2

  echo5("Hello World!")

  println("Quick Chack 5.2")
  count()

  // 5.3

  echo5UsingFor("It's a fine day")

  // Try This

  println("Price is $30")
  discountPrice(30)
  println("Price is $50")
  discountPrice(50)
  println("Price is $80")
  discountPrice(80)
  println("Price is $100")
  discountPrice(100)
  println("Price is $120")
  discountPrice(120)

  def categorizeDayOfWeek(n: Int) = {
    if (n == 1 || n == 7) {
      "weekend"
    } else if (n > 1 && n < 7) {
      "weekday"
    } else {
      "unknown"
    }
  }

  def label(n: Int) =
    if (n == 0) "neutral"
    else if (n < 0) "negative"
    else "positive"

  def evenOrOdd(n: Int) = {
    if (n % 2 == 1) println(s"$n は奇数です")
    else println(s"$n は偶数です")
  }

  // Lesson 5.2

  def echo5(msg: String) = {
    var i = 1
    while (i <= 5) {
      println(msg)
      i += 1
    }
    
    // println(msg)
    // println(msg)
    // println(msg)
    // println(msg)
  }

  // Quick Check5.2

  def count() = {
    var i = 1
    while (i <= 10) {
      println(i)
      i += 1
    }
  }

  // Lesson 5.3

  def echo5UsingFor(msg: String) = {
    println("Repeating using a for loop")
    for (i <- 1 to 5) {
      println(msg)
    }
  }

  // Try This

  def discountPrice(price: Int) = {
    if (price < 50) println(price)
    else if (price >= 50 && price < 100) println(price * 0.9)
    else println(price * 0.85)
  }

}