Feature: Proses Tambah baru Bahasa
#1
  @positif-TambahBaru
  Scenario: User berhasil menambahkan bahasa baru untuk diklat
    Given User berada di halaman Bahasa
    When User klik button tambah baru
    And User input jenis bahasa yang ingin dibuat
    And User memilih deskripsi
    And User klik button simpan
    Then User berhasil menemukan bahasa yang baru ditambahkan

  @positif-EksporPdf
  Scenario: User berhasil melakukan ekspor daftar dalam bentuk pdf
    Given User berada di halaman Bahasa
    When User klik button PDF
    Then User berhasil mendapatkan daftar dalam bentuk pdf

  @positif-EksporExcel
  Scenario: User berhasil melakukan ekspor daftar dalam bentuk pdf
    Given User berada di halaman Bahasa
    When User klik button Ekspor
    Then User berhasil mendapatkan daftar dalam bentuk Excel

  @positif-Edit
  Scenario: User berhasil melakukan edit Bahasa
    Given User memilih data yang ingin diubah
    When User klik button ubah
    And User ubah jenis bahasa
    And User ubah deskripsi
    And User klik button simpan
    Then User berhasil mendapatkan daftar yang sudah diubah

  @positif-Hapus
  Scenario: User berhasil melakukan hapus Bahasa
    Given User memilih data yang ingin diubah
    When User klik button delete
    And User klik button iya
    Then User berhasil menghapus bahasa



