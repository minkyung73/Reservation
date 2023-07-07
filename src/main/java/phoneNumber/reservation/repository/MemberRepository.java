package phoneNumber.reservation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import phoneNumber.reservation.domain.Member;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
