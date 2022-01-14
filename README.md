## INFORMASI MAHASISWA :
### NAMA : MUHAMMAD LUTFI EDI KURNIAWAN
### NIM : 18083000124
### KELAS : 7E

=============================================================

# Project sederhana  Pengelolaan Karyawan untuk kebutuhan Tugas Kuliah (UAS) semester 7
![gambar](preview.png?raw=true)
### Langkah-langkah :
1. Clone atau download folder di dalam github ini
2. Ekstrak file yang sudah di download (jika di download) ATAU buka folder yang sudah di clone sebelumnya
3. Didalam folder terdapat 2 Folder :
    - database
    - project_netbeans
4. Buka folder database
5. Buka localhost/phpmyadmin
6. Klik tab import
7. Choose file dan ambil file di dalam folder database
8. Lalu klik GO untuk mengimport database nya
9. Database akan terbuat dengan nama "project_data_karyawan"
10. Buka Netbeans
11. Klik File ( dipjok kiri atas )
12. Open Project
13. Pilih ke folder project_netbeans yang sudah kita ekstrak tadi
14. Bila sudah selesai membuka, akan ada project bernama "ProjectDataKaryawan"
15. Run Project

#### Penjelasan Package di dalam project:
- com.ubp.config : File in digunakan untuk membuka koneksi ke database
- com.ubp.manager : pengelolaan table untuk INSERT, SELECT, UPDATE, dan DELETE
- com.ubp.model : untuk penampilkan data dari table berbentuk OBJEK di dalam java
- com.ubp.tampilan : JFrame atau tampilan dari aplikasi
