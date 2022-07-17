package kodlama.io.hrms.business.requireds;

import kodlama.io.hrms.business.abstracts.FieldService;
import kodlama.io.hrms.business.constants.messages;
import kodlama.io.hrms.core.adapters.abstracts.RegexService;
import kodlama.io.hrms.core.utilities.results.ErrorResult;
import kodlama.io.hrms.core.utilities.results.Result;
import kodlama.io.hrms.core.utilities.results.SuccessResult;
import kodlama.io.hrms.dataAccess.abstracts.EmployerDao;
import kodlama.io.hrms.dataAccess.abstracts.UserDao;
import kodlama.io.hrms.entities.concretes.Employer;

public class EmployerFieldManager implements FieldService<Employer> {

    private EmployerDao employerDao;
    private UserDao userDao;
    private RegexService regexService;

    public EmployerFieldManager(EmployerDao employerDao, UserDao userDao, RegexService regexService) {
        super();
        this.employerDao = employerDao;
        this.userDao = userDao;
        this.regexService = regexService;
    }

    @Override
    public Result verifyRegister(Employer employer) {

        if (employer.getEmail().isEmpty() || employer.getEmail().isBlank()
                || employer.getWebsite().isEmpty() || employer.getWebsite().isBlank()
                || employer.getCompanyName().isEmpty() || employer.getCompanyName().isBlank()
                || employer.getPhoneNumber().isEmpty() || employer.getPhoneNumber().isBlank()) {
            return new ErrorResult(messages.emptyField);
        }

        String email = employer.getEmail();
        String[] emailSplit = email.split("@");
        if (!emailSplit[1].equals(employer.getWebsite())) {
            return new ErrorResult("Your e-mail address and domain do not match");
        }

        if (userDao.existsByEmail(employer.getEmail()) == true) {
            return new ErrorResult(messages.existsEmail);
        }

        if (!regexService.isPasswordFormat(employer.getPassword())) {
            return new ErrorResult(messages.passwordFormat);
        }

        employerDao.save(employer);
        return new SuccessResult(messages.registered);
    }
}

