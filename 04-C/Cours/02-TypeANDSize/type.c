#include <stdio.h>  

int main(int args , char*argv[]){
    printf("a char is %ld bytes\n", sizeof(char));
    printf("an int  is %ld bytes\n" , sizeof(int));
    printf("a float  is %ld bytes\n" , sizeof(float));
    printf("a double is %ld bytes\n" , sizeof( double));
    printf("a short int is %ld bytes\n" , sizeof(short int));
    printf("a long int is %ld bytes\n" , sizeof( long int));
    printf("a long double is %ld bytes\n" , sizeof(long double)); // 12 for  64 bits OS  and 16 for 32 bits OS
    return 0;
}