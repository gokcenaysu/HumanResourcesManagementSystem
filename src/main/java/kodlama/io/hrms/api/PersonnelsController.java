package kodlama.io.hrms.api;

import kodlama.io.hrms.business.abstracts.PersonnelService;
import kodlama.io.hrms.core.utilities.results.DataResult;
import kodlama.io.hrms.entities.concretes.Personnel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/personnels/")
public class PersonnelsController {

    private PersonnelService personnelService;

    public PersonnelsController(PersonnelService personnelService) {
        super();
        this.personnelService = personnelService;
    }

    @GetMapping("getall")
    public DataResult<List<Personnel>> getAll(){
        return this.personnelService.getAll();
    }
}
