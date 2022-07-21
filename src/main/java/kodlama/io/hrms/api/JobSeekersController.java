package kodlama.io.hrms.api;

import kodlama.io.hrms.business.abstracts.JobSeekerService;
import kodlama.io.hrms.core.utilities.results.DataResult;
import kodlama.io.hrms.core.utilities.results.Result;
import kodlama.io.hrms.entities.concretes.Employer;
import kodlama.io.hrms.entities.concretes.JobSeeker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/jobseekers/")
public class JobSeekersController {

    private JobSeekerService jobSeekerService;

    @Autowired
    public JobSeekersController(JobSeekerService jobSeekerService) {
        super();
        this.jobSeekerService = jobSeekerService;
    }

    @GetMapping("getall")
    public DataResult<List<JobSeeker>> getAll(){
        return this.jobSeekerService.getAll();
    }

    @GetMapping("findById")
    public DataResult<JobSeeker> findById(int id){
        return this.jobSeekerService.findById(id);
    }

    @PostMapping("register")
    public Result register(@RequestBody JobSeeker jobSeeker) {
        return this.jobSeekerService.register(jobSeeker);
    }

    @PutMapping("login")
    public Result login (@RequestBody JobSeeker jobSeeker){
        return this.jobSeekerService.login(jobSeeker);
    }

}
