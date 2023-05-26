package by.itacademy.spring;

import lombok.*;

import java.time.LocalDate;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Car implements ICar {
    private Long id;
    private String model;
    private double engineCapacity;
    private List<EngineType> engineType;

    public Car(String model, String engineCapacity) {
    }
}
