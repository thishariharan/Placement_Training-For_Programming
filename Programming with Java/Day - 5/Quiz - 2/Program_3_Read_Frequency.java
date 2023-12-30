package Quiz_2;

import java.util.*;
import java.io.*;
import java.nio.file.*;

public class Program_3_Read_Frequency {

	public static void main(String[] args) {
		try
		{
			Scanner s = new Scanner(System.in);
			System.out.print("Enter the Path to Select the File : ");
			String path = s.nextLine();
			Map<String,Integer> frequency = findcoms(path);
			System.out.print("\nThe Words and its Frequency");
			for(Map.Entry<String,Integer> a : frequency.entrySet())
			{
				System.out.print("\n"+a.getKey()+" - "+a.getValue());
			}			
		}
		catch(IOException e)
		{
			System.out.print("\nError : "+e.getMessage());
		}

	}
	public static Map<String,Integer> findcoms(String p) throws IOException
	{
		Map<String,Integer> freq = new HashMap<>();
		File d = new File(p);
		File[] f = d.listFiles();
		if(f != null)
		{
			for(File fi : f)
			{
				if(fi.isFile() && fi.getName().endsWith(".txt"))
				{
					String str = Files.readString(Paths.get(fi.getPath()));
					String[] word = str.toLowerCase().split("\\s+");
					for(String w : word)
					{
						freq.put(w, freq.getOrDefault(w, 0)+1);
					}
				}
			}
		}
		int c = 0;
		Map<String,Integer> common = new HashMap<>();
		for(Map.Entry<String,Integer> entry : freq.entrySet())
		{
			int fre = entry.getValue();
			if(fre > c)
			{
				c = fre;
				common.clear();
				common.put(entry.getKey(), fre);
			}
			else if( fre == c)
			{
				common.put(entry.getKey(), fre);				
			}
		}
		return common;
	}

}




/*
The Output is

Enter the Path to Select the File : D:\stds\Placement Training\Java Programming\Day_5\src\Quiz_2\Samps

The Words and its Frequency
how - 3
world - 3
are - 3
you - 3
*/