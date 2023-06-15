/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package org.quaan.main.util.core.test;

import org.quaan.mathutil.core.MathUtility;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 *
 * @author ACER
 */
public class MathUtilityTest {

    @Test
    public void checkFactorialGIvenRightArgumentReturnsWell() {
        //assertEquals(69, 69);
        assertEquals(1, MathUtility.getFactorial(0));
        assertEquals(1, MathUtility.getFactorial(1));
        assertEquals(2, MathUtility.getFactorial(2));
        assertEquals(24, MathUtility.getFactorial(4));
        assertEquals(720, MathUtility.getFactorial(6));
    }
}

// Kien thuc moi: DDT: DATA DRIVEN TESTING
// KI THUAT VIET CODE KIEM THU CUA UNIT TEST
// MA TACH PHAN DATA RA KHOI CÁC LỆNH assertE()
// Viết các test case hướng về việc tách data test ra riêng biệt
// KO NHẦM LẪN VỚI TDD: TEST DRIVEN DEVELOPMENT
// test case để đảm bảo / method / class chạy ngon
// TDD: viết code chính và code test/test case đan xen để check hàm đúng sai
//DDT: trong quá tình viết code test, tách data ra riêng 1 chỗ cho dễ đọc, bảo trì 
// DDT là nằm trong TDD
