
public class ReverseAString_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str ="Saket Saurav";
		char[] charArray = str.toCharArray();
		
		for(int i = charArray.length-1;i>=0;i--)
		{
			System.out.print(charArray[i]);
			
		}
		
		
		
	}

}
