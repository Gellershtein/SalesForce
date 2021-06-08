package tests.classwork;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Car {
    String make;
    String model;
    int maxSpeed;
}
