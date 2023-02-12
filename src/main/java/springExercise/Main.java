package springExercise;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import Configuration.SConfig;
import Configuration.sComponent;

public class Main {
	
	
    public static void main( String[] args )
   {
    	
//    	maak een nieuw Maven project en voeg 3 beans toe op 3 verschillende manieren.
//    	Maak bij de @Beans methode 1 Bean primary.
//    	Gebruik bij de stereotype annotatie ook een manier om waardes te initialiseren voor ze worden toegevoegt aan de spring context.
//    	Maak voor het programmatisch toevoegen van beans een list van Cars, en geef die een property color, en steek cars met 
//    	vershcillende colors in je lijst, maak daarna alleen beans aan van de Objecten dat een bepaalde color heeft.
    	
      
        
        
        
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SConfig.class);

            sBean bean1 = context.getBean(sBean.class);
            sBean bean2 = context.getBean(sBean.class);
            
            sComponent bean3 = context.getBean(sComponent.class);
            Car blueCar = context.getBean(Car.class);

            System.out.println("Bean1: " + bean1);
            System.out.println("Bean2: " + bean2);
            
            System.out.println("sComponent: " + sComponent.getsName());
            System.out.println("Blue Car: " + blueCar.getColor());
        
        
    }
}
