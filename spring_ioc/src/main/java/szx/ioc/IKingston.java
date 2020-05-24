package szx.ioc;

import org.springframework.stereotype.Component;

@Component
public class IKingston implements IMemory{
    public void read() {
        System.out.println("kingston read");
    }

    public void write() {
        System.out.println("kingston write");
    }
}
