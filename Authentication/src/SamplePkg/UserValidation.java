package SamplePkg;

/* 
 * Validation rules:
 * 1. Minimum number of input characters: 8
 * 2. Must have one or more numbers
 * 3. Must have at least one CAPS char.
 * 4. Must have one special character for example $, # etc
 * 5. Can't have the same character repeated more than two times consequently
 * If the above rules are met then return true, else false;
 */

public class UserValidation 
{
	private static char[] symbols = {'!', '@', '#', '$', '%','^','&','*'};
	
	public static boolean doValidate(String inputString) {
		int len = 0;
		if(inputString == "") {
			return false;
		} else {
			len = inputString.length();
			if(len < 8 || len > 8) return false;
		}
		
		boolean number_flag = false, uppercase_char_flag = false;
		char[] c = inputString.toCharArray();
        for(int i = 0; i < c.length; i++) 
        {
			if(c[i] >= '0' && c[i] <= '9')
				number_flag = true;		
			
			if(c[i] >= 'A' && c[i] <= 'Z')
				uppercase_char_flag = true;
			
			if(symbols[c[i]]
		}
		        
        if(number_flag && uppercase_char_flag)
        	return true;
        
		return false;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abhiguB9";
		System.out.println("doValidate: " + doValidate(str));
	}

}

