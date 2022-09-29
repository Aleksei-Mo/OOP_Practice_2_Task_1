public class Alarm_system {
    private Boolean systemStatus;
    private Doors doors;

    public Alarm_system(){
        doors = new Doors();
    }

    public void activated() {
        this.systemStatus = true;
        this.doors.close();
        System.out.println("Сигнализация включена.");
        doors.getDoorsStatus();
    }

    public void deactivated() {
        this.systemStatus = false;
        this.doors.open();
        System.out.println("Сигнализация выключена.");
        doors.getDoorsStatus();
    }

    public Boolean getStatus() {
        return systemStatus;
    }
}
