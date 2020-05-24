package szx.ioc;

public class ISumsung implements IMemory {
    public void read() {
        System.out.println("sumsung read");
    }

    public void write() {
        System.out.println("sumsung write");
    }
}
