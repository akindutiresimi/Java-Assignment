import java.util.Scanner;
public class StudentGrade{

    public static void main(String[] args){

    Scanner input = new Scanner(System.in);

    System.out.print("Enter the number of Student");
    int number = input.nextInt();

    int [] score = new int[number]; 

    System.out.print("Enter the score:");

    for (int count = 0; count < score.length; count++){ 
    score[count] = input.nextInt();
    }

    for(int count = 0; count < score.length; count++){
    System.out.print(score[count] + " ");
    }

    double max = score[0];

    for (int counter = 0; counter < score.length; counter++){

    if(score[counter] > max){

    max = score[counter];
    }  

    System.out.println(max);                                      
    }

    for (int counter = 0; counter < score.length; counter++){

        char grade;

        if (score[counter] >= max - 10){
            System.out.println('A');
        }
        else if(score[counter] >= max - 20){
            System.out.println('B');
        }

         else if(score[counter] >= max - 30){
            System.out.println('C');
        }

         else if(score[counter] >= max - 40){
            System.out.println('D');
        }

         else{
            System.out.println("F");
        }
    }
        
}

}
 
