package org.example.gestiontournoismvc.repository;

import org.example.gestiontournoismvc.entity.RoundRobin;
import org.springframework.data.repository.CrudRepository;

public interface RoundRobinRepository extends CrudRepository<RoundRobin, Long> {
}