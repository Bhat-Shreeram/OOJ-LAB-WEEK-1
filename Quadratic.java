import java.util.Scanner;
//import java.util.Math*;
class Quadraticequation
{
public static void main(String args[])
{
System.out.println("for QUADRATIC EQUATION ax2+bx+c\n enter the coefficients a,b,c\n");
Scanner sc=new Scanner(System.in);
double a=sc.nextDouble();
double b=sc.nextDouble();
double c=sc.nextDouble();
double d=b*b-4*a*c;
double r1=(-b/(2*a));
double r2;
if(d>0)
{
System.out.println("there are two real solution\n");
r2=Math.pow(d,0.5)/(2*a);
System.out.println("roots are\n x1="+""+(r1+r2));
System.out.println("\nx2="+""+(r1-r2));
}
else if(d==0)
{
System.out.println("solution is real and equal\nx1="+""+r1);
}
else
{
System.out.println("roots are imaginary\n");
r2=Math.pow(-d,.5)/(2*a);
System.out.println("roots are\n x1="+r1+"+i"+r2);
System.out.println("roots are\n x1="+r1+"-i"+r2);
}
}
}
