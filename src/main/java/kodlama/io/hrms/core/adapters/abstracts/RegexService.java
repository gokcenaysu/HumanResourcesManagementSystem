package kodlama.io.hrms.core.adapters.abstracts;

public interface RegexService {

    boolean isEmailFormat(String email);
//  boolean isPhoneNumberFormat(String phoneNumber);
    boolean isBirthYearFormat(String birthYear);
    boolean isPasswordFormat(String password);
    boolean isFirstNameFormat(String firstName);
    boolean isLastNameFormat(String lastName);
}
