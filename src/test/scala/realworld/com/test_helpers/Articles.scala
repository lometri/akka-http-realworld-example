package realworld.com.test_helpers

import realworld.com.articles.Article

object Articles {
  val normalArticle = Article(
    1,
    "slug",
    "title",
    "description",
    "body",
    1,
    Dates.currentWhenInserting,
    Dates.currentWhenInserting)
}
