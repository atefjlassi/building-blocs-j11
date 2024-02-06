/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Operators;

import java.util.Map;
import java.util.Set;

/**
 *
 * @author Atef Jlassi
 */
public class Quiz {

    public static void main(String[] args) {
//        System.out.print(addCandy(1.4, 2.4f) + "-");
//        System.out.print(addCandy(1.9, (float) 4) + "-");
//        System.out.print(addCandy((long) (int) (short) 2, (float) 4));

//        boolean sunny = true, raining = false, sunday = true;
//        boolean goingToTheStore = sunny & raining ^ sunday;
//        System.out.println(goingToTheStore);

        /**
         * This Answer is Correct The code compiles and runs without issue, so
         * option E is not correct. This example is tricky because of the second
         * assignment operator embedded in line 5. The expression (wolf=false)
         * assigns the value false to wolf and returns false for the entire
         * expression. Since teeth does not equal 10, the left side returns
         * true; therefore, the exclusive or (^) of the entire expression
         * assigned to canine is true. The output reflects these assignments,
         * with no change to teeth, so option B is the only correct answer.
         */
        boolean canine = true, wolf = true;
        int teeth = 20;
        canine = (teeth != 10) ^ (wolf = false);

        System.out.println(canine + ", " + teeth + ", " + wolf);
        
//        Byte.MAX_VALUE
        Set

    }

    void q1() { //  void static q1() => invalid method declaration; return type required
        int a = 2, b = 4, c = 2;
        System.out.println(a > 2 ? --c : b++);
        System.out.println(b = (a != c ? a : b++));
        System.out.println(a > b ? b < c ? b : 2 : 1);
    }

    // The ternary operator is the only operator that takes three values, making option D the only correct choice.
    static long addCandy(double fruit, float vegetables) {

        return (int) (fruit + vegetables);

    }

}
