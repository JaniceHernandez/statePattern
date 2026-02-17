public interface VendingMachineState {

    void selectItem();
    void insertCoin();
    void dispenseItem();
    void setOutOfOrder();
}
