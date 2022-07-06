package kodlama.io.hrms.business.abstracts;

import kodlama.io.hrms.entities.concretes.Personnel;

import java.util.List;

public interface PersonnelService {

    List<Personnel> getAll();
}
