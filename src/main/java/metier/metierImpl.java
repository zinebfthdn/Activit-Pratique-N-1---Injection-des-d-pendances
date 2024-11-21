package metier;

import dao.DaoImpl;
import dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class metierImpl implements Imetier {
   // @Autowired //injection des dépendances
    //@Qualifier("dao2")
    private IDao dao; //couplage faible

    public metierImpl(IDao dao) {
        this.dao = dao;
    }


    @Override
    public double calcul() {
        double tmp = dao.getData();
        double res = tmp*540/Math.cos(tmp*Math.PI); //un algo compliqué
        return res;
    }

//Set est une méthode qui permet d'injecter dans la var dao unn objet d'une classe qui implémente l'interface IDao
    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
