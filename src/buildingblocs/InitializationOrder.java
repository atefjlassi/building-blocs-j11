package buildingblocs;

/**
 *
 * @author Atef Jlassi
 */
public class InitializationOrder extends Object{
    
    private String name = "Fluffy"; // 1.1

    {
        int f = 0;
        System.out.println("Setting field"); // 1.2
    }
    

    {
        System.out.println(name);
    }
    
    /**
     * if name was declared here, CF: because its used before it been declared
     */
    
    // private String name = "Fluffy"; 

    public InitializationOrder() { // 2
        name = "Tiny";
        System.out.println("Setting constructor");

    }

    public static void main(String[] args) {
        InitializationOrder initOrder = new InitializationOrder(); // 0
        System.out.println(initOrder.name);

        
    }
    
    public void findAnswer(boolean check) {
        int answer;
        int otherAnswer;
        int onlyOneBranch;
        if(check) {
            onlyOneBranch = 1;
            answer = 1;
        } else {
            answer = 2;
        }
        System.out.println(answer);
        //System.out.println(onlyOneBranch); // CF: variable onlyOneBranch might not have been initialized
    }
    
    public void checkAnswer() {
        boolean value;
        findAnswer(value); // variable value might not have been initialized
    }
    
}
