package kodlama.io.hrms.business.abstracts;

import kodlama.io.hrms.core.utilities.results.DataResult;
import kodlama.io.hrms.core.utilities.results.Result;
import kodlama.io.hrms.entities.concretes.JobSeeker;
import kodlama.io.hrms.entities.concretes.Position;

import java.util.List;

public interface PositionService {

    DataResult<List<Position>> getAll();
    DataResult<Position> findById(int id);
    Result add(Position position);
    Result delete(Position position);
}
