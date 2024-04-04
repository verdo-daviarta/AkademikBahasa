Feature: Proses Tambah baru Kursus

  @positif-TambahBaru
  Scenario: User berhasil menambahkan Kursus baru
    Given User berada di halaman Kursus
    When User klik button tambah baru
    And User input kursus yang ingin dibuat
    And User memilih Bahasa
    And User memilih tingkat
    And User input nama Kursus
    And User input nama Mata Pelajaran
    And User input total jam
    And User klik button simpan
    Then User berhasil menemukan kursus yang baru ditambahkan
