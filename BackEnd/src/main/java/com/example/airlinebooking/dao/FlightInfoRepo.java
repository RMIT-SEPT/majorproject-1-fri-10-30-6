package flightbooking.backend.dao;
import flightbooking.backend.model.FlightInfo;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface FlightInfoRepo extends CrudRepository<FlightInfo, Integer> {

    @Query("from FlightInfo where departure=?1 and arrival=?2 and location_From=?3 and location_To=?4")
    List<FlightInfo> findBydeparturearrivallocation_Fromlocation_TototalSeats(String depature, String arrival,String location_From, String location_To);
}
