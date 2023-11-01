package lk.NextTravelPvt.Ltd.vishnuka084.guideservice.service;

import lk.NextTravelPvt.Ltd.vishnuka084.guideservice.dto.GuideDTO;
import lk.NextTravelPvt.Ltd.vishnuka084.guideservice.exception.DuplicateException;
import lk.NextTravelPvt.Ltd.vishnuka084.guideservice.exception.NotFoundException;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
/**
 * Created by Vishnuka Yahan
 *
 * @author  : Vishnuka Yahan
 * @data    : 11/1/2023
 * @project : Next TravelPvt. Ltd
 *
 */
public interface GuideService {

    GuideDTO findGuideById(String guideId);

    List<GuideDTO> getAllGuides();

    void saveGuide(GuideDTO guideDTO, MultipartFile nic,
                   MultipartFile guideId,MultipartFile pic) throws DuplicateException;
//    void saveGuide(GuideDTO guideDTO) throws DuplicateException;

    void updateGuide(GuideDTO guideDTO, MultipartFile nic,
                     MultipartFile guideId,MultipartFile pic) throws NotFoundException;

    void deleteGuide(String guideId) throws NotFoundException;

    void updateGuideStatus(String guideId) throws NotFoundException;
}
