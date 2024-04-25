Feature: Proses Tambah baru Kursus

  @positif-TambahBaru
  Scenario: User berhasil menambahkan Kursus baru
    Given User berada di halaman Kursus
    When User klik button tambah baru
    And User input Nama
    And User memilih Bahasa
    And User memilih tingkat
    And User input nama Kursus
    And User input nama Mata Pelajaran
    And User input total jam
    And User klik button simpan
    Then User berhasil menemukan kursus yang baru ditambahkan

  @positif-EksporPdf
  Scenario: User berhasil melakukan ekspor daftar dalam bentuk pdf
    Given User berada di halaman Kursus
    When User klik button PDF di halaman kursus
    Then User berhasil mendapatkan daftar dalam bentuk pdf

  @positif-EksporExcel
  Scenario: User berhasil melakukan ekspor daftar dalam bentuk Excel
    Given User berada di halaman Kursus
    When User klik button Ekspor di halaman Kursus
    Then User berhasil mendapatkan daftar dalam bentuk Excel

  @positif-Edit
  Scenario: User berhasil melakukan edit Kursus
    Given User memilih kursus yang ingin diubah
    When User klik button ubah pada kursus
    And User ubah nama kursus
    And User ubah deskripsi
    And User klik button simpan
    Then User berhasil mendapatkan daftar yang sudah diubah