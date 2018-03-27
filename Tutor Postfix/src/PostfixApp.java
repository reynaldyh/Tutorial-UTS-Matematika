import java.io.*;


public class PostfixApp {
	
    public static void main(String[] args) throws IOException{
        String input;
        int output;
        
        while(true)
        {
            System.out.print("Enter postfix: ");
            System.out.flush();
            InputStreamReader isr = new InputStreamReader(System.in);
	        BufferedReader br = new BufferedReader(isr);
	        input = br.readLine();
            if( input.equals(" ") )
                break;
            
            ParsePost aParser = new ParsePost(input);
            output = aParser.doParse();
            System.out.println("Evaluates to " + output);
        }
    }   
}