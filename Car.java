public class Car {
    private Base base;
   


    public Car() {
        base = new Base();
        
    }

    public void carStart() {
        base.start();
    }
    public void carStop() {
        base.stop();
    }

    public void carDrive(){
        base.drive();
    }

    public void carLightOn(){
        base.lightOn();
    }

    public void carLightOff(){
        base.lightOff();
    }

    public void checkAll(){
        base.checkAll();
    }
    public void TransmOBDconnect(){
        base.TransmOBDconnect();
    }

    public void TransmOBDmenu(){
        base.TransmOBDmenu();
    }

    public void GasEngineOBDconnect(){
        base.GEOBDconnect();
    }

    public void GasEngineOBDmenu(){
        base.GEOBDmenu();
    }
    public static void main(String[] args) {
        Car car = new Car();
        Alarm_system alarm = new Alarm_system();
        car.checkAll();
        alarm.deactivated();
        car.TransmOBDconnect();
        car.TransmOBDmenu();
        car.GasEngineOBDconnect();
        car.GasEngineOBDmenu();
        car.carStart(); 
        car.carLightOn(); 
        car.carDrive();     
        car.carStop();
        alarm.activated();
        car.carLightOff();
    }
}

