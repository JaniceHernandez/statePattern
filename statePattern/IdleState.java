public class IdleState implements VendingMachineState {

    private VendingMachine machine;

    public IdleState(VendingMachine machine) {
        this.machine = machine;
    }

    public void selectItem() {
        System.out.println("Item selected.");
        machine.setState(new ItemSelectedState(machine));
    }

    public void insertCoin() {
        System.out.println("Select item first.");
    }

    public void dispenseItem() {
        System.out.println("No item selected.");
    }

    public void setOutOfOrder() {
        machine.setState(new OutOfOrderState(machine));
        System.out.println("Machine is Out Of Order.");
    }
}
