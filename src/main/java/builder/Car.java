package builder;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Car {
    private final String model;
    private final String brand;
    private final double power;
    private final boolean isAcclimatization;
}
