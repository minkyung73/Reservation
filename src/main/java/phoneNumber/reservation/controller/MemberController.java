package phoneNumber.reservation.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import phoneNumber.reservation.dto.MemberDto;
import phoneNumber.reservation.service.MemberService;

@Slf4j
@RestController
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;

    /**
     * 회원가입 API
     */
    @PostMapping("/signUp")
    public ResponseEntity<MemberDto.SignUpResponseDto> saveMember
        (@Validated @RequestBody  MemberDto.SignUpRequestDto signUpRequestDto ) {

        MemberDto.SignUpResponseDto member = memberService.createMember(signUpRequestDto);
        return new ResponseEntity<>(member, HttpStatus.CREATED);
    }

    /**
     * 회원 정보 조회 API
     * [DESCRIPTION] phone_number 를 사용해서 회원 정보 조회
     * */
    @GetMapping("/member/{phone_number}")
    public ResponseEntity<MemberDto.OneMemberResponseDto> oneMember
    (@Validated @RequestBody  MemberDto.OneMemberRequestDto oneMemberRequestDto ) {

        MemberDto.OneMemberResponseDto member = memberService.findMember(oneMemberRequestDto);
        return new ResponseEntity<>(member, HttpStatus.CREATED);
    }

}
