package szx_aop;

public class Shop implements IComputerSell,IPhoneSell {


    private IComputerSell cs;
    private IPhoneSell ps;

    public Shop(IPhoneSell ps) {
        this.ps = ps;
    }

    public Shop(IComputerSell cs) {
        this.cs =  cs;
    }

    @Override
    public void SellComputer() {
        System.out.println("-------------Sell Shop--------------");
        cs.SellComputer();
    }

    @Override
    public void SellPhone() {
        System.out.println("-------------Sell Shop--------------");
        ps.SellPhone();
    }
}
