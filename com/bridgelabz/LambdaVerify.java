package com.bridgelabz;

import java.util.regex.Pattern;

public class LambdaVerify {

    public interface UserVerifyLambda {
        boolean validate(String pattern);
    }

    private final String namePattern = "[A-Za-z]{3,}";
    private final String emailPattern = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
    private final String mobilePattern = "^(\\d{0,9}[\\s]?)?\\d{10}$";
    private final String passwordPattern = "^(?=.*[!@#$%^&*|'<>.-^*()%!])(?=.*[0-9])(?=.*[A-Z])[^\\s]{8,}$";

    public UserVerifyLambda verifyFirstName = (pattern) -> (Pattern.compile(namePattern).matcher(pattern).matches());
    UserVerifyLambda verifyEmail = (pattern) -> (Pattern.compile(emailPattern).matcher(pattern).matches());
    UserVerifyLambda verifyMobile = (pattern) -> (Pattern.compile(mobilePattern).matcher(pattern).matches());
    UserVerifyLambda verifyPassword = (pattern) -> (Pattern.compile(passwordPattern).matcher(pattern).matches());

}
