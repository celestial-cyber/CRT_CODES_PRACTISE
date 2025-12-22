//#include <stdio.h>

int main() {
    int arr[15], even[15], odd[15];
    int size, i, ev = 0, od = 0;

    printf("Enter the size of array: ");
    scanf("%d", &size);

    printf("Enter the elements:\n");
    for (i = 0; i < size; i++) {
        printf("Input %d: ", i + 1);
        scanf("%d", &arr[i]);
    }

    // Separate odd and even
    for (i = 0; i < size; i++) {
        if (arr[i] % 2 == 0) {
            even[ev] = arr[i];
            ev++;
        } else {
            odd[od] = arr[i];
            od++;
        }
    }

    // Print even numbers
    printf("\nEven numbers: ");
    if (ev == 0) {
        printf("None");
    } else {
        for (i = 0; i < ev; i++) {
            printf("%d ", even[i]);
        }
    }

    // Print odd numbers
    printf("\nOdd numbers: ");
    if (od == 0) {
        printf("None");
    } else {
        for (i = 0; i < od; i++) {
            printf("%d ", odd[i]);
        }
    }

    return 0;
}
