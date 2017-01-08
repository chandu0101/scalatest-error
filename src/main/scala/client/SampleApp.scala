package client

import org.scalajs.dom
import sri.core.{ReactComponent, all}
import com.dispalt.vdom.prefix_<^._
import scala.scalajs.js
import scala.scalajs.js.annotation.ScalaJSDefined
import scala.scalajs.js.{undefined, |, UndefOr => U}

@ScalaJSDefined
class Test extends ReactComponent[Unit, Unit] {
  def render() = React.createElement("div", js.Dynamic.literal(id = "hello"), "div child2", React.createElement("div", js.Dynamic.literal(id = "hello"), "div child"))
}

object SampleApp extends js.JSApp {

  @inline
  def div1(props: DOMProps) = React.createElement("div", props)

  @inline
  def div2(id: js.UndefOr[String] = js.undefined,
           key: js.UndefOr[String] = js.undefined,
           tabIndex: U[Int] = undefined,
           is: U[String] = undefined,
           classID: U[String] = undefined,
           contentEditable: U[String] = undefined,
           role: U[String] = undefined,
           style: U[js.Any] = undefined,
           hidden: U[Boolean] = undefined,
           ref: U[(_ <: dom.html.Element) => _] = undefined,
           dir: U[String] = undefined,
           className: js.UndefOr[String] = js.undefined) = {
    val p = js.Dynamic.literal()
    id.foreach(v => p.updateDynamic("id")(v))
    key.foreach(v => p.updateDynamic("key")(v))
    className.foreach(v => p.updateDynamic("className")(v))
    tabIndex.foreach(v => p.updateDynamic("tabIndex")(v))
    is.foreach(v => p.updateDynamic("is")(v))
    classID.foreach(v => p.updateDynamic("classID")(v))
    contentEditable.foreach(v => p.updateDynamic("contentEditable")(v))
    role.foreach(v => p.updateDynamic("role")(v))
    style.foreach(v => p.updateDynamic("style")(v))
    dir.foreach(v => p.updateDynamic("dir")(v))
    ref.foreach(v => p.updateDynamic("ref")(v))
    React.createElement("div", p)
  }


  override def main(): Unit = {

//    val div1_v = div1(new DOMProps {
//      key = "div1_key";
//      style = js.Dynamic.literal(padding = 10);
//      className = "sfdf";
//      role = "dgsdgf";
//      dir = "sadsad"
//    })
//    dom.window.console.log(div1_v)
//    val div2_v = div2(key = "div2_key", style = js.Dynamic.literal(padding = 10), className = "sdad", role = "asdas", dir = "sadsad")
//    dom.window.console.log(div2_v)

    val div3_v = <.div(^.key := "div3_key",^.className := "div3_class")
    dom.window.console.log(div3_v)

  }
}

@ScalaJSDefined
trait DOMProps extends js.Object {
  var id: js.UndefOr[String] = js.undefined
  var key: js.UndefOr[String] = js.undefined
  var tabIndex: U[Int] = undefined
  var is: U[String] = undefined
  var classID: U[String] = undefined
  var contentEditable: U[String] = undefined
  var role: U[String] = undefined
  var style: U[js.Any] = undefined
  var hidden: U[Boolean] = undefined
  var ref: U[js.Function1[(_ <: dom.html.Element), _]] = undefined
  var dir: U[String] = undefined
  var className: js.UndefOr[String] = js.undefined
}

