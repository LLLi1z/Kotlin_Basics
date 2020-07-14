package lesson1.变量定义

fun main() {
//    Byte
//    Int
//    Float
//    Double
//    Long
//    Boolean
//    String
//    Array
//    List
//    Map
//    Set.基本数据类型
    //var 定义变量，可能进行更改就使用var
    //val 定义常量，明确不行更改了，就使用val

    //定义的时候明确指定类型
    val pi: Double = 3.14
    //类型自动推导（类型可要可不要）
    val name: String = "中国"

    var temp = 20 //自动判别为int型
    var score = 95.5 //自动判别为double型
    temp = 30
    // 不能 score = temp，说明Kotlin是类型安全的语言，不一样就不能赋值
    // 通过Number类提供的对应的to方法进行显示转换
    score = temp.toDouble()
    temp = score.toInt()
}