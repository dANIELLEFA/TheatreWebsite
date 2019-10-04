
public class propList 
{
public static void loadData()
{
	Website.propsList.add(new Props("Bike", "Stanley", "Caleb","Not in theatre"));
	Website.propsList.add(new Props("Books", "Mrs. Finch", "Marina","In theatre"));
	Website.propsList.add(new Props("Clipboard", "Silvia", "Hannah","In theatre"));
	Website.propsList.add(new Props("Basketballs", "Ted, Stanley", "Bobby, Greg","In theatre"));
	Website.propsList.add(new Props("Tissues", "Mrs. Brooks", "Emy","In theatre"));
}
public static void viewOrEdit()
{
	System.out.println("Would you like to 1)view or 2)edit?");
	Website.yesAndNoQuestion = Website.intInput.nextInt();
	if (Website.yesAndNoQuestion == 1)
	{
		
	}
	if (Website.yesAndNoQuestion == 2)
	{
		
	}
}
public static void viewProps()
{
	System.out.println("Here is the list of props");
	for (int i = 0; i < Website.propsList.size(); i++)
	{
		System.out.println(Website.propsList.get(i).getProp() + " for "+ Website.propsList.get(i).getActorName() + " and it is " + Website.propsList.get(i).getAvailability());
		
	}
	for (int i = 0; i < Website.propsList.size(); i++)
	{
		if (Website.propsList.get(Website.person).getActorName().equals(Website.name))
		{
			System.out.println(Website.propsList.get(i).getProp() + " and it is " + Website.propsList.get(i).getAvailability());
		}
		
	}
	
	
}
}

