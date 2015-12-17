import scala.scalajs.js
import scala.scalajs.js.annotation.JSExport

object SampleApp extends js.JSApp {
  @JSExport
  override def main(): Unit = {
    val x = ListViewPagingExample.title
  }
}
