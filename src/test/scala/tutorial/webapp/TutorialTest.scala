package tutorial.webapp

import org.scalajs.dom
import org.scalajs.dom.document
import org.scalajs.dom.ext._
import utest._

object TutorialTest extends TestSuite {

  // Initialize App
  TutorialApp.setupUI()

  def tests = Tests {
    test("HelloWorld") {
      assert(
        document
          .querySelectorAll("p")
          .count(_.textContent.toString == "Hello World") == 1
      )
    }

    test("ButtonClick") {
      def messageCount =
        document
          .querySelectorAll("p")
          .count(_.textContent.toString == "You clicked the button!")

      val button = document.querySelector("button").asInstanceOf[dom.html.Button]

      assert(button != null && button.textContent.toString == "Click me!")
      assert(messageCount == 0)

      for (c <- 1 to 5) {
        button.click()
        assert(messageCount == c)
      }
    }
  }
}
