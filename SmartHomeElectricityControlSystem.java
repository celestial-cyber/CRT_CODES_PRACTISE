import java.util.Scanner;

public class SmartHome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int light = 0, fan = 0, ac = 0, tv = 0;
        double totalEnergy = 0;

        while (true) {
            System.out.println("\n====== SMART HOME ELECTRICITY SYSTEM =========");
            System.out.println("1. Turn on Appliances");
            System.out.println("2. Turn off Appliances");
            System.out.println("3. View Current Status");
            System.out.println("4. Calculate Energy Usage");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                // Turn ON
                case 1:
                    System.out.println("\nSelect the device to turn on");
                    System.out.println("1.Light\n2.Fan\n3.AC\n4.TV");
                    int choose = sc.nextInt();

                    if (choose == 1) {
                        light = 1;
                        System.out.println("Light is turned ON");
                    } else if (choose == 2) {
                        fan = 1;
                        System.out.println("Fan is turned ON");
                    } else if (choose == 3) {
                        ac = 1;
                        System.out.println("AC is turned ON");
                    } else if (choose == 4) {
                        tv = 1;
                        System.out.println("TV is turned ON");
                    } else {
                        System.out.println("Invalid device");
                    }
                    break;

                // Turn OFF
                case 2:
                    System.out.println("\nEnter the device to turn off:");
                    System.out.println("1.Light\n2.Fan\n3.AC\n4.TV");
                    int device = sc.nextInt();

                    if (device == 1) {
                        if (light == 1) {
                            light = 0;
                            System.out.println("Light is turned OFF");
                        } else {
                            System.out.println("Light is already OFF");
                        }
                    } else if (device == 2) {
                        if (fan == 1) {
                            fan = 0;
                            System.out.println("Fan is turned OFF");
                        } else {
                            System.out.println("Fan is already OFF");
                        }
                    } else if (device == 3) {
                        if (ac == 1) {
                            ac = 0;
                            System.out.println("AC is turned OFF");
                        } else {
                            System.out.println("AC is already OFF");
                        }
                    } else if (device == 4) {
                        if (tv == 1) {
                            tv = 0;
                            System.out.println("TV is turned OFF");
                        } else {
                            System.out.println("TV is already OFF");
                        }
                    } else {
                        System.out.println("Invalid option");
                    }
                    break;

                // Status
                case 3:
                    System.out.println("\n======== Appliances Status ==========");
                    System.out.println("Light : " + (light == 1 ? "ON" : "OFF"));
                    System.out.println("Fan   : " + (fan == 1 ? "ON" : "OFF"));
                    System.out.println("AC    : " + (ac == 1 ? "ON" : "OFF"));
                    System.out.println("TV    : " + (tv == 1 ? "ON" : "OFF"));
                    break;

                // Energy Usage
                case 4:
                    System.out.print("Enter hours the devices were running: ");
                    double hours = sc.nextDouble();

                    if (light == 1) totalEnergy += (10 * hours) / 1000.0;
                    if (fan == 1)   totalEnergy += (50 * hours) / 1000.0;
                    if (ac == 1)    totalEnergy += (1500 * hours) / 1000.0;
                    if (tv == 1)    totalEnergy += (100 * hours) / 1000.0;

                    System.out.printf("Total Energy used: %.2f kWh\n", totalEnergy);
                    break;

                // Exit
                case 5:
                    System.out.println("Exiting Smart Home Electricity System... Goodbye!");
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
