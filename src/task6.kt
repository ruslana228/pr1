//Задача 6.
//Создать приложение, в котором пользователь вводит две различных цифры. На выходе приложение выдает, если это возможно, из введенных цифр, нечетное число.
// Результат выводится в консоль.
//При невозможности создать нечетное число выводится сообщение – «Создать нечетное число невозможно».
// Каждое число вводится на отдельной строке

fun main() {

    print("Введите первую цифру: ")
    val a = readln()

    print("Введите вторую цифру: ")
    val b = readln()


    //проверить каждую цифру на чётность

    if ((b.toInt() % 2 == 1) && (a.toInt() % 2 == 1)) {
        print("Нечётные числа: $b$a и $a$b" )
    }
    else if (a.toInt() % 2 == 1) {
        print("Нечётное число: $b$a" )
    }
    else if (b.toInt() % 2 == 1) {
        print("Нечётное число: $a$b")
    }
    else println("Создать нечетное число невозможно")




}