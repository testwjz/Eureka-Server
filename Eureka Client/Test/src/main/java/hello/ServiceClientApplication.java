package hello;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class ServiceClientApplication {

    @RequestMapping("/")
    public String home() {
        return "Hello world";
    }
    public static void main(String[] args) {
        SpringApplication.run(ServiceClientApplication.class, args);
    }

    //EurekaClient模式发现客户端
    @Autowired
    private EurekaClient discoveryClient;

    @RequestMapping("/test")
    public String serviceUrl() {
        InstanceInfo instance = discoveryClient.getNextServerFromEureka("eureka-client", false);
        return instance.getHomePageUrl();
    }
}