import org.scalajs.dom.ext.Ajax

import scala.async.Async.{async,await}
import scala.concurrent.Future
import scala.scalajs.concurrent.JSExecutionContext.Implicits.runNow

object SampleService {

  val url = s"https://chandu0101.cloudant.com/seeds/_design/app/_search/search?"

   def getData(query: String, bookmark: String = ""): Future[String] = async {
    val nQuery = if (query.isEmpty) "*:*" else query
    val finalURL = if (bookmark.isEmpty) url.concat(s"q=$nQuery&limit=2&include_docs=true")
    else url.concat(s"q=$nQuery&bookmark=$bookmark&limit=2&include_docs=true")
    val headers = Map(
      "Host" -> "chandu0101.cloudant.com",
      "Authorization" -> "Basic aGluZ2VyaW5ndGhlbGFnZXJpZ2hpc2V2OllwZ2lDamFzWVcyUldxVE9EZDV0QmtTdg=="
    )
    val result = await(Ajax.get(finalURL, headers = headers)).responseText
    result
  }

}
