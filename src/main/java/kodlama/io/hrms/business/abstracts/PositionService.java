package kodlama.io.hrms.business.abstracts;

import kodlama.io.hrms.entities.concretes.Position;

import java.util.List;

public interface PositionService {

    List<Position> getAll();
}
