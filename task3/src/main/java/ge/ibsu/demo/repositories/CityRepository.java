package ge.ibsu.demo.repositories;

import ge.ibsu.demo.entities.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CityRepository extends JpaRepository<City, Long> {

    @Query("SELECT c.cityName, c.country.countryName FROM City c")
    List<City> findAllCitiesWithCountry();
}

