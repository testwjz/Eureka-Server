package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TestController {
    @Autowired
    MyService myService;

    @RequestMapping("/getUrl")
    public String HomePage() {
        return myService.getHomePage();
    }
}