package fizzBuzz

import org.junit.Assert.assertArrayEquals
import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.specification.describe

object FizzBuzzTests: Spek ({
    describe("FizzBuzz"){
        it("One Number"){
            val expected = arrayOf("1")
            assertArrayEquals(expected, fizzBuzz(1))
        }

        it("Ten numbers"){
            val expected = arrayOf("1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz")
            assertArrayEquals(expected, fizzBuzz(10))
        }
    }
})