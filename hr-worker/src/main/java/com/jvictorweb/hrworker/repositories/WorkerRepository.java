package com.jvictorweb.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jvictorweb.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long>{

}