package com.gradle.demo;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
class BirdWatcherTest {
    @Test
    public void itShouldNotHaveBusyDays() {
        BirdWatcher birdWatcher = new BirdWatcher(new int[]{1, 2, 3, 3, 2, 1, 4});
        assertThat(birdWatcher.getBusyDays()).isEqualTo(0);
    }
    @Test
    public void itShouldReturnZeroIfBirdWatcherLastWeekIsEmpty() {
        int[] lastWeekEmpty = new int[0];
        BirdWatcher birdWatcher = new BirdWatcher(lastWeekEmpty);
        assertThat(birdWatcher.getToday()).isEqualTo(0);
    }
    @Test
    public void itShouldNotHaveDaysWithoutBirds() {
        BirdWatcher birdWatcher = new BirdWatcher(new int[] { 1, 2, 5, 3, 7, 8, 4 });
        assertThat(birdWatcher.hasDayWithoutBirds()).isFalse();
    }
    @Test
    public void itTestGetLastWeek() {
        BirdWatcher birdWatcher = new BirdWatcher(new int[] { 0,2,5,3,7,8,4});
        assertThat(birdWatcher.getLastWeek()).containsExactly(0,2,5,3,7,8,4);
    }
    @Test
    public void itHasDayWithoutBirds() {
        BirdWatcher birdWatcher = new BirdWatcher(new int[] { 1, 2, 5, 3, 7, 8, 4 });
        assertThat(birdWatcher.hasDayWithoutBirds()).isFalse();
    }
    @Test
    public void itTestGetCountForBusyDays() {
        // DAY3, DAY5 and DAY6 are all >= 5 birds
        BirdWatcher birdWatcher = new BirdWatcher(new int[] { 1, 2, 5, 3, 7, 8, 4 });
        assertThat(birdWatcher.getBusyDays()).isEqualTo(3);
    }
    @Test
    public void itTestGetCountForFirstDays() {
        BirdWatcher birdWatcher = new BirdWatcher(new int[] { 1, 2, 5, 3, 7, 8, 4 });
        assertThat(birdWatcher.getCountForFirstDays(4)).isEqualTo(11);
    }
    @Test
    public void itTestGetToday() {
        BirdWatcher birdWatcher = new BirdWatcher(new int[] { 1, 2, 5, 3, 7, 8, 4 });
        assertThat(birdWatcher.getToday()).isEqualTo(4);
    }
    @Test
    public void itIncrementTodaysCount() {
        BirdWatcher birdWatcher = new BirdWatcher(new int[] { 1, 2, 5, 3, 7, 8, 4 });
        assertThat(birdWatcher.getToday()).isEqualTo(4);
    }
    @Test
    public void itTestGetCountForMoreDaysThanTheArraySize() {
        BirdWatcher birdWatcher = new BirdWatcher(new int[] { 1, 2, 5, 3, 7, 8, 4 });
        assertThat(birdWatcher.getCountForFirstDays(10)).isEqualTo(30);
    }
}