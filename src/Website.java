import java.util.ArrayList;
import java.util.Scanner;
public class Website
	{
static ArrayList <Props> propsList = new ArrayList <Props>();
static ArrayList <PeopleInfo> auditionPacket = new ArrayList<PeopleInfo>();
static ArrayList <SignInInfo> logIn = new ArrayList <SignInInfo>();
static ArrayList <Dictionary> Dictionary = new ArrayList<Dictionary>();
static Scanner stringInput = new Scanner (System.in);
static Scanner intInput = new Scanner (System.in);
static boolean lookingAtWebsite = true;
static int yesAndNoQuestion;
static int correctAnswer =0;
static int incorrectAnswer =0;
static int person;
static String name = Website.logIn.get(Website.person).getName();
		public static void main(String[] args)
			{
				SigningIn.loginOrSignIn();
				while(lookingAtWebsite)
				{
					SigningIn.welcomePatron();
				}

			}
		public static void yesOrNo()
			{
			System.out.println("1) Yes or 2) No");
			yesAndNoQuestion = intInput.nextInt();
			}

	}
