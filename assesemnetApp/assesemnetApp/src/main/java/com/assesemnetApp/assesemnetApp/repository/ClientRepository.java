package com.assesemnetApp.assesemnetApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.assesemnetApp.assesemnetApp.entity.ClientEntity;

@Repository
public interface ClientRepository extends JpaRepository<ClientEntity, Long>{

}
