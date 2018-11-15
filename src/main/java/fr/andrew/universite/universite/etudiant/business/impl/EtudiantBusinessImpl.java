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

}
