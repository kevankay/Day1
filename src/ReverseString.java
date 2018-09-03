import java.io.*;
public class ReverseString {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		    String inp=br.readLine();
		    String words[]=inp.split(" ");
		    String fin="";
		    for(int i=0;i<words.length;i++)
		    {
		    	String rev="" ;
		    	for(int j=words[i].length()-1;j>=0;j--)
		    		{
		    		rev+=words[i].charAt(j);
		    		}
		    fin+=rev+" ";
	}
	System.out.print(fin) ;
	}
}
