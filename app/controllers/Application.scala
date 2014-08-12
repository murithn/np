package controllers

import play.api._
import play.api.mvc._
import play.api.data._
import play.api.data.Forms._
import models.Slide

object Application extends Controller {

  def index = Action {
    Ok(views.html.index(""))
  }

  def slides = Action {
  	Ok(views.html.slides(Slide.all(), slideForm))
  }

  def newSlide = Action { implicit request =>
	  slideForm.bindFromRequest.fold(
	    errors => BadRequest(views.html.slides(Slide.all(), errors)),
	    markdown => {
	      Slide.create(markdown)
	      Redirect(routes.Application.slides)
	    }
	  )
  }

  def deleteSlide(id: Long) = Action {
	  Slide.delete(id)
	  Redirect(routes.Application.slides)
  }

  def static = Action {
    Ok(views.html.static("Static Slides"))
  }

  val slideForm = Form(
  	"markdown" -> nonEmptyText
  )

}