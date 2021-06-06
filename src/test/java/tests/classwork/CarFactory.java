package tests.classwork;

import com.github.javafaker.Faker;

public class CarFactory {

    public static Car get() {
        Faker faker = new Faker();
        return Car.builder()
                .make(faker.name().firstName())
                .model("i8")
                .maxSpeed(360)
                .build();
    }
}
