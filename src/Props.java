
public class Props
	{
private String prop;
private String character;
private String actorName;
private String availability;
public Props(String p, String c, String aN, String a)
{
prop = p;
character = c;
actorName = aN;
availability = a;
}
public String getProp()
	{
		return prop;
	}
public void setProp(String prop)
	{
		this.prop = prop;
	}
public String getCharacter()
	{
		return character;
	}
public void setCharacter(String character)
	{
		this.character = character;
	}
public String getActorName()
	{
		return actorName;
	}
public void setActorName(String actorName)
	{
		this.actorName = actorName;
	}
public String getAvailability()
	{
		return availability;
	}
public void setAvailability(String availability)
	{
		this.availability = availability;
	}

	}
