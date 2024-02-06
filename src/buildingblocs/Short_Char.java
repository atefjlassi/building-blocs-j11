package buildingblocs;

/**
 *
 * @author Atef Jlassi
 */
public class Short_Char {

    public static void main(String[] args) {
        short bird = 'd';
        char mammal = (short) 83;

        System.out.println(bird);
        System.out.println(mammal);
        
        
        // CF outside the range of short and char
        // short reptile = 65535;  // incompatible types: possible lossy conversion from int to short
        // char fish = (short)-1; // incompatible types: possible lossy conversion from short to char
    }
}
