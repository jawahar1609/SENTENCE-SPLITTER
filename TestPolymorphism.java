package End_Sem;

public class TestPolymorphism 

{
  // The TestPolymorphism class has the two methods start( ) and stop( ) that are used by the SplitSentence class. 
	public void start()  
	    {  
	        System.out.println("Started");  
	    }  
	    public void stop()  
	    {  
	        System.out.println("Stopped");  
	    }  
	    
	public static void main(String[] args) 
    { 
  
		ReadTextAsString1 obj1; 
  
        obj1 = new SplitSentence(); 
        obj1.Print(); 
  
        obj1 = new ReadFileIntoList(); 
        obj1.Print(); 
        
        obj1 = new ReadTextAsString1(); 
        obj1.Print(); 
    } 
}

