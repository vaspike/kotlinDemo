import java.util.ArrayList

fun main() {
    //kotlin中没有new关键字
    // val为声明final变量
    val demo1 = Demo1()
    println("---kotlin函数写法概览 start-----")
    //kotlin函数写法概览 start
    val sum = demo1.sum(4, 5)
    println("--------基本式-------")
    println(sum)

    println("-----无返回值式(:Unit可以省略)--------")
    demo1.sum0(1, 8)

    val sum1 = demo1.sum1(1, 5, 6, 8)
    println("------可变参数式-------")
    println(sum1)

    val sum2 = demo1.sum2(1, 4)
    println("------lambda式---------")
    println(sum2)
    //kotlin函数写法概览 end


    //字符串模板
    println("-------字符串模板--------")
    val s = "a is $sum2"
    println(s)
    val s0 = "b is ${demo1.sum2(2, 3)}"
    println(s0)

    //null问题
    println("-------Kotlin null 问题--------")
    println("-------数据类型后加'?'表示变量可为空--------")
    //数据类型后加'?'表示变量可为空
    val age: String? = null
    //当age为null时将不做处理返回null
    val c = age?.toInt()
    println("-------当age为null时将不做处理返回null--------")
    println("c is $c")
    println("-------当age为null时将返回-1--------")
    //当age为null时将返回-1
    val e = age?.toInt() ?: -1
    println("e is $e")

    //当age为null时将抛出空指针异常
    try {
        val d = age!!.toInt()
        println("d is $d")
        println()
    } catch (e: Exception) {
        println("-------当age为null时将抛出空指针异常--------")
        println("exception is $e")
    }

    println("------类型检测及自动类型转换-------")
    //类型检测及自动类型转换
    val demo2 = Demo2()
    val len0 = demo2.getStringLength("再见")
    val len1 = demo2.getStringLength(125)
    println("len0 is $len0")
    println("len1 is $len1")

    //区间
    println("------区间-------")
    println("基本循环(左闭右闭):")
    for (i in 1..3) {
        println(i)
    }
    println("-------------------")
    println("设置步长:")
    for (i in 1..4 step 2) {
        println(i)
    }
    println("-------------------")
    println("使用downTo:")
    for (i in 4 downTo 1 step 2) {
        println(i)
    }
    println("-------------------")
    println("使用until处理(左闭右包):")
    for (i in 1 until 4) {
        println(i)
    }
    println("-------------------")

    //Kotlin 的基本数值类型包括 Byte、Short、Int、Long、Float、Double 等。不同于 Java 的是，字符不属于数值类型，是一个独立的数据类型。kotlin中没有基础数据类型
    //比较两个数字
    val f = 10000
    val g: Int? = f
    val h: Int? = f
    println("-----kotlin中'==='比较的是对象的地址-------")
    //kotlin中'==='比较的是对象的地址
    println("g===h is ${g === h}")
    //'=='比较的是对象的值
    println("-----'=='比较的是对象的值---")
    println("g==h is ${g == h}")

    //类型转换
    //toByte(): Byte
    //toShort(): Short
    //toInt(): Int
    //toLong(): Long
    //toFloat(): Float
    //toDouble(): Double
    //toChar(): Char
    println("-------类型转换-------")
    val i1 = 5
    val char = i1.toChar()
    println(char)
    println("-------------------")

    //数组
    println("--------数组--------")
    //使用arrayOf()函数
    val arr1 = arrayOf(1, 2, 3)
    //使用工厂函数
    val arr2 = Array(3) { j: Int -> j * 2 }
    println(arr1[2])
    println(arr2[2])
    arr2[2] = 0
    println(arr2[2])
    println("-------------------")

    //条件控制之:when
    println("-------条件控制之:when-------")
    val x = 0
    when (x) {
        0, 1 -> println("x == 0 or x == 1")
        else -> println("otherwise")
    }

    when (x) {
        1 -> println("x == 1")
        2 -> println("x == 2")
        else -> { // 注意这个块
            println("x 不是 1 ，也不是 2")
        }
    }

    when (x) {
        in 0..10 -> println("x 在该区间范围内")
        else -> println("x 不在该区间范围内")
    }
    println("-------------------")

    //循环控制
    //基础for
    println("------循环控制--------")
    println("------基础for--------")
    for (i in arr1) {
        println(i)
    }
    println("------获取索引-----")
    //获取索引
    for (i in arr1.indices){
        println(i)
    }
    println("------同时获取索引与值------")
    //同时获取索引与值
    for ((index,value) in arr1.withIndex()){
        println("the element at $index is $value")
    }
}