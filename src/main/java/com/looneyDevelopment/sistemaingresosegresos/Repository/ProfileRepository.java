package com.looneyDevelopment.sistemaingresosegresos.Repository;


import com.looneyDevelopment.sistemaingresosegresos.Entities.Profile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProfileRepository extends JpaRepository<Profile,String> {

    public Profile findByEmployeeNombre(String nombre);
}
