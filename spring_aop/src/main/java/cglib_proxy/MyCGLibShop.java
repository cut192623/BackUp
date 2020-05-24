package cglib_proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class MyCGLibShop implements MethodInterceptor {
    private Object factory =null;

    public  Object createProxy(Object factory){
        this.factory=factory;
        //帮助创建代理类的工具
        Enhancer enhancer=new Enhancer();
        //给代理类设置父类
        enhancer.setSuperclass(this.factory.getClass());
        //设置方法的回调（调用代理对象的方法是执行的代码）
        enhancer.setCallback(this);
        //创建并返回代理类的对象
        return  enhancer.create();
    }
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println(".......CGLIB.......");
        methodProxy.invokeSuper(o,objects);
        return null;
    }
}
