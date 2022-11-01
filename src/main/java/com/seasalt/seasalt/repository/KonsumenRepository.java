package com.seasalt.seasalt.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.seasalt.seasalt.model.Konsumen;

public interface KonsumenRepository extends JpaRepository<Konsumen, Long>{
  List < Konsumen > findAll();
}
