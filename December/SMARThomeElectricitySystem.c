

int main() {
    int choice;
    float capacity = 0.0, maxCapacity = 1000.0;
    float add, need, consume = 0.0;
    float level, needLevel;

    while (1) {
        printf("\n=========== SMART WATER MONITORING SYSTEM ===========");
        printf("\n1. Add Water");
        printf("\n2. Use Water (Consume)");
        printf("\n3. Check Tank");
        printf("\n4. Alerts (Overflow / Low Level)");
        printf("\n5. Exit");
        printf("\nEnter your choice: ");
        scanf("%d", &choice);

        switch (choice) {

            case 1:
                printf("Enter litres to add: ");
                scanf("%f", &add);

                if (capacity + add > maxCapacity) {
                    printf("Tank Overflow");
                } else {
                    capacity += add;
                    level = (capacity / maxCapacity) * 100;
                    printf("Water added: %.2f", add);
                    printf("\nCurrent water: %.2f", capacity);
                    printf("\nTank level: %.2f%%", level);
                }
                break;

            case 2:
                printf("Enter litres to consume: ");
                scanf("%f", &need);

                if (need > capacity) {
                    printf("Insufficient water");
                } else {
                    capacity -= need;
                    consume += need;
                    level = (capacity / maxCapacity) * 100;
                    printf("Water consumed: %.2f", need);
                    printf("\nRemaining water: %.2f", capacity);
                    printf("\nTank level: %.2f%%", level);
                }
                break;

            case 3:
                level = (capacity / maxCapacity) * 100;
                printf("Current water: %.2f", capacity);
                printf("\nTank level: %.2f%%", level);
                printf("\nTotal water consumed: %.2f", consume);
                break;

            case 4:
                printf("Enter alert level (percentage): ");
                scanf("%f", &needLevel);

                level = (capacity / maxCapacity) * 100;

                if (level >= needLevel) {
                    printf("Overflow Alert");
                } else if (level <= needLevel) {
                    printf("Low Level Alert");
                } else {
                    printf("Normal Level");
                }
                break;

            case 5:
                printf("Thank you");
                return 0;

            default:
                printf("Invalid option");
        }
    }
}
