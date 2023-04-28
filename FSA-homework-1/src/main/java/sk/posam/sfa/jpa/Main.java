package sk.posam.sfa.jpa;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import sk.posam.sfa.jpa.classes.Address;
import sk.posam.sfa.jpa.classes.Company;
import sk.posam.sfa.jpa.classes.Person;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");

        Person person = (Person) context.getBean("person");
        Address address = (Address) context.getBean("address");
        Company company = (Company) context.getBean("company");

        System.out.println("Person name: " + person.getName());
        System.out.println("Address: " + address.getStreet() + ", " + address.getCity());
        System.out.println("Company: " + company.getName() + ", located at: " + company.getAddress().getStreet() + ", " + company.getAddress().getCity());
    }
}