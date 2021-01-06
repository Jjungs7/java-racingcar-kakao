package com.nextstep.racingcar.racingcar;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CarTest {

  private final int ONE_UNIT = 1;

  @Test
  void shouldMoveOneUnit() {
    Car car = new Car("test", 0);
    int currentLocation = car.getLocation();

    car.move();

    assertThat(car.getLocation()).isEqualTo(currentLocation + ONE_UNIT);
  }

  @DisplayName("5글자를 초과하는 이름의 경우 Exception 발생")
  @Test
  void carCannotHandleLongName() {
    assertThatExceptionOfType(RuntimeException.class)
        .isThrownBy(() -> new Car("longname", 0));
  }
}
