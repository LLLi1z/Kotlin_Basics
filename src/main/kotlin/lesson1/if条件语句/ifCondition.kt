package lesson1.if条件语句

import main.java.Kotlin和Java的区别.MyClass

fun main() {

    //问号表达式 2 > 1? a:b
    //判空表达式   a ?: b  成立结果为a，不成立结果为b
    var school = MyClass.getName()
    val result = school.length ?: "没有内容"
    println(result)
}

fun test1(){
    val num =20

    if (num > 10){

    }else{

    }

    //Kotlin里面if-else是一个表达式 -> 结果
    val result = if (num > 10) "下载成功" else "下载失败"

    //if和else语句的最后内容就是这个表达式的返回值
    val res = if (num > 10){
        println("$num > 10")
        20
    }else{
        println("$num < 10")
        "失败"
    }

    var temp: Int = 0
    var name: String
    if (1 > 0){
        temp = 20
    }else{
        name = "Name"
    }

}