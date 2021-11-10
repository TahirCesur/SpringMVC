package SpringMVC;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
// @ComponentScan ek açıklaması, Spring tarafından taranacak üç paketi (ve alt paketleri) 
// belirtmek için basePackages özniteliğini kullanır
@ComponentScan({"controller"}) //run class ı sonuc class ıyla farklı package de ve
// Aynı hizada old için çalışabilmesi için bunu ekledik, aynı package de olsalar buna gerek yoktu.
public class SpringMVCApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMVCApplication.class, args);
	}

}

// RUNNER CLASS I