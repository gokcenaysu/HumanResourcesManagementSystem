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
    private FieldService fieldService;

    @Autowired
    public EmployerManager(EmployerDao employerDao, FieldService fieldService) {
        super();
        this.employerDao = employerDao;
        this.fieldService=fieldService;
    }

    @Override
    public DataResult<List<Employer>> getAll() {
        return new SuccessDataResult<List<Employer>>(this.employerDao.findAll(),messages.listed);
    }

    @Override
    public DataResult<List<Employer>> findById(int id) {
        if(employerDao.equals(findById(id)) == false){
            return new ErrorDataResult<List<Employer>>("error");
        }
        return new SuccessDataResult<List<Employer>>(messages.listed);
    }

    @Override
    public Result register(Employer employer) {
        return this.fieldService.verifyRegister(employer);
    }

    @Override
    public Result update(Employer employer) {
        this.employerDao.save(employer);
        return new SuccessResult(messages.updated);
    }

    @Override
    public Result delete(Employer employer) {
        this.employerDao.delete(employer);
        return new SuccessResult(messages.deleted);
    }

}
