package spring_aop;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring_aop.service.IGoodsService;
import spring_aop.service.IUserService;

public class aop_Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext s=new ClassPathXmlApplicationContext("spring_aop.xml");
        IGoodsService us=s.getBean(IGoodsService.class);
        System.out.println(us);
        us.add();
        us.delete();
        us.query();
        us.update();
    }
}
