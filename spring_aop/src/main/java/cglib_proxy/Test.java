package cglib_proxy;

import szx_aop.AppleFactory;
import szx_aop.AsusFactory;
import szx_aop.IComputerSell;
import szx_aop.IPhoneSell;

public class Test {
    public static void main(String[] args) {
        IComputerSell f1=new AppleFactory();
        IPhoneSell f2=new AsusFactory();
        MyCGLibShop shop=new MyCGLibShop();
        IComputerSell proxy1=(IComputerSell)shop.createProxy(f1);
        proxy1.SellComputer();

        IPhoneSell proxy2=(IPhoneSell)shop.createProxy(f2);
        proxy2.SellPhone();
    }
}
