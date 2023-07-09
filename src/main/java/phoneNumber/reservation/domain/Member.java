package phoneNumber.reservation.domain;

import lombok.*;
import phoneNumber.reservation.dto.MemberDto;

import javax.persistence.*;

@Entity
@Table(name = "members")
@Getter @Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Member {

    @Id @GeneratedValue
    @Column(name = "member_id")
    private Long id;

    private String name;

    private String phone_number;

    private BirthDate birthDate;

}
