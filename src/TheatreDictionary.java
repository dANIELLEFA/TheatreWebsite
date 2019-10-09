import java.util.Collections;

public class TheatreDictionary 
{
	static int answer;
public static void searchWordsOrNot()
{
	System.out.println("Would you like to 1) search up the first letter of the word or 2) just view?");
	
	 answer = Website.intInput.nextInt();
	if(answer == 1)
	{
		viewTheatre();
		
	}
	else
	{
		viewTheatre();
	}
}
public static void search()
{
	System.out.println("Enter the first letter of the word you want:");
	String firstLetter = Website.stringInput.nextLine();
	int there = 0;
	for(int i = 0; i< Website.Dictionary.size(); i++)
	{
		if(Website.Dictionary.get(i).getWord().substring(0, 1).equals(firstLetter))
		{
			System.out.println(Website.Dictionary.get(i).getWord() + ": " + Website.Dictionary.get(i).getDefinition());
			there++;
		}
		
	}
	if(there == 0)
		{
			System.out.println("There are no words in this dictionary that start with that letter.");
		}
	System.out.println("Would you like to search another word?");
	Website.yesOrNo();
	if(Website.yesAndNoQuestion == 1)
		{
			search();
		}
	else
		{
			Website.areYouDone();
		}
}
public static void loadWords()
{
	Website.Dictionary.add(new Dictionary("Director","Person, who choreographies and / or blocks, the actors"));
	Website.Dictionary.add(new Dictionary("Choreography","Specific steps to music "));
	Website.Dictionary.add(new Dictionary("Blocking","Movement that is given to you by the director"));
	Website.Dictionary.add(new Dictionary("Stage left","On stage, actor's left"));
	Website.Dictionary.add(new Dictionary("Stage Right","On stage, actor's right"));
	Website.Dictionary.add(new Dictionary("Down Stage","Towards the audience"));
	Website.Dictionary.add(new Dictionary("Up Stage","Away from the audience"));
	Website.Dictionary.add(new Dictionary("Center","Middle of stage"));
	Website.Dictionary.add(new Dictionary("Backstage","Where  actors wait for cues and where tech works"));
	Website.Dictionary.add(new Dictionary("Tech","Works on legs, lights, sound, and props"));
	Website.Dictionary.add(new Dictionary("Thespis","First person to ever play a character on stage"));
	Website.Dictionary.add(new Dictionary("Thespian","Society for really hard working actors"));
	Website.Dictionary.add(new Dictionary("Cage","Where the tools are"));
	Website.Dictionary.add(new Dictionary("Sound Board","Where tech controls mics and other noises"));
	Website.Dictionary.add(new Dictionary("Spot","Spotlight"));
	Website.Dictionary.add(new Dictionary("Rodgers and Hammerstein","Famous writers and composers that brought a lot of musicals to Broadway"));
	Website.Dictionary.add(new Dictionary("Leg","Holds up the flat"));
	Website.Dictionary.add(new Dictionary("Flat","Backdrop"));
	Website.Dictionary.add(new Dictionary("Skrim","Cloth that is in the background"));
	Website.Dictionary.add(new Dictionary("Gels","Colored sheets for lights"));
	Website.Dictionary.add(new Dictionary("Green Room","Warm ups before a performance"));
	Website.Dictionary.add(new Dictionary("Stripped Screw","Screw that can't be used because the top doesn't look like it should"));
	Website.Dictionary.add(new Dictionary("Props","Actor's object that they use during a scene"));
	Website.Dictionary.add(new Dictionary("Audition","Trying out for a part"));
	Website.Dictionary.add(new Dictionary("Cue","A line that is said to let an actor know whether to go on stage or not"));
	Website.Dictionary.add(new Dictionary("Soliloquy","character saying one's thoughts on stage with other characters"));
	Website.Dictionary.add(new Dictionary("Monologue","character saying one's thoughts on stage with no other characters"));
	Website.Dictionary.add(new Dictionary("Playbill","Information on the show"));
	Website.Dictionary.add(new Dictionary("Cast list","Tells the actors what part they get"));
	Website.Dictionary.add(new Dictionary("Tech Week","Week that tech finishes up"));
	Website.Dictionary.add(new Dictionary("Hell Week","Week of the preformance"));
	Website.Dictionary.add(new Dictionary("Shakespeare","Famous play writer"));
	Website.Dictionary.add(new Dictionary("On Broadway","Broadway is presenting it."));
	Website.Dictionary.add(new Dictionary("Off Broadway","It is not on Broadway"));
}
public static void viewTheatre()
{
	loadWords();
	for(int i = 0; i < Website.Dictionary.size(); i++)
	{
	//	Collections.sort(Website.Dictionary.get(i).getWord());
		System.out.println(Website.Dictionary.get(i).getWord() + ": " + Website.Dictionary.get(i).getDefinition());
	}
	if(answer == 1)
		{
			search();
		}
	else
		{
			System.out.println("Would you like to search a word or leave this part of the website");
			Website.yesOrNo();
			if(Website.yesAndNoQuestion == 1)
				{
					search();
				}
			else
				{
					SigningIn.welcomePatron();
				}
		}

	
}


}
