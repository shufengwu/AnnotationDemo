package com.delta.annotation

// Java 编写的注解没有定义参数顺序，所以不能使用常规函数
// 调用语法来传递参数。相反，你需要使用命名参数语法。
@Ann(intValue = 1, stringValue = "abc")

//参数是value，无需显式名称指定
@AnnWithValue("abc")

//value 参数具有数组类型，它会成为 Kotlin 中的一个 vararg 参数
@AnnWithArrayValue("abc", "foo", "bar")

//具有数组类型的非value参数，你需要显式使用 arrayOf
@AnnWithArrayMethod(names = arrayOf("abc", "foo", "bar"))
class C{
    fun testAnno(ann:Ann){
        val i = "${ann.intValue}---${ann.stringValue}"
        println(i)
    }
}