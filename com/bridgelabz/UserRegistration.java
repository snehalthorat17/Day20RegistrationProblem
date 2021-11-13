package com.bridgelabz;

public class UserRegistration {
    public static void main(String args[]) {
        Verify verify = new Verify();
//        System.out.println("Enter the first name");
//        String fName = verify.validName();
//        System.out.println("Enter the last name");
//        String lName = verify.validName();
//        System.out.println("Enter the Valid Email");
//        String email = verify.validEmail();
//        System.out.println("Enter the Valid number");
//        String number = verify.validNum();
//        System.out.println("Enter The Valid password");
//        String ps = verify.validPwd();
        boolean result;
        LambdaVerify lambdaVerify = new LambdaVerify();
        result = lambdaVerify.verifyFirstName.validate("Snehal");
        System.out.println(result);
    }

}
