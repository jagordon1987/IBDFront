import org.specs2.mutable._
import org.specs2.runner._
import org.junit.runner._

import play.api.test._
import play.api.test.Helpers._

@RunWith(classOf[JUnitRunner])
class ApplicationSpec extends Specification {

  "Application" should {

    "send a 404 when a bad request is made" in new WithApplication{
      route(FakeRequest(GET, "/invalid")) must beSome.which (status(_) == NOT_FOUND)
    }

    "render the launch page" in new WithApplication{
      val home = route(FakeRequest(GET, "/launch")).get
      status(home) must equalTo(OK)
      contentType(home) must beSome.which(_ == "text/plain")
      contentAsString(home) must contain ("Application successfully launched")
    }
  }
}
