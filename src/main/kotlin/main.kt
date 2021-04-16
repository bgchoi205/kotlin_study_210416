fun main () {

    val person1 = Person(1,"k", 30, "korea");
//    println(person1.introduce())
    val person2 = Person(2,"jack", 28, "USA")
    val person3 = Person(3,"j", 29, "italy")

//    println(person1)
//    println(person2)
//    println(person3)

    var arr = IntArray(3){0}
    for(i in arr.indices){
        print("숫자 입력 : ")
//        arr[i] = (readLine() ?:"").trim().toInt()
        arr[i] = readLine()?.trim()?.toInt() ?:0 // 하나하나 실행하다 null 이면 0을 넣는다
    }
    println("입력한 숫자 : ")
    for(i in arr.indices){
        println(arr[i])
    }


}

// 데이터클래스는 주생성자가 필수!
// 자동으로 오버라이드되서 편리, 그러나 간단한 클래스에만 적용하는게 좋다.
data class Person(
    var id : Int,
    var name : String,
    var age : Int,
    var home : String
){
    fun introduce() : String = "안녕하십니까"


//    override fun toString() : String = "id : $id, name : $name, age : $age, home : $home"

}



