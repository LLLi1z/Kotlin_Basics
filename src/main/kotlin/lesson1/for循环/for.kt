package main.kotlin.lesson1.for循环

fun main() {
    /**
     * 变量
     */

    //使用 .. 表示范围
    for (i in 1..10) {
        //println("$i ")
    }

    //使用until不包括最后一个值
    for (i in 1 until 10) {

    }

    //使用step改变增量
    for (i in 1..10 step 2) {
        //println("$i ")
    }

    //使用downTo递减
    for (i in 10 downTo 1) {
        //println("$i ")
    }

    /**
     * 数组
     */

    //遍历数组
    val names = arrayOf("jack", "rose", "merry")
    for (i in 0 until names.size) {
        //println(names[i])
    }

    //更优方法
    for (element in names) {
        println(element)
    }

    //依次获取每一个item
    for (item in names) {
        println(item)
    }

    //获取对应的索引值
    for (i in names.indices) {
        println(names[i])
    }

    for ((index,item) in names.withIndex()){
        println("$index-$item")
    }
}