package kodlama.io.hrms.dataAccess.abstracts;

import kodlama.io.hrms.entities.concretes.Employer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployerDao extends JpaRepository<Employer, Integer> {

    List<Employer> findById (int id);
    Employer findByEmailEquals (String email);
    List<Employer> findByPhoneNumber (String phoneNumber);
}
