package End_Sem;
// Abstraction
abstract class Splitting 
{
    //abstract method 
	String split;
	 
    // these are abstract methods
   
    public abstract String toString();
 
    // abstract class can have constructor
    public Splitting(String split)
    {
        System.out.println("Splitting constructor called");
        this.split = split;
    }
 
    // this is a concrete method
    public String getsplit() 
    { 
    	return split;
    	
    }

}
 


  
