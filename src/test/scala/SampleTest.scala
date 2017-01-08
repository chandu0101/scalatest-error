import client.{React, ReactDOM, Test}
import org.scalajs.dom
import org.scalatest.{FunSuite, TestSuite}
import sri.core.all
import sri.enzyme.Enzyme

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSImport, JSName}

@js.native
@JSImport("jsdom","jsdom")
object jsdom extends js.Object {
  def apply(value:js.Any = ???,options:js.Object = ???) : js.Dynamic = js.native
  def createVirtualConsole():js.Dynamic = js.native
}

class SampleTest  extends FunSuite{

  test("hello") {
//
//    val document = jsdom(options = js.Dynamic.literal(virtualConsole =  jsdom.createVirtualConsole().sendTo(dom.window
//      .console)))
val wrapper = Enzyme.shallow(all.makeElement[Test])

    dom.window.console.log(wrapper)

    println(s"html : ${wrapper.html()}")
    println(s"hello2 : ${wrapper.find("#hello1").length}")
    println(s"hello : ${wrapper.find("#hello").length}")
    println(s"text : ${wrapper.text()}")
  }
}
