package kodlama.io.hrms.business.abstracts;

import kodlama.io.hrms.core.utilities.results.DataResult;
import kodlama.io.hrms.core.utilities.results.Result;
import kodlama.io.hrms.entities.concretes.Employer;
import kodlama.io.hrms.entities.concretes.JobSeeker;
import kodlama.io.hrms.entities.concretes.Position;

import java.util.List;

public interface JobSeekerService {

    DataResult<List<JobSeeker>> getAll();
    DataResult<JobSeeker> findById(int id);

    Result register(JobSeeker jobSeeker);
    Result delete(JobSeeker jobSeeker);
    Result login (JobSeeker jobSeeker);


}
