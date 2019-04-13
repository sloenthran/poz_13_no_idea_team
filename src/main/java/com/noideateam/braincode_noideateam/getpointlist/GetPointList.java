package com.noideateam.braincode_noideateam.getpointlist;

import com.noideateam.braincode_noideateam.getpointlist.inpost.Query;
import com.noideateam.braincode_noideateam.getpointlist.inpost.ReturnPointList;

public class GetPointList {
    public static ReturnPointList generate() {
        Query query = new Query();
        return query.ask();
    }
}
