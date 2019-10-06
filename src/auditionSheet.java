
public class auditionSheet 
{
public static void questionare()
{
	
	System.out.println("Hello " + SigningIn.name + ". Here are a few questions for your common audition packet.");
	System.out.println("1) What is your age? ");
	int age = Website.intInput.nextInt();
	System.out.println("2) What are your top three dream roles?");
	String roles = Website.stringInput.nextLine();
	System.out.println("3) What is your past experience as an actor?");
	String experience = Website.stringInput.nextLine();
	System.out.println("4) Do you have an allergies?");
	String allergies = Website.stringInput.nextLine();
	System.out.println("5) What is your shirt size?");
	String shirtSize = Website.stringInput.nextLine();
	System.out.println("6) What is your pant size?");
	String pantSize = Website.stringInput.nextLine();
	System.out.println("Thank you for your time!");
	Website.auditionPacket.add(new PeopleInfo(SigningIn.name, age, roles, experience, allergies, shirtSize, pantSize ));
}
}
