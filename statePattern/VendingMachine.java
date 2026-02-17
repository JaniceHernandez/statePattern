public class VendingMachine {

    private VendingMachineState state;

    int inventory = 5;
    int balance = 0;

    public VendingMachine() {
        state = new IdleState(this);
    }

    public void setState(VendingMachineState state) {
        this.state = state;
    }

    // delegate methods
    public void selectItem() {
        state.selectItem();
    }

    public void insertCoin() {
        state.insertCoin();
    }

    public void dispenseItem() {
        state.dispenseItem();
    }

    public void setOutOfOrder() {
        state.setOutOfOrder();
    }
}
