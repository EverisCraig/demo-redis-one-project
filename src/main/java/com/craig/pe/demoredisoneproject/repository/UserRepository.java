package com.craig.pe.demoredisoneproject.repository;

import com.craig.pe.demoredisoneproject.entities.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    @Modifying(clearAutomatically = true, flushAutomatically = true)
    @Transactional
    @Query(value = "UPDATE userdb.user SET salary = :salary WHERE id = :id", nativeQuery = true)
    int updateSalary(@Param("id")Long id, @Param("salary") float salary);

    default  Optional<User> findUser(Long id){
        System.out.println("Call repository to get id=" + id);
        return this.findById(id);
    }
}
