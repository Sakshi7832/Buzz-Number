//  a number is said to be Buzz if it ends with 7 or is divisible by 7.
import java.util.*;
class Buzz
{
  public static void main(String args[])
  {
    int num;
    Scanner sc =  new Scanner(System.in);
    System.out.println("Check Buzz Number Or Not.. ");
    System.out.println("Enter the number = ");
    num = sc.nextInt();

    if(num%10==7 || num%7==0)
      {
        System.out.println("It is  buzz number = "+num);
      }
    else
   {
      System.out.println("It is not  buzz number = "+num);
   }


  }
}
