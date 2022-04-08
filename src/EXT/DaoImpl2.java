package EXT;

import DAO.IntDao;

public class DaoImpl2 implements IntDao {
    @Override
    public double getData() {
        System.out.println("Version Capteurs");
        double temp = 80;
        return temp;
    }
}
