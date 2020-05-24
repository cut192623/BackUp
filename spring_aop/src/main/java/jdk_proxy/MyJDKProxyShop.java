package jdk_proxy;

import szx_aop.IComputerSell;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MyJDKProxyShop implements InvocationHandler {
    private  Object factory;

    public Object CreateProxy(Object factory) {
        this.factory = factory;
        Object p = Proxy.newProxyInstance(
                factory.getClass().getClassLoader(),
                factory.getClass().getInterfaces(),
                this);
        return p;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Electronic Shop");
        //factory是调用方法的对象，args是方法的参数
        method.invoke(factory,args);
        return null;
    }
}
