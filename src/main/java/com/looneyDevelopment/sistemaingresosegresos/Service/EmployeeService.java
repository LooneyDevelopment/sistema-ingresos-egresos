package com.looneyDevelopment.sistemaingresosegresos.Service;

import com.looneyDevelopment.sistemaingresosegresos.Entities.Employee;
import com.looneyDevelopment.sistemaingresosegresos.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> getEmployee(){
        return employeeRepository.findAll();
    }



    public Employee getEmployee(Long id_Empleado) throws Exception {
        Optional<Employee> employeeOptional = employeeRepository.findById(id_Empleado);
        if(employeeOptional.isPresent()){
            return employeeOptional.get();
        }else {
            //Crea una excepcion por si no existe el dato
            throw new Exception("Empleado No Existe");
        }
    }

    public Employee saveEmployee(Employee employee_param){ return employeeRepository.save(employee_param); }

    public Employee patchEmployee(Employee employee_param, Long id) throws Exception{
        try{
            Employee employeeBd = getEmployee(id);

            if(employee_param.getNombre() != null){
                employeeBd.setNombre(employee_param.getNombre());
            }
            if(employee_param.getRol() != null){
                employeeBd.setRol(employee_param.getRol());
            }

            return saveEmployee(employeeBd);

        } catch (Exception e){
            throw new Exception("Empleado no se actualizo porque no existe");
        }
    }


    //Preguntar por el public String
    public String delete(Long id){
        employeeRepository.deleteById(id);
        return "Empleado eliminado exitosamente";
    }


}
