package lk.ijse.travelPackage.PackageService.service;


import lk.ijse.travelPackage.PackageService.dto.TravelPackageDTO;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;
/**
 * Created by Vishnuka Yahan
 *
 * @author  : Vishnuka Yahan
 * @data    : 11/1/2023
 * @project : Next TravelPvt. Ltd
 *
 */
public interface TravelPackageService {
    TravelPackageDTO saveTravelPackage(TravelPackageDTO travelPackageDTO, MultipartFile file) throws IOException;

    List<TravelPackageDTO> getAllTravelPackages();

    TravelPackageDTO updateTravelPackage(TravelPackageDTO travelPackageDTO, MultipartFile file) throws IOException;

    void deletePackage(int packageId);
}
