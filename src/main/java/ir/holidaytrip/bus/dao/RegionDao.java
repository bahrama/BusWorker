package ir.holidaytrip.bus.dao;

import ir.holidaytrip.bus.model.regions.CityMapping;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegionDao  extends JpaRepository<CityMapping,Long> {

}
