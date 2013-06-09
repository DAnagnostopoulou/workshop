package javaWorkShop;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class WorkShop implements IWorkShop{
	
	private Set<String> treeSet1 = new TreeSet<String>(); 
	private Set<String> hashSet2 = new HashSet<String>(); 
	private Formatter output;
	private String file1;
	private String file2;
	private String outputFile;
	
	public WorkShop (String[] args)
	{
		file1 = args[0];
		file2 = args[1];
		outputFile = args[2];
	}
	
	public void processFiles()
	{
		try {
			output = new Formatter(outputFile);
			
			Scanner input = new Scanner(new File(file1));
			while (input.hasNext())
			{
				String word = input.nextLine();
				treeSet1.add(word);
			}
			
			input = new Scanner(new File(file2));
			while (input.hasNext())
			{
				String word = input.nextLine();
				hashSet2.add(word);
			}
		}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
			output.close();
			System.exit(1);
		}		
	}
	
	public void compareContents()
	{		
		for (String word : treeSet1)
		{
				if (hashSet2.contains(word))
					output.format("%s\n", word);
		}
		output.close();
	}
}



