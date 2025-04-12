package metier;
import dao.IDao;

public class MetierImpl implements Imetier {
    //couplage faible
    private IDao dao =null;

    public MetierImpl() {
    }

    public MetierImpl(IDao dao) {
        this.dao = dao;
    }

    @Override
   public double calcul(){
        double t= dao.getData();
        double res = t*23;
       return res;
   }
// pour injecter dans la valeur diao un object  d'une classe quinimplemente IDao
    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
