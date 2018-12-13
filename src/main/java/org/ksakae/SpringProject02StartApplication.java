package org.ksakae;

import org.ksakaeano.ConfigAno;
import org.ksakaexml.ConfigXml;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

@SpringBootApplication
public class SpringProject02StartApplication {

	public static void main(String[] args) {
		//JavaベースConfiguration
		ApplicationContext contextJava = new AnnotationConfigApplicationContext(AppConfig.class);
		ConfigJava configJava = contextJava.getBean(ConfigJava.class);
		
		//XMLベースConfiguration
		ApplicationContext contextXml = new FileSystemXmlApplicationContext("classpath:applicationContext.xml");
		ConfigXml configXml = contextXml.getBean(ConfigXml.class);

		//アノテーションベースConfiguration
		ApplicationContext contextAno = new AnnotationConfigApplicationContext("org.ksakaeano");
		ConfigAno configAno = contextAno.getBean(ConfigAno.class);
		
		System.out.println("JavaベースConfiguration -> " + configJava.getConsoleLog());		//JavaベースConfiguration 
		System.out.println("XMLベースConfiguration -> " + configXml.getConsoleLog());		//XMLベースConfiguration
		System.out.println("アノテーションベースConfiguration -> " + configAno.getConsoleLog());		//アノテーションベースConfiguration
		
		((AnnotationConfigApplicationContext)contextJava).close();
		((FileSystemXmlApplicationContext)contextXml).close();
		((AnnotationConfigApplicationContext)contextAno).close();
	}
}
