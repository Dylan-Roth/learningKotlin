package homework

fun incrementNumberByTwo(startingNumber: Int): Int{
    val incrementedNumber = startingNumber + 2;
    return incrementedNumber
}

fun printEvenNumbers(start: Int, finish: Int){
    var x = start;
    if (x % 2 == 0) {
        print("$x");
        x++;
        x++;
        while (x <= finish) {
            print(", $x");
            x++;
            x++;
        }
    }
    else
        x++;
        print("$x");
    x++;
    x++;
    while (x <= finish) {
        print(", $x");
        x++;
        x++;
    }
}
/**
Programming exercises:
 * Write a function to print “Hello $name” where name is a function argument
 * Write a function to print a list of even numbers between a certain range:
 * printEvenNumbers(start, finish)
 * Write a function to print a fib sequence up to specified number position
 * printFib(number)
 * Create a class called “Dog” with properties / methods:
     * val name
     * val breed
     * val color
     * val barkSound: String
     * var isHungry : Boolean - false
     * def bark() -> Prints barkSound
     * def run() -> prints dog is running, make isHungry to true
     * def eat() -> if Hungry, print Dog eats, if not hungry, print Dog refuses to eat.
 */
