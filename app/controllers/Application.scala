package controllers

import play.api.mvc._

class Application extends Controller {

  def launch = Action {
    Ok("Application successfully launched")
  }

}
