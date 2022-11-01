package com.seasalt.seasalt.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "konsumen")
public class Konsumen {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;

  private String nama;

  private String alamat;

  private char kota;

  private char provinsi;

  private Date tgl_registrasi;

  private char status;

  public Konsumen() {
    super();
  }

  public Konsumen(String nama, String alamat, char kota, char provinsi, Date tgl_registrasi, char status) {
    super();
    this.nama = nama;
    this.alamat = alamat;
    this.kota = kota;
    this.provinsi = provinsi;
    this.tgl_registrasi = tgl_registrasi;
    this.status = status;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getNama() {
    return nama;
  }

  public void setNama(String nama) {
    this.nama = nama;
  }

  public String getAlamat() {
    return alamat;
  }

  public void setAlamat(String alamat) {
    this.alamat = alamat;
  }

  public char getKota() {
    return kota;
  }

  public void setKota(char kota) {
    this.kota = kota;
  }

  public char getProvinsi() {
    return provinsi;
  }

  public void setProvinsi(char provinsi) {
    this.provinsi = provinsi;
  }

  public Date getTgl_registrasi() {
    return tgl_registrasi;
  }

  public void setTgl_registrasi(Date tgl_registrasi) {
    this.tgl_registrasi = tgl_registrasi;
  }

  public char getStatus() {
    return status;
  }

  public void setStatus(char status) {
    this.status = status;
  }

  @Override
public String toString() {
  return "Konsumen{" +
      "nama='" + nama + '\'' +
      "alamat='" + alamat + '\'' +
      "kota='" + kota + '\'' +
      "provinsi='" + provinsi + '\'' +
      "tgl_registrasi='" + tgl_registrasi + '\'' +
      "status='" + status + '\'' +
      '}';
}
}
