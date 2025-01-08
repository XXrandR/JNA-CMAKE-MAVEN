#include<iostream>

using namespace std;

int generateRandomNumber(int maxNumber) {
	srand(time(0));
	return rand() % maxNumber;
}

extern "C" {
    int JnaInterface_getValue(int maxNumber) {
        return generateRandomNumber(maxNumber);
    }
}
