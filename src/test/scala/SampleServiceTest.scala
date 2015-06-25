import org.scalatest.FunSuite
import org.scalatest.concurrent.ScalaFutures
import scala.concurrent.Future
import scala.scalajs.concurrent.JSExecutionContext.Implicits.runNow


class SampleServiceTest extends FunSuite with ScalaFutures {

  test("getData") {

    val x = SampleService.getData("")

    assert(x.futureValue.contains("total_rows"))
  }

}
