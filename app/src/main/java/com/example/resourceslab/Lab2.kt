package com.example.resourceslab

import kotlin.random.Random

//fun Lab2() {
//    lab2Task1()
//    lab2Task2()
//    lab2Task3()
//    lab2Task4()
//    lab2Task5()
//    lab2Task6()
//    lab2Task7()
//    lab2Task8()
//    lab2Task9()
//    lab2Task10()
//    lab2Task11()
//    lab2Task12()
//    lab2Task13()
//    lab2Task14()
//    lab2Task15()
//}
//
//fun lab2Task1(){
//    val numbers = Array(10){
//        Random.nextInt(1,101)
//    }
//    println("\nTask 1")
//    println("Массив:")
//    println(numbers.joinToString())
//
//    println("Максимальное число: ${numbers.maxOrNull()}")
//    println("Минимальное число: ${numbers.minOrNull()}")
//    println("Среднее значение: ${numbers.average()}")
//}
//
//fun lab2Task2(){
//    val numbers = arrayOf(
//        12,7,18,5,24,
//        33,42,11,16,9,
//        30,25,8,17,20
//    )
//    val evenNumbers = numbers.filter{it % 2 == 0}
//    val oddNumbers = numbers.filter {it % 2 != 0}
//    println("\nTask 2")
//    println("Массив:")
//    println(numbers.joinToString())
//
//    println("Чёткие числа:")
//    println(evenNumbers.joinToString())
//    println("Количество чётных: ${evenNumbers.size}")
//
//    println("Нечётные числа:")
//    println(oddNumbers.joinToString())
//    println("Количество нечётных: ${oddNumbers.size}")
//}
//fun lab2Task3(){
//    val cities = arrayOf(
//        "Алматы",
//        "Астана",
//        "Прага",
//        "Лондон",
//        "Токио",
//        "Берлин",
//        "Амстердам",
//        "Париж"
//    )
//    val longestCity = cities.maxByOrNull { it.length }
//    val shortestCity = cities.minByOrNull { it.length }
//
//    println("\nTask 3 ")
//    println("Города:")
//    println(cities.joinToString())
//    println("Самое длинное название: $longestCity")
//    println("Самое короткое название: $shortestCity")
//    println("По алфавиту:")
//    println(cities.sorted().joinToString())
//}
//fun lab2Task4(){
//    val students = ArrayList<String>()
//    students.add("Рамазан")
//    students.add("Али")
//    students.add("Тимур")
//    students.add("Аслан")
//    students.add("Данияр")
//    println("\nTask4")
//    println("Студенты:")
//    println(students)
//    students.sort()
//    println("Отсортированный список:")
//    println(students)
//}
//fun lab2Task5() {
//    val grades = arrayListOf(
//        75, 90, 45, 82, 67,
//        38, 95, 55, 48, 76
//    )
//
//    println("\nTask 5")
//    println("Оценки:")
//    println(grades)
//
//    grades.add(0, 88)
//
//    println("После добавления новой оценки:")
//    println(grades)
//
//    grades.removeAll { it < 50 }
//
//    println("После удаления оценок ниже 50:")
//    println(grades)
//
//    println("Размер списка: ${grades.size}")
//}
//
//fun lab2Task6() {
//    val subjects = arrayListOf(
//        "Математика",
//        "Программирование",
//        "Базы данных",
//        "Физика",
//        "Английский"
//    )
//
//    val searchSubject = "Базы данных"
//
//    println("\nTask 6")
//    println("Дисциплины:")
//    println(subjects)
//
//    println("Содержится ли $searchSubject: ${subjects.contains(searchSubject)}")
//
//    subjects[3] = "Мобильная разработка"
//
//    println("После замены:")
//    println(subjects)
//
//    println("В обратном порядке:")
//    println(subjects.reversed())
//}
//
//fun lab2Task7() {
//    val words = listOf(
//        "Kotlin",
//        "Java",
//        "Kotlin",
//        "Android",
//        "Java",
//        "Python",
//        "Android",
//        "C++"
//    )
//
//    val uniqueWords = HashSet<String>()
//    uniqueWords.addAll(words)
//
//    println("\nTask 7")
//    println("Слова:")
//    println(words)
//    println("Уникальные слова:")
//    println(uniqueWords)
//    println("Количество уникальных слов: ${uniqueWords.size}")
//}
//
//fun lab2Task8() {
//    val group1 = hashSetOf(101, 102, 103, 104, 105)
//    val group2 = hashSetOf(103, 104, 105, 106, 107)
//
//    val intersection = group1.intersect(group2)
//    val union = group1.union(group2)
//    val difference = group1.subtract(group2)
//
//    println("\nTask 8")
//    println("Первая группа: $group1")
//    println("Вторая группа: $group2")
//    println("Пересечение: $intersection")
//    println("Объединение: $union")
//    println("Разность: $difference")
//}
//
//fun lab2Task9() {
//    val emails = hashSetOf(
//        "ramazan@gmail.com",
//        "ali@gmail.com",
//        "timur@gmail.com"
//    )
//
//    val newEmail = "aslan@gmail.com"
//
//    println("\nTask 9")
//    println("Email студентов:")
//    println(emails)
//
//    if (emails.contains(newEmail)) {
//        println("Email $newEmail уже существует")
//    } else {
//        emails.add(newEmail)
//        println("Email $newEmail добавлен")
//    }
//
//    println("Итоговый список:")
//    println(emails)
//    println("Количество уникальных email: ${emails.size}")
//}
//
//fun lab2Task10() {
//    val grades = HashMap<String, Int>()
//
//    grades["Рамазан"] = 90
//    grades["Али"] = 75
//    grades["Тимур"] = 85
//    grades["Аслан"] = 70
//    grades["Данияр"] = 95
//
//    println("\nTask 10")
//    println("Все студенты:")
//
//    for ((name, grade) in grades) {
//        println("$name: $grade")
//    }
//
//    println("Студенты с оценкой выше 80:")
//
//    for ((name, grade) in grades) {
//        if (grade > 80) {
//            println("$name: $grade")
//        }
//    }
//}
//
//fun lab2Task11() {
//    val groups = HashMap<String, String>()
//
//    groups["CS-101"] = "Рамазан"
//    groups["CS-102"] = "Али"
//    groups["CS-103"] = "Тимур"
//    groups["CS-104"] = "Аслан"
//    groups["CS-105"] = "Данияр"
//
//    println("\nTask 11")
//    println("Группы и старосты:")
//
//    for ((group, leader) in groups) {
//        println("$group: $leader")
//    }
//
//    groups["CS-102"] = "Арман"
//    groups.remove("CS-105")
//
//    println("После изменения:")
//
//    for ((group, leader) in groups) {
//        println("$group: $leader")
//    }
//}
//
//fun lab2Task12() {
//    val absences = HashMap<String, Int>()
//
//    absences["Рамазан"] = 0
//    absences["Али"] = 5
//    absences["Тимур"] = 2
//    absences["Аслан"] = 8
//    absences["Данияр"] = 0
//
//    println("\nTask 12")
//    println("Количество пропусков:")
//
//    for ((name, count) in absences) {
//        println("$name: $count")
//    }
//
//    val mostAbsent = absences.maxByOrNull { it.value }
//
//    if (mostAbsent != null) {
//        println("Больше всего пропусков: ${mostAbsent.key}, ${mostAbsent.value}")
//    }
//
//    println("Студенты без пропусков:")
//
//    for ((name, count) in absences) {
//        if (count == 0) {
//            println(name)
//        }
//    }
//}
//
//class Student(
//    val name: String,
//    val grades: ArrayList<Int>
//) {
//    fun averageGrade(): Double {
//        return grades.average()
//    }
//}
//
//fun lab2Task13() {
//    val students = arrayListOf(
//        Student("Рамазан", arrayListOf(90, 85, 95, 88)),
//        Student("Али", arrayListOf(75, 80, 72, 78)),
//        Student("Тимур", arrayListOf(95, 92, 97, 90)),
//        Student("Аслан", arrayListOf(82, 85, 80, 88))
//    )
//
//    println("\nTask 13")
//
//    for (student in students) {
//        println("${student.name}: ${student.averageGrade()}")
//    }
//
//    val bestStudent = students.maxByOrNull {
//        it.averageGrade()
//    }
//
//    if (bestStudent != null) {
//        println(
//            "Самый высокий средний балл: ${bestStudent.name}, ${bestStudent.averageGrade()}"
//        )
//    }
//
//    val uniqueGrades = HashSet<Int>()
//
//    for (student in students) {
//        uniqueGrades.addAll(student.grades)
//    }
//
//    println("Уникальные оценки:")
//    println(uniqueGrades)
//}
//
//class Book(
//    val title: String,
//    val author: String,
//    val year: Int
//)
//
//fun lab2Task14() {
//    val books = arrayListOf(
//        Book("1984", "George Orwell", 1949),
//        Book("Animal Farm", "George Orwell", 1945),
//        Book("The Hobbit", "J.R.R. Tolkien", 1937),
//        Book("The Lord of the Rings", "J.R.R. Tolkien", 1954),
//        Book("Fahrenheit 451", "Ray Bradbury", 1953)
//    )
//
//    val booksByAuthor = HashMap<String, ArrayList<Book>>()
//
//    for (book in books) {
//        if (!booksByAuthor.containsKey(book.author)) {
//            booksByAuthor[book.author] = ArrayList()
//        }
//
//        booksByAuthor[book.author]?.add(book)
//    }
//
//    println("\nTask 14")
//
//    for ((author, authorBooks) in booksByAuthor) {
//        println("$author: ${authorBooks.size} книг")
//
//        for (book in authorBooks) {
//            println("${book.title}, ${book.year}")
//        }
//    }
//}
//
//open class Employee(
//    val name: String,
//    val salary: Double
//) {
//    open val position: String = "Employee"
//
//    open fun printInfo() {
//        println("$name, $position, зарплата: $salary")
//    }
//}
//
//class Manager(
//    name: String,
//    salary: Double,
//    val teamSize: Int
//) : Employee(name, salary) {
//
//    override val position: String = "Manager"
//
//    fun bonus(): Double {
//        return teamSize * 1000.0
//    }
//
//    override fun printInfo() {
//        println(
//            "$name, $position, зарплата: $salary, команда: $teamSize, премия: ${bonus()}"
//        )
//    }
//}
//
//fun lab2Task15() {
//    val employees = arrayListOf<Employee>(
//        Employee("Рамазан", 250000.0),
//        Employee("Али", 220000.0),
//        Manager("Тимур", 400000.0, 5),
//        Manager("Аслан", 450000.0, 8)
//    )
//
//    println("\nTask 15")
//    println("Сотрудники:")
//
//    for (employee in employees) {
//        employee.printInfo()
//    }
//
//    val totalSalary = employees.sumOf {
//        it.salary
//    }
//
//    println("Суммарная зарплата: $totalSalary")
//
//    val positions = HashSet<String>()
//
//    for (employee in employees) {
//        positions.add(employee.position)
//    }
//
//    println("Уникальные должности:")
//    println(positions)
//}