public class EvenOfArray{

    public static void main(String[] args){

    int[] Array = {5,9,3,6,2};
    
    int[] newArray = new int[3];
    int counter = 0;

    for(int count = 0; count <= Array.length; count++){

    if(Array[count] % 2 != 0){
    System.out.println(Array[count]);
 
    count += Array[count];
    newArray[count] = counter;
    }
    
    //Array[count] = newArray[]
    //System.out.print(newArray);

    for(int counter = 0; counter < newArray; counter++){
    //Array[count] = newArray[ask];
    System.out.print(newArray[counter]);


    }
    }
    }
}

