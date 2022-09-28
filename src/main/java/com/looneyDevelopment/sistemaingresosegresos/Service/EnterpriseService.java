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

    public Enterprise create(Enterprise enterprise) {
        return enterpriseRepository.save(enterprise);
    }

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


    public Optional<Enterprise> patchEnterprise(Enterprise enterprise_param, Long id) throws Exception {
        try {
            Enterprise empresa = getEnterprise(String.valueOf(id));

            if (enterprise_param.getPhoneEnterprise() != null) {
                empresa.setPhoneEnterprise(enterprise_param.getPhoneEnterprise());
            }

            if (enterprise_param.getNitEnterprise() != null) {
                empresa.setNitEnterprise(enterprise_param.getNitEnterprise());
            }
            if (empresa.getNameEnterprise() != null) {
                empresa.setNameEnterprise(enterprise_param.getNameEnterprise());
            }
            if (enterprise_param.getAddressEnterprise() != null) {
                empresa.setAddressEnterprise(enterprise_param.getAddressEnterprise());
            }
            if (empresa.getUpdatedAt() != null) {
                empresa.setUpdatedAt(enterprise_param.getUpdatedAt());
            }
            if (enterprise_param.getCreatedAt() != null) {
                empresa.setCreatedAt(enterprise_param.getCreatedAt());
            }


            return Optional.ofNullable(create(empresa));

        } catch (Exception e) {
            throw new Exception("Persona no se actualizo, porque no existe");
        }
    }
}

