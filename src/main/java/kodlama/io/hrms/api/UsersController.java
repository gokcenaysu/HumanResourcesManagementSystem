package kodlama.io.hrms.api;

import kodlama.io.hrms.business.abstracts.UserService;
import kodlama.io.hrms.core.entities.User;
import kodlama.io.hrms.core.utilities.results.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    public Result GetAll(User user){
        return this.userService.getAll(user);
    }

    @PostMapping("login")
    public Result Login(@RequestBody User user){
        return this.userService.login(user);
    }
}
