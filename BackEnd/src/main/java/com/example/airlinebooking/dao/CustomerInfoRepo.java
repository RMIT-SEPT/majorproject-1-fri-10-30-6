package flightbooking.backend.dao;

import flightbooking.backend.model.CustomerInfo;
import org.springframework.data.repository.CrudRepository;

public interface CustomerInfoRepo extends CrudRepository<CustomerInfo, Integer> {
}
