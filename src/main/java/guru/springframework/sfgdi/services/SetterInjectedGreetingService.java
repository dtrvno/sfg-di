package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

import javax.xml.ws.handler.Handler;
@Service
public class SetterInjectedGreetingService implements GreetingService {
    @Override
    public String sayGreeting()  {
        return "Hello World- setter";
    }
}
