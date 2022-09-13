package End_Sem;

import java.util.List;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.FileInputStream;
import java.util.*;


public class ReadFileIntoList extends ReadTextAsString1
{
	// Testing Polymorphism 
	void Print() 
    { 
        System.out.println("subclass-2 ReadFileIntoList"); 
    } 
	
	public static void count(final File file) throws IOException 
	
	{
    	BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file)));

    	String line;    	
    		
    	int paragraphCount = 1;
    	
    	while ((line = br.readLine()) != null) 
    	{
    		if (line.equals("")) 
    		{
    			paragraphCount++;
    		} 
    		
    	}

       System.out.println("\nTotal number of paragraphs = " + paragraphCount);

    }
	
	public static void main(String[] args) throws IOException
	{
	   //Using Try Catch Method
		System.out.println("\t\tMethod 2\n");
	    List<String> l = readFileInList("C:\\Users\\Harish\\Desktop\\File2.java");
        Iterator<String> itr = l.iterator();
    
        while (itr.hasNext())
	     
    	System.out.println(itr.next());
	    String textfile = "File2.txt";
        String filename = textfile.split("\\.")[0];
          
        count(new File("C:\\Users\\Harish\\Desktop\\File2.java"));
        	
    }
           
}



