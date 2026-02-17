public class VendingMachineDemo {

    public static void main(String[] args) {

        VendingMachine machine = new VendingMachine();

        machine.selectItem();     // Idle → ItemSelected
        machine.insertCoin();     // ItemSelected → Dispensing → Idle

        machine.insertCoin();     // Not allowed

        machine.setOutOfOrder();  // Idle → OutOfOrder
        machine.selectItem();     // Blocked
    }
}
