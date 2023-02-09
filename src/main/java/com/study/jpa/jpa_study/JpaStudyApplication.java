package com.study.jpa.jpa_study;

import com.study.jpa.jpa_study.Entity.Member;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.List;


@SpringBootApplication
public class JpaStudyApplication {

    public static void main(String[] args) {
        SpringApplication.run(JpaStudyApplication.class, args);
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpastudy");

        // 엔티티 매니저 생성

        EntityManager em = emf.createEntityManager();

        // 트랜잭션 관리

        EntityTransaction tx = em.getTransaction();

        try{
            tx.begin();
            logic(em); // 비즈니스 로직
            tx.commit();
        } catch (Exception e){
            e.printStackTrace();
            tx.rollback();
        } finally {
            em.close();
        }

        emf.close();

    }
    public static void logic(EntityManager em) {
        String id = "id1";
        Member member = new Member();
        member.setId(id);
        member.setUsername("지한");
        member.setAge(2);

        // 등록

        em.persist(member);
        // 수정
        member.setAge(20);
        // 한 건 조회
        Member findMember = em.find(Member.class, id);
        // 목록 조회

        List<Member> members = em.createQuery("select m from Member m", Member.class).getResultList();
        // 삭제
        em.remove(member);
    }
}
