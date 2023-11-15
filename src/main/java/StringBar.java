public class StringBar extends Bar {

    public boolean isHappyHour = false;

    @Override
    public boolean isHappyHour() {
        return isHappyHour;
    }

    @Override
    public void startHappyHour(){
         isHappyHour = true;
         this.notifyObservers();
    }

    @Override
    public void endHappyHour() {
        isHappyHour = false;
        this.notifyObservers();
    }
}
