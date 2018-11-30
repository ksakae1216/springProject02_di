package org.ksakae;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringProject01StartApplication {

	public static void main(String[] args) {
		// 修正
		//SpringApplication.run(SpringProject01StartApplication.class, args);
		ConfigurableApplicationContext cApp = SpringApplication.run(SpringProject01StartApplication.class, args);
		SpringProject01StartApplication app = cApp.getBean(SpringProject01StartApplication.class);
		app.hello();
	}
	
	// メソッド追加
	public void hello() {
		System.out.println("Hellow World");
	}
}
