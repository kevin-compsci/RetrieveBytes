//Kevin Nguyen
//Basic program in C++ (Cpp) that returns a binary representation for a given value. 1 Byte = 8 bits. Large values may have odd truncated digits so increase the # of bits as needed. Signed/Unsigned bits are not considered.

/*
How to run (linux):
	1.) open command line and cd into directory folder of where this code is
	2.) type in "g++ *.cpp" to compile c++ files
	3.) type in "a.out" to run out file
*/

//include statements
#include <cstdlib>
#include <bitset>
using namespace std;

//main driver
int main(int argc, char** argv) {
	//local declarations
	int value = 10; //<-- value to retrive bytes from
	cout << bitset<8>(value).to_string() << endl; //<--- utilize bitset to retrieve the # of bits based on some value
}
