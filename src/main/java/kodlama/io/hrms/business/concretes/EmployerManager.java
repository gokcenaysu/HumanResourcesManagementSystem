package kodlama.io.hrms.business.concretes;

import kodlama.io.hrms.business.abstracts.EmployerService;
import kodlama.io.hrms.dataAccess.abstracts.EmployerDao;
import kodlama.io.hrms.entities.concretes.Employer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployerManager implements EmployerService {

    @Autowired
    private EmployerDao employerDao;

    public EmployerManager(EmployerDao employerDao) {
        super();
        this.employerDao = employerDao;
    }

    @Override
    public List<Employer> getAll() {
        return this.employerDao.findAll();
    }
}
