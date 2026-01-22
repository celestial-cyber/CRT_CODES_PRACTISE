//#include <stdio.h>

int main(){
    int total_books, available, fine = 5 , max_days = 7, calculated_fine=0; 
    char name[20];
    int burrow=0, need = 0, choice, days , returns = 0, max_limit = 3 ;

    printf("\nEnter Student Name:");
    scanf("%s", name);

    printf("\nEnter the total number of books:");
    scanf("%d", &total_books);

    while(1){
        printf("\n=======================Student Library Burrow System========================\n");
        printf("Student: %s\n", name);
        printf("\n1.Burrow book");
        printf("\n2.Return book");
        printf("\n3.Burrow Status display");
       
        printf("\n4.Reset System");
        printf("\n5.Exit\n");

        scanf("%d", &choice);

        switch(choice){
            case 1 : printf("\nEnter number of books to be burrowed: ");
                     scanf("%d", &need);
                     if (burrow + need > max_limit || need > total_books){
                        printf("\nCan't burrow more books");
                     }
                     else{
                        printf("\nBook Burrowed Successfully");
                        burrow = burrow + need;
                        total_books = total_books - need;
                     }
                     break;

            case 2: printf("\nEnter number of books to be returned: ");
                     scanf("%d", &returns);

                     printf("\nEnter number of days used: ");
                     scanf("%d", &days);

                     if(returns > burrow){
                        printf("\nYou cannot return more books than borrowed");
                     }
                     else{
                        if(days > max_days){
                            calculated_fine= fine*(days-max_days);
                            printf("\nDays exceeds max_limit - fine = %d", calculated_fine);
                        }
                        printf("\nBooks Returned Successfully");
                        total_books = total_books + returns;
                        burrow = burrow - returns;
                     }
                     break;

            case 3: printf("\nBurrow Status is as follows");
                     printf("\nBurrowed Books: %d", burrow);
                     printf("\nAvailable Books: %d", total_books);
                     break;


            case 4: printf("\nSystem reset");
                     burrow=0;
                     need=0;
                     returns=0;
                     days=0;
                     break;

            case 5: printf("\nSystem exit successfully");
                     return 0;

            default: printf("\nInvalid Options, Try again ");
        }
    }
}
