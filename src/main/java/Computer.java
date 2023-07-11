public class Computer {

    private int currentStorage;
    private String printerModel;

    public Computer(int storage) {
        this.currentStorage = storage;
        this.printerModel = "No printer connected";
    }

    public int getStorage() {
        return currentStorage;
    }

    public String getPrinterModel() {
        return printerModel;
    }

    public void setPrinterModel(String printerModel) {
        this.printerModel = printerModel;
    }

    public void addStorage(int additionalStorage) {
        currentStorage += additionalStorage;
    }

    public void printMessage(String message) {
        System.out.println(message);
    }

}
