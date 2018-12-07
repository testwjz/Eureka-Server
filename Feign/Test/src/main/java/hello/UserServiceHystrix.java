package hello;

import org.springframework.stereotype.Component;

@Component
public class UserServiceHystrix implements MyService {

    @Override
    public String getHomePage() {
        return "网络中断";
    }
}
