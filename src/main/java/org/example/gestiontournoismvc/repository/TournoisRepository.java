package org.example.gestiontournoismvc.repository;

import org.example.gestiontournoismvc.entity.Tournois;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TournoisRepository extends CrudRepository<Tournois, Long> {
}