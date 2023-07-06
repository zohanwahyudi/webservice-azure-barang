package webservices.rea.webserviceazurebarang.models.repos;

import org.springframework.data.repository.CrudRepository;

import webservices.rea.webserviceazurebarang.models.entities.Barang;

public interface BarangRepo extends CrudRepository<Barang, Long> {
    
}
