package com.example.myapplication.kiosk


fun main() {
    println("한식당에 오신것을 환영합니다.")
    println("아래의 메뉴를 보시고 메뉴를 선택해주세요.")
    println("1.한정식 2.생선정식 3.돈까스 정식 4.음료선택")
    showMenu()

    try { //숫자와 데이터를 다 읽어야 해서 추가합니다
        var input = readLine()!!.toInt()
    } catch (e: NumberFormatException) {
        println("숫자를 입력해주세요. 다시 시도하세요")
    }
}

fun showMenu( ) {
    while (true) {
        var input = readLine()!!.toInt()
        when (input) {
            1 -> {// 일번메뉴를 선택했을때 보여준다.
                println("1.한정식 입니다.")
                println("[1] 한정식  10000원   메뉴 구성은 밥과 반찬, 국을 포함하여 주인 구성한 그날의 정식입니다")
                savforMal()
            }

            2 -> { //이번 메뉴를 선택했을때 보여준다.
                println("2. 생선정식 입니다.")
                println("[2] 생선정식  13000원  메뉴 구성은 제철 생선과 밥과 반찬, 국을 포함한 정식입니다")
                fishMeal()
            }

            3 -> { //삼번 메뉴를 선택했을때 보여준다.
                println("3. 돈까스 정식 입니다.")
                println("[3] 돈까스정식  12000원  메뉴 구성은 옛날돈까스와 밥과 반찬, 국을 포함한 정식입니다")
                PorkCutletSet()
            }

            4 -> { //4번 선택시 보여준다.
                println("4. 음료선택 입니다.")
                println("[4] 음료선택  1500원  음료는 콜라, 사이다, 환타 선택이 가능합니다.")
                drinkMenu()
            }

            0 -> {
                println("0. 키오스크를 종료합니다")
                break
            }

            else -> {
                println("잘못된 메뉴를 입력했어요. 다시 시도해주세요")
            }


        }

    }
}

    fun drinkMenu(d: String): String {
        return when (d) {
            "1" -> "콜라"
            "2" -> "사이다"
            "3" -> "환타"
            else -> "없습니다"
        }
    }

    fun savforMal() {
        var savforMeal2 = savforMeal("savforMal", 10000)
       savforMeal2.info()}

      fun fishMeal() {
        var fishMeal = fishMeal("fishMeal", 13000)
        fishMeal.info()
    }

    fun PorkCutletSet() {
        var PorkCutletSet = PorkCutletSet("PorkCutletSet", 12000)
        PorkCutletSet.info()
    }

    fun drinkMenu() {
        var drinkMenu = drinkMenu("drinkMenu", 1500)
        drinkMenu.info()
    }


