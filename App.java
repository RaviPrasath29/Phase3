package com.samples.s01springcoreDI;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
       ClassPathXmlApplicationContext springContainer = new ClassPathXmlApplicationContext("com/samples/s01springcoreDI/springconfig.xml");
       
       employee emp = (employee) springContainer.getBean("emp"); 
       System.out.println(emp);
       
       Hospital hospital = (Hospital) springContainer.getBean("hospital");
       System.out.println(hospital);
       
       Cardealer dealer = (Cardealer) springContainer.getBean("cardealer");
       System.out.println(dealer);
       
       Customer customer = (Customer) springContainer.getBean("customer");
       System.out.println(customer);
       
    }
}