package com.gradle.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
class LasagnaTest {
    @Test
    public void total_time_in_minutes_for_multiple_layers() {
          Assertions.assertEquals(16,new Lasagna().totalTimeInMinutes(4, 8));
    }
    @Test
    public void total_time_in_minutes_for_one_layer() {
        Assertions.assertEquals(32,new Lasagna().totalTimeInMinutes(1, 30));
    }
    @Test
    public void remaining_minutes_in_oven() {
        Assertions.assertEquals(15,new Lasagna().remainingMinutesInOven(25));
    }
    @Test
    public void preparation_time_in_minutes_for_one_layer() {
        Assertions.assertEquals(2,new Lasagna().preparationTimeInMinutes(1));
    }
    @Test
    public void expected_minutes_in_oven() {
        Assertions.assertEquals(40, new Lasagna().expectedMinutesInOven());
    }
    @Test
    public void preparation_time_in_minutes_for_multiple_layers() {
        Assertions.assertEquals(8, new Lasagna().preparationTimeInMinutes(4));
    }
    }