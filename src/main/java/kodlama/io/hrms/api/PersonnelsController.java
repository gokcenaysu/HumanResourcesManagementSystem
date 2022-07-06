package kodlama.io.hrms.api;

import kodlama.io.hrms.business.abstracts.PersonnelService;
import kodlama.io.hrms.core.utilities.results.DataResult;
import kodlama.io.hrms.core.utilities.results.Result;
import kodlama.io.hrms.entities.concretes.Personnel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/personnels/")
public class PersonnelsController {

    private PersonnelService personnelService;

    @Autowired
    public PersonnelsController(PersonnelService personnelService) {
        super();
        this.personnelService = personnelService;
    }

    @GetMapping("getall")
    public DataResult<List<Personnel>> getAll(){
        return this.personnelService.getAll();
    }

    @PostMapping("login")
    public Result login (@RequestBody Personnel personnel){
        return this.personnelService.login(personnel);
    }
}
