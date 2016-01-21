package Observer;

import Singleton.Log;

import java.lang.reflect.Field;

/**
 * Created by wei on 16/1/20.
 */
public abstract class Observer {
    private String subject;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void update(Object o) {
        setSubject(o.toString());
        Log log = Log.getLogInstance();

        log.Print("I am "+this.getClass().getName()+",I am reading "+getSubject());
    }
}
