package com.rycb.etech.util;

/**
 * @author RYCBStudio/Java Department
 * <p>Create Time: 2022/8/7 18:10</p>
 * <p>Use the IntelliJ IDEA</p>
 * <p>Location: EasyTech/com.rycb.etech.util/Calculator.java</p>
 * <h1><center>Calculator</center></h1>
 */
public class Calculator {
    public static int sq(int num) {
        return num * num;
    }
    
    public static float sq(float num) {
        return num * num;
    }
    
    public static double sq(double num) {
        return num * num;
    }
    
    public static long sq(long num) {
        return num * num;
    }
    
    public static double sqrt(int num) {
        return Math.sqrt(num);
    }
    
    public static double cbrt(int num) {
        return Math.cbrt(num);
    }
    
    public static int randomGenerate(int num, int max) {
        return (Math.max(num, max) == num) ? num : max;
    }
    
    public static float randomGenerate(float num, int max) {
        return (Math.max(num, max) == num) ? num : max;
    }
    
    public static double randomGenerate(double num, int max) {
        return (Math.max(num, max) == num) ? num : max;
    }
    
}
