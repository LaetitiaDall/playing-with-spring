package kami.springframework.didemo;

import kami.springframework.didemo.di.controllers.ConstructorInjectedController;
import kami.springframework.didemo.di.controllers.MyController;
import kami.springframework.didemo.di.controllers.PropertyInjectedController;
import kami.springframework.didemo.di.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);
        MyController controller = (MyController) ctx.getBean("myController");

        System.out.println(controller.hello());
        System.out.println(ctx.getBean(PropertyInjectedController.class).SayHello());
        System.out.println(ctx.getBean(SetterInjectedController.class).SayHello());
        System.out.println(ctx.getBean(ConstructorInjectedController.class).SayHello());

    }
}
