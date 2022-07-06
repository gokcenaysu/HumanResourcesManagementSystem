package kodlama.io.hrms.business.abstracts;

import kodlama.io.hrms.core.utilities.results.DataResult;
import kodlama.io.hrms.core.utilities.results.Result;
import kodlama.io.hrms.entities.concretes.Personnel;

import java.util.List;

public interface PersonnelService {

    DataResult<List<Personnel>> getAll();
    Result login (Personnel personnel);
}
