package com.task1;

import java.util.Scanner;

public class OnlineReservationSystem {
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
			
		System.out.println("welcome to the train Reservation System!");
		
		System.out.println("username:");
		String username = scanner.nextLine();
		
		System.out.println("password:");
		String password = scanner.nextLine();
		
		boolean isValid = validateCredentials(username,password);
		if(isValid) {
			System.out.println("login successful!");
			System.out.println("train Reservation system-Reservation Form");
			
				System.out.println("Enter the source station:");
				String source = scanner.nextLine();
				
				System.out.println("enter destination station:");
				String destination1= scanner.nextLine();
				
				System.out.println("enter the date of travel:");
				String date =scanner.nextLine();
				
				System.out.println("enter train number:");
				int trainNumber=scanner.nextInt();
				scanner.nextLine();// consume the new line character
				
				String trainName= getTrainName(trainNumber);
				
				System.out.println("train Name:"+ trainName);
				
				System.out.println("enter class type:");
				String classType = scanner.nextLine();
				
			
				processReservation1(trainNumber,trainName,classType,source,destination1,date);
				
				
				
				System.out.println("Reservation successful!");
				System.out.println("Would you like to cancel your reservation?(Yes/no)");
				String cancelChoice = scanner.nextLine();
				
				if(cancelChoice.equalsIgnoreCase("yes")) {
					processCancellation(trainNumber,trainName,classType,source,destination1,date);
					
						System.out.println(" enter the PNR number: ");
						String PNRnumber = scanner.nextLine();
						
						System.out.println("if you need to cancel the train,press OK button:");
						String cancel = scanner.nextLine();
					System.out.println("cancellation successful!");
				
			   }else {
				System.out.println("press insert button for entering into train :");
				String insert = scanner.nextLine();
				System.out.println("thankyou for using train Reservation system.Have a great journey!");
			   }
		        }else {
				System.out.println("invalidCredentials.Please try again");	
			}	
		}
		
		
		private static void processCancellation(int trainNumber, String trainName, String classType, String source,
				String destination1, String date) {	
		}

		private static boolean validateCredentials(String username, String password) {
			return username.equals("admin") && password.equals("password");
		}
			
	    private static String getTrainName(int trainNumber) {
	  	//logic to retrieve train name based on train number			
			return "Bhagyanagar Express";
		}

		private static void processReservation1(int trainNumber, String trainName, String classType, String source,
			Object destination, String date){
			System.out.println("Reservation confirmed for train:"+trainName);
			System.out.println("Train Number:"+trainNumber);			
			System.out.println("Class type:"+classType);
			System.out.println("from:"+source);
			System.out.println("To:"+destination);			
			System.out.println("date:" + date);	
			}	

}
