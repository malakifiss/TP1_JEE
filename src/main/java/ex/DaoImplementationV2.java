package ex;

import dao.IDao;

public class DaoImplementationV2 implements IDao {
    public double getData() {
        System.out.println("Version web service");
        double t=11;
        return t;
    }
}