package com.example.hxds.mps.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public interface DriverLocationService {

    public void updateLocationCache(Map param);

    public void removeLocationCache(long driverId);

    public ArrayList searchBefittingDriverAboutOrder(double startPlaceLatitude,
                                                     double startPlaceLongitude,
                                                     double endPlaceLatitude,
                                                     double endPlaceLongitude,
                                                     double mileage);

    public void updateOrderLocationCache(Map param);

    public HashMap searchOrderLocationCache(long orderId);
}
