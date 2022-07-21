package kodlama.io.hrms.dataAccess.abstracts;

import kodlama.io.hrms.core.entities.User;
import kodlama.io.hrms.entities.concretes.Employer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends JpaRepository<User, Integer> {

    boolean existsByEmail(String email);
    User findByPasswordEquals(String password);
    User findById (int id);

}
