
public class PropList 
{
	static int first = 1;
	static int answer;
public static void loadData()
{
	Website.propsList.add(new Props("Bike", "Stanley", "Caleb Coit","Not in theatre"));
	Website.propsList.add(new Props("Books", "Mrs. Finch", "Marina Hoft","In theatre"));
	Website.propsList.add(new Props("Clipboard", "Silvia", "Hannah","In theatre"));
	Website.propsList.add(new Props("Basketballs", "Ted, Stanley", "Bobby Sannwald, Greg","In theatre"));
	Website.propsList.add(new Props("Tissues", "Mrs. Brooks", "Emy McGuire","In theatre"));
	Website.propsList.add(new Props("Broom", "Mrs. Brooks", "Emy McGuire","In theatre"));
	Website.propsList.add(new Props("Soccerball", "Annie", "Danielle Failor","In theatre"));
}
public static void viewOrEdit()
{
	
	if(first == 1)
	{
		loadData();
		first++;
	}
	System.out.println("Would you like to 1)view or 2)edit?");
	answer = Website.intInput.nextInt();
	if (answer == 1)
	{
		viewProps();
	}
	if (answer == 2)
	{
		editProps();
	}
}
public static void viewProps()
{
	System.out.println("Here is the list of props");
	for (int i = 0; i < Website.propsList.size(); i++)
	{
		System.out.println(Website.propsList.get(i).getProp() + " for "+ Website.propsList.get(i).getActorName() + " and it is " + Website.propsList.get(i).getAvailability());
		
	}
	for (int j = 0; j < Website.propsList.size(); j++)
	{
		if (Website.propsList.get(j).getActorName().equals(SigningIn.name))
		{
			System.out.println("These are your props:");
			System.out.println(Website.propsList.get(j).getProp() + " and it is " + Website.propsList.get(j).getAvailability());
		}
		
	}
	
Website.areYouDone();	
}
public static void editProps()
{
	System.out.println("Here is the list of props");
	int counter = 1;
	for (int i = 0; i < Website.propsList.size(); i++)
	{
		System.out.println(counter + ") "+Website.propsList.get(i).getProp() + " for "+ Website.propsList.get(i).getActorName() + " and it is " + Website.propsList.get(i).getAvailability());
		counter++;
	}
	System.out.println("Which of these would you to edit or would you like to add a prop or remove a prop");
	System.out.println("1) Prop");
	System.out.println("2) Actor Name");
	System.out.println("3) Availability");
	System.out.println("4) Character name");
	System.out.println("5) Add a prop");
	System.out.println("6) Remove a prop");
	int choice = Website.intInput.nextInt();
	if(choice == 1)
	{
		System.out.println("Which prop number would you like to edit?");
		int propNumber = Website.intInput.nextInt();
		System.out.println("What would you like to change the prop to?");
		String change = Website.stringInput.nextLine();
		Website.propsList.get(propNumber-1).setProp(change);;
	}
	else if(choice == 2)
	{
		System.out.println("Which prop number  would you like to edit?");
		int propNumber = Website.intInput.nextInt();
		System.out.println("What would you like to change the actor name to?");
		String change = Website.stringInput.nextLine();
		Website.propsList.get(propNumber-1).setActorName(change);
	}
	else if(choice == 3)
	{
		System.out.println("Which prop number  would you like to edit?");
		int propNumber = Website.intInput.nextInt();
		System.out.println("What would you like to change the availability to?");
		String change = Website.stringInput.nextLine();
		Website.propsList.get(propNumber-1).setAvailability(change);
	}
	else if(choice == 4)
	{
		System.out.println("Which prop number would you like to edit?");
		int propNumber = Website.intInput.nextInt();
		System.out.println("What would you like to change the character name to?");
		String change = Website.stringInput.nextLine();
		Website.propsList.get(propNumber-1).setCharacter(change);
	}
	else if(choice == 5)
	{
		System.out.println("What prop would you like to add?");
		String prop =Website.stringInput.nextLine();
		System.out.println("What character uses this prop?");
		String character =Website.stringInput.nextLine();
		System.out.println("Who uses this prop?");
		String actor =Website.stringInput.nextLine();
		System.out.println("What is the availability of this prop?");
		String inOrNot =Website.stringInput.nextLine();
		Website.propsList.add(new Props(prop, character, actor, inOrNot));
	}
	else if( choice == 6)
	{
		System.out.println("Which prop number would you like to remove?");
		int propNumber = Website.intInput.nextInt();
		Website.propsList.remove(propNumber-1).getProp();
	}
	System.out.println("Would you like to view the prop list now? ");
	Website.yesOrNo();
	if(Website.yesAndNoQuestion == 1)
	{
		viewProps();
	}
	else
	{
		Website.areYouDone();
	}
}
}

