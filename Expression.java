package End_Sem;

class Expression extends Splitting 
{ 
	double exp;
	 
    public Expression(String split)
    {
 
        // calling Splitting constructor
        super(split);
        System.out.println("Expression constructor called");
       
    }
 
   
 
     public String toString()
    {
        return "Expression split is " + super.getsplit();
    }
    public void out(){System.out.println("Hello");} 
    

	    } 

