//Final exam ITP120 problem F ArraySort.java by Yan lu 12/09

import java.util.Scanner;
import java.security.SecureRandom;
import java.util.Arrays;


public class ArraySort{
public static void main(String[] args){

Scanner input=new Scanner(System.in);
SecureRandom randomNumbers = new SecureRandom();

int[] Array=new int[1000];
int number=Array.length;

for(int i=0;i<Array.length;i++){
Array[i] = randomNumbers.nextInt(1001);
}

Arrays.sort(Array); 

System.out.println("The biggest number is "+Array[number-1]);
System.out.println("The smallest number is "+Array[0]);
System.out.println("The value at location 456 is "+Array[456]);
System.out.println("The value at location 67 is "+Array[67]);
}

}
