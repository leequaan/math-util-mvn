/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package org.quaan.math.util.main;

import org.quaan.mathutil.core.MathUtility;

/**
 *
 * @author User
 */
public class MathUtilityMvn {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Run test case #1
        int n = 0; // check getF(0) 0!
        long expected = 1; // hy vọng 0! trả về 1
        long actual;        // = ?; 0! thực tế là mấy, gọi hàm mới biết
        actual = MathUtility.getFactorial(n);
//      So sánh hoi
        System.out.println(n + "! | expected: " + expected + "| actual: " + actual);
        //    Test case #2:
        System.out.println("1! | expected: 1" + "| actual: " + MathUtility.getFactorial(1));
        //    Test case #3:
        System.out.println("5! | expected: 120" + "| actual: " + MathUtility.getFactorial(5));
        //    Test case #4:
        System.out.println("-1! | expected: NL" + "| actual: " );
        MathUtility.getFactorial(-1);

    }

}
