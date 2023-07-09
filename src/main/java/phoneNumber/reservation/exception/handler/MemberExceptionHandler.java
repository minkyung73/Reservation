package phoneNumber.reservation.exception.handler;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import phoneNumber.reservation.exception.exceptions.MemberExistException;
import phoneNumber.reservation.exception.response.ErrorResponse;

//@Slf4j
//@RestControllerAdvice
//public class MemberExceptionHandler {
//    @ExceptionHandler(MemberExistException.class)
//    protected final ResponseEntity<ErrorResponse> handleAuthenticationException
//            (MemberExistException ex, WebRequest request) {
//        log.error(request.getDescription(false));
//        return AUTHOR_MEMBER_NOT_FOUND;
//    }
//}
