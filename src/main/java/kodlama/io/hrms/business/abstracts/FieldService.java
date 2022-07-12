package kodlama.io.hrms.business.abstracts;

import kodlama.io.hrms.core.utilities.results.Result;

public interface FieldService<T> {

    Result verifyRegister (T data);
   // Result verifyLogin (T data);
}
