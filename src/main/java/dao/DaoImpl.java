package dao;

import org.springframework.stereotype.Component;

@Component("dao") //comme on dit au spring au démarrage si il trouve une classe qui commence par component il va l'instancier en donnat un nom dao
public class DaoImpl  implements IDao{
    @Override
    public double getData(){
        //connection à la base de données afin de recuperer la temperature
        System.out.println("Version BDD");
        double temp = Math.random()*40;
        return temp;
    }
}
