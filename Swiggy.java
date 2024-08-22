import java.util.*;
class Swiggy 
{
	static Scanner sc=new Scanner(System.in);
	static int cost=0,amount=0;
	public static void Total()
	{
		System.out.println("\t----------------");
		System.out.print("\tQuantity : ");
		int c=sc.nextInt();
		amount =c*cost;
		System.out.println("\tTotal Ammount : "+amount);
		Pay();
		
	}
	public static void Pay()
	{
		System.out.println("\t----------------");
		System.out.println("\tPayment method : ");
		System.out.println("\t----------------");
		System.out.println("\t1.Cash on Delivery");
		System.out.println("\t2.Online payment");
		int d=sc.nextInt();
		if (d==1)
		{
            System.out.println("\t----------------");
			System.out.println("\tOrder placed");
			System.out.println("\tThank You!!!!");
		}
		else if (d==2)
		{
			System.out.println("\t----------------");
			System.out.print("\tEnter the Ammount : ");
			int e=sc.nextInt();
			if (e==amount)
			{
				int otp=(int)(Math.random()*-9999+9999);
				System.out.println("\tCapcha : "+otp);
				System.out.print("\tEnter the Capcha : ");
				int f=sc.nextInt();
				if (otp==f)
				{
					System.out.println("\t----------------");
					System.out.println("\n\tPayment Successfull\n\tOrder placed");
					System.out.println("\tThank You!!!!");
				}
				else 
				{
					System.out.println("\t----------------");
					System.out.println("\tFAILED.......");
				}

			}
		}
		else
		{
			System.out.println("\t----------------");
			System.out.println("\tInvalid.......");
			System.out.println("\tPlease try again");
			
		}
	}

	public static void main(String[] args) 
	{
		System.out.println("\t\t\tWelcome to Swiggy Application");
		boolean flag=true;
		
        do
        {
		
		System.out.println("\n\n\tSelect the Hotel");
		System.out.println("\t----------------");
		System.out.println("\t1.Buhari");
		System.out.println("\t2.A2B");
		System.out.println("\t3.Anandbavan");
		System.out.println("\t4.Amma Canteen");
		System.out.println("\t----------------");
		System.out.print("\twhich Hotel : ");
		int a=sc.nextInt();
		System.out.println("\t----------------");
		//******************************************************************************************************************************
		if (a==1)
		{
			System.out.println("\n\n\t\t\tWelcome to Buhari!!!!");
			System.out.println("\n\n\tSelect Which food ");
			System.out.println("\t----------------");
			System.out.println("\t1.Biriyani");
			System.out.println("\t2.veg meals");
			System.out.println("\t3.falooda");
			System.out.println("\t4.gobi frie");
			System.out.println("\t----------------");
			System.out.print("\tWhat Do You Want : ");
			int b=sc.nextInt();
			System.out.println("\t----------------");
			switch (b)
			{
			case 1:
				{
				 cost=210;
				System.out.println("\t1.Biriyani	Rs."+cost);
				Total();
				break;
				}
			case 2:
				{
				cost=50;
				System.out.println("\t2.veg meals	Rs."+cost);
				Total();
				break;
				}
			case 3:
				{
				cost=90;
				System.out.println("\t3.falooda		Rs."+cost);
				Total();
				break;
				}
			case 4:
				{
				cost=110;
				System.out.println("\t4.gobi frie	Rs."+cost);
				Total();
				break;
				}
			default:
				{
				System.out.println("\n\n\t******Invalid Input******");
				break;
				}
			}
		}
		//******************************************************************************************************************************

		else if (a==2)
		{
			System.out.println("\n\n\t\t\tWelcome to A2B!!!!");
			System.out.println("\n\n\tSelect Which food ");
			System.out.println("\t----------------");
			System.out.println("\t1.jammun");
			System.out.println("\t2.laddu");
			System.out.println("\t3.mixture");
			System.out.println("\t4.creame cake (1 piece)");
			System.out.println("\t----------------");
			System.out.print("\tWhat Do You Want : ");
			int b=sc.nextInt();
			System.out.println("\t----------------");
			switch (b)
			{
			case 1:
				{
				cost=75;
				System.out.println("\t1.jammun	Rs."+cost);
				Total();
				break;
				}
			case 2:
				{
				cost=50;
				System.out.println("\t2.laddu	Rs."+cost);
				Total();
				break;
				}
			case 3:
				{
				cost=120;
				System.out.println("\t3.Mixture		Rs."+cost);
				Total();
				break;
				}
			case 4:
				{
				cost=30;
				System.out.println("\t4.Creame Cake (1 piece)	Rs."+cost);
				Total();
				break;
				}
			default:
				{
				System.out.println("\n\n\t******Invalid Input******");
				break;
				}
			}
		}
		//******************************************************************************************************************************

		else if (a==3)
		{
			System.out.println("\n\n\t\t\tWelcome to Anandbavan!!!!");
			System.out.println("\n\n\tSelect Which food ");
			System.out.println("\t----------------");
			System.out.println("\t1.Chicken Biriyani");
			System.out.println("\t2.Mutton Biriyani");
			System.out.println("\t3.Fish Biriyani");
			System.out.println("\t4.Pron Biriyani");
			System.out.println("\t----------------");
			System.out.print("\tWhat Do You Want : ");
			int b=sc.nextInt();
			System.out.println("\t----------------");
			switch (b)
			{
			case 1:
				{
				cost=210;
				System.out.println("\t1.Chicken Biriyani	Rs."+cost);
				Total();
				break;
				}
			case 2:
				{
				cost=350;
				System.out.println("\t2.Mutton Biriyani	Rs."+cost);
				Total();
				break;
				}
			case 3:
				{
				cost=180;
				System.out.println("\t3.Fish Biriyani		Rs."+cost);
				Total();
				break;
				}
			case 4:
				{
				cost=300;
				System.out.println("\t4.Pron Biriyani	Rs."+cost);
				Total();
				break;
				}
			default:
				{
				System.out.println("\n\n\t******Invalid Input******");
				break;
				}
			}
		}
		//******************************************************************************************************************************

		else if (a==4)
		{
			System.out.println("\n\n\t\t\tWelcome to Amma Canteen!!!!");
			System.out.println("\n\n\tSelect Which food ");
			System.out.println("\t----------------");
			System.out.println("\t1.Lemon rice");
			System.out.println("\t2.Tomato Rice");
			System.out.println("\t3.Tiger Rice");
			System.out.println("\t4.Curd Rice");
			System.out.println("\t----------------");
			System.out.print("\tWhat Do You Want : ");
			int b=sc.nextInt();
			System.out.println("\t----------------");
			switch (b)
			{
			case 1:
				{
				cost=40;
				System.out.println("\t1.Lemon rice	Rs."+cost);
				Total();
				break;
				}
			case 2:
				{
				cost=50;
				System.out.println("\t2.Tomato Rice		Rs."+cost);
				Total();
				break;
				}
			case 3:
				{
				cost=40;
				System.out.println("\t3.Tiger Rice		Rs."+cost);
				Total();
				break;
				}
			case 4:
				{
				cost=30;
				System.out.println("\t4.Curd Rice	Rs."+cost);
				Total();
				break;
				}
			default:
				{
				System.out.println("\n\n\t******Invalid Input******");
				break;
				}
			}
		}
		//******************************************************************************************************************************

		else
		{
			System.out.println("\n\n\t******Invalid Input******");
		}
        
		System.out.println("\n\n\t----------------");
		System.out.println("Do you want to contineou : (y/n)");
		char ch=sc.next().charAt(0);
		if (ch=='n' || ch=='N')
			{
				flag=false;
			}
		
		/*if (ch=='y' || ch=='Y' || ch=='n' || ch=='N')
		{
			if (ch=='n' || ch=='N')
			{
				flag=false;
			}
			if (ch=='y' || ch=='Y')
			{
				flag=true;
			}
		}
		else 
			{
				System.out.println("enter yes or no");
			}*/
		}
        while (flag);


	}
}
