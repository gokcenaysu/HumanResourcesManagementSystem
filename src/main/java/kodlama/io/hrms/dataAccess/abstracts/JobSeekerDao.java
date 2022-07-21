package kodlama.io.hrms.dataAccess.abstracts;

import kodlama.io.hrms.core.entities.User;
import kodlama.io.hrms.entities.concretes.JobSeeker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JobSeekerDao extends JpaRepository<JobSeeker,Integer> {

    boolean existsByIdentityNumber(String identityNumber);
    JobSeeker findById (int id);
    JobSeeker findByEmail (String email);
    JobSeeker findByIdentityNumber (String identityNumber);
    boolean existsByEmail(String email);


}
