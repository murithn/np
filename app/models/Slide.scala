package models

import anorm._
import anorm.SqlParser._
import play.api.db._
import play.api.Play.current

case class Slide(id: Long, markdown: String)

object Slide {

	def all(): List[Slide] = DB.withConnection { implicit c => SQL("Select * from slide").as(slide *) }

	def create(markdown: String) {
	  DB.withConnection { implicit c =>
	    SQL("insert into slide (markdown) values ({markdown})").on(
	      'markdown -> markdown
	    ).executeUpdate()
	  }
	}

	def delete(id: Long) {
	  DB.withConnection { implicit c =>
	    SQL("delete from slide where id = {id}").on(
	      'id -> id
	    ).executeUpdate()
	  }
	}

	val slide = {
	  get[Long]("id") ~
	  get[String]("markdown") map {
	    case id~markdown => Slide(id, markdown)
	  }
	}

}