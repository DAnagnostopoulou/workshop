My Java Program is class WorkShop which consists of 6 private class members (for storing data in HashSets, 
storing the input argument parameters and storing the outputData) and of 2 public class methods:
-processFiles() for saving file data to HashSets and
-compareContents() for getting common data and storing to output file

My implementation is the following:
1) For each file, read each line and add it to HashSet
2) The two HashSets (resulted from the two files) are instantiating two TreeSets (used for sorting the HashSets)
3) The TreeSets are used for instantiating two ArrayLists (we need type List for the following step) 
4) Use static method binarySearch of Collections on the ArrayLists for performance (no logic error-ArrayLists are 
   already sorted via using TreeSets)
   
Answers:
1) There is no limit for the maximum number of words in the input files. (I created large files ~1.2G and the program
   terminated and with correct results).It is expected and reasonable that the bigger the files are, the program will 
   take longer to terminate. (This fact is based on many parameters such as the system properties, the jvm version etc).
   Even if I use the option -Xmx256M, it is not guaranteed that my program will run faster, depends on the machine 
   and platform.
2) No limit.
3) For the time given, I believe that I selected an efficient way to solve this issue. I used HashSets/TreeSets/ArrayList, 
   Java APIs that are proven to be quicker and not error-prone. Additionally, binarySearch is a quick enough method for 
   searching.
4) If I had big files, I would select a machine with enough memory in order to increase the max heap size to e.g.
   -Xmx1024M. Additionally, if I had more time, I would re-evaluate my proposed solution and try to find out if there
   would be a more efficient software solution.
