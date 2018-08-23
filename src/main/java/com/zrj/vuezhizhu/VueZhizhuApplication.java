package com.zrj.vuezhizhu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.zrj.vuezhizhu.dao")
public class VueZhizhuApplication {

	public static void main(String[] args) {
		SpringApplication.run(VueZhizhuApplication.class, args);
	}
}
