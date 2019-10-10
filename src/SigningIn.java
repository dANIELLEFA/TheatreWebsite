
public class SigningIn 
{
	static String name ;
public static void loginData()
{
	Website.logIn.add(new SignInInfo("Danielle Failor" , "student director/ Tech", "Daniellef3606", "wonderWoman"));
	Website.logIn.add(new SignInInfo("Nick Giacomozzi" , "actor", "Hugo", "theGirl"));
	Website.logIn.add(new SignInInfo("Emy McGuire" , "actor", "Judas", "sheWhoMustNotBeNamed"));
	Website.logIn.add(new SignInInfo("Connie Brooks" , "director", "Boss", "HugoAndConnieForever"));
	Website.logIn.add(new SignInInfo("Hugo" , "audience member", "Coach", "sailing"));
	Website.logIn.add(new SignInInfo("Ted" , "actor", "WildTed", "theStar"));
	Website.logIn.add(new SignInInfo("Jane" , "actor", "Helen", "ILOVETEDTEDTEDTED"));
	Website.logIn.add(new SignInInfo("Finch" , "audience member", "bird", "studentsAreTerrible"));
	Website.logIn.add(new SignInInfo("Bobby Sannwald" , "actor", "Daisy", "Daisy2"));
	
}
public static void loginOrSignIn()
{
	loginData();
	System.out.println("Hello! Do you have an account?");
	Website.yesOrNo();
	if(Website.yesAndNoQuestion == 1)
	{
		login();
	}
	else if (Website.yesAndNoQuestion == 2)
	{
		signUp();
	}
	else
	{
		System.out.println("Answer the question");
		loginOrSignIn();
	}
}
public static void login()
{
	
	System.out.println("Enter your username:");
	String username = Website.stringInput.nextLine();
	for(int i = 0; i < Website.logIn.size();i++)
	{
		if(username.equals(Website.logIn.get(i).getUserName()))
		{
			System.out.println("Correct username");
			Website.correctAnswer++;
			Website.person = i;
		}
	
	}
	if (Website.correctAnswer == 0)
	{
		Website.incorrectAnswer++;
	}
	if(Website.incorrectAnswer >= 1)
	{
		System.out.println("Incorrect username");
		Website.incorrectAnswer = 0;
		login();
		
	}
	Website.incorrectAnswer = 0;
	System.out.println("Enter password:");
	String password = Website.stringInput.nextLine();
	for(int i = 0; i < Website.logIn.size();i++)
	{
		if(password.equals(Website.logIn.get(i).getPassword()))
		{
			System.out.println("Correct password");
			Website.correctAnswer++;
			Website.person = i;
			name =  Website.logIn.get(Website.person).getName();
		}
	
	}
	if (Website.correctAnswer == 0)
	{
		Website.incorrectAnswer++;
	}
	if(Website.incorrectAnswer >= 1)
	{
		System.out.println("Incorrect password");
		Website.incorrectAnswer = 0;
		login();
		
	}
	Website.logging();
	Website.loggingOn();
	
}

public static void signUp()
{
	System.out.println("What is your first and last name?");
	String name1 = Website.stringInput.nextLine();
	System.out.println("What is your position in theatre?");
	String position = Website.stringInput.nextLine();
	System.out.println("What will your username be?");
	String username = Website.stringInput.nextLine();
	System.out.println("What will your password be?");
	String password = Website.stringInput.nextLine();
	Website.logIn.add(new SignInInfo(name1, position, username, password));
	name = name1;
	Website.logging();
	Website.loggingOn();
}

public static void welcomePatron()
{
System.out.println("Hello " + name + " Would you like to look at:");	
System.out.println("1) Audition profile");
System.out.println("2) Prop List");
System.out.println("3) Theatre Dictionary");
System.out.println("4) Sign out");
int choice = Website.intInput.nextInt();
if(choice == 1)
{
	auditionSheet.questionare();
}
else if(choice == 2)
{
	PropList.viewOrEdit();
}
 if(choice == 3)
{
	TheatreDictionary.searchWordsOrNot();
}
else if(choice ==4)
{
	System.out.println("Goodbye!");
	Website.logging();
	Website.loggingOff();
	System.exit(0);
}
else
{
//	System.out.println("Answer the question");
//	welcomePatron();
	TheatreDictionary.viewTheatre();
}
}

}
