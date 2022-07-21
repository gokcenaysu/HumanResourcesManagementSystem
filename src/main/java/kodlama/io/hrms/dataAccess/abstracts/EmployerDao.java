package kodlama.io.hrms.dataAccess.abstracts;

import kodlama.io.hrms.core.entities.User;
import kodlama.io.hrms.entities.concretes.Employer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployerDao extends JpaRepository<Employer, Integer> {

    Employer findById (int id);
    List<Employer> findByPhoneNumber (String phoneNumber);
    boolean existsByEmail(String email);
    User findByPasswordEquals(String password);
}
