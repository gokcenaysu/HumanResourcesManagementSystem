package kodlama.io.hrms.dataAccess.abstracts;

import kodlama.io.hrms.entities.concretes.Position;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PositionDao extends JpaRepository<Position,Integer> {

    List<Position> findById(int id);
    List<Position> findByPositionName (String positionName);
}
