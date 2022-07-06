package kodlama.io.hrms.business.abstracts;

import kodlama.io.hrms.entities.concretes.Employer;

import java.util.List;

public interface EmployerService {

    List<Employer> getAll();
}
