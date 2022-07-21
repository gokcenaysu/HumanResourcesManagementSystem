package kodlama.io.hrms.business.abstracts;

import kodlama.io.hrms.core.utilities.results.DataResult;
import kodlama.io.hrms.core.utilities.results.Result;
import kodlama.io.hrms.entities.concretes.Personnel;
import kodlama.io.hrms.entities.concretes.Position;

import java.util.List;

public interface PersonnelService {

    DataResult<List<Personnel>> getAll();
    DataResult<Personnel> findById(int id);

    Result login (Personnel personnel);
}
