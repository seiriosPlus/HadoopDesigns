package Strategy;

import Singleton.Log;

/**
 * Created by wei on 16/1/20.
 */
public class NovelBook implements Book{

    @Override
    public void ReadBook() {
        Log log = Log.getLogInstance();
        log.Print("Log Instance:"+log.toString()+" This a Novel.");
    }
}
