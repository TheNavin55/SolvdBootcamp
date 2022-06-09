package University.service;

import University.bin.staff.Dean;

public interface DeanService {
    Dean getDean(long id);
    void saveDean(Dean dean);
    void updateDean(Dean dean);
    void deleteDean(long id);
}
