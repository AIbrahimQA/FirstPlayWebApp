package controllers

import javax.inject._
import play.api.mvc._

@Singleton
class HomeController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  def index = Action {
    Ok(views.html.index("Hello World"))
  }


  def getGreeting() = Action { request =>
    Ok(views.html.index("Hello World! Again "))
  }


  def getGreeting1() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.index("Hello World! Again again"))
  }

}
