/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package making.decision;

/**
 *
 * @author Atef Jlassi
 */
public class Decision {

    public static void main(String[] args) {
        int month = 3;
        switch (month) {
            case 1 | 2: // case 1 || 2 CF
                System.out.println("January");
                break;

        }

        switch (month) {
            // VALID
        }
        
        countAttendees();
    }

    private static void countAttendees() {
        int participants = 4, animals = 2, performers = -1;
        while ((participants = participants + 1) < 10) {
        }
        do {
        } while (animals++ <= 1);
        for (; performers < 2; performers += 2) {
        }
        System.out.println(participants); //10
        System.out.println(animals); //3 
        System.out.println(performers); // 3
    }
}
