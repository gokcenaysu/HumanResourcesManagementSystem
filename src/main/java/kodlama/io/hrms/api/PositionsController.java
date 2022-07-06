package kodlama.io.hrms.api;

import kodlama.io.hrms.business.abstracts.PositionService;
import kodlama.io.hrms.entities.concretes.Position;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/positions/")
public class PositionsController {

    private PositionService positionService;

    public PositionsController(PositionService positionService) {
        super();
        this.positionService = positionService;
    }

    @GetMapping("getall")
    public List<Position> getAll(){
        return this.positionService.getAll();
    }
}
