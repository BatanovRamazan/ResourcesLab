package com.example.resourceslab
//
//fun Lab1() {
//
//    println("===== ЗАДАНИЕ 1 =====")
//
//    val name: String = "Рамазан"
//    var age: Int = 20
//    var averageGrade: Double = 4.7
//    var isExcellent: Boolean = true
//
//    println("ФИО: $name")
//    println("Возраст: $age")
//    println("Средний балл: $averageGrade")
//    println("Отличник: $isExcellent")
//
//
//    println("\n===== ЗАДАНИЕ 2 =====")
//
//    task2()
//
//
//    println("\n===== ЗАДАНИЕ 3 =====")
//
//    task3()
//
//
//    println("\n===== ЗАДАНИЕ 4 =====")
//
//    task4()
//
//
//    println("\n===== ЗАДАНИЕ 5 =====")
//
//    task5()
//}
//
//
//fun task2() {
//    val width = 5
//    val height = 5
//
//    val area = width * height
//    val perimeter = 2 * (width + height)
//
//    val isSquare = width == height
//
//    println("Ширина: $width")
//    println("Высота: $height")
//    println("Площадь: $area")
//    println("Периметр: $perimeter")
//    println("Является квадратом: $isSquare")
//}
//
//
//fun task3() {
//    val score = 85
//
//    val grade = when (score) {
//        in 90..100 -> "A"
//        in 80..89 -> "B"
//        in 70..79 -> "C"
//        in 50..69 -> "D"
//        in 0..49 -> "F"
//        else -> "Некорректная оценка"
//    }
//
//    println("Баллы студента: $score")
//    println("Буквенная оценка: $grade")
//}
//
//
//fun task4() {
//    val phone: String? = null
//
//    val phoneLength = phone?.length
//
//    val displayPhone = phone ?: "Номер телефона не указан"
//
//    println("Номер телефона: $displayPhone")
//    println("Длина номера: $phoneLength")
//}
//
//
//fun calculateAverage(vararg grades: Int): Double {
//    return grades.average()
//}
//
//
//fun printReport(name: String, average: Double = 0.0) {
//    println("Студент: $name")
//    println("Средний балл: $average")
//}
//
//
//fun task5() {
//    val average = calculateAverage(90, 85, 78, 92, 88)
//
//    println("Оценки: 90, 85, 78, 92, 88")
//    println("Вычисленный средний балл: $average")
//
//    println("\nОтчёт с переданным средним баллом:")
//    printReport("Рамазан", average)
//
//    println("\nОтчёт с параметром по умолчанию:")
//    printReport("Али")
//}
//

fun main(){
    var phoneDisplay: String? = "text"
    phoneDisplay=phoneDisplay?:null
    println("Display: $phoneDisplay")

}