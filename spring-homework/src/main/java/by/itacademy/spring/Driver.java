package by.itacademy.spring;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.*;

import java.util.Map;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Driver {
    private Integer id;
    private Integer age;
    private Map<String, String> name;
    private String phone;
    private String email;
    private ICar car;

    @PostConstruct
    private void init() {
        System.out.println("init driver");
    }

    @PreDestroy
    private void destroy() {
        System.out.println("destroy driver");
    }

    private static Driver instance;

    public static Driver getInstance() {
        if (instance == null) {
            instance = new Driver();
        }
        return instance;
    }
}
