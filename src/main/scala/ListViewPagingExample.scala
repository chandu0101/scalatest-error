import scala.scalajs.js
import scala.scalajs.js.Dynamic.{literal => json}

object ListViewPagingExample {


  val LayoutAnimation : js.Dynamic = null

  val animations = json(
    layout = json(
      spring = json(
        duration = 750,
        create = json(
          duration = 300,
          `type` = LayoutAnimation.Types.easeInEaseOut,
          property = LayoutAnimation.Properties.opacity
        )
          update = json(
          `type` = LayoutAnimation.Types.spring,
          springDamping = 0.4
        )
      )
        easeInEaseOut = json(
        duration = 300,
        create = json(
          `type` = LayoutAnimation.Types.easeInEaseOut,
          property = LayoutAnimation.Properties.scaleXY
        )
          update = json(
          delay = 100,
          `type` = LayoutAnimation.Types.easeInEaseOut
        )
      )
    )
  )

  val layoutAnimationConfigs = js.Array(animations.layout.spring,
    animations.layout.easeInEaseOut)

  def title: String = "ListView - paging"

  def description: String = "Floating headers & layout animations."
}
