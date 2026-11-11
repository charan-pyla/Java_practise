import java.util.Scanner;
class Divisible{
public static void main(String[]args){

Scanner sc = new Scanner(System.in);
System.out.println("enter the number");
int num = sc.nextInt();
 
if (num%2 ==0){
System.out.println("its divisible by 2");
}else{
System.out.println("its not divisible by 2");
}
}
}

