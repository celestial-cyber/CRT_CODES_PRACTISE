//smart water tank monitoring system 
//1. add water , use water (consume) , chekc tank , 4. alert (overflow/low level) 5.exit - enter your choice
//1. add water - enter lit to add - watr added - show currennt level 
//2. use water
//check tank status - current water level  /total , total wate rconsume 
//2. enter water to use - water consumed - show raminng level 
//4. alert - overflow / low level -> enter the level - 4 , normal 
//5. on addding more water - it should show tank overflow 
int main(){
    int choice;
    float total, consume=0, status, level=0, add, capacity, maxCapacity=1000.00, need, needLevel;

    while(1){
        printf("\n===========SMART WATER MONITORING SYSTEM=================");
        printf("\n1.Add water");
        printf("\n2.Use Water(Consume)");
        printf("\n3.Check Tank");
        printf("\n4.Alerts (Overflow/Low Level)");
        printf("\n5.Exit");
        printf("\nEnter your choice");

        while(1){
            switch(choice){
                //1. add water
                case 1: printf("\nEnter litres to add");
                        scanf("%f", &add);
                        capacity = capacity + add;
                        if (capacity> maxCapacity){
                            printf("Overflow");
                        }
                        else {
                            printf("water added:%f", add);
                            printf("TotalCapacity:%f",capacity);
                            level = capacity /maxCapacity;
                        }
                        break;
                case 2: printf("Enter litres to consume");
                        scanf("%f", need);
                        if (need>level){
                            printf("Required water is not present");
                        }
                        else {
                            capacity = capacity-need;
                            printf("Water consumed:%f", need);
                            printf("Remaining water:%f", capacity);

                            level = level - (need/1000.00);
                            printf("Tank Level Remaining:%f", level );

                        }
                        break;

                case 3: printf("Current water status");
                        printf("Current water level:%f", &level);
                        printf("water consume: %f", consume);
                        printf("Total water consumed:",total);
                        break;

                case 4: printf("Enter the level:");
                        scanf("%f", &needLevel);
                        if (needLevel>level){
                            printf("Overflow");

                        }
                        else if (needLevel<level){
                            printf("underflow");
                        }
                        else{
                            printf("Normal - level : %f", needLevel);
                        }

                        break;
                case 5: printf("Thank you");
                        break;

                default: printf("Invalid option");

            }
        }


    }
    return 0;
}