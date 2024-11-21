package pres;

import metier.Imetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class presSpringXML {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        Imetier metier = (Imetier) context.getBean("metier"); //cast
        System.out.println("Résultat est : "+metier.calcul());
    }
}
