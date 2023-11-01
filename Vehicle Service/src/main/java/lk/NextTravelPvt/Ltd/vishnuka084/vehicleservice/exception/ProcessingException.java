package lk.NextTravelPvt.Ltd.vishnuka084.vehicleservice.exception;
/**
 * Created by Vishnuka Yahan
 *
 * @author  : Vishnuka Yahan
 * @data    : 11/1/2023
 * @project : Next TravelPvt. Ltd
 *
 */
public class ProcessingException extends Exception{

    public ProcessingException(String message) {
        super(message);
    }

    public ProcessingException(String message, Throwable cause) {
        super(message, cause);
    }

    public ProcessingException(Throwable cause) {
        super(cause);
    }
}
