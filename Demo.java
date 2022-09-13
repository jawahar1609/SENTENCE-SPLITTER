package End_Sem;

public class Demo {
	public static void main(String[] args)  
    {  
		//In the code above we make an object of the SplitSentence class and then initialize it. All the methods like setExpression(), 
		//splitInfo(), setSplitting() are used here because of the Is-A relationship of the SplitSentence class with the ReadTextAsString1 class.
		
		SplitSentence b = new SplitSentence();  
        b.setExpression("." + "\n");  
        b.setSplitting("Starts Splitting");  
        b.splitInfo();  
        b.StartDemo();  
    }  
}

