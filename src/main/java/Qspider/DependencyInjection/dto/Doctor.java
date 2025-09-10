package Qspider.DependencyInjection.dto;

import java.util.List;

import lombok.Data;

@Data
public class Doctor {
private int id;
private String name;
private String contact;
private List<String> list;
}
