package kodlama.io.hrms.api;

import kodlama.io.hrms.business.abstracts.EmployerService;
import kodlama.io.hrms.core.utilities.results.DataResult;
import kodlama.io.hrms.core.utilities.results.Result;
import kodlama.io.hrms.entities.concretes.Employer;
import lombok.Data;
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

    @GetMapping("findById")
    public DataResult<Employer> findById(int id){
        return this.employerService.findById(id);
    }

    @PostMapping("register")
    public Result register(@RequestBody Employer employer) {
        return this.employerService.register(employer);
    }

    @PutMapping("login")
    public Result login (@RequestBody Employer employer) {
        return this.employerService.login(employer);
    }

    @DeleteMapping("delete")
    public Result delete(@RequestBody Employer employer){
        return this.employerService.delete(employer);
    }
}
