package kodlama.io.hrms.core.adapters.concretes;

import kodlama.io.hrms.core.adapters.abstracts.RegexService;
import org.springframework.stereotype.Service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service
public class RegexManager implements RegexService {

    @Override
    public boolean isEmailFormat(String email) {
        String regex = "^(.+)@(\\S+)$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

//    @Override
//    public boolean isPhoneNumberFormat(String phoneNumber) {
//        String regex = "^(05)([0-9]{2})\\s?([0-9]{3})\\s?([0-9]{2})\\s?([0-9]{2})$";
//
//        Pattern pattern = Pattern.compile(regex);
//        Matcher matcher = pattern.matcher(phoneNumber);
//        return matcher.matches();
//    }

    @Override
    public boolean isBirthYearFormat(String birthYear) {
        String regex = "(?:19|20)\\d\\d";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(birthYear);
        return matcher.matches();
    }

    @Override
    public boolean isPasswordFormat(String password) {
        String regex = "^(?=.*[A-Z])(?=.*[\\W])(?=.*[0-9])(?=.*[a-z]).{8,128}$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }
}
