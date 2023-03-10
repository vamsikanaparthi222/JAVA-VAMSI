package com.Backend;

public class ConditionalStatements {

	public static void main(String[] args) {
		//int i = 25;
//		If condition
		//if(i<0) {
			//System.out.println("The givrm number is Negative number");
			
		//}
		
//		If-else Condition
		//if(i<0) {
			//System.out.println("The givrm number is negetive number");
		//}
		//else {
			//System.out.println("positive");
		//}
		
//		nested if
		{/*String examStatus = "Pass";
		if(examStatus == "Pass") {
			System.out.println("Please wait for further details");
			
			String round1Status = "Pass";
			if(round1Status == "Pass") {
				System.out.println("You Have cleared the first round and wait for the second round");
				
				String round2Status = "Pass";
				if(round2Status == "Pass") {
					System.out.println("You Have cleared the second round and wait for the HR interview");
					
					String HRroundStatus = "Pass";
					if(HRroundStatus == "Pass") {
						System.out.println("You Have cleared the HR round and wait for further  details");
						
						String eligibleTest = "Pass";
						if(eligibleTest == "Pass") {
							System.out.println("Congratulations! you currently fit for this Role And wait for the Joining Letter ");
							
							String JoiningLetter ="Pass";
							if(JoiningLetter == "Pass") {
								System.out.println("ID,BUS,CAR,CANTEEN,FREE etc..");
							}
							else {
								System.out.println("Please Wait for further details");
							}
							
						}
						else {
							System.out.println("You are not fit for this  Role");
						}
								
					}
					else {
						System.out.println("Go to Home");
					}
				}
				else {
					System.out.println("Go to Home");
				}
			}
			else {
				System.out.println("Go to Home");
			}
		}
		else {
			System.out.println("Go to Home");
		}*/}
		
//		switch statement condition
		int i =10;
		
		switch(i) {
		case 1:
			System.out.println("First Statement");
			break;
			//if case 1 and case 2 any value is same it will excute below print statement
		/*case 1:
		  case 2:
			System.out.println("First Statement");
			break:
		*/
			
		case 2:
			System.out.println("Second Statement");
			break;
		default:
			System.err.println("default Statement");
			break;
		
			
		}
		
		

	}

}
