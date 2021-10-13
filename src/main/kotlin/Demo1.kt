/**
 * kotlin函数demo
 */
class Demo1 {
    /**
     * 基本式
     */
    fun sum(a: Int, b: Int): Int {
        return a + b
    }

    /**
     * 无返回值式(:Unit可以省略)
     */
    fun sum0(a:Int,b: Int) {
        println(a+b)
    }

    /**
     * 可变参数式
     */
    fun sum1(vararg arr: Int): Int {
        var a = 0
        for (i in arr) {
            a += i
        }
        return a
    }

    /**
     * lambda式
     */
    var sum2: (Int, Int) -> Int = { x, y -> x + y }
}