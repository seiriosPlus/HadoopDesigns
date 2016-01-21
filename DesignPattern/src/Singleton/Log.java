package Singleton;

/**
 * Created by wei on 16/1/20.
 */
public class Log {
    private static Log log;

    private Log(){}

    public static Log getLogInstance(){
        if (log == null){
            log = new Log();
        }
        return log;
    }

    public void Print(Object o){
        System.out.println(o.toString());
    }

}
