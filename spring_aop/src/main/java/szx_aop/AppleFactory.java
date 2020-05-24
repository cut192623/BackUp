package szx_aop;

public class AppleFactory  implements IComputerSell,IPhoneSell{

    @Override
    public void SellComputer() {
        System.out.println("apple sells a computer");
    }

    @Override
    public void SellPhone() {
        System.out.println("apple sells a phone");
    }
}
