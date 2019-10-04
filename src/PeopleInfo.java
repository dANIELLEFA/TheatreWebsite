
public class PeopleInfo
	{
private String name;
private int age;
private String characters;
private String pastExperience;
private String allergies;
private String shirtSize;
private String pantSize;
public PeopleInfo(String n, int a, String c,String pE, String al, String sS,String pS )
	 {
		name = n;
		age = a;
		characters=c;
		pastExperience = pE;
		allergies = al;
		shirtSize = sS;
		pantSize = pS;
	 }
public String getName()
	{
		return name;
	}
public void setName(String name)
	{
		this.name = name;
	}
public int getAge()
	{
		return age;
	}
public void setAge(int age)
	{
		this.age = age;
	}
public String getCharacters()
	{
		return characters;
	}
public void setCharacters(String characters)
	{
		this.characters = characters;
	}
public String getPastExperience()
	{
		return pastExperience;
	}
public void setPastExperience(String pastExperience)
	{
		this.pastExperience = pastExperience;
	}
public String getAllergies()
	{
		return allergies;
	}
public void setAllergies(String allergies)
	{
		this.allergies = allergies;
	}
public String getShirtSize()
	{
		return shirtSize;
	}
public void setShirtSize(String shirtSize)
	{
		this.shirtSize = shirtSize;
	}
public String getPantSize()
	{
		return pantSize;
	}
public void setPantSize(String pantSize)
	{
		this.pantSize = pantSize;
	}

	}
