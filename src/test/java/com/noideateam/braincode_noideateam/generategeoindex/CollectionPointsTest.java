package com.noideateam.braincode_noideateam.generategeoindex;

import com.noideateam.braincode_noideateam.CollectionPoint;
import org.junit.Test;

import java.util.Collection;
import java.util.Map;

import static org.junit.Assert.*;

public class CollectionPointsTest {

    @Test
    public void collectionPointsInRange() {
        Map<CollectionPoint, Double> result= CollectionPoints.collectionPointsInRange(21.98131561279297, 51.41465759277344, 10);
        System.out.println("result = " + result);
    }
}