/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package org.quaan.main.util.core.test;

import static org.quaan.mathutil.core.MathUtility.getFactorial;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.params.ParameterizedTest;  
import org.junit.jupiter.params.provider.MethodSource;

/**
 *
 * @author ACER
 */
public class MathUtilityAdvancedTest {

    // Hàm trả về mảng 2 chiều gồm nhiều dòng, 2 cột
    // 0 -> 1
    // 0 -> 1
    // 1 -> 1
    // 2 -> 2
    // 6 -> 720 
    // mảng 2 chiều, cột 0 là n, cột 1 là expected
    // n expected
    public static Object[][] unitTestData() {
        // int a[] = {5, 10, 15, 20};
        Object testData[][] = {{0, 1},
                               {1, 1}, 
                               {2, 2}, 
                               {4, 24}, 
                               {5, 120}
                              };
        return testData;
    }
    
    @ParameterizedTest
    @MethodSource("unitTestData")
    public void checkFactorialGIvenRightArgumentReturnsWell(int n, long expected) {
                                                          //cột 0         cột 1
        assertEquals(expected, getFactorial(n));
    }
}

// BẮT NGOẠI LỆ THÌ SAO, TỨC LÀ HÀM CỦA TA GETF() TRẢ VỀ
// NGOẠI LỆ KHI ĐƯA N CÀ CHỚN, -1, -2, N > 20
// HÀM NÀY LẠI XÀI LAMBDA EXPRESS, THỨ 5 CẤM VẮNG
// VÌ ÔNG SẼ GIẢNG CĂN BẢN VỀ LAMBDA LÀ GÌ?
//                         CHỈ CÒN CÁI DÂY NỊT
// TDD Test Driven Development: là kĩ thuật xài cho dân DEV
// nói về việc code chính cần phải đc kiểm tra ngay và chất lượng
// nên viết code chính đan xen, xen kẽ cùng với việc thiết kế
// các test case để test code chính
// lập trình mà viết code chính và code test (JUnit, Unit Test)
// đan xen xen kẽ nhau thì gọi là TDD
// VIẾT CODE THEO VIỆC KIỂM THỬ NGAY CODE

// DDT: Data Driven Testing: là kĩ thuật mở rộng, bổ sung thêm cho:
// TDD trong đó việc viết code test đc tách riêng ra so vs test
// data nghĩa là bộ dữ liệu test thường đc đặt 
