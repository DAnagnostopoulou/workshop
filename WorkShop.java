import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Formatter;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class WorkShop {
  
	private Set<String> hashSet1 = new HashSet<String>(); 
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
				hashSet1.add(word);
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
			System.out.println("File not found!");
			output.close();
			System.exit(1);
		}
	}
	
	void compareContents()
	{
		ArrayList<String> array1 = new ArrayList<String>(new TreeSet<String>(hashSet1));
		ArrayList<String> array2 = new ArrayList<String>(new TreeSet<String>(hashSet2));

		for (String word : array1)
		{
			if (Collections.binarySearch(array2, word) >=0 ) 
				output.format("%s\n", word);
		}
		output.close();
	}
	
	public static void main(String[] args) {
		if (args.length!=3)
		{
			System.out.println("You should provide 3 args!");
			System.exit(1);
		}
		WorkShop test = new WorkShop(args);
		test.processFiles();
		test.compareContents();
	}
}



