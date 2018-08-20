package strudyGithubNote;

import java.lang.annotation.*;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target(FIELD)
@Retention(RUNTIME)
@Documented
public @interface FruitColor {
   public enum Color{BLUE,RED,GREEN};

   Color fruitColor() default Color.GREEN;
}
