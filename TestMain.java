package javaWorkShop;

public class TestMain {
  
	public static void main(String[] args) {
		if (args.length!=3)
		{
			System.out.println("You should provide 3 args!");
			System.exit(1);
		}
		IWorkShop test = new WorkShop(args);
		test.processFiles();
		test.compareContents();
		return;
	}
}



