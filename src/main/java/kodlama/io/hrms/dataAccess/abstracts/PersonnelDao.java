package kodlama.io.hrms.dataAccess.abstracts;

import kodlama.io.hrms.entities.concretes.Personnel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PersonnelDao extends JpaRepository<Personnel,Integer> {

    List<Personnel> findById(int id);
}
