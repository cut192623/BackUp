package szx.ioc;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/*
* 配置类
* */
@Configuration
@ComponentScan(basePackages = "szx.ioc")  //选择扫描范围
public class MyConfig {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext c = new AnnotationConfigApplicationContext(MyConfig.class);
        Computer computer=c.getBean(Computer.class);
        computer.start();

    }

}
