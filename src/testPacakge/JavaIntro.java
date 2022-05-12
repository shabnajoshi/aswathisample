package testPacakge;

public class JavaIntro {
	
	public class MyFirstPrograms {
	/*
	 * first java program
	 * adding numbers
	 * modulus of two numbers
	 * if else statements
	 */
		public static void main(String[] args) {
		System.out.println("1)   hello java");
		//addition of two numbers
	           int x=10;
	           int y=10;
	           int c=x+y;
	           System.out.println("2)   result= "+c);
	    //modulus of two numbers
	           int a=10;
	           int b=3;
	           int d=a%b;
	           System.out.println("3)  result= "+d);
	    //if else statement
	           if(x<y){
	        	   System.out.println("4))   is less than y");
	           }else if(x ==y){                       //relational operators
	        	   System.out.println("4)  x is equal to y");
	           }else{
	        	   System.out.println("4)  x is greater than y");   
	           }
	    //for loop
	           System.out.println("5)increment");
	          for(int i=0;i<=10;i++)              //i++    -->  i=i+1
	           { 
	        	   System.out.println("i="+i);
	           }
	          System.out.println("6)decrement");
	           for(int i=10;i>=0;i--)              //i--    -->  i=i-1
	           {
	        	   System.out.println("i="+i);
	           }
	    //while loop
	           int z=-10;
	           System.out.println("7) while loop");
	           while(z <= 0)
	           {
	        	   System.out.println(" z="+z);
	        	   z++;         //z=z+1   , z +=1 , z+=2
	           }
	    //do while loop
	           int n=-10;
	           System.out.println("8) do while loop"); //executes the block of statements at least once 
	           do{
	        	  System.out.println("n="+n);
	        	  n--;
	           }while(n>0);
	     //AND $ OR statements    
	           int p,q;
	           p=10;
	           q=-10;
	           System.out.println("9)  && AND operation  || OR operation"); //short and(both condition must be true,if first condition fails it will not look @ the next condition in double &&)
	           if(p>0  && q>0)    // &-used for bit operators(it will check both the condition)
	           {
	        	   System.out.println("Both numbers are positive");
	           }else if(p>0 || q>0)
	           {
	        	   System.out.println("atleast one should be positive");
	           }else{
	        	   System.out.println("both numbers are negative");
	           }
	           
		}

	}


}
