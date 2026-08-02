
public class DispatchRider{

public static int AmountPerParcelDelivered(int SuccessfulDelivery){

int BasePay = 5000;

int Amount = 0;

    if (AmountPerParcel >= 70 && AmountPerParcel <= 100){
    Amount = SuccessfulDelivery * 500 + BasePay;
    }
    
    else if (AmountPerParcel >= 60 && AmountPerParcel <= 69){
        Amount = SuccessfulDelivery * 250 + BasePay;
    }
    
    else if (AmountPerParcel >= 50 && AmountPerParcel <= 59){
    Amount = SuccessfulDelivery * 200 + BasePay;
    }

    else //(AmountPerParcel < 50){
    Amount = SuccessfulDelivery * 160 + BasePay;
    }
return Amount; 
}



public static void main(String[] args){
Scanner input = new Scanner(System.in);

System.out.println("Enter SuccesfulDelivery:");
int SuccessfulDelivery = input.nextInt();

int Amount = AmountPerParcelDelivered(SuccessfulDelivery);
System.out.println("the salary is:" + Amount);

}


}
