package szx.ioc;

import java.lang.reflect.Field;

public class ComputerFactory {
    public Computer createComputer() throws NoSuchFieldException, IllegalAccessException, InstantiationException {
            Class c=Computer.class;
            Object computer =c.newInstance();
            Field cpu=  c.getDeclaredField("cpu");
            ComPuterComponent cpuCom= cpu.getDeclaredAnnotation(ComPuterComponent.class);
            Class cpuClass= cpuCom.type();
            Object cpuObj=cpuClass.newInstance();
            cpu.setAccessible(true);
            cpu.set(computer,cpuObj);

            Field memory=  c.getDeclaredField("memory");
            ComPuterComponent memoryCom= memory.getDeclaredAnnotation(ComPuterComponent.class);
            Class memoryClass= memoryCom.type();
            Object memoryObj=memoryClass.newInstance();
            memory.setAccessible(true);
            memory.set(computer,memoryObj);

            return (Computer) computer;

    }
}
