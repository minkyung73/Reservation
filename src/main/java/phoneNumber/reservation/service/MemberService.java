package phoneNumber.reservation.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import phoneNumber.reservation.domain.Member;
import phoneNumber.reservation.dto.MemberDto;
import phoneNumber.reservation.exception.exceptions.MemberExistException;
import phoneNumber.reservation.repository.MemberRepository;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
@Slf4j
public class MemberService {
    private final MemberRepository memberRepository;

    /**
     * 회원 가입 로직
     * */
    @Transactional
    public MemberDto.SignUpResponseDto createMember (MemberDto.SignUpRequestDto signUpRequestDto) {
        // 이미 존재하는 회원인지 확인 (전화번호로)
        Member memberByPhoneNumber = memberRepository.findMemberByPhone_number(signUpRequestDto.getPhoneNumber());
        if(memberByPhoneNumber != null){    // 이미 존재하는 회원
            // 예외
            throw new MemberExistException();
        }

        // 아직 없는 회원이면 데이터 저장
        Member newMember = signUpRequestDto.toEntity();         // dto를 member 객체에 넣어줌
        Member savedMember = memberRepository.save(newMember);  // newMember를 DB에 저장

        return new MemberDto.SignUpResponseDto().toResponseDto(savedMember);

//        MemberDto.SignUpResponseDto signUpResponseDto =
//                new MemberDto.SignUpResponseDto().toResponseDto(savedMember);   // return하기 위해 savedMember를 dto에 담음
//        return signUpResponseDto;
    }

    /**
     * 전화번호를 통한 특정 회원 조회
     * */
    @Transactional
    public MemberDto.OneMemberResponseDto findMember (MemberDto.OneMemberRequestDto oneMemberRequestDto) {
        Member memberByPhoneNumber = memberRepository.findMemberByPhone_number(oneMemberRequestDto.getPhoneNumber());
        log.info(String.valueOf(memberByPhoneNumber));
        return new MemberDto.OneMemberResponseDto().toResponseDto(memberByPhoneNumber);
    }


}
