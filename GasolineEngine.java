import java.util.ArrayList;

public class GasolineEngine extends Engine implements OBD2 {

    @Override
    protected void startInternal() {
        System.out.println("Бензиновый двигатель запущен");

    }

    @Override
    protected void stopInternal() {
        System.out.println("Бензиновый двигатель остановлен");

    }

    @Override
    protected void throttleUpInternal(int level) {
        System.out.printf("Дросель открыт %d%n", level);

    }

    @Override
    public void check() {
        System.out.println("Диагностика двигателя проведена. Ошибок нет.");

    }

    @Override
    public void connect() {
        System.out.println("Соединение с контроллером двигателя установлено.");
    }

    @Override
    public void menu() {
        ArrayList<String> menu = new ArrayList<String>();
        int count = 0;
        menu.add("Диагностика");
        menu.add("Настройки топливной карты");
        menu.add("Посмотреть логи");
        menu.add("Обновить прошивку");
        menu.add("Выход");
        for (String menu_element : menu) {
            count++;
            System.out.println(count + ". " + menu_element);
        }
    }
}
