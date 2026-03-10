##check anagrams
str1 = input()
str2 = input()

if len(str1) != len(str2):
    print("length not same")
else:
    
    sorted_str1 = sorted(list(str1.lower())) 
    sorted_str2 = sorted(list(str2.lower())) 

    if sorted_str1 == sorted_str2:
        print("Anagrams")
    else:
        print("Not Anagrams")