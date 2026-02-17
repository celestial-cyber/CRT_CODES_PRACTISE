/// take one input i = 5 assignthe expression i++ + ++i to another variavle and print both values 
import java.util.*;
class program2{
    public static void main(String args[]){
       
        int i= 5;
        int var = i++ + ++i;
        System.out.println(var);
        System.out.println(i);

}

}