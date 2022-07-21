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

//    @Override
//    public DataResult<List<User>> login(User user) {
//
//            if(user.getPassword().isBlank() || user.getPassword().isEmpty()
//            || user.getEmail().isBlank() || user.getEmail().isEmpty()){
//                return new ErrorDataResult<List<User>>(messages.emptyField);
//            }
//
//            if(userDao.existsByEmail(user.getEmail())  == false){
//                return new ErrorDataResult<List<User>>(messages.notEmail);
//            }
//            if(userDao.findByPasswordEquals(user.getPassword()) == null){
//                return new ErrorDataResult<List<User>>(messages.errorPassword);
//            }
//            return new SuccessDataResult<List<User>>(messages.loggedIn);
//        }

//    @Override
//    public Result deleteAccount(User user) {
//
//        if(userDao.existsByEmail(user.getEmail())==false){
//            return new ErrorDataResult<List<User>>(messages.notEmail);
//        }
//        if(userDao.findByPasswordEquals(user.getPassword())==null){
//            return new ErrorDataResult<List<User>>(messages.errorPassword);
//        }
//        this.userDao.delete(user);
//        return new SuccessResult(messages.deleted);
//    }

    @Override
    public DataResult<List<User>> getAll() {
        return new SuccessDataResult<List<User>>(this.userDao.findAll(), messages.listed);
    }

    @Override
    public DataResult<User> findById(int id) {
        User user = this.userDao.findById(id);
        if(user==null)
            return new ErrorDataResult<User>(messages.noData);
        return new SuccessDataResult<User>(user,messages.listed);
    }
}

