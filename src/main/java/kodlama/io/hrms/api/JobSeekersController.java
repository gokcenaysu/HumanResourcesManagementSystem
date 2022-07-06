package kodlama.io.hrms.api;

import kodlama.io.hrms.business.abstracts.JobSeekerService;
import kodlama.io.hrms.core.utilities.results.DataResult;
import kodlama.io.hrms.entities.concretes.JobSeeker;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/jobseekers/")
public class JobSeekersController {

    private JobSeekerService jobSeekerService;

    public JobSeekersController(JobSeekerService jobSeekerService) {
        super();
        this.jobSeekerService = jobSeekerService;
    }

    @GetMapping("getall")
    public DataResult<List<JobSeeker>> getAll(){
        return this.jobSeekerService.getAll();
    }
}
