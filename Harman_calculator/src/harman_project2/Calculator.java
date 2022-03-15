package harman_project2;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		int x,y,add,sub,mul,div;
		Scanner s=new Scanner(System.in);
		
		addition a=new addition();
		Subtraction b=new Subtraction();
		Multiplication c=new Multiplication();
		Division d=new Division();
		
		System.out.println("Enter Num 1 :");
		x=s.nextInt();
		System.out.println("Enter Num 1 :");
		y=s.nextInt();
		
		add=a.add(x , y);
		System.out.println("Addition :"+add);
		
		sub=b.sub(x , y);
		System.out.println("Subtraction :"+sub);
		
		mul=c.mul(x , y);
		System.out.println("Multiplication :"+mul);
		
		div=d.div(x , y);
		System.out.println("Division :"+div);
		
	}

}
