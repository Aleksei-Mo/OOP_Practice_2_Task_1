public class ElectricEngine extends Engine {

    @Override
    protected void startInternal() {
        System.out.println("Электрический двигатель запущен");
        
    }

    @Override
    protected void stopInternal() {
        System.out.println("Электрический двигатель остановлен");
        
    }

   @Override
    protected void throttleUpInternal(int level) {
        System.out.printf("Уровень мощности %d%n", level);
        
    }
    @Override
    public void check() {
        System.out.println("Диагностика двигателя проведена. Ошибок нет.");

}
}
