package com.rycb.etech.util;

import java.util.Random;

/**
 * @author RYCBStudio/Java Department
 * <p>Create Time: 2022/8/7 18:10</p>
 * <p>Use the IntelliJ IDEA</p>
 * <p>Location: EasyTech/com.rycb.etech.util/SimpleCalculator.java</p>
 * <h1><center>SimpleCalculator</center></h1>
 */
public class SimpleCalculator {
    
    public static float getSimpleBurnXp() {
        float xp = new Random().nextFloat();
        return xp > 0.7f ? xp : 0.75f;
    }
    
    public static class rGenerate {
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
    
    public static class sq {
        public static int square(int num) {
            return num * num;
        }
        
        public static float square(float num) {
            return num * num;
        }
        
        public static double square(double num) {
            return num * num;
        }
        
        public static long square(long num) {
            return num * num;
        }
    }
    
    public static class root {
        public static double sqrt(int num) {
            return Math.sqrt(num);
        }
        
        public static double cbrt(int num) {
            return Math.cbrt(num);
        }
    }
}
