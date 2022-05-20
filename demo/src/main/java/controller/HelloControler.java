package controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import service.HelloService;

@RestController
public class HelloControler {

    private final HelloService helloService;

    public HelloControler(HelloService helloService) {
        this.helloService = helloService;
    }

    @GetMapping("/")
    public String hello()
    {
        return helloService.hello();
    }
}
