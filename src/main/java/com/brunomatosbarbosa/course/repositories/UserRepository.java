package com.brunomatosbarbosa.course.repositories;

import com.brunomatosbarbosa.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
