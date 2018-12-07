package hello;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "EUREKA-CLIENT", fallback = UserServiceHystrix.class)
public interface MyService {

    @RequestMapping("/test")
    public String getHomePage();

}
