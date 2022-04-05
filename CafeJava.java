public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app. 
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";
        
        // Menu variables (add yours below)
        double mochaPrice = 1.5;
        double dripCoffeePrice = 2.2;
        double lattePrice = 1.0;
        double cappuccinoPrice = 3.6;
    
        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2 = "Jimmy";
        String customer3 = "Sam";
        String customer4 = "Noah";

        // Order completions (add yours below)
        boolean isReadyOrder1 = true;
        boolean isReadyOrder2 = false;
        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:
        // System.out.println(generalGreeting + customer1); // Displays "Welcome to Cafe Java, Cindhuri"
    	// // ** Your customer interaction print statements will go here ** //
        // Cindhuri ordered a coffee. Print to the console the correct status message, based on her order status
        System.out.println(generalGreeting + customer1 + readyMessage + displayTotalMessage + dripCoffeePrice);

        // Noah ordered a cappuccino. Use an if statement to check the status of his order and print the correct status message. If it is ready, also print the message to display the total. Note: Outcomes may be different depending on what you assigned as the status.
        if(isReadyOrder1) {
            System.out.println(generalGreeting + customer4 + pendingMessage);
        }
        else if(isReadyOrder2) {        
            System.out.println(generalGreeting + customer4 + readyMessage + displayTotalMessage +  cappuccinoPrice);
        }
        
        
        
        // Sam just ordered 2 lattes, print the message to display their total. Next, use an if statement to print the appropriate order status message. Change the isReady flag value from true to false or vice versa in order to test your control logic (if-statement).
        if(isReadyOrder1) {
            System.out.println(generalGreeting + customer3 + pendingMessage); 
        }
        else if(isReadyOrder2){
            System.out.println(generalGreeting+ customer3 + readyMessage + displayTotalMessage + (cappuccinoPrice*2));
        }

        // Jimmy just realized he was charged for a coffee but had ordered a latte. Print the total message with the new calculated total (what he owes) to make up the difference.

        System.out.println(generalGreeting + customer2 + ", your refund balance is:" + "$" + (dripCoffeePrice - lattePrice));









    }
}
