import java.util.Scanner;
	public class Total{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);
	System.out.print("Enter Score1");
	int score1 = input.nextInt();

	System.out.print("enter score2");
	int score2 = input.nextInt();
 
	System.out.print("enter score3");
	int score3 = input.nextInt();

	int totalscore = score1 + score2 + score3;
	System.out.println("result of score:" + totalscore);

	int averagescore = totalscore / 2;
	System.out.println("result of score:" + averagescore);



	}
}