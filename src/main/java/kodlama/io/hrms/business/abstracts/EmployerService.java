package kodlama.io.hrms.business.abstracts;

import kodlama.io.hrms.core.utilities.results.DataResult;
import kodlama.io.hrms.core.utilities.results.Result;
import kodlama.io.hrms.entities.concretes.Employer;
import kodlama.io.hrms.entities.concretes.JobSeeker;

import java.util.List;

public interface EmployerService {

    DataResult<List<Employer>> getAll();
    DataResult<Employer> findById(int id);
    Result register(Employer employer);
    Result login (Employer employer);
    Result delete(Employer employer);
}
