package com.example.assignment.ulti;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateUtil {
    public  static  final  Pattern VALID_EMAIL_ADDRESS_REGEX =
            Pattern.compile("\\b[A-Z0-9._%-]+@[A-Z0-9.-]+\\.[A-Z]{2,4}\\b",
                    Pattern.CASE_INSENSITIVE);
    public  static  final  Pattern VALID_PHONE_REGEX =
            Pattern.compile("\\b[A-Z0-9._%-]+@[A-Z0-9.-]+\\.[A-Z]{2,4}\\b",
                    Pattern.CASE_INSENSITIVE);
    public static boolean checkEmail(String email){
        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(email); // tìm trong chuỗi theo khuân mẫu
        return  matcher.find();
    }
    public static boolean checkPhone(String phone){
        Matcher matcher = VALID_PHONE_REGEX.matcher(phone);// tìm trong chuỗi theo khuân mẫu
        return  matcher.find();
    }
}
