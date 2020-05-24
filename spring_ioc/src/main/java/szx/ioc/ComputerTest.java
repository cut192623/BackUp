package szx.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ComputerTest {
    public static void main(String[] args) throws IllegalAccessException, NoSuchFieldException, InstantiationException {
       // Computer computer =new Computer();
        // computer.start();
      //    ComputerFactory cf= new ComputerFactory();
    //    Computer computer=cf.createComputer();
        //   computer.start();
         ClassPathXmlApplicationContext cxt = new ClassPathXmlApplicationContext("spring-ioc.xml");
      //  Computer computer = (Computer)cxt.getBean("computer");
        Computer computer = cxt.getBean(Computer.class);
        computer.start();
    }


}
