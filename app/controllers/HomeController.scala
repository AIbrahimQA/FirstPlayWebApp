package controllers


import javax.inject._
import play.api.mvc._


@Singleton
class HomeController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  def index() = Action {
    Ok("Hello ")
  }

//  def age() = Action { implicit request: Request[AnyContent] =>
//    Ok(views.html.age))
//  }

  def hello() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.age("Ahmed", 24))
  }




  def getGreeting() = Action { request =>
    Ok(views.html.index("Hello World! Again "))
  }


  def getGreeting1() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.index("Hello World! Again again"))
  }

  def google() = Action {
    Redirect("https://www.google.co.uk/")
  }

  def help() = TODO



}
