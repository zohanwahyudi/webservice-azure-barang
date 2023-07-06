package webservices.rea.webserviceazurebarang.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import webservices.rea.webserviceazurebarang.models.entities.Barang;
import webservices.rea.webserviceazurebarang.models.repos.BarangRepo;

@Service
@Transactional
public class BarangService {
    @Autowired
    private BarangRepo barangRepo;

    public Barang save(Barang barang){
        return barangRepo.save(barang);
    }

    public Barang findOne(Long ID){
        return barangRepo.findById(ID).get();
    }

    public Iterable<Barang> findAll(){
        return barangRepo.findAll();
    }

    public void removeOne(Long ID){
        barangRepo.deleteById(ID);
    }

    public List<Barang> SearchByNama(String nama){
        return barangRepo.SearchByNama(nama);
    }

    public List<Barang> SearchByDeskripsi(String deskripsi){
        return barangRepo.SearchByDeskripsi(deskripsi);
    }

    public List<Barang> SearchByharga(String harga){
        return barangRepo.SearchByHarga(harga);
    }
}
