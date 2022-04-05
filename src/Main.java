
import Controller.MusikwunschService;
import java.sql.SQLException;
import model.Gast;
import model.Musikwunsch;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author amesbah
 */
public class Main {
        public static void main(String[] args) throws SQLException {
      MusikwunschService musikwunschService =new MusikwunschService();


        Gast gast =new Gast("person1");
        Musikwunsch musikwunsch=new Musikwunsch("Hallo","blabla","romantisch");
        musikwunschService.addMusikWunsch(musikwunsch);

    }
}
