import java.util.ArrayList;

public class Transmission implements Checkable, OBD2 {
    private int grNumber;

    public void switchGear(int number) {
        this.grNumber = number;
        System.out.printf("Переключение скорости на %d%n", number);
    }

    public int getGrNumber() {
        return grNumber;
    }

    @Override
    public void check() {
        System.out.println("Диагностика трансмиссии проведена. Ошибок нет.");
    }

    @Override
    public void connect() {
        System.out.println("Соединение с контроллером коробки передач установлено.");
    }
    @Override
    public void menu() {
       ArrayList<String> menu = new ArrayList<String>();
       int count=0;
       menu.add("Диагностика");
       menu.add("Настройки");
       menu.add("Посмотреть логи");
       menu.add("Выход");
       for (String menu_element : menu) {
        count++;
        System.out.println(count +". " +menu_element);
        }
    }
}
