package kodlama.io.hrms.business.concretes;

import kodlama.io.hrms.business.abstracts.PositionService;
import kodlama.io.hrms.business.constants.messages;
import kodlama.io.hrms.core.utilities.results.*;
import kodlama.io.hrms.dataAccess.abstracts.PositionDao;
import kodlama.io.hrms.entities.concretes.Position;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PositionManager implements PositionService {

    private PositionDao positionDao;

    @Autowired
    public PositionManager(PositionDao positionDao) {
        super();
        this.positionDao = positionDao;
    }

    @Override
    public DataResult<List<Position>> getAll() {
        return new SuccessDataResult<List<Position>>(this.positionDao.findAll());
    }

    @Override
    public DataResult<Position> findById(int id) {
        Position position=this.positionDao.findById(id);
        if(position==null)
            return new ErrorDataResult<Position>(messages.noData);
        return new SuccessDataResult<Position>(position,messages.listed);
    }

    @Override
    public Result add(Position position) {
        if(position.getPositionName().length()<2){
            return new ErrorResult(messages.letterLength);
        }
        if(positionDao.existsByPositionName(position.getPositionName())){
            return new ErrorResult(messages.existsPosition);
        }
        this.positionDao.save(position);
        return new SuccessResult(messages.added);
    }

    @Override
    public Result delete(Position position) {
        this.positionDao.delete(position);
        return new SuccessResult(messages.deleted);
    }
}
