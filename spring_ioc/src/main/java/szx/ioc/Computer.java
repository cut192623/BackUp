package szx.ioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class Computer {
  //  @ComPuterComponent(type = IAMDCpu.class)
  @Autowired
  @Qualifier("amd")
    private ICpu cpu=null;
  //  @ComPuterComponent(type = ISumsung.class)
  @Resource
   private IMemory memory=null;
  @Value("ASUS ")
   private String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ICpu getCpu() {
        return cpu;
    }

    public void setCpu(ICpu cpu) {
        this.cpu = cpu;
    }

    public IMemory getMemory() {
        return memory;
    }

    public void setMemory(IMemory memory) {
        this.memory = memory;
    }

    public Computer(ICpu cpu, IMemory memory, String name) {
        this.cpu = cpu;
        this.memory = memory;
        this.name = name;
    }

    public Computer() {
    }

    public  void start(){
        System.out.println(name+"starting");
        cpu.run();
        memory.read();
        memory.write();

    }
}
