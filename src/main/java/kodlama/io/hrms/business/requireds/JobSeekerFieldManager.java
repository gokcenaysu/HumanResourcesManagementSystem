package kodlama.io.hrms.business.requireds;

import kodlama.io.hrms.business.abstracts.FieldService;
import kodlama.io.hrms.business.constants.messages;
import kodlama.io.hrms.core.adapters.abstracts.RegexService;
import kodlama.io.hrms.core.utilities.results.ErrorDataResult;
import kodlama.io.hrms.core.utilities.results.ErrorResult;
import kodlama.io.hrms.core.utilities.results.Result;
import kodlama.io.hrms.core.utilities.results.SuccessResult;
import kodlama.io.hrms.dataAccess.abstracts.JobSeekerDao;
import kodlama.io.hrms.dataAccess.abstracts.UserDao;
import kodlama.io.hrms.entities.concretes.Employer;
import kodlama.io.hrms.entities.concretes.JobSeeker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobSeekerFieldManager implements FieldService<JobSeeker> {

    private JobSeekerDao jobSeekerDao;
    private UserDao userDao;
    private RegexService regexService;

    @Autowired
    public JobSeekerFieldManager(JobSeekerDao jobSeekerDao, UserDao userDao, RegexService regexService) {
        super();
        this.jobSeekerDao = jobSeekerDao;
        this.userDao = userDao;
        this.regexService=regexService;
    }

    @Override
    public Result verifyRegister(JobSeeker jobSeeker) {

        if(jobSeeker.getEmail().isEmpty() || jobSeeker.getEmail().isBlank()
                || jobSeeker.getFirstName().isEmpty() || jobSeeker.getFirstName().isBlank()
                || jobSeeker.getLastName().isEmpty() || jobSeeker.getLastName().isBlank()
                || jobSeeker.getPassword().isEmpty() || jobSeeker.getPassword().isBlank()){
            return new ErrorResult(messages.emptyField);
        }

        if(userDao.existsByEmail(jobSeeker.getEmail())){
            return new ErrorResult(messages.existsEmail);
        }

        if(!regexService.isEmailFormat(jobSeeker.getEmail())){
            return new ErrorResult(messages.emailFormat);
        }

        if(jobSeekerDao.existsByIdentityNumber(jobSeeker.getIdentityNumber())){
            return new ErrorResult(messages.existsIdentityNumber);
        }

        if(jobSeeker.getFirstName().length()<2 || jobSeeker.getLastName().length()<2){
            return new ErrorResult(messages.letterLength);
        }

        if(!regexService.isBirthYearFormat(jobSeeker.getBirthYear())){
            return new ErrorResult(messages.birthYearFormat);
        }

        if(!regexService.isPasswordFormat(jobSeeker.getPassword())){
            return new ErrorResult(messages.passwordFormat);
        }

        jobSeekerDao.save(jobSeeker);
        return new SuccessResult(messages.registered);
    }

    @Override
    public Result deleteAccount(JobSeeker jobSeeker) {
        if(!jobSeekerDao.existsByEmail(jobSeeker.getEmail())){
            return new ErrorDataResult<List<Employer>>(messages.notEmail);
        }
        if(userDao.findByPasswordEquals(jobSeeker.getPassword())==null){
            return new ErrorDataResult<List<Employer>>(messages.errorPassword);
        }
        this.jobSeekerDao.delete(jobSeeker);
        return new SuccessResult(messages.deleted);
    }

    @Override
    public Result verifyLogin(JobSeeker jobSeeker) {
        if(!jobSeekerDao.existsByEmail(jobSeeker.getEmail())){
            return new ErrorDataResult<List<Employer>>(messages.notEmail);
        }
        if(userDao.findByPasswordEquals(jobSeeker.getPassword())==null){
            return new ErrorDataResult<List<Employer>>(messages.errorPassword);
        }
        return new SuccessResult(messages.loggedIn);
    }

}