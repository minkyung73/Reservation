package phoneNumber.reservation.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import phoneNumber.reservation.domain.Member;
import phoneNumber.reservation.dto.MemberDto;
import phoneNumber.reservation.repository.MemberRepository;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class MemberService {
    private final MemberRepository memberRepository;

    /**
     * 회원 가입 로직
     * */
    @Transactional
    public MemberDto.SignUpResponseDto createMember (MemberDto.SignUpRequestDto signUpRequestDto) {

        // 이미 존재하는 회원인지 확인

        // 아직 없는 회원이면 데이터 저장
        Member newMember = signUpRequestDto.toEntity();         // dto를 member 객체에 넣어줌
        Member savedMember = memberRepository.save(newMember);  // newMember를 DB에 저장

//        MemberDto.SignUpResponseDto signUpResponseDto =
//                new MemberDto.SignUpResponseDto().toResponseDto(savedMember);   // return하기 위해 savedMember를 dto에 담음
        
//        return signUpResponseDto;
        return new MemberDto.SignUpResponseDto().toResponseDto(savedMember);
    }


}
