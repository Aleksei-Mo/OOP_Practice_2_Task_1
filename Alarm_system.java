public abstract class Alarm_system {
    private Boolean systemStatus;
    private Doors doors;

    protected abstract void activatedInternal();
    protected abstract void deactivatedInternal();
    
    public Alarm_system(){
        doors = new Doors();
    }

    public void activated() {
        activatedInternal();
        this.systemStatus = true;
        this.doors.close();
        System.out.println("Сигнализация включена.");
        doors.getDoorsStatus();
    }

    public void deactivated() {
        deactivatedInternal();
        this.systemStatus = false;
        this.doors.open();
        System.out.println("Сигнализация выключена.");
        doors.getDoorsStatus();
    }

    public Boolean getStatus() {
        return systemStatus;
    }
}
