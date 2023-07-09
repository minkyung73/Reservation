package phoneNumber.reservation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import phoneNumber.reservation.domain.Member;

import java.util.List;

public interface MemberRepository extends JpaRepository<Member, Long> {
    @Query(value = "SELECT * FROM members m WHERE m.phone_number = :phone_number", nativeQuery = true)
    Member findMemberByPhone_number(@Param("phone_number")String phone_number);


}
