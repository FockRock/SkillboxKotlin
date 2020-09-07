package com.skillbox.kotlin

fun main() {
    val pair1 = Pair("key", "value")
    val pair2 = 1 to 2

    println(pair1.first)
    println(pair1.second)

    println(pair2)

    val map = mapOf(
        "Name1" to "+79993456543",
        "Name2" to "+79993456544",
        "Name3" to "+79993456545"
    )

    println(map["Name1"])

    val mutableMap = map.toMutableMap()
    val mutableMap2 = mutableMapOf("1" to "2")
    mutableMap["Name1"] = "143463"
    mutableMap["Name"] = "248930"
    mutableMap.put("key", "value")
    mutableMap.remove("key")
    println(mutableMap)

    val sortedMap = sortedMapOf(
        "2" to "22",
        "3" to "33",
        "4" to "44",
        "5" to "55",
        "6" to "66",
        "1" to "11"
    )

    val hashMap = hashMapOf(
        "2" to "22",
        "3" to "33",
        "4" to "44",
        "5" to "55",
        "6" to "66",
        "1" to "11"
    )

    println(sortedMap)

    println(hashMap.keys)
    println(hashMap.values)

    for (key in hashMap.keys) {
        println("key = $key, value = ${hashMap[key]}")
    }

    hashMap.forEach { (key, value) ->
        key
        value
    }
}