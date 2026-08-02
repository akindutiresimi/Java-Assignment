public class GroupTask{

    public static double addition(double numberOne, double numberTwo){
    double add = numberOne + numberTwo;
    return add;
}
    public static double subtraction(double numberOne, double numberTwo){
    double subtract = 0;
    if (numberOne > numberTwo){
        subtract = numberOne - numberTwo;
    }   
    else{
        subtract = numberTwo - numberOne;
    }
    return subtract;
}
    public static double multiplication(double numberOne, double numberTwo){
    double multiply = numberOne * numberTwo;
    return multiply;
}
    public  static double division(double numberOne, double numberTwo){
    double divid = 0;
    if(numberOne > numberTwo){
       divid = numberOne / numberTwo;    
    }
    else{
        divid = numberTwo / numberOne;
    }
    return divid;
}    
    public static double operator(double numberOne, double numberTwo, char operator){
    double result = 0;       
    if (operator == '+'){
        result = addition(numberOne, numberTwo);
    } 
    
    else if (operator == '-'){
        result = subtraction(numberOne, numberTwo);
    }
    
    else if (operator == '/'){
        result = division(numberOne, numberTwo);    
    }
    
    else{
        result = multiplication(numberOne, numberTwo);
    }
    return result;
}



    public static void main(String[] args){
    System.out.println(operator(3, 5, '*'));    
    }

}
