public class PerfectPrime{
    public static boolean perfectPrime(int a){
    int sum = 0;
    int number = 0;
  
    
    for(number = 1; number <= a / 2; number++){
            if(a % number == 0){
            sum = sum + number;
            }
        
    }
    if (sum == a){
    return true;
    }
    else{
    return false;
    }
    //return;
    }       

    public static void main(String[] args){
	boolean sumResult = perfectPrime(9);
    System.out.println(sumResult);
    }   
}

