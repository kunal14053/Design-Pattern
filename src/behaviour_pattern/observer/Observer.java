package behaviour_pattern.observer;

public abstract class Observer {
    public Subject subject;
    public abstract void update();
}
