package randomNum;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

import org.junit.Test;



public class GenerateRandomNumbers {
	
	@Test
	public void userShouldBeAbleToGenerateRandomNumbers() {
		
		Scanner ui= new Scanner(System.in);
		List<Integer>mydata= new ArrayList<Integer>();
		Random rnd= new Random();
		for(int i=0; i<500; i++) {
			int randomNumber=rnd.nextInt(1000);	
			Object[]myNumbers=mydata.toArray();
			mydata.add(randomNumber);			
		}
		Collections.sort(mydata);
		System.out.println(mydata);
		System.out.println("Enter Nth Number");
		int NthNumber= ui.nextInt();
		System.out.println("The "+NthNumber+"th smallest number is "+mydata.get(NthNumber-1));
	}

	
}
