#include <stdio.h> // header file for Standard Input Output
#include <stdlib.h> // header file for Standard Library

int main() {
	int x,y;
	scanf("%i%i",&x,&y);
	(x%2==0 & y%2==0)?printf("YES"):printf("NO");
	return 0;
}