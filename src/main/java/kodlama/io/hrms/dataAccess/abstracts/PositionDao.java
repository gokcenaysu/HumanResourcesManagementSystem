package kodlama.io.hrms.dataAccess.abstracts;

import kodlama.io.hrms.entities.concretes.Position;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PositionDao extends JpaRepository<Position,Integer> {

    Position findById(int id);
    boolean existsByPositionName (String positionName);
}
