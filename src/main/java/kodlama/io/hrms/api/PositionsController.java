package kodlama.io.hrms.api;

import kodlama.io.hrms.business.abstracts.PositionService;
import kodlama.io.hrms.core.utilities.results.DataResult;
import kodlama.io.hrms.core.utilities.results.Result;
import kodlama.io.hrms.entities.concretes.Employer;
import kodlama.io.hrms.entities.concretes.Position;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/positions/")
public class PositionsController {

    private PositionService positionService;

    @Autowired
    public PositionsController(PositionService positionService) {
        super();
        this.positionService = positionService;
    }

    @GetMapping("getall")
    public DataResult<List<Position>> getAll(){
        return this.positionService.getAll();
    }

    @GetMapping("findById")
    public DataResult<Position> findById(int id){
        return this.positionService.findById(id);
    }

    @PostMapping("add")
    public Result add (@RequestBody Position position) {
        return this.positionService.add(position);
    }

    @DeleteMapping("delete")
    public Result delete(@RequestBody Position position){
        return this.positionService.delete(position);
    }
}
