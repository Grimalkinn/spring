package core;


import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.GetMapping;



@Boot public class App { 

    protected final String path = "/";
    public static void main(String[] args) { SpringApplication.run(App.class, args); }

    public record Response(String key) {}

    @GetMapping("/") public Response getMethodName() {
        return new Response("Home page");
    }

    
}

//