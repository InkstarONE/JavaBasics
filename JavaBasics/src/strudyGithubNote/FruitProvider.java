package strudyGithubNote;

import java.lang.annotation.*;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target(FIELD)
@Retention(RUNTIME)
@Documented
public @interface FruitProvider {
    public int id()default -1;

    public String name() default "";

    public String address() default "";
}
