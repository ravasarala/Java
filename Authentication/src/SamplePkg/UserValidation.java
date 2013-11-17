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
	
	public static boolean doValidateViaArray(String inputString) 
	{
		char symbols[] = {'!', '@', '#', '$', '%','^','&','*'};
		int i = 0, len = 0, temp[];
		temp = new int[256];
		
		if(inputString == null) {
			return false;
		} else {
			len = inputString.trim().length();
			if(len < 8 || len > 8) {
				System.out.println("Make sure the password has the above mentioned rules with a length of 8, and no white spaces!");
				return false;
			}
		}
						
		while(i < symbols.length) {
			temp[symbols[i]] = 1;
			i++;
		}
				
		boolean number_flag = false, uppercase_char_flag = false, symbol_flag = false;
		char[] c = inputString.toCharArray();
		int count = 1;
		i = 0;
		char first = c[i];
        
		for(; i < c.length; i++) 
        {
			if(c[i] >= '0' && c[i] <= '9')
				number_flag = true;		
			else if(c[i] >= 'A' && c[i] <= 'Z')
				uppercase_char_flag = true;
			else if(temp[c[i]] == 1)
				symbol_flag = true;
			
			if(i + 1 != c.length) 
			{
				if(first == c[i+1]) {
					count++;
				} else {
					first = c[i + 1];
					count = 1;
				}
			}
			
			if(count > 2) {
				System.out.println("Characters repeated more than 2 times consequently!");
				return false;
			}
		}
		        
        if(number_flag && uppercase_char_flag && symbol_flag)
        	return true;
        
        System.out.println("Either or And - number|uppercase|symbol flag are false!");
		return false;
	}
	
	public static boolean doValidateViaHashtable(String str) {
		//Todo...
		return false;
	}
	
	public static boolean doValidateViaBytes(String str) {
		//todo...
		return false;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = " b8*HggA";
		System.out.println("doValidateViaArray: " + doValidateViaArray(str));
		System.out.println("doValidateViaHashtable: " + doValidateViaHashtable(str));
		System.out.println("doValidateViaBytes: " + doValidateViaBytes(str));
	}

}

