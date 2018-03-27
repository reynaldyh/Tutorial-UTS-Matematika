import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Postfix {
	 	private final int maxSize;
	    private final int[] stackArray;
	    private int top;

	    public Postfix(int size)
	    {
	        maxSize = size;
	        stackArray = new int[maxSize];
	        top = -1;
	    }
	    
	    public void push(int j)
	    { stackArray[++top] = j; } 
	    
	    public int pop()
	    { return stackArray[top--]; }
	    
	    public int peek()
	    { return stackArray[top]; }
	    
	    public boolean isEmpty()
	    { return (top == -1); }
	    
	    public boolean isFull()
	    { return (top == maxSize-1); }
	    
	    public int size()
	    { return top+1; }
	    
	    public int peekN(int n)
	    { return stackArray[n]; }
	    
	    public void displayStack(String s)
	    {
	        System.out.print(s);
	        System.out.print("Stack (bottom-->top): ");
	        for(int j=0; j<size(); j++)
	        {
	            System.out.print( peekN(j) );
	            System.out.print(' ');
	        }
	        System.out.println(" ");
	    }
	   
}
