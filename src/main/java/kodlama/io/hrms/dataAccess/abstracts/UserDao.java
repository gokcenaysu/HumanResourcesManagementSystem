package kodlama.io.hrms.dataAccess.abstracts;

import kodlama.io.hrms.core.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends JpaRepository<User, Integer> {

    boolean existsByEmail(String email);
}
