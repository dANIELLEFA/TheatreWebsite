
public class SigningIn 
{
	static String name ;
public static void loginData()
{
	Website.logIn.add(new SignInInfo("Danielle Failor" , "Student Director", "Daniellef3606", "wonderWoman"));
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
		}
	
	}
	if (Website.correctAnswer == 0)
	{
		Website.incorrectAnswer++;
	}
	if(Website.incorrectAnswer >= 1)
	{
		System.out.println("Incorrect username");
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
		login();
	}
	
	
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
	propList.viewOrEdit();
}
 if(choice == 3)
{
	TheatreDictionary.viewTheatre();
}
else if(choice ==4)
{
	System.out.println("Goodbye!");
	Website.lookingAtWebsite = false;
}
else
{
//	System.out.println("Answer the question");
//	welcomePatron();
	TheatreDictionary.viewTheatre();
}
}

}
