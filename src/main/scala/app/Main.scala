package app

object Main extends App with Main {
  println(greeting)
}

trait Main {
  lazy val greeting: String = "Bonjour, Scala"
}
