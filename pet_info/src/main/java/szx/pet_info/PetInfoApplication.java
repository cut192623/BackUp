package szx.pet_info;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("szx.pet_info.dao")
@SpringBootApplication
public class PetInfoApplication {

    public static void main(String[] args) {
        SpringApplication.run(PetInfoApplication.class, args);
    }

}
