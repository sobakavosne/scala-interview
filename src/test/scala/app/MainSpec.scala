package app

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class HelloSpec extends AnyFlatSpec with Matchers {
  "The Hello object" should "have the correct greeting" in {
    app.Main.greeting shouldEqual "Bonjour, Scala"
  }
}
