package kodlama.io.hrms.api;

import kodlama.io.hrms.business.abstracts.EmployerService;
import kodlama.io.hrms.core.utilities.results.DataResult;
import kodlama.io.hrms.core.utilities.results.Result;
import kodlama.io.hrms.entities.concretes.Employer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employers/")
public class EmployersController {

    private EmployerService employerService;

    @Autowired
    public EmployersController(EmployerService employerService) {
        super();
        this.employerService = employerService;
    }

    @GetMapping("getall")
    public DataResult<List<Employer>> getAll() {
        return this.employerService.getAll();
    }

    @PostMapping("register")
    public Result register(@RequestBody Employer employer) {
        return this.employerService.register(employer);
    }

    @PostMapping("login")
    public Result login (@RequestBody Employer employer) {
        return this.employerService.login(employer);
    }

    @PutMapping("update")
    public Result update (@RequestBody Employer employer){
        return this.employerService.update(employer);
    }

    @PostMapping("delete")
    public Result delete(@RequestBody Employer employer){
        return this.employerService.delete(employer);
    }
}
