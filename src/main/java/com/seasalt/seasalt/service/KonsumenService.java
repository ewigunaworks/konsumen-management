package com.seasalt.seasalt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seasalt.seasalt.model.Konsumen;
import com.seasalt.seasalt.repository.KonsumenRepository;

@Service
public class KonsumenService {
  @Autowired
  private KonsumenRepository konsumenRepository;

  public List<Konsumen> listAll() {
    return konsumenRepository.findAll();
  }
  
  public void save(Konsumen konsumen) {
    System.out.println(konsumen.toString());
    konsumenRepository.save(konsumen);
  }
  
  public Konsumen get(long id) {
      return konsumenRepository.findById(id).get();
  }
  
  public void delete(long id) {
    konsumenRepository.deleteById(id);
  }
  
}
