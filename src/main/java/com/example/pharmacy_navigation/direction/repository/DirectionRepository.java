package com.example.pharmacy_navigation.direction.repository;

import com.example.pharmacy_navigation.direction.entity.Direction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DirectionRepository extends JpaRepository<Direction, Long> {
}
