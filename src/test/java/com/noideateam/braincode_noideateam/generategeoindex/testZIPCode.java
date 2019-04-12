package com.noideateam.braincode_noideateam.generategeoindex;

import org.junit.Assert;
import org.junit.Test;

public class testZIPCode {
    @Test
    public void testBadValue() {
        ZIPCode zipCode = new ZIPCode("123");
        Assert.assertEquals("bad_zipCode", zipCode.getZipCode());
    }

    @Test
    public void testTrueValue() {
        ZIPCode zipCode = new ZIPCode("62-070");
        Assert.assertEquals("62-070", zipCode.getZipCode());
    }
}
