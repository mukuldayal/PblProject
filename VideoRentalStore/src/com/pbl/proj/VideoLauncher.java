package com.pbl.proj;
import java.util.*;

public class VideoLauncher {

	public static void main(String[] args) {
		VideoStore VS=new VideoStore();
		boolean loop=true;
		int ch;
		String name;
		Scanner sc=new Scanner(System.in);
		while(loop==true) {
			System.out.print("\n");
			System.out.println("MAIN MENU");
			System.out.println("=========");
			System.out.println("1.Add Videos :");
			System.out.println("2.Check Out Video :");
			System.out.println("3.Return Video :");
			System.out.println("4.Receive Rating :");
			System.out.println("5.List Inventory :");
			System.out.println("6.Exit");
			System.out.print("Enter your choice (1..6) :");
			ch=Integer.parseInt(sc.nextLine());
			switch(ch) {
			case 1:
				System.out.print("Enter the name of the video you want to add:");
				name=sc.nextLine();
				VS.addVideo(name);
				break;
			case 2:
				System.out.print("Enter the name of the video you want to check out:");
				name=sc.nextLine();
				VS.doCheckout(name);
				break;
			case 3:
				System.out.print("Enter the name of the video you want to Return:");
				name=sc.nextLine();
				VS.doReturn(name);
				break;
			case 4:
				System.out.print("Enter the name of the video you want to Rate:");
				name=sc.nextLine();
				System.out.print("\nEnter the rating for this video:");
				int rating=Integer.parseInt(sc.nextLine());
				VS.receiveRating(name,rating);
				break;
			case 5:
				VS.listInventory();
				break;
			case 6:
				loop=false;
				System.out.println("Exiting...!! Thanks for using the application.");
				break;
			default:
				System.out.println("Enter Valid Choice");
				
			}
			
		}
		sc.close();

	}

}
