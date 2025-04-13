package presentation;

import dao.IDao;
import metier.Imetier;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PresentationV2 {
    public static void main(String[] args) {
      try {
          Scanner scanner= new Scanner(new File("config.txt"));
          String daoClassname =scanner.nextLine();
          Class cDao= Class.forName(daoClassname);
          //instansier d'une maniere dynamique
         IDao dao =(IDao)  cDao.getConstructor().newInstance();
         System.out.println(dao.getData());

           String metierClassname = scanner.nextLine();
          Class cMetier= Class.forName(metierClassname);
          //instansier d'une maniere dynamique
          Imetier metier =(Imetier)  cDao.getConstructor(IDao.class).newInstance(dao);



          Method satDao = cMetier.getDeclaredMethod("setDao", IDao.class);
          setDao.invoke(metier, dao);



           System.out.println("RES="+metier.calcul());


      } catch (Exception e){
      System.out.println(e.getMessage ());
      }

    }
}

