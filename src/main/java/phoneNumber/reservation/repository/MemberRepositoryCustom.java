package phoneNumber.reservation.repository;

import org.springframework.stereotype.Repository;
import phoneNumber.reservation.domain.Member;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class MemberRepositoryCustom {

    @PersistenceContext
    private EntityManager em;

    public Member save(Member member) {
        em.persist(member);
        return member;
    }


}
