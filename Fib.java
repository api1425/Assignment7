import java.io.*;
class Fib{

public static void main(String args[])throws Exception{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

int number=Integer.parseInt(System.getProperty("param1"));

int arr[]=new int[number];

try{
arr[0]=0;
arr[1]=1;
arr[2]=1;
}
catch(Exception ex){
System.out.println("Array index out of BOUND exception\nYou have to enter the number greater than 2");
}

//manipulating
for(int i=3;i<number;i++){
arr[i]=arr[i-1]+arr[i-2];
}

//displaying
System.out.println("Your series till "+number);
for(int i:arr)
System.out.print(i+" ");
}}