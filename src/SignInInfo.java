
public class SignInInfo
	{
private String name;
private String position;
private String userName;
private String password;
public SignInInfo(String n, String p, String u, String pa)
{
	name = n;
	position = p;
	userName = u;
	password = pa;
}
public String getName()
	{
		return name;
	}
public void setName(String name)
	{
		this.name = name;
	}
public String getPosition()
	{
		return position;
	}
public void setPosition(String position)
	{
		this.position = position;
	}
public String getUserName()
	{
		return userName;
	}
public void setUserName(String userName)
	{
		this.userName = userName;
	}
public String getPassword()
	{
		return password;
	}
public void setPassword(String password)
	{
		this.password = password;
	}

	}
