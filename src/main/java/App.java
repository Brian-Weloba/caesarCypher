import java.io.Console;

public class App {
    public static void main(String[] args) {
        Console con = System.console();

        System.out.println(" ");

        System.out.println("\n" +
                        "░█████╗░░█████╗░███████╗░██████╗░█████╗░██████╗░\n" +
                        "██╔══██╗██╔══██╗██╔════╝██╔════╝██╔══██╗██╔══██╗\n" +
                        "██║░░╚═╝███████║█████╗░░╚█████╗░███████║██████╔╝\n" +
                        "██║░░██╗██╔══██║██╔══╝░░░╚═══██╗██╔══██║██╔══██╗\n" +
                        "╚█████╔╝██║░░██║███████╗██████╔╝██║░░██║██║░░██║\n" +
                        "░╚════╝░╚═╝░░╚═╝╚══════╝╚═════╝░╚═╝░░╚═╝╚═╝░░╚═╝\n");
        System.out.println("\n" +
                "░█████╗░██╗░░░██╗██████╗░██╗░░██╗███████╗██████╗░\n" +
                "██╔══██╗╚██╗░██╔╝██╔══██╗██║░░██║██╔════╝██╔══██╗\n" +
                "██║░░╚═╝░╚████╔╝░██████╔╝███████║█████╗░░██████╔╝\n" +
                "██║░░██╗░░╚██╔╝░░██╔═══╝░██╔══██║██╔══╝░░██╔══██╗\n" +
                "╚█████╔╝░░░██║░░░██║░░░░░██║░░██║███████╗██║░░██║\n" +
                "░╚════╝░░░░╚═╝░░░╚═╝░░░░░╚═╝░░╚═╝╚══════╝╚═╝░░╚═╝\n");
        System.out.println(" ");
        System.out.println("WELCOME TO CAESAR CYPHER!!");

        while (true) {

            System.out.println(" ");
            System.out.println("Would you like to: \n 1. ENCODE \n 2. DECODE \n 3. EXIT");
            int response = 0;
            try {
                response = Integer.parseInt(con.readLine().trim());
            } catch (NumberFormatException e) {
                System.out.println(" ");
            }

            if (response == 1) {
                System.out.println("Input text to encode: ");
                String inputText = con.readLine().toLowerCase();
                System.out.println("Enter key: ");
                int key = Integer.parseInt(con.readLine().trim());
                Cypher cypher = new Cypher(key, inputText);
                if (cypher.isInputValid(inputText) && cypher.isKeyValid(key)) {
                    System.out.println("The encoded text is: \n"+ cypher.encode());
                }

            }else if (response==2){
                System.out.println("Input text to decode: ");
                String inputText = con.readLine().toLowerCase();
                System.out.println("Enter key: ");
                int key = Integer.parseInt(con.readLine().trim());
                Cypher cypher = new Cypher(key, inputText);
                if (cypher.isInputValid(inputText) && cypher.isKeyValid(key)) {
                    System.out.println("The decoded text is: \n"+ cypher.decode());
                }

            }else if ( response ==3){
                System.out.println("\n" +
                        "░██████╗░░█████╗░░█████╗░██████╗░██████╗░██╗░░░██╗███████╗\n" +
                        "██╔════╝░██╔══██╗██╔══██╗██╔══██╗██╔══██╗╚██╗░██╔╝██╔════╝\n" +
                        "██║░░██╗░██║░░██║██║░░██║██║░░██║██████╦╝░╚████╔╝░█████╗░░\n" +
                        "██║░░╚██╗██║░░██║██║░░██║██║░░██║██╔══██╗░░╚██╔╝░░██╔══╝░░\n" +
                        "╚██████╔╝╚█████╔╝╚█████╔╝██████╔╝██████╦╝░░░██║░░░███████╗\n" +
                        "░╚═════╝░░╚════╝░░╚════╝░╚═════╝░╚═════╝░░░░╚═╝░░░╚══════╝\n");
                System.exit(0);
            }else{
                System.out.println("Invalid option");
            }

        }

    }
}
