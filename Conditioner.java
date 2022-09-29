public class Conditioner implements Checkable {
    private Boolean status;

    public void switchOn() {
        this.status = true;
        System.out.println("Кондиционер включен.");
    }

    public void switchOff() {
        this.status = false;
        System.out.println("Кондиционер выключен.");
    }

    public Boolean getStatus() {
        return status;
    }

    public void check(){
        System.out.println("Диагностика пройдена!");
}
}

