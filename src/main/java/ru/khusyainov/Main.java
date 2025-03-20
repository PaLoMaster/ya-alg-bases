package ru.khusyainov;

import ru.khusyainov.p31.Paragraph31;
import ru.khusyainov.p32.Paragraph32;
import ru.khusyainov.p33.Paragraph33;
import ru.khusyainov.p34.Paragraph34;
import ru.khusyainov.p35.Paragraph35;
import ru.khusyainov.p36.Paragraph36;
import ru.khusyainov.p42.Paragraph42;
import ru.khusyainov.p43.Paragraph43;
import ru.khusyainov.p51.Paragraph51;
import ru.khusyainov.p52.Paragraph52;
import ru.khusyainov.p61.Paragraph61;
import ru.khusyainov.p62.Paragraph62;
import ru.khusyainov.p63.Paragraph63;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        run(Paragraph31.class, args);
        run(Paragraph32.class, args);
        run(Paragraph33.class, args);
        run(Paragraph34.class, args);
        run(Paragraph35.class, args);
        run(Paragraph36.class, args);
        run(Paragraph42.class, args);
        run(Paragraph43.class, args);
        run(Paragraph51.class, args);
        run(Paragraph52.class, args);
        run(Paragraph61.class, args);
        run(Paragraph62.class, args);
        run(Paragraph63.class, args);
    }

    private static <T> void run(Class<T> clazz, String[] args) {
        try {
            Method method = clazz.getMethod("main", String[].class);
            method.invoke(null, new Object[]{args});
        } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
            e.printStackTrace();
        }
        System.out.printf("%n%n");
    }
}
