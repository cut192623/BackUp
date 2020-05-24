package jdk_proxy;

import szx_aop.AppleFactory;
import szx_aop.AsusFactory;
import szx_aop.IComputerSell;
import szx_aop.IPhoneSell;

public class Test {
    public static void main(String[] args) {
        IComputerSell sell1=new AppleFactory();
        IPhoneSell sell2=new AsusFactory();

        MyJDKProxyShop shop=new MyJDKProxyShop();
        IComputerSell proxy = (IComputerSell) shop.CreateProxy(sell1);
        proxy.SellComputer();

        IPhoneSell proxy2=(IPhoneSell)shop.CreateProxy(sell2);
        proxy2.SellPhone();
    }
}
