#include <stdio.h>    
int main()
{ 
   char fName[20];
   char lName[20];
   char email[80];
   int sysid, rollNo;
    printf("\n===============================================\n");
    printf("Welcome to Sharda Registration Form!!!");
    printf("\n========== Please Enter Your Details ==========\n");
    printf("Enter First Name: ");
    scanf("%s", &fName);
    printf("Enter Last Name: ");
    scanf("%s", &lName);
    printf("Enter Email Address: ");
    scanf("%s", &email);
    printf("Enter System I'd: ");
    scanf("%d", &sysid);
    printf("Enter Roll Number: ");
    scanf("%d", &rollNo);
    printf("\n========== The Details you have entered ==========\n");
    printf("Your First Name: %s\n", fName);
    printf("Your Last Name: %s\n", lName);
    printf("Your Email Address: %s\n", email);
    printf("Your System I'd: %d\n", sysid);
    printf("Your Roll Number: %d\n", rollNo);
    printf("===============================================");
    return 0;   
}
