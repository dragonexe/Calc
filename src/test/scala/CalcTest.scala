package com.example.test
 
import com.example.Calc
import org.scalatest.Suite
 
class CalcTest extends Suite {
 
    def testAddition() {
        assert(4 === Calc.add(2,2))
    }
}
