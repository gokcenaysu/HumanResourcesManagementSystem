package kodlama.io.hrms.business.abstracts;

import kodlama.io.hrms.core.entities.User;
import kodlama.io.hrms.core.utilities.results.DataResult;
import kodlama.io.hrms.core.utilities.results.Result;
import kodlama.io.hrms.entities.concretes.JobSeeker;

import javax.xml.crypto.Data;
import java.util.List;

public interface UserService {

//    DataResult<List<User>> login(User user);
//    Result deleteAccount(User user);
    DataResult<List<User>> getAll();
    DataResult<User> findById(int id);
}
