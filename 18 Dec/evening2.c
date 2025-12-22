#include <stdio.h>

int main() {
    int total_slot = 50;
    int occupied_slot = 0;
    int available_slot = 50;
    int exited = 0;
    int choice, add;

    while (1) {
        printf("\n\n========== SMART PARKING MANAGEMENT SYSTEM ==========");
        printf("\n1. Park One Vehicle");
        printf("\n2. Remove Vehicle");
        printf("\n3. View Parking Status");
        printf("\n4. Park Multiple Vehicles");
        printf("\n5. Exit System");
        printf("\nEnter your choice: ");
        scanf("%d", &choice);

        switch (choice) {

            case 1:
                if (occupied_slot >= total_slot) {
                    printf("Parking Full!");
                } else {
                    occupied_slot++;
                    available_slot = total_slot - occupied_slot;
                    printf("Vehicle parked successfully.");
                }
                break;

            case 2:
                if (occupied_slot <= 0) {
                    printf("No vehicles to remove.");
                } else {
                    occupied_slot--;
                    exited++;
                    available_slot = total_slot - occupied_slot;
                    printf("Vehicle exited successfully.");
                }
                break;

            case 3:
                printf("\n------ Parking Status ------");
                printf("\nTotal Slots      : %d", total_slot);
                printf("\nOccupied Slots   : %d", occupied_slot);
                printf("\nAvailable Slots  : %d", available_slot);
                printf("\nTotal Vehicles Exited: %d", exited);

                if (occupied_slot == total_slot) {
                    printf("\nStatus: PARKING FULL");
                } else {
                    printf("\nStatus: NORMAL");
                }
                break;

            case 4:
                printf("Enter number of vehicles to park: ");
                scanf("%d", &add);

                if (occupied_slot + add > total_slot) {
                    printf("Parking Full! Cannot add %d vehicles.", add);
                } else {
                    occupied_slot += add;
                    available_slot = total_slot - occupied_slot;
                    printf("%d vehicles parked successfully.", add);
                }
                break;

            case 5:
                printf("Exited Successfully.");
                return 0;

            default:
                printf("Invalid choice! Try again.");
        }
    }
}
