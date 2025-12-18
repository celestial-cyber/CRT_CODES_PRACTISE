//Smart parking management system - park vehucle , remove vehicle , view parking status , alerts , exist system 
//1. totalslots , occupied slots , available slots 2. vehicle exited succesfully 3. totsl , occupied , available , total vehicle existed  4. parking status - normal 
//if parking slot is 50 then full


#include <stdio.h>

int main() {
    int total_slot = 50;
    int occupied_slot = 0;
    int available_slot = 50;
    int exited = 0;
    int choice;

    while (1) {
        printf("\n\n========== SMART PARKING MANAGEMENT SYSTEM ==========");
        printf("\n1. Park Vehicle");
        printf("\n2. Remove Vehicle");
        printf("\n3. View Parking Status");
        printf("\n4. Exit System");
        printf("\nEnter your choice: ");
        scanf("%d", &choice);

        switch (choice) {

            case 1:
                if (occupied_slot >= total_slot) {
                    printf("Parking Full! No slots available.");
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
                printf("Exited Successfully.");
                return 0;

            default:
                printf("Invalid choice! Try again.");
        }
    }
}
