package kodlama.io.hrms.business.concretes;

import kodlama.io.hrms.business.abstracts.EmployerService;
import kodlama.io.hrms.business.abstracts.FieldService;
import kodlama.io.hrms.business.constants.messages;
import kodlama.io.hrms.core.utilities.results.*;
import kodlama.io.hrms.dataAccess.abstracts.EmployerDao;
import kodlama.io.hrms.entities.concretes.Employer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployerManager implements EmployerService {

    private EmployerDao employerDao;
    private FieldService<Employer> fieldService;

    @Autowired
    public EmployerManager(EmployerDao employerDao, FieldService<Employer> fieldService) {
        super();
        this.employerDao = employerDao;
        this.fieldService=fieldService;
    }
    @Override
    public DataResult<List<Employer>> getAll() {
        return new SuccessDataResult<List<Employer>>(this.employerDao.findAll(),messages.listed);
    }

    @Override
    public DataResult<Employer> findById(int id) {
        Employer employer = employerDao.findById(id);
        if(employer==null)
            return new ErrorDataResult<Employer>(messages.noData);
        return new SuccessDataResult<Employer>(employer,messages.listed);
    }

    @Override
    public Result register(Employer employer) {
        return this.fieldService.verifyRegister(employer);
    }

    @Override
    public Result login(Employer employer) {
        return this.fieldService.verifyLogin(employer);
    }

    @Override
    public Result delete(Employer employer) {
       return this.fieldService.deleteAccount(employer);
    }

}
