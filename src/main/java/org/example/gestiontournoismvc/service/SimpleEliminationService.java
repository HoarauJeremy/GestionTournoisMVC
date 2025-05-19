package org.example.gestiontournoismvc.service;

import org.example.gestiontournoismvc.entity.SimpleElimination;
import org.example.gestiontournoismvc.repository.SimpleEliminationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SimpleEliminationService {

    private SimpleEliminationRepository simpleEliminationRepository;

    @Autowired
    public SimpleEliminationService(SimpleEliminationRepository simpleEliminationRepository) {
        this.simpleEliminationRepository = simpleEliminationRepository;
    }

    public List<SimpleElimination> getSimpleEliminations() {
        return (List<SimpleElimination>) simpleEliminationRepository.findAll();
    }

    public Optional<SimpleElimination> getSimpleEliminationById(Long id) {
        return simpleEliminationRepository.findById(id);
    }

    public SimpleElimination saveSimpleElimination(SimpleElimination simpleElimination) {
        return simpleEliminationRepository.save(simpleElimination);
    }

    public void deleteSimpleEliminationById(Long id) {
        simpleEliminationRepository.deleteById(id);
    }

    public boolean simpleEliminationExist(Long id) {
        return simpleEliminationRepository.existsById(id);
    }

}
