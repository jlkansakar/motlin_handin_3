package com.example.motlin_handin_3

fun main() {
    val article1: Article = Article("John Doe", "Song of Ice and Fire")
    val article2: Article = Article("John Doey", "Song of Ice and Faire")
    val article3: Article = Article("John Doea", "Song of Ice and Feire")
    val article4: Article = Article("John Doee", "Song of Ice and Fdire")
    val article5: Article = Article("John Doeb", "Song of Ice and Fighre")
    val articleList: List<Article> = arrayListOf(article1, article2, article3,article4, article5)
    println(articleList.toString())

    val salatPizza: Pizza = Pizza("Salat Pizza", 1200, false, 8)
    val pepsMedDress: Pizza = Pizza("Pepperoni Pizza", 1000, false, 8)
    val phillyCheesesteak: Sandwich = Sandwich("Philly Cheesesteak", 700, false, 1)
    val avocadoToast: Sandwich = Sandwich("Avocado Toast", 400, true, 1)
    val foodList: List<FastFood> = arrayListOf(salatPizza, pepsMedDress, phillyCheesesteak, avocadoToast)
    for (food in foodList) {
        if (food is Pizza) {
            food.addSauce("Dressing")
        }
        if (food is Sandwich) {
            food.cutFood()
        }

    }
    println(foodList.toString())
}

class Article(val author: String, val title: String){
    override fun toString(): String {
        return author
    }
}

public interface FastFood {
    val name: String
    var calories: Int
    val isItHealthy: Boolean
    var numberOfFood: Int
    fun cutFood(){
        numberOfFood *= 2
    }
    fun addSauce(sauce: String){
        calories = (calories * 1.5).toInt()
    }

}

class Pizza(
    override val name: String,
    override var calories: Int,
    override val isItHealthy: Boolean,
    override var numberOfFood: Int

): FastFood {
    override fun toString(): String {
        return "$name, $calories, $isItHealthy, $numberOfFood |"
    }
}

class Sandwich(
    override val name: String,
    override var calories: Int,
    override val isItHealthy: Boolean,
    override var numberOfFood: Int
): FastFood {
    override fun toString(): String {
        return "$name, $calories, $isItHealthy, $numberOfFood |"
    }
}