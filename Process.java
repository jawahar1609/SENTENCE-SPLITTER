package End_Sem;

class Process extends Splitting 
{  
	
public Process(String split)
{
    // calling Splitting constructor
    super(split);
    System.out.println("Process constructor called");
    
}


public String toString()
{
    return "Process is " + super.getsplit();

}
} 
