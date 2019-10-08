import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		// Type your code here
      Scanner sc=new Scanner(System.in);
    int  n1=sc.nextInt();
    int  r1=n1;
      while(r1>=10)
      {
       r1=r1/10;
      }
      int r2=n1%10;
     int sum=r1+r2;
      System.out.println(sum);
	}
}