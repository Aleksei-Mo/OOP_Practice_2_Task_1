public class Doors implements Checkable {
    private Boolean doorsStatus;
    private Boolean windowsStatus;
    private Engine engineStatus;

    public Doors() {
        engineStatus = new GasolineEngine();
    }

    public void open() {
        this.doorsStatus = true;
        this.getDoorsStatus();
    }

    public void close() {
        this.doorsStatus = false;
        this.getDoorsStatus();
    }

    public void windowsIsOpenAlarm() {
        if(!engineStatus.getWork() && doorsStatus){
          System.out.println("Внимание! Окна автомобиля открыты.");
        }
    }

    public void getDoorsStatus() {
        if (doorsStatus) {
            System.out.println("Двери открыты.");
        }else {
            System.out.println("Двери закрыты");
        }
    }

    public Boolean getWindowsStatus() {
        return windowsStatus;
    }

    public void check(){
        System.out.println("Диагностика пройдена!");
}
}
