public class Computer {

    private int currentStorage;
    private String printerModel;

    public Computer(int storage) {
        this.currentStorage = storage;
        this.printerModel = null;
    }

    public int getStorage() {
        return this.currentStorage;
    }

    public String getPrinterModel() {
        return this.printerModel;
    }

    public void setPrinterModel(String printerModel) {
        this.printerModel = printerModel;
    }

    public void addStorage(int additionalStorage) {
        this.currentStorage += additionalStorage;
    }

    public void printMessage(String message) {
        if (this.printerModel != null) {
            System.out.println(message);
        }
    }

}
