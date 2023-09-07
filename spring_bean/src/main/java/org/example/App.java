package org.example;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("/employee_config.xml");
        Employee emp = (Employee) context.getBean("employee");
        Student student = (Student) context.getBean("student");
        System.out.println(emp.getName());
        System.out.println(emp.getPh());
        student.display();
    }
}
