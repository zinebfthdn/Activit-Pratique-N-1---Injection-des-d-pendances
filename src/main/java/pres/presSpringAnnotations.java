package pres;

import metier.Imetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class presSpringAnnotations {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("dao","metier"); //on le liste les packages qu'il doit scanner
        Imetier metier = context.getBean(Imetier.class);
        System.out.println(metier.calcul());

    }
}
