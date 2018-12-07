package hello;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name="EUREKA-CLIENT")
public interface MyService {
    @RequestMapping("/test")
    public String getName();
}