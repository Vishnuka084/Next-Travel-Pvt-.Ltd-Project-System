package lk.NextTravelPvt.Ltd.vishnuka084.guideservice.advisor;

import lk.NextTravelPvt.Ltd.vishnuka084.guideservice.util.ResponseUtil;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * Created by Vishnuka Yahan
 *
 * @author : Vishnuka Yahan
 * @data : 11/1/2023
 * @project : Next TravelPvt. Ltd
 *
 */

@RestControllerAdvice
@CrossOrigin
public class ExceptionHandler {

    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @org.springframework.web.bind.annotation.ExceptionHandler({Exception.class})
    public ResponseUtil sendResponse(Exception e){
        return new ResponseUtil(500,e.getMessage(),null);
    }
}
