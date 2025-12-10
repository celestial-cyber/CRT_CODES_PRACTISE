//#include <stdio.h>
//#include <stdlib.h>   // for exit()

int main() {
    int choice, device, light = 0, fan = 0, ac = 0, tv = 0, choose;
    float totalEnergy = 0, hours;

    while (1) {
        printf("\n====== SMART HOME ELECTRICITY SYSTEM =========\n");
        printf("1. Turn on Appliances\n");
        printf("2. Turn off Appliances\n");
        printf("3. View Current Status\n");
        printf("4. Calculate Energy Usage\n");
        printf("5. Exit\n");        // <-- Added
        printf("Enter your choice: ");
        scanf("%d", &choice);

        switch (choice) {

            // Turn ON
            case 1:
                printf("\nSelect the device to turn on\n1.Light\n2.Fan\n3.AC\n4.TV\n");
                scanf("%d", &choose);
                if (choose == 1) {
                    light = 1;
                    printf("Light is turned ON\n");
                } 
                else if (choose == 2) {
                    fan = 1;
                    printf("Fan is turned ON\n");
                } 
                else if (choose == 3) {
                    ac = 1;
                    printf("AC is turned ON\n");
                } 
                else if (choose == 4) {
                    tv = 1;
                    printf("TV is turned ON\n");
                } 
                else {
                    printf("Invalid device\n");
                }
                break;

            // Turn OFF
            case 2:
                printf("\nEnter the device to turn off:\n1.Light\n2.Fan\n3.AC\n4.TV\n");
                scanf("%d", &device);

                if (device == 1) {
                    if (light) { light = 0; printf("Light is turned OFF\n"); }
                    else printf("Light is already OFF\n");
                }
                else if (device == 2) {
                    if (fan) { fan = 0; printf("Fan is turned OFF\n"); }
                    else printf("Fan is already OFF\n");
                }
                else if (device == 3) {
                    if (ac) { ac = 0; printf("AC is turned OFF\n"); }
                    else printf("AC is already OFF\n");
                }
                else if (device == 4) {
                    if (tv) { tv = 0; printf("TV is turned OFF\n"); }
                    else printf("TV is already OFF\n");
                }
                else {
                    printf("Invalid option\n");
                }
                break;

            // View Status
            case 3:
                printf("\n======== Appliances Status ==========\n");
                printf("Light : %s\n", light ? "ON" : "OFF");
                printf("Fan   : %s\n", fan ? "ON" : "OFF");
                printf("AC    : %s\n", ac ? "ON" : "OFF");
                printf("TV    : %s\n", tv ? "ON" : "OFF");
                break;

            // Energy usage
            case 4:
                printf("Enter the hours the devices were running: ");
                scanf("%f", &hours);

                if (light) totalEnergy += (10 * hours) / 1000.0;
                if (fan) totalEnergy += (50 * hours) / 1000.0;
                if (ac) totalEnergy += (1500 * hours) / 1000.0;
                if (tv) totalEnergy += (100 * hours) / 1000.0;

                printf("Total Energy used: %.2f kWh\n", totalEnergy);
                break;

            // EXIT PROGRAM
            case 5:
                printf("\nExiting Smart Home System... Goodbye!\n");
                exit(0);      // <--- EXIT PROGRAM

            default:
                printf("Invalid choice\n");
        }
    }

    return 0;
}
