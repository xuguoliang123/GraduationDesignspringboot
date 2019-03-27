package com.example.demo.Interface;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.persistence.*;
import java.util.List;

@Repository
public interface MemberRepository extends JpaRepository<User,Long> {
    List<User> findByName(String username);
}
