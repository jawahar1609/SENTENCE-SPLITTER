package End_Sem;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

public class ReadTextAsString1 
{ 
	// Encapsulation
	  private String Topic;
	  private String Team;
	  private int TeamNumber;

	  public void setTopic(String OOPTopic)
	  {
		  Topic = OOPTopic;
	  }
	  
	  public String getTopic()
	  {
		  return Topic;
	  }
	
	  public void setTeam(String OOPTeam)
	  {
		  Team = OOPTeam;
	  }
	 
	  public String getTeam()
	  {
		  return Team;
	  }
	 
	  public void setTeamNumber(int i)
	  {
		  TeamNumber = i;
	  }
	
	  public int getNumber()
	  {
		  return TeamNumber;
	  }
	 
	  
	  // IS-A and HAS-A relation
	  // In the code ReadTextAsString1 class has a few instance variables and methods.
	    private String Expression;  
	    private String Splitting;  
	    public void splitInfo()  
	    {  
	        System.out.println("Regular Expression = "+ Expression + "Process = " + Splitting);  
	    }  
	    public void setExpression(String Expression)  
	    {  
	        this.Expression = Expression;  
	    }  
	    public void setSplitting(String Splitting)  
	    {  
	        this.Splitting = Splitting;
	    }
	    
	 // Constructor Method
        String s;
      
        
     // Method Overloading 
	     
        static void show(String a,String b) 
	    {  
		     System.out.println(a + " "+ b);  	   
	    }
	 
	    static void show(String a, int b) 
	    {   
	    	 System.out.println(a + " "+ b);   
	    }
	     
	     
	  // Method Overriding
	     void Print() 
	     { 
	         System.out.println("Parent ReadTextAsString1 class"); 
	     } 
	        
	     
	  
	     
	  // Static variables
         public static String array;  // array  variable is a public static variable
         public static final String Sentence = "Sucessfully Splitted ";   // Sentence is a constant

         
	   // Method-2 using try catch
	      public static List<String> readFileInList(String fileName) 
	      {
		      List<String> lines = Collections.emptyList();
	          
	         try
	         {
	    	     lines = Files.readAllLines(Paths.get(fileName), StandardCharsets.UTF_8);
	    	 }
	      
	         catch (IOException e)
	         { 
	    	     e.printStackTrace();
	    	 }
	           
	           return lines;
	        
	       } 
}


