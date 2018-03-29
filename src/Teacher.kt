class Teacher : Person {

    val currentSubject: String,
            val students: List<Students>

    constructor(firstName: String,
                lastName: String,
                age: Int,
                gender: String) : super(firstName, lastName, age, gender)
}