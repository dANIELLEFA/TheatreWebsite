
public class auditionSheet 
{
	static int review = 0;
public static void questionare()
{
	
	System.out.println("Hello " + SigningIn.name + ". Here are a few questions for your common audition packet.");
	System.out.println("1) What is your age? ");
	int age = Website.intInput.nextInt();
	System.out.println("2) What are your top three dream roles?");
	String roles = Website.stringInput.nextLine();
	System.out.println("3) What is your past experience as an actor?");
	String experience = Website.stringInput.nextLine();
	System.out.println("4) Do you have an allergies and if so what allergies?");
	String allergies = Website.stringInput.nextLine();
	System.out.println("5) What is your shirt size? XS/S/M/L/XL");
	String shirtSize = Website.stringInput.nextLine();
	System.out.println("6) What is your pant size? XS/S/M/L/XL");
	String pantSize = Website.stringInput.nextLine();
	System.out.println("Thank you for your time!");
	Website.auditionPacket.add(new PeopleInfo(SigningIn.name, age, roles, experience, allergies, shirtSize, pantSize ));
	review = Website.auditionPacket.size()-1;
	System.out.println("Would you like to change the info that you typed in?");
	Website.yesOrNo();
	if(Website.yesAndNoQuestion == 1)
		{
		
			changeAnswers();
		}
	else
		{
			Website.areYouDone();
		}
	
}
public static void changeAnswers()
{
	System.out.println("Which question do you want to change?");
	int questionNumber =Website.intInput.nextInt();
	if(questionNumber == 1)
		{
			System.out.println("What do you want to change your age to?");
			int change = Website.intInput.nextInt();
			 Website.auditionPacket.get(review).setAge(change);
		}
	if(questionNumber == 2)
		{
			System.out.println("What do you want to change your top three roles to?");
			String change = Website.stringInput.nextLine();
			 Website.auditionPacket.get(review).setCharacters(change);
		}
	if(questionNumber == 3)
		{
			System.out.println("What do you want to change your past experience to?");
			String change = Website.stringInput.nextLine();
			 Website.auditionPacket.get(review).setPastExperience(change);
		}
	if(questionNumber == 4)
		{
			System.out.println("What do you want to change your allegeries to?");
			String change = Website.stringInput.nextLine();
			 Website.auditionPacket.get(review).setAllergies(change);
		}
	if(questionNumber == 5)
		{
			System.out.println("What do you want to change your shirt size to?");
			String change = Website.stringInput.nextLine();
			 Website.auditionPacket.get(review).setShirtSize(change);
		}
	if(questionNumber == 6)
		{
			System.out.println("What do you want to change your pant size to?");
			String change = Website.stringInput.nextLine();
			 Website.auditionPacket.get(review).setPantSize(change);
		}
	Website.areYouDone();
}

}

