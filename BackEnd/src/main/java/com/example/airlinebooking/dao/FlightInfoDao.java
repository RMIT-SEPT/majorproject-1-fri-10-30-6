package flightbooking.backend.dao;

import flightbooking.backend.model.FlightInfo;

public interface FlightInfoDao {

    int insertFlightInfo(FlightInfo flightInfo);

    default int addFlightInfo(FlightInfo flightInfo) {
        return insertFlightInfo(flightInfo);
    }

}
