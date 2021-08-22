object Main extends App {
  // println("Hello, World!")
  // println("Hello, Kenji!!")

  for (i <- 1 to 7) println(categorizeDayOfWeek(i))

  for (i <- -3 to 3) println(label(i))

  // Quick Check 5.1
  for (i <- 1 to 10) println(evenOrOdd(i))

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
    if (n % 2 == 1) "odd"
    else "even"
  }
}