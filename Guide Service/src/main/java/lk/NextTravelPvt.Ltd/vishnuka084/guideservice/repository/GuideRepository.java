package lk.NextTravelPvt.Ltd.vishnuka084.guideservice.repository;

import lk.NextTravelPvt.Ltd.vishnuka084.guideservice.entity.Guide;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Vishnuka Yahan
 *
 * @author : Vishnuka Yahan
 * @data : 11/1/2023
 * @project : Next TravelPvt. Ltd
 */
@Repository
public interface GuideRepository extends JpaRepository<Guide,String> {
}

