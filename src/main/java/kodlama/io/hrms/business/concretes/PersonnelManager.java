package kodlama.io.hrms.business.concretes;

import kodlama.io.hrms.business.abstracts.PersonnelService;
import kodlama.io.hrms.business.constants.messages;
import kodlama.io.hrms.core.utilities.results.*;
import kodlama.io.hrms.dataAccess.abstracts.PersonnelDao;
import kodlama.io.hrms.entities.concretes.Personnel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonnelManager implements PersonnelService {

    private PersonnelDao personnelDao;

    @Autowired
    public PersonnelManager(PersonnelDao personnelDao) {
        super();
        this.personnelDao = personnelDao;
    }

    @Override
    public DataResult<List<Personnel>> getAll() {
        return new SuccessDataResult<List<Personnel>>(this.personnelDao.findAll());
    }

    @Override
    public DataResult<Personnel> findById(int id) {
        Personnel personnel = this.personnelDao.findById(id);
        if(personnel==null)
            return new ErrorDataResult<Personnel>(messages.noData);
        return new SuccessDataResult<Personnel>(personnel,messages.listed);
    }

    @Override
    public Result login(Personnel personnel) {
        this.personnelDao.save(personnel);
        return new SuccessResult(messages.loggedIn);
    }
}
