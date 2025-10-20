package com.cleevio.example

class TestKotlinService {
    fun makeKotlinWorkWithJavaAndLombok(){
        val testDto = TestDto()
        // use Lombok generated getters and setters
        println("Generated getter: ${testDto.name}, ${testDto.age}")
        testDto.name = "Something"
        testDto.age = 10
        println("Generated toString: $testDto")
    }
}