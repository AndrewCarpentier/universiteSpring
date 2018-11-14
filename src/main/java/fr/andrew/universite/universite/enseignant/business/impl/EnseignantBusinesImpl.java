package fr.andrew.universite.universite.enseignant.business.impl;

import fr.andrew.universite.universite.enseignant.business.IEnseignantBusiness;
import fr.andrew.universite.universite.enseignant.domain.Enseignant;
import fr.andrew.universite.universite.enseignant.repository.IEnseignantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnseignantBusinesImpl implements IEnseignantBusiness {

    @Autowired
    private IEnseignantRepository enseignantRepository;

    @Override
    public List<Enseignant> findAll() {
        return enseignantRepository.findAll();
    }

    @Override
    public Enseignant findOneById(Integer id) {
        return enseignantRepository.getOne(id);
    }
}
