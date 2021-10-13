class Demo2 {
    /**
     * 变量类型判断及smart cast
     */
    fun getStringLength(obj: Any): Int {
        if (obj is String) {
            return obj.length
        }
        return -1
    }
}