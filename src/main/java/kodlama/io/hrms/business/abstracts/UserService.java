package kodlama.io.hrms.business.abstracts;

import kodlama.io.hrms.core.entities.User;
import kodlama.io.hrms.core.utilities.results.Result;
import kodlama.io.hrms.entities.concretes.JobSeeker;

public interface UserService {

    Result login(User user);
}
