package kodlama.io.hrms.business.concretes;

import kodlama.io.hrms.business.abstracts.PersonnelService;
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
    public List<Personnel> getAll() {
        return this.personnelDao.findAll();
    }
}
