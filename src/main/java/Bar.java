import java.util.ArrayList;
import java.util.List;

public abstract class Bar {
    protected List<BarObserver> observers = new ArrayList<>();

    abstract public boolean isHappyHour();
    abstract public void startHappyHour();
    abstract public void endHappyHour();

    abstract public void order(StringDrink drink, StringRecipe recipe);

    public void addObserver(BarObserver observer) {
        this.observers.add(observer);
    }
    public void removeObserver(BarObserver observer) {
        observers.remove(observer);
    }
    public void notifyObservers() {
        for (BarObserver observer : observers)
            if (isHappyHour()){
                observer.happyHourStarted(this);
            }
            else{
                observer.happyHourEnded(this);
            }
    }
}
