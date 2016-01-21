package Strategy;

import Singleton.Log;

/**
 * Created by wei on 16/1/20.
 */
public class MathBook implements Book {
    @Override
    public void ReadBook() {
        Log log = Log.getLogInstance();

        log.Print("Log Instance:"+log.toString()+" This is a Math.");
    }
}
