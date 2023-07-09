package phoneNumber.reservation.exception.response;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

//public class MemberErrorResponse {
//    public static final ResponseEntity<ErrorResponse> AUTHOR_MEMBER_NOT_FOUND = new ResponseEntity<>(ErrorResponse.builder()
//            .exceptionName(AuthorOrMemberNotFoundException.class.getSimpleName())
//            .message("통계에 대한 권한이 없습니다.")
//            .build(), HttpStatus.BAD_REQUEST);
//
//}
