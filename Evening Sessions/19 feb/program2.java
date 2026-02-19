import java.util.*;

class Program1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int choice;
        int totalData = 2048;
        int used = 0;
        int available = totalData;

        while (true) {
            System.out.println("========== Mobile Data Tracker ==============");
            System.out.println("1. Use Data");
            System.out.println("2. Check Data Balance");
            System.out.println("3. Data Alerts");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = in.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Data to use (MB): ");
                    int dataToUse = in.nextInt();
                    if (dataToUse > available) {
                        System.out.println("Not enough data available!");
                    } else {
                        used += dataToUse;
                        available = totalData - used;
                        System.out.println("Data used successfully.");
                    }
                    break;

                case 2:
                    System.out.println("Used Data: " + used + " MB");
                    System.out.println("Available Data: " + available + " MB");
                    break;

                case 3:
                    if (available < 500) {
                        System.out.println("Data Warning: You have less Data Available" + available);
                    } else {
                        System.out.println("You have enough data to use.");
                    }
                    break;

                case 4:
                    System.out.println("Exiting Mobile Data Tracker...");
                    in.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
