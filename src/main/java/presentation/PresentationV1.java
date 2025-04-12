package presentation;

import dao.DaoImpl;
import ex.DaoImplementationV2;
import metier.MetierImpl;

public class PresentationV1 {
    public static void main (String[] args){
        //ceci est une injection des depandences par instantation statique cad New
        // injection des depandences via l'instructeur

        DaoImplementationV2  d= new DaoImplementationV2();
        MetierImpl metier = new MetierImpl();
       metier.setDao(d);
        System.out.println("RESULTAT=" +metier.calcul());
    }
}
