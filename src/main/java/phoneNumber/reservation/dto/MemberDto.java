package phoneNumber.reservation.dto;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.lang.NonNull;
import phoneNumber.reservation.domain.BirthDate;
import phoneNumber.reservation.domain.Member;

public class MemberDto {

    /**
     * 회원 가입 요청 DTO
     * */
    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class SignUpRequestDto {
        private String name;


        private String phoneNumber;
        private BirthDate birthDate;

        public Member toEntity() {
            return Member.builder()
                    .name(this.getName())
                    .phone_number(this.getPhoneNumber())
                    .birthDate(this.getBirthDate())
                    .build();
        }
    }

    /**
     * 회원 가입 응답 DTO
     * */
    @Getter
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class SignUpResponseDto {
        private Long id;
        private String name;
        private String phoneNumber;
        private BirthDate birthDate;

        public SignUpResponseDto toResponseDto(Member member) {
            return SignUpResponseDto.builder()
                    .id(member.getId())
                    .name(member.getName())
                    .phoneNumber(member.getPhone_number())
                    .birthDate(member.getBirthDate())
                    .build();
        }
    }

    /**
     * 특정 회원 조회 요청 DTO
     * */
    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class OneMemberRequestDto {
        private String phoneNumber;

        public Member toEntity() {
            return Member.builder()
                    .phone_number(this.getPhoneNumber())
                    .build();
        }
    }


    /**
     * 특정 회원 조회 응답 DTO
     * */
    @Getter
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class OneMemberResponseDto {
        private Long id;
        private String name;
        private String phoneNumber;
        private BirthDate birthDate;

        public OneMemberResponseDto toResponseDto(Member member) {
            return OneMemberResponseDto.builder()
                    .id(member.getId())
                    .name(member.getName())
                    .phoneNumber(member.getPhone_number())
                    .birthDate(member.getBirthDate())
                    .build();
        }
    }
}
