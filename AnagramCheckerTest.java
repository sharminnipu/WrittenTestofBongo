/* Unit Test of Anagram Solution */

import org.junit.Test;


import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.*;


public  class AnagramsCheckerTest {
	
	private String input1 ="bleat";
	
	private String input2 ="table";

	
	
	@Test
	public  void testValidInput() {
		
		if(input1!=null && input2!=null){
			System.out.println("inputs are valid");
			}
			else{
			System.out.println("inputs are not valid");
			}
       
       
   }
	
	
	@Test
	public  void testCaseOfAnagram() {
		
	
        assertThat(AnagramChecker. isAnagram(input1, input2) , equalTo(true));
       
   }
	
		
}