public abstract class Engine implements Checkable {
    private Boolean work;
    
    protected abstract void startInternal();
    protected abstract void stopInternal();
    protected abstract void throttleUpInternal(int level);

    public void start () {
        this.work = true;
        System.out.println("Двигатель запущен");
        startInternal();
    }
    
    public void stop () {
        this.work = false;
        System.out.println("Двигатель остановлен");
    stopInternal();
    }
    
    public void throttleUp(int level) {
        if (this.work) {
            System.out.printf("Дросель открыт %d%n", level);
            throttleUpInternal(level);
        }
    }
    
    public Boolean getWork() {
        return work;
    }
    }
