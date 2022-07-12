package kodlama.io.hrms.dataAccess.abstracts;

import kodlama.io.hrms.entities.concretes.JobSeeker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JobSeekerDao extends JpaRepository<JobSeeker,Integer> {

    boolean existsByIdentityNumber(String identityNumber);
    List<JobSeeker> findById (int id);
    List<JobSeeker> findByEmail (String email);
    List<JobSeeker> findByIdentityNumber (String identityNumber);

}
