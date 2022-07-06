package kodlama.io.hrms.api;

import kodlama.io.hrms.business.abstracts.EmployerService;
import kodlama.io.hrms.entities.concretes.Employer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/employers/")
public class EmployersController {

    private EmployerService  employerService;

    @Autowired
    public EmployersController(EmployerService employerService) {
        super();
        this.employerService = employerService;
    }

    @GetMapping("getall")
    public List<Employer> getAll(){
        return this.employerService.getAll();
    }
}
