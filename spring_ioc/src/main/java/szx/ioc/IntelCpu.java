package szx.ioc;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("intel")
public class IntelCpu implements ICpu {


    public void run() {
        System.out.println("intel");
    }
}
