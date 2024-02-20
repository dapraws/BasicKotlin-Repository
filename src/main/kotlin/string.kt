package com.dicoding.kotlin

fun main() {
    val text  = "Dicoding.com"
    val firstChar = text[3]
    print("The 4th character of the $text is $firstChar")

    // Indexing
    for (char in text){
        print("$char ")
    }

    // Escaped
    val statement = "Kotlin is \"Awesome!\""
    print(statement)

    // Unicode
    val name = "Unicode test: \u00A9"
    print(name)

    // Raw
    val line = """
        Line 1
        Line 2
        Line 3
        Line 4
    """.trimIndent()
    print(line)
}

/*
  output : The 4th character of the Dicoding.com is o
  output : D i c o d i n g
  output : Kotlin is "Awesome!"
  output: Unicode test : ©
  output:
        Line 1
        Line 2
        Line 3
        Line 4
*/