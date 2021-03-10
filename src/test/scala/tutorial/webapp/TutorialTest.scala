package tutorial.webapp

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
  }
}
