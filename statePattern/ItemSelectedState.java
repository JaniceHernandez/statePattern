public class ItemSelectedState implements VendingMachineState {

    private VendingMachine machine;

    public ItemSelectedState(VendingMachine machine) {
        this.machine = machine;
    }

    public void selectItem() {
        System.out.println("Item already selected.");
    }

    public void insertCoin() {
        machine.balance += 20; // Assume each item costs 20
        System.out.println("Coin inserted.");

        machine.setState(new DispensingState(machine));
    }

    public void dispenseItem() {
        System.out.println("Insert coin first.");
    }

    public void setOutOfOrder() {
        machine.setState(new OutOfOrderState(machine));
        System.out.println("Machine is Out Of Order.");
    }
}
