# SMART HOME ELECTRICITY SYSTEM - Python Version

light = 0
fan = 0
ac = 0
tv = 0
totalEnergy = 0

while True:
    print("\n====== SMART HOME ELECTRICITY SYSTEM =========")
    print("1. Turn on Appliances")
    print("2. Turn off Appliances")
    print("3. View Current Status")
    print("4. Calculate Energy Usage")
    print("5. Exit")

    choice = int(input("Enter your choice: "))

    # Turn ON devices
    if choice == 1:
        print("\nSelect the device to turn on\n1.Light\n2.Fan\n3.AC\n4.TV")
        choose = int(input("Enter option: "))

        if choose == 1:
            light = 1
            print("Light is turned ON")
        elif choose == 2:
            fan = 1
            print("Fan is turned ON")
        elif choose == 3:
            ac = 1
            print("AC is turned ON")
        elif choose == 4:
            tv = 1
            print("TV is turned ON")
        else:
            print("Invalid device")

    # Turn OFF devices
    elif choice == 2:
        print("\nEnter the device to turn off:\n1.Light\n2.Fan\n3.AC\n4.TV")
        device = int(input("Enter option: "))

        if device == 1:
            if light:
                light = 0
                print("Light is turned OFF")
            else:
                print("Light is already OFF")

        elif device == 2:
            if fan:
                fan = 0
                print("Fan is turned OFF")
            else:
                print("Fan is already OFF")

        elif device == 3:
            if ac:
                ac = 0
                print("AC is turned OFF")
            else:
                print("AC is already OFF")

        elif device == 4:
            if tv:
                tv = 0
                print("TV is turned OFF")
            else:
                print("TV is already OFF")

        else:
            print("Invalid option")

    # Status
    elif choice == 3:
        print("\n======== Appliances Status ==========")
        print("Light :", "ON" if light else "OFF")
        print("Fan   :", "ON" if fan else "OFF")
        print("AC    :", "ON" if ac else "OFF")
        print("TV    :", "ON" if tv else "OFF")

    # Energy Usage
    elif choice == 4:
        hours = float(input("Enter number of hours devices were running: "))

        if light: totalEnergy += (10 * hours) / 1000
        if fan:   totalEnergy += (50 * hours) / 1000
        if ac:    totalEnergy += (1500 * hours) / 1000
        if tv:    totalEnergy += (100 * hours) / 1000

        print(f"Total Energy used: {totalEnergy:.2f} kWh")

    # Exit
    elif choice == 5:
        print("Exiting Smart Home Electricity System... Goodbye!")
        break

    else:
        print("Invalid choice")
