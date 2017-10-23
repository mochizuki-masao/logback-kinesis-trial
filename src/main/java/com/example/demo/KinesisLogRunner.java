package com.example.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Created by mochizukimasao on 2017/10/23.
 *
 * @author mochizukimasao
 * @since version
 */
@Slf4j
@Component
public class KinesisLogRunner implements CommandLineRunner {
	
	@Override
	public void run(String... args) throws Exception {
		while(true) {
			log.debug("debug log");
			log.info("info log");
			log.warn("warn log");
			log.error("error log");
			Thread.sleep(1000L);
		}
	}
}
