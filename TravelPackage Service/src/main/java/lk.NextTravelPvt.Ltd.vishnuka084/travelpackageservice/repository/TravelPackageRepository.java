package lk.NextTravelPvt.Ltd.vishnuka084.travelpackageservice.repository;

import lk.NextTravelPvt.Ltd.vishnuka084.travelpackageservice.entity.TravelPackage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Vishnuka Yahan
 *
 * @author  : Vishnuka Yahan
 * @data    : 11/2/2023
 * @project : Next TravelPvt. Ltd
 *
 */
@Repository
public interface TravelPackageRepository extends JpaRepository<TravelPackage,String> {
    @Query(value = "select t from TravelPackage t order by t.travelPackage_Id desc")
    List<TravelPackage> getLastPackageId();

    @Query(value = "select t from TravelPackage t where t.travelPackage_PacedDate like %?1%")
    List<TravelPackage> getPackageDetailsByDate(String date);
}
