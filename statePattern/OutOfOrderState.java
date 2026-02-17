public class OutOfOrderState implements VendingMachineState {

    public OutOfOrderState(VendingMachine machine) {
    }

    public void selectItem() {
        System.out.println("Machine is Out Of Order.");
    }

    public void insertCoin() {
        System.out.println("Machine is Out Of Order.");
    }

    public void dispenseItem() {
        System.out.println("Machine is Out Of Order.");
    }

    public void setOutOfOrder() {
        System.out.println("Already Out Of Order.");
    }
}
