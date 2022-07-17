package kodlama.io.hrms.business.concretes;

import kodlama.io.hrms.business.abstracts.UserService;
import kodlama.io.hrms.business.constants.messages;
import kodlama.io.hrms.core.entities.User;
import kodlama.io.hrms.core.utilities.results.*;
import kodlama.io.hrms.dataAccess.abstracts.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserManager implements UserService {

    private UserDao userDao;

    @Autowired
    public UserManager(UserDao userDao) {
        super();
        this.userDao = userDao;
    }

    @Override
    public Result login(User user) {

            if(userDao.existsByEmail(user.getEmail())  == false){
                return new ErrorResult(messages.notEmail);
            }
            this.userDao.save(user);
            return new SuccessResult(messages.loggedIn);
        }

    @Override
    public DataResult<List<User>> getAll(User user) {
        return new SuccessDataResult<List<User>>(this.userDao.findAll(), messages.listed);
    }
}

