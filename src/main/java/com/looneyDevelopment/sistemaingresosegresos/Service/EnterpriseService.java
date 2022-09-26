package com.looneyDevelopment.sistemaingresosegresos.Service;

import com.looneyDevelopment.sistemaingresosegresos.Entities.Enterprise;
import com.looneyDevelopment.sistemaingresosegresos.Repository.EnterpriseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EnterpriseService {

    @Autowired
    private EnterpriseRepository enterpriseRepository;


    public Enterprise saveEnterprise(Enterprise enterprise_param){ //Crea una fila en la database
        return enterpriseRepository.save(enterprise_param);
    }

    public List<Enterprise> getEnterprises(){ //Halla todas las empresas en la database
        return enterpriseRepository.findAll();
    }

    public Enterprise getEnterprise(String id) throws Exception { //Busca una empresa por su id
        Optional<Enterprise> enterpriseOptional = enterpriseRepository.findById(id);
        if (enterpriseOptional.isPresent()){
            return enterpriseOptional.get();
        }
        else{
            throw new Exception("La empresa no existe en al base de datos");
        }
    }
    public Enterprise putEnterprise(Enterprise enterprise_param) {  //Actualiza datos
        return enterpriseRepository.save(enterprise_param);
    }
}

