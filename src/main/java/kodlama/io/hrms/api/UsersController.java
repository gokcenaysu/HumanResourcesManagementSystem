package kodlama.io.hrms.api;

import kodlama.io.hrms.business.abstracts.UserService;
import kodlama.io.hrms.core.entities.User;
import kodlama.io.hrms.core.utilities.results.DataResult;
import kodlama.io.hrms.core.utilities.results.Result;
import kodlama.io.hrms.entities.concretes.Position;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users/")
public class UsersController {

    private UserService userService;

    @Autowired
    public UsersController(UserService userService) {
        super();
        this.userService = userService;
    }

    @GetMapping("getall")
    public DataResult<List<User>> GetAll(){
        return this.userService.getAll();
    }

    @GetMapping("findById")
    public DataResult<User> findById(int id){
        return this.userService.findById(id);
    }
}
