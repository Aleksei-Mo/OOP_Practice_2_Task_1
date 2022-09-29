public class Light implements Checkable {
    private Boolean status;

    public void switchOn() {
        this.status = true;
        System.out.println("Освещение включено.");
    }

    public void switchOff() {
        this.status = false;
        System.out.println("Освещение выключено.");
    }

    public Boolean getStatus() {
        return status;
    }

    public void check(){
        System.out.println("Диагностика пройдена!");
    }
}
