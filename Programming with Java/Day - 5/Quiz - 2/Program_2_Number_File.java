package Quiz_2;

import java.io.*;

public class Program_2_Number_File {

	public static void main(String[] args) {
		try
		{
			checker("D:\\stds\\Placement Training\\Java Programming\\Day_5\\src\\Quiz_2\\Numbers.txt");
		}
		catch(PositivityException e)
		{
			System.out.print("\nError : "+e.getMessage());
		}
		catch(FileNotFoundException e)
		{
			System.out.print("\nError : "+e.getMessage());
		}
		catch(IOException e)
		{
			System.out.print("\nError : "+e.getMessage());
		}

	}
	public static void checker(String f) throws PositivityException, FileNotFoundException, IOException
	{
		try(BufferedReader b = new BufferedReader(new FileReader(f)))
		{
			System.out.print("\nThe Negative Elements in the File are\n");
			String a;
			while((a = b.readLine()) != null)
			{
				String[] str = a.split("\\s+");
				for(String s : str)
				{
					int n = Integer.parseInt(s);
					System.out.print(" "+n+" ");
					if(n>=0)
					{
						throw new PositivityException("A Positive Number "+n+" is found.");
					}
				}
			}
		}
	}
}

class PositivityException extends Exception
{
	public PositivityException(String m)
	{
		super(m);
	}
}




/*
The Output is

The Negative Elements in the File are
-21  -3  -5  -6  7 
Error : A Positive Number 7 is found.
*/