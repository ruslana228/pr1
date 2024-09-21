//Задача 5.
//Создать приложение, с помощью которого пользователь, введя целое число n и основание степени x узнает,
// существует ли целочисленный показатель степени y для которого выполняется равенство x^y = n.
// В случае, если показатель существует – вычислить его и вывести. В противном случае вывести текст – «Целочисленный показатель не существует».

import kotlin.math.pow
import kotlin.math.log

fun main() {

    println("Введите целое число n: ")
    val n = readln().toDouble()
    println("Введите основание степени x: ")
    val x = readln().toDouble()
    var result = log(n,x)

    if(result % 1 == 0.0)
    {
        print("Ответ: " + result)
    }
    else
        print("Нет такого")
}