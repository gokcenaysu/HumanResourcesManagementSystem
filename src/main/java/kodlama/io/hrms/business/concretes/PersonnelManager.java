package kodlama.io.hrms.business.concretes;

import kodlama.io.hrms.business.abstracts.PersonnelService;
import kodlama.io.hrms.business.constants.messages;
import kodlama.io.hrms.core.utilities.results.DataResult;
import kodlama.io.hrms.core.utilities.results.Result;
import kodlama.io.hrms.core.utilities.results.SuccessDataResult;
import kodlama.io.hrms.core.utilities.results.SuccessResult;
import kodlama.io.hrms.dataAccess.abstracts.PersonnelDao;
import kodlama.io.hrms.entities.concretes.Personnel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonnelManager implements PersonnelService {

    @Autowired
    private PersonnelDao personnelDao;

    public PersonnelManager(PersonnelDao personnelDao) {
        super();
        this.personnelDao = personnelDao;
    }

    @Override
    public DataResult<List<Personnel>> getAll() {
        return new SuccessDataResult<List<Personnel>>(this.personnelDao.findAll());
    }

    @Override
    public Result login(Personnel personnel) {
        this.personnelDao.save(personnel);
        return new SuccessResult(messages.loggedIn);
    }
}
