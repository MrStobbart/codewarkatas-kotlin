package tribonacci

import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.specification.describe
import org.junit.Assert.assertArrayEquals

object ApplicationSpec : Spek({

    val basicSignature = doubleArrayOf(1.0, 2.0, 3.0)
    val precision = 1e-10;

    describe("Calculation of tribonacci") {
        it("Returns an empty double array for n = 0"){
            assertArrayEquals(doubleArrayOf(), tribonacci(basicSignature, 0), precision)
        }
        it("Returns the first element for n = 1"){
            assertArrayEquals(doubleArrayOf(1.0), tribonacci(basicSignature, 1), precision)
        }
        it("Returns the first and the second element for n = 2"){
            assertArrayEquals(doubleArrayOf(1.0, 2.0), tribonacci(basicSignature, 2), precision)
        }
        it("Returns the signature for n = 3"){
            assertArrayEquals(doubleArrayOf(1.0, 2.0, 3.0), tribonacci(basicSignature, 3), precision)
        }

        it("calculates tribonacci"){
            assertArrayEquals(doubleArrayOf(1.0,1.0,1.0,3.0,5.0,9.0,17.0,31.0,57.0,105.0), tribonacci(doubleArrayOf(1.0,1.0,1.0),10), precision)
            assertArrayEquals(doubleArrayOf(0.0,0.0,1.0,1.0,2.0,4.0,7.0,13.0,24.0,44.0), tribonacci(doubleArrayOf(0.0,0.0,1.0),10), precision)
            assertArrayEquals(doubleArrayOf(0.0,1.0,1.0,2.0,4.0,7.0,13.0,24.0,44.0,81.0), tribonacci(doubleArrayOf(0.0,1.0,1.0),10), precision)
        }

    }
})
