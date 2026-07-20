import java.util.Scanner;

	public class NokiaTwo{
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);

		String mainMenu = """
List of menu function

Press 1 for Phone book
Press 2 for Message
Press 3 for Chat  
Press 4 for Call register
Press 5 for Tone
Press 6 for Setting 
Press 7 for Call divert
Press 8 for Games
Press 9 for Calculate
Press 10 for Reminder
Press 11 for Clock
Press 12 for Profiles
Press 13 for SIM services

""";       

		System.out.println(mainMenu);
		int mainMenuList = input.nextInt();

		switch (mainMenuList){

case 1 : System.out.println("Phone book"); 	
		String phoneBook = """

press 1 to Search 
press 2 to ServiceNos
press 3 to Addname
press 4 to Erase
press 5 to Edit
press 6 to Assigntone
press 7 to Send b'card
press 8 to Option 
press 9 to Speed dials
press 10 to Voice tags

""";
	System.out.println(phoneBook);
	int phoneBookList = input.nextInt();

			switch(phoneBookList){
	case 1: System.out.println("Search"); break;
	case 2: System.out.println("Service Nos."); break; 
	case 3: System.out.println("Add name"); break;
	case 4: System.out.println("Erase"); break;  
	case 5: System.out.println("Edit"); break; 
	case 6: System.out.println("Assign tone"); break;
	case 7: System.out.println("Send b'card"); break; 
	case 8: System.out.println("option"); 
      		String option = """
press 1 : Type of view
press 2 : Memmory status
""";
		System.out.println(option);
		int optionList = input.nextInt();

		switch(optionList){
		case 1: System.out.println("Type of view"); break;
		case 2: System.out.println("Memory status"); break;
		default: System.out.println("sat");
		}
		break;
	case 9: System.out.println("Speed dials"); break; 
	case 10: System.out.println("Voice tags"); break; 
	default: System.out.println("Sea"); 
	}

	System.out.print("Enter number");
	int number = input.nextInt();

	case 1 -> Phone book;
	case : 0;
	
	for (case = 0; case <= 13; case++){ 
		//counter != 0;	
	System.out.println("case:" + case);
	}
	System.out.println();
	}
	break;	 


	
	}
} 	 