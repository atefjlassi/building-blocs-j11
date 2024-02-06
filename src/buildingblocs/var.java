package buildingblocs;

/**
 *
 * @author Atef Jlassi
 */
//'var' not allowed here
//  as of release 10, 'var' is a restricted type name and cannot be used for type declarations
public class var { // CF

    public static void main(String[] args) {

        var n = "Data";
        n = null;
        var m = 5;
        m = null; //incompatible types: <null> cannot be converted to int
        var o = (String) null;
        System.out.println(o.length()); // Compile but NPE
        var var = 2;
        
        var night = new Object();
    }
}
