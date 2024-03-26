Feature: Proses Tambah baru Bahasa
#1
  @positif
  Scenario: user berhasil menambahkan bahasa baru untuk diklat
    Given User berada di halaman Bahasa
    When User klik button tambah baru
    And User input jenis bahasa yang ingin dibuat
    And User memilih deskripsi
    And User klik button simpan
    Then User berhasil menemukan bahasa yang baru ditambahkan