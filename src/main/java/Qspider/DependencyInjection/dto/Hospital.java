package Qspider.DependencyInjection.dto;

import java.util.List;

import lombok.Data;

@Data
public class Hospital {
private int id;
private String name;
private String address;
private List<Doctor>dr;
}
