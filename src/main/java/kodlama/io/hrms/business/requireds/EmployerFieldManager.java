package kodlama.io.hrms.business.requireds;

import kodlama.io.hrms.business.abstracts.FieldService;
import kodlama.io.hrms.core.adapters.abstracts.RegexService;
import kodlama.io.hrms.core.utilities.results.Result;
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
//        if (employer.getCompanyName().isEmpty() || employer.getCompanyName().isBlank()
//                || employer.getPhoneNumber().isEmpty() || employer.getPhoneNumber().isBlank()
//        || employer.getWebsite().isEmpty() || employer.getWebsite().isBlank())
            return null;
    }
}
