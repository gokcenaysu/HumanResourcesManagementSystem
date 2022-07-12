package kodlama.io.hrms.business.concretes;

import kodlama.io.hrms.business.abstracts.FieldService;
import kodlama.io.hrms.business.abstracts.JobSeekerService;
import kodlama.io.hrms.business.constants.messages;
import kodlama.io.hrms.core.utilities.results.DataResult;
import kodlama.io.hrms.core.utilities.results.Result;
import kodlama.io.hrms.core.utilities.results.SuccessDataResult;
import kodlama.io.hrms.core.utilities.results.SuccessResult;
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
    public Result register(JobSeeker jobSeeker) {
        return this.fieldService.verifyRegister(jobSeeker);
    }

    @Override
    public Result update(JobSeeker jobSeeker) {
        this.jobSeekerDao.save(jobSeeker);
        return new SuccessResult(messages.updated);
    }

    @Override
    public Result delete(JobSeeker jobSeeker) {
        this.jobSeekerDao.delete(jobSeeker);
        return new SuccessResult(messages.deleted);
    }
}
