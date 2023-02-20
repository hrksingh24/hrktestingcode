package apachepoi;

import org.testng.annotations.Test;

public class Forloop {
	
	int month=12;
	int days=31;

//	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	@Test	
	public void days() {
		
		for(int i=1; i<=12; i++ ){
			System.out.println("month:"+i);
			
			
			for (int j=1; j<=31;j++) {
				System.out.println("days:"+j);
			}
			
		}

	}

}
