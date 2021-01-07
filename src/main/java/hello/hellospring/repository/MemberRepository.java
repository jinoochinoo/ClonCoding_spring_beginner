package hello.hellospring.repository;

import hello.hellospring.domain.Member;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    // 저장
    Member save(Member member);

    // id, name 통해 정보 찾기
    Optional<Member> findById(Long id);
    Optional<Member> findByName(String name);

    // 저장된 모든 데이터 반환
    List<Member> findAll();


}
