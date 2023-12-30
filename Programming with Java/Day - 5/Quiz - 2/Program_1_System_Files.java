package Quiz_2;

import java.util.*;
import java.io.*;

public class Program_1_System_Files {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the Path to Select the File : ");
		String path = s.nextLine();
		System.out.print("Enter the Extension of the File : ");
		String ext = s.nextLine();
		File f = new File(path);
		File[] all = Filegeter(f,ext);
		System.out.print("\n\nThe Files at Location '"+path+"' with extension '"+ext+"' are");
		int i=0;
		for(File f1 : all)
		{
			i++;
			System.out.print("\n"+i+" - "+f1.getName());
		}
		s.close();
	}
	public static File[] Filegeter(File f, final String e)
	{
		FilenameFilter fl = new FilenameFilter() 
		{
				public boolean accept(File dic,String nm)
				{
					return nm.endsWith(e);
				}
		};
		return f.listFiles(fl);
	}
}





/*
The Output is

Enter the Path to Select the File : D:\Lets do Programs
Enter the Extension of the File : .txt


The Files at Location 'D:\Lets do Programs' with extension '.txt' are
1 - Importants.txt
*/
