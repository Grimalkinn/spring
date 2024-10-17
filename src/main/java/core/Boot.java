package core;

import java.lang.annotation.*;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@Target(ElementType.TYPE) 
@Retention(RetentionPolicy.RUNTIME)
@SpringBootApplication
@RestController

public @interface Boot{}