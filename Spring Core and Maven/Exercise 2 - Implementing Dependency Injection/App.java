import org.springframework.context.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class App{
public static void main(String[] a){
ApplicationContext c=new ClassPathXmlApplicationContext("beans.xml");
c.getBean(Car.class).drive();
}
}