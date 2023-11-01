package com.example.spring_boot_scope;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class SpringBootScopeApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // Singleton bean
        SingletonBean singletonBean1 = context.getBean(SingletonBean.class);
        SingletonBean singletonBean2 = context.getBean(SingletonBean.class);

        System.out.println("Is the SingletonBean the same instance? " + (singletonBean1 == singletonBean2));
        singletonBean1.setCount(100);
        singletonBean2.setCount(200);

        System.out.println("SingletonBean 1 count: " + singletonBean1.getCount());
        System.out.println("SingletonBean 2 count: " + singletonBean2.getCount());

        // Prototype bean
        PrototypeBean prototypeBean1 = context.getBean(PrototypeBean.class);
        PrototypeBean prototypeBean2 = context.getBean(PrototypeBean.class);

        System.out.println("Is the PrototypeBean the same instance? " + (prototypeBean1 == prototypeBean2));
        prototypeBean1.setCount(100);
        prototypeBean2.setCount(200);
        System.out.println("PrototypeBean 1 count: " + prototypeBean1.getCount());
        System.out.println("PrototypeBean 2 count: " + prototypeBean2.getCount());

        // Close the Spring context
        context.close();
    }

}
