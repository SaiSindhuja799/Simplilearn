import java.io.*;
import java.util.*;
public class assessment {

	public static void main(String[] args) {
		boolean temp = true;
		System.out.println(" Welcome to FileApp!!!");
		System.out.println("Company Lockers Pvt. Ltd.\n Developer: Sai Sindhuja\n Hi All!!");
		while(temp)
		{
		System.out.println("Please select one of the below options");
		System.out.println("1.Display List of files\n 2.File Related option\n 3.Close");
		Scanner scan = new Scanner(System.in);
		int user_choice = scan.nextInt();
		switch(user_choice)
		{
		case 1:
			File disp = new File("F:\\simplilearn\\assessment_1");
			File[] array = disp.listFiles();
			if(array.length>0)
			{	System.out.println("The Files are");
				for(int cnt=0;cnt<array.length;cnt++)
				{   
					if(array[cnt].isFile())
					{
						System.out.println("->"+ array[cnt].getName());
					}
				}
				
			}
			else
				System.out.println("No files available");
			
			break;
		case 2:
			System.out.println(" choose one of the below file handling options.");
			System.out.println("1.Add File \n2.Delete File \n3.Search File\n");
			int choice = scan.nextInt();
			String FileName;
			switch(choice)
			{
			case 1:
				System.out.println("Please enter file name");
				FileName = scan.next();
				FileName="F:\\simplilearn\\assessment_1\\" + FileName;
				File ob = new File(FileName);
				try {
					if(ob.exists())
						System.out.println("File already exists");
					else
						{
						ob.createNewFile();
						System.out.println("File Added Successfully");
						}
						
				} catch (IOException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
				break;
			case 2:
				FileName = scan.next();
				FileName="F:\\simplilearn\\assessment_1\\" + FileName;
				File delob = new File(FileName);
				if(delob.exists())
					{
					delob.delete();
					System.out.println("File deleted successfully");
					}
				else
					System.out.println("File is not available");
				break;
			case 3:
				FileName = scan.next();
				FileName="F:\\simplilearn\\assessment_1\\" + FileName;
				File fob = new File(FileName);
					if(fob.exists())
						System.out.println("File exists");
					else
						System.out.println("File Not found"); 
				break;
			}//switch
			break;
		case 3:
			temp=false;
			break;
		
		default:
			System.out.println("Please enter correct option");
			break;
		}
		System.out.println(" ");
		}
		
		System.out.println("Thank you for using the application!!");
		
	}

}
