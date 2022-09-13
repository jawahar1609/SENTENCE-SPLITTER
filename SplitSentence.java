package End_Sem;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.BreakIterator;
import java.util.Locale;


public class SplitSentence extends ReadTextAsString1 
{
	// SplitSentence has IS-A relationship with ReadTextAsString1
	// SplitSentence is a type of process which splits the sentence from the String, that extends the ReadTextAsString1 class which 
	// shows that SplitSentence is a ReadTextAsString1. 
	// SplitSentence also uses an TestPolymorphism method, stop, using composition. So it shows that a SplitSentence has an TestPolymorphism.
	public void StartDemo()  
    {  
		TestPolymorphism a = new TestPolymorphism();  
        a.stop();  
    }  
	
	// Constructor Method
		 
	  public SplitSentence()
	  {
	     s="Splitting Paragraph Into Sentences";
	  }
	
	 // Testing Polymorphism 
	  void Print() 
      { 
         System.out.println("subclass-1 SplitSentence"); 
      } 
	
	public static String readFileAsString(String fileName)throws Exception 
	{ 
	    String data = ""; 
	    data = new String(Files.readAllBytes(Paths.get(fileName))); 
	    return data; 
	} 
	
	
	public static void main(String[] args) throws Exception 
	{ 
    		
		// Encapsulation
		ReadTextAsString1 obj2 = new ReadTextAsString1();
		obj2.setTopic("\t\t\t\t\t\t Sentence Splitter using OOP's Concepts \n\n");
		obj2.setTeam("\t\t\t\t\t\t\t\t Team");
		obj2.setTeamNumber(11);
		System.out.println(obj2.getTopic());
		System.out.println(obj2.getTeam()+"-"+obj2.getNumber());
		
			 
		
		// Constructor method
		SplitSentence obj = new SplitSentence();
		System.out.println(obj.s +"\n");
		     
		     
		// Reading file in local repository 
		System.out.println("\t\t\t\t\t Method-1: Reading File in Local Repository and starts splitting \n");
	    String data = readFileAsString("C:\\Users\\Harish\\Desktop\\File1.java"); 
	// System.out.println(data); 
	   
	    
	    // Starts splitting
	    String[] parts = data.split("");

	    
		/* String[] res = data.split("[.]", 0);
		   for(String myStr: res) 
	       System.out.println(myStr.trim()+".");
	    */ 
	    

        // Checking the Number of Sentences in a paragraph
	    BreakIterator iterator = BreakIterator.getSentenceInstance(Locale.US);
	    int sentences = count(iterator, data);
	    System.out.println(" \n Number of sentences: " + sentences + "\n"); 
	    System.out.println();
	     
	    // Method Overloading
	 	ReadTextAsString1.show("Output","Predicted"); 
	 	ReadTextAsString1.show("Method Overloaded", 1 +"\n"); 
	 	   
	    
	 	// Static Variable
		array=" Result  " ;
		System.out.println(array +"\n"+Sentence );
		   
    }
	     
	private static int count(BreakIterator bi, String source) 
	{
	     int counter = 0;
	     bi.setText(source);
         
	     int lastIndex = bi.first();
	     while (lastIndex != BreakIterator.DONE) 
	     {
	        int firstIndex = lastIndex;
	        lastIndex = bi.next();
	     
	        if (lastIndex != BreakIterator.DONE) 
	        {
	        	
	           String sentence = source.substring(firstIndex, lastIndex);
	           System.out.print("\n Sentence = "  + sentence + "\n");            
	           counter++;
	        	
	        }
	        
	      }
	   
	     return counter;
	
	}

}



