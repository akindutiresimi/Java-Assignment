public class Asteric{
public static void main(String[] args){

for(int space = 0; space <= 10; space++){
	for(int count = 0; count <= space; count++){
	System.out.print("*");
	}
	System.out.println();
	}

	//for(int space = 10; space >= 0; space--){
	for(int count = 0; count <= space; count++){
	System.out.print("*");
	
	}



	//for(int space = 0; space > 10; space++){
	for(int count = 0; count <= space; count++){
	System.out.print(" ");
	}
	for(int counter = 10; counter >= space; counter--){
	System.out.print("*");
	}
	//}
	for(int space = 0; space > 10; space++){
	for(int count = 0; count > space; column--){
	System.out.print(" ");
	}
	for(int counter = 0; counter <= space; column++){
	System.out.print("*");
	}

}
}
}