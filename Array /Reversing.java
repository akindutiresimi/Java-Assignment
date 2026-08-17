public class Reversing{
/*public static void main(String[] args){

int[] number = {2,5,6,7,8,9};

int[] numbers = new int[number.length - 1];

int count = 0; 

for(int index = 0; index < number.length; index++){

   if(number[2] != number[index]){
    
    numbers[count] = number[index];

    count++;

    System.out.println("numbers: "  + number[count]);
    }
    
}

}
}*/


/*public static void main(String[] args){

int[] number = {1,2,3,5,6};


for(int count = 0; count < number[number.length / 2]; count++){

    int temp = number[count];

    number[count] = number[number.length - 1 - count];

    number[number.length - 1 - count] = temp;

    if(number[count] == number[number.length -1 - count]){
    
        System.out.println("palindrom");
    
    }

    else{
        System.out.println("not palindrom");
        
    }    
}
}*/




public static void main(String[] args){

int[] number = {8,4,6,8,5,8,5,8};
    int counter = 0;

for(int count = 0; count < number.length; count++){

    for(int index = 0; index < number[count]; index++){
        
           number[count] = number[index];
            counter++;
    }
    System.out.println(number[count]);
    }
}

} 



