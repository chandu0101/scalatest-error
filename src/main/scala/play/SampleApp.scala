package play

import scala.annotation.StaticAnnotation
import scala.meta._
import scala.scalajs.js
import scala.scalajs.js.annotation.JSName
object SampleApp  {

  class simpleAnnot extends StaticAnnotation {

    inline def apply(defn:Any): Any = meta {
      q"$defn"
    }
  }

  class anotherAnnot extends StaticAnnotation


   def main(args:Array[String]): Unit = {


   }
}
