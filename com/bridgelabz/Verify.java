package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Verify {
    Pattern pattern;
    Matcher matcher;

    public Verify() {

    }
    Scanner sc = new Scanner(System.in);

    public String validName() {
        boolean flag = true;
        String patternEx = "[A-Za-z]{3,}";
        pattern = pattern.compile(patternEx);

        while (flag) {
            System.out.println("Please enter name with capital letter and minimum 3 characters:");
            String name = sc.nextLine();
            Matcher matcher = pattern.matcher(name);
            boolean result = matcher.matches();
            if (result) {
                flag = false;
                return name;
            }
        }
        return null;
    }

    public String validEmail() {
        boolean flag = true;
        String patternEx = "^[\\\\w!#$%&'*+/=?`{|}~^-]+(?:\\\\.[\\\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\\\.)+[a-zA-Z]{2,6}$";
        pattern = pattern.compile(patternEx);
        while (flag) {
            System.out.println("Please enter valid email:");
            String email = sc.nextLine();
            Matcher matcher = pattern.matcher(email);
            boolean result = matcher.matches();
            if (result) {
                flag = false;
                return email;
            }
        }
        return null;
    }

    public String validNum() {
        boolean flag = true;
        String patternEx = "^(\\\\d{0,9}[\\\\s]?)?\\\\d{10}$\n";
        pattern = pattern.compile(patternEx);
        while (flag) {
            System.out.println("Please enter valid mobile number:");
            String mobile_no = sc.nextLine();
            Matcher matcher = pattern.matcher(mobile_no);
            boolean result = matcher.matches();
            if (result) {
                flag = false;
                return mobile_no;
            }
        }
        return null;
    }

    public String validPwd() {
        boolean flag = true;
        String patternEx = "^(\\\\d{0,^(?=.*?[A-Z])(?=.*?[a-z])(?=.*d)(?=.*[@#$%^&-+=()]).{8,}$\n";
        pattern = pattern.compile(patternEx);
        while (flag) {
            System.out.println("Please enter valid password:");
            String password = sc.nextLine();
            Matcher matcher = pattern.matcher(password);
            boolean result = matcher.matches();
            if (result) {
                flag = false;
                return password;
            }
        }
        return null;
    }
}
