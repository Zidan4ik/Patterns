package task5.behavior.stratagy;

public class BilliardClub {
    private Actions action;

    public void setAction(Actions action) {
        this.action = action;
    }
    public void showPrice(){
        action.payPrice();
    }
}
