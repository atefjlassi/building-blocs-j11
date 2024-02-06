/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Operators;

/**
 *
 * @author Atef Jlassi
 */
public class Operators {

    public static void main(String[] args) {

   
        byte apples = 5;
        short oranges = 10;
        // short bananas = (short)(apples + oranges);
        /**
         * The expression apples + oranges is automatically promoted to int, so
         * int and data types that can be promoted automatically from int will
         * work. Options A, B, and D are such data types. Option C will not work
         * because boolean is not a numeric data type. Options E and F will not
         * work without an explicit cast to a smaller data type.
         */
//        short bananas = (apples + oranges); // CF: incompatible types: possible lossy conversion from int to short

        String s = null;
        boolean b = s == null;
        System.out.println("b : "+ b);
            
        openZoo(-1);
        
        System.out.println(null instanceof String);
    }
    public static void openZoo(Number time) {
        if (time instanceof Integer) {
            System.out.println((Integer)time +" 0'clock");
        } else 
            System.out.println(time);
    }
}
