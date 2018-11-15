package fr.andrew.universite.universite.etudiant.business.impl;

import fr.andrew.universite.universite.etudiant.business.IEtudiantBusiness;
import fr.andrew.universite.universite.etudiant.domain.Etudiant;
import fr.andrew.universite.universite.etudiant.repository.IEtudiantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EtudiantBusinessImpl implements IEtudiantBusiness{

    @Autowired
    private IEtudiantRepository etudiantRepository;


    @Override
    public List<Etudiant> findAll() {
        return etudiantRepository.findAll();
    }

    @Override
    public Etudiant findOneById(Integer id) {
        return etudiantRepository.getOne(id);
    }

    @Override
    public Etudiant add(Etudiant etudiant) {
        return etudiantRepository.save(etudiant);
    }

    @Override
    public Void delete(Integer id) {
        etudiantRepository.deleteById(id);

        return null;
    }

    @Override
    public Etudiant modifier(Etudiant etudiant) {
        return etudiantRepository.save(etudiant);
    }


}
