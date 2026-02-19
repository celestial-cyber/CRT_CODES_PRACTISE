//mobile battery monritor - ue mobile (consume battery) , charge battery . check batteyr status . batteyralerts , exi t
//charge battery - how much to charge - batteyr charged 
//3. current battery level =90 - else print lw batteyr 



import java.util.*;

class Program3{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int choice;
        int totalCharge = 100;
        int used = 0;
        int available = totalCharge;

        while (true) {
            System.out.println("========== Mobile Battery Monitor ==============");
            System.out.println("1. Use Mobile (Consume Battery)");
            System.out.println("2. Charge Battery");
            System.out.println("3. Check Battery Status");
            System.out.println("4. Battery Alerts");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = in.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter charge to consume: ");
                    int chargeToUse = in.nextInt();
                    if (chargeToUse > available) {
                        System.out.println("Not enough charge available!");
                    } else {
                        used += chargeToUse;
                        available = totalCharge - used;
                        System.out.println("Battery charge used successfully.");
                    }
                    break;

                case 2:
                    System.out.print("Enter battery percentage to be charged: ");
                    int toBeCharged = in.nextInt();
                    available += toBeCharged;
                    if (available > totalCharge) {
                        available = totalCharge;
                    }
                    used = totalCharge - available;
                    System.out.println("Battery charged successfully.");
                    break;

                case 3:
                    System.out.println("Available charge: " + available + "%");
                    System.out.println("Used charge: " + used + "%");
                    break;

                case 4:
                    if (available < 25) {
                        System.out.println("Warning! Battery low.");
                    } else {
                        System.out.println("Battery level is sufficient.");
                    }
                    break;

                case 5:
                    System.out.println("Exiting Mobile Battery Monitor...");
                    in.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
