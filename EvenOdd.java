/* Test Whether given number is Even or Odd */
import java.util.Scanner;
class EvenOdd
{
 int evenOdd(int num)
{ 
  
  if (num%2==0)
      return 1;
  else
      return 0;
}
 public static void main(String args[])
 { 
  int result;
  Scanner sc = new Scanner(System.in);
  EvenOdd object = new EvenOdd();
  System.out.println("Enter a Number");
  int number = sc.nextInt();
  result = object.evenOdd(number);
  if (result==1)
    System.out.println("Even Number");
  else
    System.out.println("Odd Number");
 }
}