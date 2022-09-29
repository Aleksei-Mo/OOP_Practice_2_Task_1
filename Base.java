import java.util.ArrayList;
import java.util.List;

public class Base {
    private GasolineEngine engine;
    private Wheel wheel1;
    private Wheel wheel2;
    private Wheel wheel3;
    private Wheel wheel4;
    private Transmission transmission;
    private Light light;
    private List <Checkable> checkAll;
   // private Conditioner conditioner;

    public Base() {
        engine = new GasolineEngine();
        wheel1 = new Wheel();
        wheel2 = new Wheel();
        wheel3 = new Wheel();
        wheel4 = new Wheel();
        transmission = new Transmission();
        light = new Light();
        checkAll = new ArrayList<>();
        checkAll.add(engine);
        checkAll.add(wheel1);
        checkAll.add(transmission);
       // conditioner = new Conditioner();
    }

    public void lightOn() {
        light.switchOn();
    }

    public void lightOff() {
        light.switchOff();
    }

    public void start() {
        engine.start();
    }

    public void drive() {
        if (engine.getWork()) {
            transmission.switchGear(1);
            wheel1.rotate();
            wheel2.rotate();
            wheel3.rotate();
            wheel4.rotate();
        }
    }

    public void stop() {
        engine.stop();
    }

    public void  checkAll(){
        for (Checkable check : checkAll) {
            check.check();
        }
    }

    public void TransmOBDconnect(){
        transmission.connect();
    }
 
    public void TransmOBDmenu (){
        transmission.menu();
    }

    public void GEOBDconnect(){
        engine.connect();
    }
 
    public void GEOBDmenu (){
        engine.menu();
    }
}
