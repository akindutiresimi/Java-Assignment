public class ArrayNumber{

    public static int ArrayOfNumber(String[] args){
    int number = 6;
    int[] number = new int[number.length];
    Deceding = number[0];

    for(int counter = 0; counter < number.length; counter++){
 
    if (Deceding < number[counter]){
    Deceding = number[counter++];
    }
    }
    return Deceding; 
    }



    public static void main(String[] args){
    int[] number = {7,9,3,16,20,15};
    System.out.println("Deceding array:" + ArrayOfNumber(Deceding));
    }    

}
