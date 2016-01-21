package Observer;

import Singleton.Log;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wei on 16/1/20.
 */
public abstract class News {
    private List<Observer> observerList = new ArrayList<Observer>();
    private String subject = "";

    public void setSubject(String subject) {
        Log log = Log.getLogInstance();
        log.Print("Subject Change to:"+subject);
        if (!this.subject.equals(subject)) {
            this.subject = subject;
            notifyObservers();
        }
    }

    public void attachObserver(Observer observer) {
        observerList.add(observer);
    }

    public void detachObserver(Observer observer) {
        observerList.remove(observer);
    }

    public void notifyObservers() {
        for (Observer observer : observerList) {
            observer.update(subject);
        }
    }
}
