package fr.andrew.universite.universite.matiere.business.impl;

import fr.andrew.universite.universite.enseignant.business.IEnseignantBusiness;
import fr.andrew.universite.universite.enseignant.domain.Enseignant;
import fr.andrew.universite.universite.matiere.business.IMatiereBusiness;
import fr.andrew.universite.universite.matiere.domain.Matiere;
import fr.andrew.universite.universite.matiere.repository.IMatiereRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MatiereBusinessImpl implements IMatiereBusiness {

    @Autowired
    private IMatiereRepository matiereRepository;

    @Autowired
    private IEnseignantBusiness enseignantBusiness;

    @Override
    public List<Matiere> findAll() {
        return matiereRepository.findAll();
    }

    @Override
    public Matiere findOneById(Integer id) {
        return matiereRepository.getOne(id);
    }

    @Override
    public Matiere add(Matiere matiere) {
        return matiereRepository.save(matiere);
    }

    @Override
    public Void delete(Integer id) {
        matiereRepository.deleteById(id);
        return null;
    }

    @Override
    public Matiere modifier(Matiere matiere) {
        return matiereRepository.save(matiere);
    }

    @Override
    public List<Enseignant> getEnseignant() {
        List<Enseignant> enseignant = enseignantBusiness.findAll();
        return enseignant;
    }

    @Override
    public Enseignant getEnseignantByID(Integer id) {
        return enseignantBusiness.findOneById(id);
    }
}
