
public class SelectionDemo 
{

	public static void main(String[] args) 
	{
		// if else if else, we can have multiple else if statements
		int n =5;
		
		if(n==0)
		{
			System.out.println("nothing");
			System.out.println("Bye");
		}
		else if (n%2==0) 
		{
			System.out.println("It is even");
			
		}
		else
		{
			System.out.println("It is odd");
			
		}
		
		//ternary operator
		
		int i= 4,j=6;
		
           // condition?exp1:exp2		
	    j= i<3?1:2;
	    System.out.println(j);
	    
	    
	    //switch,it will support integer,character(it ultimately gets converted to character),string 1.7 and above compiler,but not double
	    
	    int m = 2;
	    
	    switch(m)
	    {
	    
	     case 1: 
	     { 
	    	 System.out.println("One");
	    	 break;
	     }
	     case 2: 
	     { 
	    	 System.out.println("Two");
	    	 break;
	     }
	     case 3: 
	     { 
	    	 System.out.println("three");
	    	 break;
	     }
	     default:
	     { 
	    	 System.out.println("No match");
	    	 
	     }
	     
	    
	    }
	    
	    

	}

}
