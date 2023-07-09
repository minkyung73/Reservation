package phoneNumber.reservation.exception.exceptions;

public class MemberExistException extends RuntimeException{
    public MemberExistException() {
        super("이미 가입한 회원입니다");
    }
}
