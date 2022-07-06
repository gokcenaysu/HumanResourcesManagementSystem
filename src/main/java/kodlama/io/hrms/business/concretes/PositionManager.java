package kodlama.io.hrms.business.concretes;

import kodlama.io.hrms.business.abstracts.PositionService;
import kodlama.io.hrms.business.constants.messages;
import kodlama.io.hrms.core.utilities.results.DataResult;
import kodlama.io.hrms.core.utilities.results.Result;
import kodlama.io.hrms.core.utilities.results.SuccessDataResult;
import kodlama.io.hrms.core.utilities.results.SuccessResult;
import kodlama.io.hrms.dataAccess.abstracts.PositionDao;
import kodlama.io.hrms.entities.concretes.Position;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PositionManager implements PositionService {

    @Autowired
    private PositionDao positionDao;

    public PositionManager(PositionDao positionDao) {
        super();
        this.positionDao = positionDao;
    }

    @Override
    public DataResult<List<Position>> getAll() {
        return new SuccessDataResult<List<Position>>(this.positionDao.findAll());
    }

    @Override
    public Result add(Position position) {
        this.positionDao.save(position);
        return new SuccessResult(messages.added);
    }

    @Override
    public Result update(Position position) {
        this.positionDao.save(position);
        return new SuccessResult(messages.added);
    }

    @Override
    public Result delete(Position position) {
        this.positionDao.delete(position);
        return new SuccessResult(messages.deleted);
    }
}
