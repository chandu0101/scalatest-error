package client

import sri.core.{ReactElement, ReactNode}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@JSImport("react" ,JSImport.Namespace)
@js.native
object React extends js.Object{
  def createElement(ctor : js.Any,props : js.Object,children:ReactNode*):ReactElement = js.native
}

@JSImport("react-dom" ,JSImport.Namespace)
@js.native
object ReactDOM extends js.Object{
  def render(ctor : js.Any,node:js.Any):js.Any = js.native
}
