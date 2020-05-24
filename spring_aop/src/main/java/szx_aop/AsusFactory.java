package szx_aop;

public class AsusFactory implements IComputerSell,IPhoneSell {

    @Override
    public void SellComputer() {
        System.out.println("asus sells a  computer");
    }

    @Override
    public void SellPhone() {
        System.out.println("asus sells a  phone");
    }
}
