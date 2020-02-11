import kotlin.math.roundToInt

// Задание 8: Проценты по вкладу
// Напишите программу для расчета дохода по вкладу. Пользователь вводит сумму вклада, длительность вклада (количество месяцев) и ежемесячный процент по вкладу.
// Программа выводит в консоль информацию по каждому месяцу отдельно. Информация отображает: на сколько будет увеличиваться вклад в этом месяце и итоговую сумму вклада в данном месяце.
fun main(){
    println("Введите сумму вклада:")
    var amountDeposit = round(readLine().toString().toDouble())

    println("Введите длительность вклада (количество месяцев):")
    val depositDuration = readLine().toString().toInt()

    println("Введите ежемесячный процент по вкладу:")
    val monthPercent = (readLine().toString().toDouble() / 100.0) + 1.0

    var temp: Double

    for (month in 1..depositDuration){
        temp = amountDeposit

        amountDeposit = round(amountDeposit * monthPercent)

        println("""
            |/------------------------------------------------------/
            |Месяц №$month
            |Началная сумма вклада на текущий месяц - '$temp'
            |Конечная сумма вклада на текущий месяц - '$amountDeposit'
            |Доход за месяц - '${round(amountDeposit - temp)}'
            |/------------------------------------------------------/
        """.trimMargin())
    }
}

fun round(value: Double): Double {
    return (value * 100.0).roundToInt() / 100.0
}