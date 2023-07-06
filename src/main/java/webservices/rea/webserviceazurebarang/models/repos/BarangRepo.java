package webservices.rea.webserviceazurebarang.models.repos;


import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import webservices.rea.webserviceazurebarang.models.entities.Barang;

public interface BarangRepo extends CrudRepository<Barang, Long> {
    @Query(value = "SELECT * FROM dbo.[barang] WHERE Nama LIKE CONCAT('%', :nama, '%') ", nativeQuery = true)
    List<Barang> SearchByNama(String nama);

    @Query(value = "SELECT * FROM dbo.[barang] WHERE deskripsi LIKE CONCAT('%', :deskripsi, '%') ", nativeQuery = true)
    List<Barang> SearchByDeskripsi(String deskripsi);

    @Query(value = "SELECT * FROM dbo.[barang] WHERE Harga LIKE CONCAT('%', :harga, '%') ", nativeQuery = true)
    List<Barang> SearchByHarga(String harga);

}
