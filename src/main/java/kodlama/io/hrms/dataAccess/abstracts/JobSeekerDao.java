package kodlama.io.hrms.dataAccess.abstracts;

import kodlama.io.hrms.entities.concretes.JobSeeker;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface JobSeekerDao extends JpaRepository<JobSeeker,Integer> {

    List<JobSeeker> findById (int id);
    List<JobSeeker> findByEmail (String email);
    List<JobSeeker> findByIdentityNumber (String identityNumber);

}
