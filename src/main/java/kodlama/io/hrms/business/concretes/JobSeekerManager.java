package kodlama.io.hrms.business.concretes;

import kodlama.io.hrms.business.abstracts.FieldService;
import kodlama.io.hrms.business.abstracts.JobSeekerService;
import kodlama.io.hrms.business.constants.messages;
import kodlama.io.hrms.core.utilities.results.*;
import kodlama.io.hrms.dataAccess.abstracts.JobSeekerDao;
import kodlama.io.hrms.entities.concretes.JobSeeker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobSeekerManager implements JobSeekerService {

    private JobSeekerDao jobSeekerDao;
    private FieldService<JobSeeker> fieldService;

    @Autowired
    public JobSeekerManager(JobSeekerDao jobSeekerDao, FieldService<JobSeeker> fieldService) {
        super();
        this.jobSeekerDao = jobSeekerDao;
        this.fieldService = fieldService;
    }

    @Override
    public DataResult<List<JobSeeker>> getAll() {
        return new SuccessDataResult<List<JobSeeker>>(this.jobSeekerDao.findAll());
    }

    @Override
    public DataResult<JobSeeker> findById(int id) {
        JobSeeker jobSeeker = this.jobSeekerDao.findById(id);
        if(jobSeeker==null)
            return new ErrorDataResult<JobSeeker>(messages.noData);
        return new SuccessDataResult<JobSeeker>(jobSeeker,messages.listed);
    }

    @Override
    public Result register(JobSeeker jobSeeker) {
        return this.fieldService.verifyRegister(jobSeeker);
    }

    @Override
    public Result delete(JobSeeker jobSeeker) {
        return this.fieldService.deleteAccount(jobSeeker);
    }

    @Override
    public Result login(JobSeeker jobSeeker) {
        return this.fieldService.verifyLogin(jobSeeker);
    }


}
