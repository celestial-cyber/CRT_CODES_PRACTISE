//#include<stdio.h>
int main(){
    int choice;
    int attendance;
    int total=0;
    int attended=0;
    int conducted=0;

    while(1){
        printf("================Student Attendance System=================");
        printf("\n1.Add Class Conducted");
        printf("\n2.Mark Attendance");
        printf("\n3.Check Attendance Percentage");
        printf("\n4.Attendance Status");
        printf("\n5.Exit");
        printf("\nEnter your choice: ");
        scanf("%d", &choice);

        switch(choice){
            case 1: 
                printf("Enter the classes conducted: ");
                scanf("%d", &conducted);
                total = total + conducted;
                printf("Conducted Classes: %d\n", total);
                break;
    
            case 2: 
                attended++;
                printf("Attendance Marked\n");
                break;

            case 3: 
                if(total == 0){
                    printf("No classes conducted yet.\n");
                } else {
                    attendance = (attended * 100) / total;  
                    printf("Attendance = %d%%\n", attendance);
                }
                break;

            case 4: 
                if(total == 0){
                    printf("No classes conducted yet.\n");
                } else {
                    attendance = (attended * 100) / total;
                    printf("Attendance Status: ");
                    if (attendance < 75){
                        printf("Not Eligible\n");
                    } else {
                        printf("Eligible\n");
                    }
                }
                break;

            case 5:
                printf("Exited Successfully\n");
                return 0;

            default:
                printf("Invalid choice! Try again.\n");
        }
    }
}
