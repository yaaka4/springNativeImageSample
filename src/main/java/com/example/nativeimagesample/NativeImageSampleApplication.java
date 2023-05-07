package com.example.nativeimagesample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(proxyBeanMethods = false)
public class NativeImageSampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(NativeImageSampleApplication.class, args);
	}

}
