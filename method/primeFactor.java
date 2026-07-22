public class primeFactor{

	public static int primeFactor(int a){
        int prime = 0;
        for(int count = 2; count <= prime; count++){
            while(prime % count == 0){
            sum += prime;
            a = a / prime;
            }

        }
            
       return prime;
       }

}

  public static void main(String[] args){
	int primeResult = PrimeFactor(45);
    System.out.println(primeResult);
    }   
}

    




