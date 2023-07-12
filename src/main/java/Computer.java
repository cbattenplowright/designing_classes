public class Computer {

    private int currentStorage;
    private String printerModel;
    private boolean printerConnected;

    public Computer(int storage) {
        this.currentStorage = storage;
        this.printerModel = "No printer connected";
    }

    public int getStorage() {
        return this.currentStorage;
    }

    public String getPrinterModel() {
        return this.printerModel;
    }

    public void setPrinterModel(String printerModel) {
        this.printerModel = printerModel;
        this.printerConnected = true;
    }

    public void addStorage(int additionalStorage) {
        this.currentStorage += additionalStorage;
    }

    public void printMessage(String message) {
        if (this.printerConnected) {
            System.out.println(message);
        }
    }

}
