public class DispensingState implements VendingMachineState {

    private VendingMachine machine;

    public DispensingState(VendingMachine machine) {
        this.machine = machine;
        dispenseItem();
    }

    public void selectItem() {
        System.out.println("Dispensing... Please wait.");
    }

    public void insertCoin() {
        System.out.println("Dispensing... Please wait.");
    }

    public void dispenseItem() {
        System.out.println("Item dispensed.");
        machine.inventory--;
        machine.balance = 0;

        machine.setState(new IdleState(machine));
    }

    public void setOutOfOrder() {
        machine.setState(new OutOfOrderState(machine));
    }
}
