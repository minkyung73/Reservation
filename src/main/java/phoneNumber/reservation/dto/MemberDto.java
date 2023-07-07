package phoneNumber.reservation.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import phoneNumber.reservation.domain.BirthDate;
import phoneNumber.reservation.domain.Member;

public class MemberDto {

    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class SignUpRequestDto {
//        private Long id;
        private String name;
        private String phoneNumber;
        private BirthDate birthDate;

        public Member toEntity() {
            return Member.builder()
//                    .id(this.getId())
                    .name(this.getName())
                    .phone_number(this.getPhoneNumber())
                    .birthDate(this.getBirthDate())
                    .build();
        }
    }

    @Getter
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class SignUpResponseDto {
        private Long id;
        private String name;
        private String phoneNumber;
        private BirthDate birthDate;

//        private Long year;
//        private Long month;
//        private Long day;

        public SignUpResponseDto toResponseDto(Member member) {
            return SignUpResponseDto.builder()
                    .id(member.getId())
                    .name(member.getName())
                    .phoneNumber(member.getPhone_number())
                    .birthDate(member.getBirthDate())
                    .build();
        }
    }

}
