package com.example.motlin_handin_3

fun main() {
    val article1: Article = Article("John Doe", "Song of Ice and Fire")
    val article2: Article = Article("John Doey", "Song of Ice and Faire")
    val article3: Article = Article("John Doea", "Song of Ice and Feire")
    val article4: Article = Article("John Doee", "Song of Ice and Fdire")
    val article5: Article = Article("John Doeb", "Song of Ice and Fighre")
    val articleList: List<Article> = arrayListOf(article1, article2, article3,article4, article5)
    article1.toString()


}

class Article(val author: String, val title: String){
    override fun toString(): String {
        return author
    }
}