#
#Kevin Nguyen
#Basic program for Python that outputs the binary representation of a value. 1 Byte = 8 Bits. Truncating could be improved.
#
#How to run (linux):
#	1.) open command line and cd into directory folder of where this code is
#	2.) type in "python PythonGetBytes.py"

#import statements
import sys;
import array;
import math;

#function implementation/definition below
def formatBinary(binaryString):
	#local declaratoins
	i, limit, length = 0, 0, len(binaryString);
	temp, newBinaryString = "", "";

	if(length == 8): #length is 8? then output original binarystring
		return binaryString
	elif(length < 8): #length is less than 8? append extra 0s as needed
		limit = 8 - length; #limit when iterating with loop
		#loop through up to limit and concatenate 0s to temp string
		while(i < limit):
			temp += "0"; #concatenate 0s to temp string here
			i=i+1;
		newBinaryString = temp + binaryString; #combine temp string with binarystring
	else: #truncate extra 0s as needed (NOTE: This could be done better to consider sign-bits & significant bits?)
		limit = length - 8;
		newBinaryString = binaryString[limit:]; #get substring and set to result
	return newBinaryString; #return results


#main driver below
value = 259 #<--- value for representation
binaryString = "{0:b}".format(abs(value));
print "Value: " + str(value);
print "Initial Binary: " + binaryString;
binaryString = formatBinary(binaryString);
print "Formatted Binary: " + binaryString;