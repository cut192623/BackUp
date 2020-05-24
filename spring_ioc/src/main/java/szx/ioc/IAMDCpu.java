package szx.ioc;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
@Qualifier("amd")
public class IAMDCpu implements ICpu {
    public void run() {
        System.out.println("Amd");
    }
}
