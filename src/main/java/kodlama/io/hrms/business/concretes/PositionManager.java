package kodlama.io.hrms.business.concretes;

import kodlama.io.hrms.business.abstracts.PositionService;
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
    public List<Position> getAll() {
        return this.positionDao.findAll();
    }
}
