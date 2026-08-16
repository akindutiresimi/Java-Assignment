public class Asterics{
public static void main(String[] args){

for(int space = 0; space <= 10; space++){
	for(int count = 0; count <= space; count++){
	System.out.print("*");
	}
	for(int spaces = 10; spaces >= space; spaces--){
	System.out.print(" ");
	}

	for(int counter = 10; counter >= space; counter--){
	System.out.print("*");
	}
	for(int spac = 0; spac <= space; spac++){
	System.out.print(" ");
	}
	for(int counte = 0; counte <= space; counte++){
	System.out.print(" ");	
	}
	for(int ast = 10; ast >= space; ast--){
	System.out.print("*");
	}
	for(int as = 10; as >= space; as--){
	System.out.print(" ");
	}
	for(int aste = 0; aste <= space; aste++){
	System.out.print("*");
	}
	System.out.println();
}
}
}