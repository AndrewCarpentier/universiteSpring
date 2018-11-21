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

    @Override
    public Enseignant add(Enseignant enseignant) {
        return enseignantRepository.save(enseignant);
    }

    @Override
    public Void delete(Integer id) {
        enseignantRepository.deleteById(id);
        return null;
    }

    @Override
    public Enseignant modifier(Enseignant enseignant) {
        return enseignantRepository.save(enseignant);
    }

}
