package test;

import Strategy.Context;
import Strategy.MathBook;
import Strategy.NovelBook;

/**
 * Created by wei on 16/1/20.
 */
public class TestStrategy {
    public static void main(String[] args) {
        Context context = new Context(new MathBook());
        context.getBookToRead();

        context = new Context(new NovelBook());
        context.getBookToRead();
    }
}
