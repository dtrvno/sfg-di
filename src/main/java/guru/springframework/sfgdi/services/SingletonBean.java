package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
public class SingletonBean {
    public SingletonBean() {
        System.out.println("Creating Singleton bean!");
    }

    public String getMyScope() {
        return "I'm Singleton";
    }
}
