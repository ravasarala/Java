package SamplePkg;

/* 
 * Validation rules:
 * 1. Minimum number of input characters: 8
 * 2. Must have one number
 * 3. Must have one special character for example $, # etc
 * 4. Can't have the same character repeated more than two times consequently
 * 
 * If the above rules are met then return true, else false;
 */

public class UserValidation {
	
	public static boolean doValidate(String inputString) {
		
		return true;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "test";
		System.out.println("doValidate: " + doValidate(str));
		
	}

}
