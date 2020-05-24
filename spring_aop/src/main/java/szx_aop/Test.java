package szx_aop;

public class Test {
    public static void main(String[] args) {
        IComputerSell asus=new AsusFactory();
        IComputerSell apple=new AppleFactory();


        IPhoneSell asus2=new AsusFactory();
        IPhoneSell apple2=new AppleFactory();


        IComputerSell sell=new Shop(asus);
        IPhoneSell sell2=new Shop(apple2);
        sell.SellComputer();
        sell2.SellPhone();
    }


}
