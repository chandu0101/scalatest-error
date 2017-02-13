package client
//import com.dispalt.vdom.prefix_<^._
import scala.scalajs.js.Dynamic.{literal => json}
import scala.scalajs.js.{JSApp, UndefOr => U}

trait Platform {
  def isIOS: Boolean
  def isAndroid: Boolean
}

object Platform {
  private var _platform: Platform = _ // evil
  def setPlatform(p: Platform): Unit = _platform = p
  def platform: Platform = _platform

  def isIOS: Boolean = platform.isIOS
  def isAndroid: Boolean = platform.isAndroid
}

object IOSPlatform extends Platform {
  def isIOS: Boolean = true
  def isAndroid: Boolean = false
}

object AndroidPlatform extends Platform {
  def isIOS: Boolean = false
  def isAndroid: Boolean = true
}
object SampleApp extends JSApp {

  override def main(): Unit = {
    Platform.setPlatform(AndroidPlatform)

    val name = if (Platform.isAndroid) " Android-Home1" else "IOS-Home"
    println(name)
  }
}
