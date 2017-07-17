package play

import play.SampleApp.{anotherAnnot, simpleAnnot}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

object Test {

  @simpleAnnot
  class SimpleTest(val x: Int,@anotherAnnot val y: Int = 5, @JSName("dude") val z: Int = 7)
    extends js.Object

}
