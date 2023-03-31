//Final exam ITP120 problem A SHAzeroTest.java by Yan lu 12/09
import java.util.Random;


public class SHAzeroTest{
public static void main(String[] args){
boolean found=false;
SHAzero sz=new SHAzero();
Random random=new Random();
int passedValue=random.nextInt();
System.out.println("random value of sz is :"+ passedValue);


int returnedValue=sz.generateHash(passedValue);

int counter=1;
while(found==false){
if(returnedValue>=7){
returnedValue=sz.generateHash(passedValue);
counter++;}
if(returnedValue<7){
found=true;}
}


System.out.println("Hash found!");
System.out.println("It took "+counter+" loops to find the solution.");
System.out.println("Passed value: "+passedValue);
}

}
 