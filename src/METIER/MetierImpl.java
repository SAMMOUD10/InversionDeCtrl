package METIER;

import DAO.IntDao;

public class MetierImpl implements IntMetier {
    // ici oû je peux faire le traitement
    // Couplage faible
    private IntDao dao;
    @Override
    public double calcul() {
        double temp = dao.getData();
        double res = temp * 540/Math.cos(temp*Math.PI);
        return res;
    }

    /*
        Injecter dans la varible dao un objet d'une classe
        qui implémente l'interface IntDao
    */
    public void setDao(IntDao dao) {
        this.dao = dao;
    }
}
