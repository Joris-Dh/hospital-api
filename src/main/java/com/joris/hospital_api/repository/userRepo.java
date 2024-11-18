package com.joris.hospital_api.repository;

import com.joris.hospital_api.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface userRepo extends JpaRepository<User, Long>{
}

