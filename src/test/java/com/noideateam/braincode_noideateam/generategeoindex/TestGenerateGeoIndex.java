package com.noideateam.braincode_noideateam.generategeoindex;

import com.noideateam.braincode_noideateam.generategeoindex.opencagedata.ReturnGenerateGeoIndex;
import org.junit.Assert;
import org.junit.Test;

public class TestGenerateGeoIndex {
    @Test
    public void testRunnable() {
        GenerateGeoIndex geoIndex = new GenerateGeoIndex("Grunwaldzka 182", "Poznań", "60-309");
        ReturnGenerateGeoIndex data = geoIndex.generate();

        Assert.assertEquals(52.391243, data.getX(), 0.000001);
        Assert.assertEquals(16.85792, data.getY(), 0.000001);
    }
}
