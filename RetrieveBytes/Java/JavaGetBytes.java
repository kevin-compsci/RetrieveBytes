/*
Kevin Nguyen
Basic Java programs that outputs the byte representation of a given value. 1 byte = 8 bits

How to run (linux):
	1.) open command line and cd into directory folder of where this code is
	2.) type in "javac *.java" to compile java files
	3.) type in "java JavaGetBytes"
*/

//imports
import java.io.*;
import java.util.*;

//class
class JavaGetBytes {
	//Global Declarations

	//main driver
	public static void main(String[] args) {
		//local Declarations
		int value = 5; //<-- value to get binary representation of
		String binaryString = Integer.toBinaryString(Math.abs(value));

		//call formatting and output initial & results
		System.out.println("Value: " + value + "\nInitial Binary: " + binaryString);
		binaryString = formatBinary(binaryString);
		System.out.println("Formatted Binary: " + binaryString);
	}

	//function definitions below
	//This formatBinary function will take a binary string and output with 0s or truncate digits so there's only 8-bits
	public static String formatBinary(String binaryString) {
		//local Declarations
		int i = 0, limit = 0, length = binaryString.length();
		String temp = "", newBinaryString = "";

		if(length == 8) { //if exact length then output original
			return binaryString;
		}
		else if(length < 8) { //if length is less than 8, 8 bits = 1 byte
			limit = 8 - length; //new limit
			//loop though and concatenate extra 0s then put it in front of the original binary string 
			while(i < limit) {
				temp += "0"; //concatenate 0s to temp string
				i++;
			}
			newBinaryString = temp + binaryString; //append temp string with original binarystring
		}
		else { //length is too large? then truncate (NOTE: could be done better -- How can we truncate and maintain the byte representation?)
			limit = length - 8;
			newBinaryString = binaryString.substring(limit, length);
		}
		return newBinaryString; //return results
	}
}