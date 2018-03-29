class Student(
        val firstName: String,
        val lastName: String,
        val age: Int,
        val gender: String,
        val favoriteSubject: String,
        val numericGrade: Int
              ) {

fun getLetterGrade(numericGrade: Int): String {
    var x = numericGrade
    when (x < 60) {
        return ("F")
    }
    when (x >= 60 && x < 70) {
        return ("D")
    }
    when (x >= 70 && x < 80) {
        return ("C")
    }
    when (x >= 80 && x < 90) {
        return ("B")
    }
    when (x >= 90) {
        return ("A")
    }
}