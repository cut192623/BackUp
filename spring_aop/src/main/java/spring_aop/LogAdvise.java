package spring_aop;

import org.aspectj.lang.ProceedingJoinPoint;

public class LogAdvise {
    public void prelog() {
        System.out.println("前置通知");
    }

    public void afterlog() {
        System.out.println("后置通知");
    }

    public Object aroundlog(ProceedingJoinPoint joinpoint) throws Throwable {
        System.out.println("环绕通知-前置执行");
        Object result=joinpoint.proceed();
        System.out.println("环绕通知-后置执行");
        return result;
    }

    public void throwlog() {
        System.out.println("方法抛出了异常");
    }

    public  void  returnlog(){

        System.out.println("方法返回后执行");
    }
}
