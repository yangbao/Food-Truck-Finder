package com.example.hxds.mps.service;

import java.util.HashMap;

public interface MapService {
    public HashMap estimateOrderMileageAndMinute(String mode,
                                                 String startPlaceLatitude,
                                                 String startPlaceLongitude,
                                                 String endPlaceLatitude,
                                                 String endPlaceLongitude);

    public HashMap calculateDriveLine(String startPlaceLatitude,
                                      String startPlaceLongitude,
                                      String endPlaceLatitude,
                                      String endPlaceLongitude);
}
