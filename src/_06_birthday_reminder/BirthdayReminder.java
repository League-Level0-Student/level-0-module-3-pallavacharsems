
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _06_birthday_reminder;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "November 16th";
		String dadsBirthday = "January 5th";
		String myBirthday = "June 9th";

		// 2. Find out which birthday the user wants and and store their response in a variable
	String birthday = JOptionPane.showInputDialog("Choose a birthday of your family. For example choose yours, your mom, your dad, and etc.");
		// 3. Print out what the user typed
		System.out.println(birthday);
		// 4. if user asked for "mom"
		if (birthday.equalsIgnoreCase("mom")){
			System.out.println(momsBirthday);	
		}
			//print mom's birthday
		// 5. if user asked for "dad"
		if (birthday.equalsIgnoreCase("dad")){
			System.out.println(dadsBirthday);
		}
			// print dad's birthday
		// 6. if user asked for your name
			if (birthday.equalsIgnoreCase("me")){
				System.out.println(myBirthday);
			}
				
			// print myBirthday
		//7. otherwise print "Sorry, i don't remember that person's birthday!"
			else {
		JOptionPane.showMessageDialog(null, "I don't remember his/her birthday!");
	}
		
	} 
}
