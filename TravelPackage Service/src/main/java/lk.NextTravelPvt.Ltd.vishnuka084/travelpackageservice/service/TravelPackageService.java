package lk.NextTravelPvt.Ltd.vishnuka084.travelpackageservice.service;

import lk.NextTravelPvt.Ltd.vishnuka084.travelpackageservice.dto.TravelPackageDTO;
import lk.NextTravelPvt.Ltd.vishnuka084.travelpackageservice.exception.DuplicateException;
import lk.NextTravelPvt.Ltd.vishnuka084.travelpackageservice.exception.NotFoundException;

import java.util.List;

/**
 * Created by Vishnuka Yahan
 *
 * @author  : Vishnuka Yahan
 * @data    : 11/2/2023
 * @project : Next TravelPvt. Ltd
 *
 */
public interface TravelPackageService {

    void saveTravelPackage(TravelPackageDTO travelPackageDTO) throws DuplicateException;

    void updateTravelPackage(TravelPackageDTO travelPackageDTO) throws NotFoundException;

    TravelPackageDTO findPackageById(String packageId);

    List<TravelPackageDTO> getAllPackages();

    void deletePackage(String packageId) throws NotFoundException;

    String getNextId();

    List<TravelPackageDTO> getDetails(String date);



}
