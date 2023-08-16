package com.nkh1987.banking.repository;

import com.nkh1987.banking.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    Boolean accountExistsByEmail(String email);

}

