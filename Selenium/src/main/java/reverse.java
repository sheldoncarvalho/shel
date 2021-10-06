

public class reverse {
public static void main(String [] args){
	String s="My name";
	int y= s.length();
	String rev ="";
	for(int i= y-1; i>=0; i--){
		rev = rev+s.charAt(i);
	}
	System.out.println(rev);
}
	
}
