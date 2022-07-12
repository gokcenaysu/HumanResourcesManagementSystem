package kodlama.io.hrms.api;

import kodlama.io.hrms.business.abstracts.UserService;
import kodlama.io.hrms.core.entities.User;
import kodlama.io.hrms.core.utilities.results.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users/")
public class UsersController {

    private UserService userService;

    @Autowired
    public UsersController(UserService userService) {
        super();
        this.userService = userService;
    }

    @PostMapping("login")
    public Result Login(@RequestBody User user){
        return this.userService.login(user);
    }
}
