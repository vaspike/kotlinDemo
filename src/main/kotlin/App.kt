fun main() {
    //kotlin中没有new关键字
    // val为声明final变量
    val demo1 = Demo1()

    val sum = demo1.sum(4, 5)
    println(sum)
    println()

    demo1.sum0(1, 8)
    println()

    val sum1 = demo1.sum1(1, 5, 6, 8)
    println(sum1)
    println()

    val sum2 = demo1.sum2(1, 4)
    println(sum2)
    println()

    //字符串模板
    val s = "a is $sum2"
    println(s)
    val s0 = "b is ${demo1.sum2(2, 3)}"
    println(s0)
    println()

    //null问题
    //数据类型后加'?'表示变量可为空
    val age: String? = null
    //当age为null时将不做处理返回null
    val c = age?.toInt()
    println("c is $c")
    //当age为null时将返回-1
    val e = age?.toInt() ?: -1
    println("e is $e")

    //当age为null时将抛出空指针异常
    val d = age!!.toInt()
    println("d is $d")

}