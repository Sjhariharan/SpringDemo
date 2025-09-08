package Qspider.DependencyInjection.dto;

import lombok.Data;

@Data
public class Car {
	private int carId;
	private String name;
	private String model;
	private Engine engine;

}
