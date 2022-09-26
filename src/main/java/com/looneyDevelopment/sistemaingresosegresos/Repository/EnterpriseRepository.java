package com.looneyDevelopment.sistemaingresosegresos.Repository;

import com.looneyDevelopment.sistemaingresosegresos.Entities.Enterprise;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  EnterpriseRepository extends JpaRepository<Enterprise, String> {
}
