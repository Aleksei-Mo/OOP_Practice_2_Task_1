public class DieselEngine extends Engine {

    @Override
    protected void startInternal() {
        System.out.println("Дизельный двигатель запущен");
        
    }

    @Override
    protected void stopInternal() {
        System.out.println("Дизельный двигатель остановлен");
        
    }

    @Override
    protected void throttleUpInternal(int level) {
        System.out.printf("Дросель открыт %d%n", level);
        
    }
    @Override
    public void check() {
        System.out.println("Диагностика двигателя проведена. Ошибок нет.");

}
}
