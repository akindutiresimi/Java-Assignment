import java.util.Scanner;

	public class Nokia{
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
	break;	
	 
case 2 : System.out.println("Message");  

	 String message= """
press 1 write message
press 2 Inbox
press 3 Outbox 
press 4 Picture message
press 5 Template 
press 6 Smileys
press 7 Message setting
press 8 Info service 
press 9 Voice mailbox number
press 10 Service command editor
"""; 
	System.out.println(message);
	int messageList = input.nextInt();

	switch(messageList){
 
	case 1: System.out.println("Write message"); break;
	case 2: System.out.println("Inbox"); break; 
	case 3: System.out.println("Outbox"); break;
	case 4: System.out.println("Picture message"); break;  
	case 5: System.out.println("Template"); break; 
	case 6: System.out.println("Smileys"); break;
	case 7: System.out.println("Message setting"); 
 
	String messageSetting = """ 
press 1 : Set
press 2 : Command 
"""; 
	System.out.println(messageSetting);
	int messageSettingList = input.nextInt(); 

	switch(messageSettingList){

	case 1: System.out.println("Set"); 
	String set = """
press 1 Message center
press 2 Message sent as
press 3 Message validity
""";    

         System.out.println(set);
	 int setList = input.nextInt(); 

	 switch(setList){  
	case 1: System.out.println("Message center"); break;
	case 2: System.out.println("Message sent as"); break; 
	case 3: System.out.println("Message validity"); break;
	default: System.out.println("Error");
	}
	break; 

	case 2: System.out.println("Command");
	String command = """

press 1 Delivery report
press 2 Reply via same centre
press 3 Character support
""";
	System.out.println(command);
	int commandList = input.nextInt(); 

	switch(commandList){
	case 1: System.out.println("Delivery report"); break; 
	case 2: System.out.println("Message sent as"); break; 
	case 3: System.out.println("Character support"); break;
	default: System.out.println("Error");
	}
	break; 
	default: System.out.println("Error");
	}
	break;

	case 8: System.out.println("Info service"); break; 
	case 9: System.out.println("Voice mailbox number"); break;
	case 10: System.out.println("Service command editor"); break; 
	default : System.out.println("Error");
	}
	break;
	

case 3 : System.out.println("Chat Menu"); break;
case 4 : System.out.println("Call register Menu"); 
	
 String callRegister= """
press 1 Missed call
press 2 Recieved call
press 3 Dialled number
press 4 Erase recent call lists
press 5 Show call duration
press 6 Show call costs
press 7 Call cost settings
press 8 Prepaid credit
"""; 
		System.out.println(callRegister);
	int callRegisterList = input.nextInt();

			switch(callRegisterList){
	case 1: System.out.println("Missed call"); break;
	case 2: System.out.println("Recieved call"); break; 
	case 3: System.out.println("Dialled number"); break;
	case 4: System.out.println("Erase recent call lists"); break;  
	case 5: System.out.println("Show call duration"); 
 
 String showCallDuration = """
press 1 Last call duration
press 2 All calls' duration
press 3 Received calls
press 4 Dialled calls duration
press 5 Clear times

""";  
	System.out.println(showCallDuration);
	int showCallDurationList = input.nextInt(); 

	switch(showCallDurationList){
	case 1: System.out.println("Last call duration"); break;
	case 2: System.out.println("All calls' duration"); break; 
	case 3: System.out.println("Received calls"); break;
	case 4: System.out.println("Dialled calls duration"); break;  
	case 5: System.out.println("Clear times"); break;
	default : System.out.println("Invalid"); 
	}
	break; 

 
	case 6: System.out.println("Show call costs"); 
 String showCallCost = """
press 1 Last cost 
press 2 All call's cost
press 3 Clear counter

""";	
	System.out.println(showCallCost);
	int showCallCostList = input.nextInt();

	switch(showCallCostList){
	case 1: System.out.println("Last cost"); break;
	case 2: System.out.println("All call's cost"); break; 
	case 3: System.out.println("Clear counter"); break; 
	default : System.out.println("Error");
	}
	break;

	case 7: System.out.println("Call cost settings"); 
String callCostSettings = """
press 1 Call cost limit 
press 2 Show cost in

""";
	System.out.println(callCostSettings);
	int callCostSettingList = input.nextInt();

	switch(callCostSettingList){
	case 1: System.out.println("Call cost limit"); break;
	case 2: System.out.println("Show cost in"); break;  
	default : System.out.println("Error");
	}
	break; 

	case 8: System.out.println("Prepaid credit"); break;
	default : System.out.println("Error"); 
	}
        break;

  
case 5 : System.out.println("Tone Menu");
        String toneMenu = """

press 1 to Ringing tone 
press 2 to Ringing volume
press 3 to Incoming call alert
press 4 to Composer
press 5 to Message alert tone
press 6 to Warning and game tone
press 7 to Vibrating alert 
press 8 to Screen Saver 

""";
	System.out.println(toneMenu);
	int toneMenuList = input.nextInt();

	switch(toneMenuList){
	case 1: System.out.println("Ringing tone"); break;
	case 2: System.out.println("Ringing volume"); break; 
	case 3: System.out.println("Incoming call alert"); break; 
	case 4: System.out.println("Composer"); break;
	case 5: System.out.println(" Message alert tone"); break; 
	case 6: System.out.println("Warning and game tone"); break;
	case 7: System.out.println("Vibrating alert"); break;  
	case 8: System.out.println("Screen Saver"); break;
	default : System.out.println("error");
	}
	break;


case 6 : System.out.println("Setting Menu");
       String settingMenu = """

press 1 to Call setting 
press 2 to Phone setting
press 3 to Security setting
press 4 to Restore factory setting

""";
	System.out.println(settingMenu);
	int settingMenuList = input.nextInt();

	switch(settingMenuList){
	case 1: System.out.println("Call setting");
    String callSettingMenu = """

press 1 to Automatic radical
press 2 to Speed dailing
press 3 to Call waiting 
press 4 to Own number sending
press 5 to Phone line in use
press 6 to Automatic answer

""";   
	System.out.println(callSettingMenu);
	int callSettingMenuList = input.nextInt();

	switch(callSettingMenuList){ 
	case 1: System.out.println("Automatic radical"); break;
	case 2: System.out.println("Speed dailing"); break; 
	case 3: System.out.println("Call waiting"); break; 
	case 4: System.out.println("Own number sending"); break;
	case 5: System.out.println("Phone line in use"); break; 
	case 6: System.out.println("Automatic answer"); break;
 	default : System.out.println("error");
	}
        break;

	case 2: System.out.println("Phone setting"); 
    	String phoneSettingMenu = """

press 1 to language
press 2 to Call info display
press 3 to Welcome note
press 4 to Network selection
press 5 to Lights
press 6 to Confirms SIM service action

""";
	System.out.println(phoneSettingMenu);
	int phoneSettingMenuList = input.nextInt();

	switch(phoneSettingMenuList){ 
	case 1: System.out.println("language"); break;
	case 2: System.out.println("Call info display"); break; 
	case 3: System.out.println("Welcome note"); break; 
	case 4: System.out.println("Network selection"); break;
	case 5: System.out.println("Lights"); break; 
	case 6: System.out.println("Confirms SIM service action"); break;
 	default : System.out.println("error");
	}
 	break; 

	case 3: System.out.println("Security setting"); 
	String securitySettingMenu = """
press 1 to Phone security
press 2 to PIN code
press 3 to Call baring service
press 4 to Fixed dialling
press 5 to Closed user group
press 6 to Change access code

""";

	System.out.println(securitySettingMenu);
	int securitySettingMenuList = input.nextInt();

	switch(securitySettingMenuList){ 
	case 1: System.out.println("Phone security"); break;
	case 2: System.out.println("PIN code"); break; 
	case 3: System.out.println("Call baring service"); break; 
	case 4: System.out.println("Fixed dialling"); break;
	case 5: System.out.println(" Closed user group"); break; 
	case 6: System.out.println("Change access code"); break;
 	default : System.out.println("error");

	}
	break; 

	case 4: System.out.println("Restore factory setting"); break; 
	default : System.out.println("error");
	}
	break;

case 7 : System.out.println("Call divert Menu"); break;
case 8 : System.out.println("Games Menu"); break;
case 9 : System.out.println("Calculator Menu"); break;
case 10 : System.out.println("Reminder Menu"); break;
case 11 : System.out.println("Clock Menu");
	String clockMenu = """

press 1 to Alarm clock 
press 2 to Clock setting
press 3 to Date setting
press 4 to Stop watch
press 5 to Countdown
press 6 to Auto update of date and time

""";   
	System.out.println(clockMenu);
	int clockMenuList = input.nextInt();

	switch(clockMenuList){ 

	case 1: System.out.println("Alarm clock"); break;
	case 2: System.out.println("Clock setting"); break; 
	case 3: System.out.println("Date setting"); break; 
	case 4: System.out.println("Stop watch"); break;
	case 5: System.out.println("Countdown"); break; 
	case 6: System.out.println(" Auto update of date and time"); break;
 	default : System.out.println("error");

	}
	break; 	 
case 12 : System.out.println("Profile Menu"); break; 
case 13 : System.out.println("SIM service Menu"); break; 
default: System.out.println("Mark");  
			}
			

					
			
		}	

		

}