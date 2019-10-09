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

		public static void main(String[] args)
			{
				SigningIn.loginOrSignIn();
				//while(lookingAtWebsite)
				//{
					SigningIn.welcomePatron();
				//}
				

			}
		public static void yesOrNo()
			{
			System.out.println("1) Yes or 2) No");
			yesAndNoQuestion = intInput.nextInt();
			}
		public static void areYouDone()
		{
			
			System.out.println("Do you want to leave the Theatre Website?");
			yesOrNo();
			if(yesAndNoQuestion == 1)
			{
				System.out.println("Goodbye");
				Website.logging();
				Website.loggingOff();
			}
			else
			{
				SigningIn.welcomePatron();
			}
		}
		public static void delay()
		{
			try
				{
					Thread.sleep(1000);
				}catch(InterruptedException e){
					
					e.printStackTrace();
				}
		}
		public static void logging()
		{
			System.out.print("L");
			delay();
			System.out.print("O");
			delay();
			System.out.print("G");
			delay();
			System.out.print("G");
			delay();
			System.out.print("I");
			delay();
			System.out.print("N");
			delay();
			System.out.print("G");
			delay();
		}
		public static void loggingOn()
		{
			System.out.print(" ");
			System.out.print("O");
			delay();
			System.out.print("N");
			delay();
			System.out.print(".");
			delay();
			System.out.print(".");
			delay();
			System.out.println(".");
		}
		public static void loggingOff()
			{
				System.out.print(" ");
				System.out.print("O");
				delay();
				System.out.print("F");
				delay();
				System.out.print("F");
				delay();
				System.out.print(".");
				delay();
				System.out.print(".");
				delay();
				System.out.println(".");
			}

	}
