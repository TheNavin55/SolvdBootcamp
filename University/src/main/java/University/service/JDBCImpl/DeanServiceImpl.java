package University.service.JDBCImpl;

import University.DAO.IDeanDAO;
import University.DAO.Impl.DeanDAO;
import University.service.DeanService;
import University.bin.staff.Dean;

public class DeanServiceImpl implements DeanService {
    @Override
    public Dean getDean(long id) {
        IDeanDAO deanDAO = new DeanDAO();
        Dean dean = deanDAO.getEntityById(id);
        return dean;
    }

    @Override
    public void saveDean(Dean dean) {
        IDeanDAO deanDAO = new DeanDAO();
        deanDAO.saveEntity(dean);
    }

    @Override
    public void updateDean(Dean dean) {
        IDeanDAO deanDAO = new DeanDAO();
        deanDAO.updateEntity(dean);
    }

    @Override
    public void deleteDean(long id) {
        IDeanDAO deanDAO = new DeanDAO();
        deanDAO.removeEntity(id);
    }
}
