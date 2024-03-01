package com.esib.esib.service.exceptions;

import java.util.logging.Logger;
import javax.persistence.EntityNotFoundException;
import static org.springframework.http.HttpStatus.NOT_FOUND;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 *
 * @author Meldo Maunze
 */
@ResponseStatus(value = NOT_FOUND)
public class ObjectNotFoundException extends EntityNotFoundException {

    /**
     *
     * @param message
     */
    public ObjectNotFoundException(String message) {
        super(message);
    }
    private static final Logger LOG = Logger.getLogger(ObjectNotFoundException.class.getName());

}