package test;

import Observer.News;
import Observer.Observer;
import Observer.BeijingObserver;
import Observer.XinhuaNews;
import Observer.HenanObserver;
import Observer.HubeiObserver;
import Singleton.Log;

/**
 * Created by wei on 16/1/20.
 */
public class TestObserver {

    public static void main(String[] args){
        Log log = Log.getLogInstance();

        News news = new XinhuaNews();
        Observer beijing1 = new BeijingObserver();
        Observer beijing2 = new BeijingObserver();
        Observer beijing3 = new BeijingObserver();
        Observer beijing4 = new BeijingObserver();
        Observer hubei1 = new HubeiObserver();

        news.attachObserver(beijing1);
        news.attachObserver(beijing2);
        news.attachObserver(beijing3);
        news.attachObserver(beijing4);
        news.attachObserver(hubei1);

        log.Print("*************************************");
        news.setSubject("国际时事");

        news.detachObserver(beijing1);
        news.detachObserver(beijing2);
        news.detachObserver(beijing3);
        news.detachObserver(beijing4);


        log.Print("*************************************");
        news.setSubject("时政新闻");

        news.attachObserver(beijing2);

        log.Print("*************************************");
        news.setSubject("花边新闻");
    }

}
