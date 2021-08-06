package ru.olegevseev.task.points;


import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class TrackerTest {

    @Test
    public void whenAddNewPointOneGroup() {
        Tracker tracker = new Tracker();
        Point point = new Point(1, 1);
        tracker.add(point);
        Set<Point> pointSet = new HashSet<>(tracker.findPoint(1));
        int sizeSet = pointSet.size();
        assertThat(sizeSet, is(1));
    }

    @Test
    public void whenAddNewPointTwoGroup() {
        Tracker tracker = new Tracker();
        Point point = new Point(2, 4);
        tracker.add(point);
        Set<Point> pointSet = new HashSet<>(tracker.findPoint(2));
        int sizeSet = pointSet.size();
        assertThat(sizeSet, is(1));
    }

    @Test
    public void whenAddNewPointThreeGroup() {
        Tracker tracker = new Tracker();
        Point point = new Point(2, 8);
        tracker.add(point);
        Set<Point> pointSet = new HashSet<>(tracker.findPoint(3));
        int sizeSet = pointSet.size();
        assertThat(sizeSet, is(1));
    }

    @Test
    public void whenAddNewPointNoGroup() {
        Tracker tracker = new Tracker();
        Point point = new Point(2, 1);
        tracker.add(point);
        Set<Point> pointSet = new HashSet<>(tracker.findPoint(4));
        int sizeSet = pointSet.size();
        assertThat(sizeSet, is(1));
    }

    @Test
    public void whenRemoveGroup() {
        Tracker tracker = new Tracker();
        Point point = new Point(2, 4);
        tracker.add(point);
        tracker.remove(2);
        Set<Point> pointSet = new HashSet<>(tracker.findPoint(2));
        int sizeSet = pointSet.size();
        assertThat(sizeSet, is(0));
    }
}