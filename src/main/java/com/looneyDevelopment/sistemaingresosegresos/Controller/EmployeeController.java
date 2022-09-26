package com.looneyDevelopment.sistemaingresosegresos.Controller;

import com.looneyDevelopment.sistemaingresosegresos.Entities.Employee;
import com.looneyDevelopment.sistemaingresosegresos.Entities.EmployeeResponse;
import com.looneyDevelopment.sistemaingresosegresos.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/users")
    //public ResponseEntity<Object> getUser(@RequestParam Long id_Empleado)
    public ResponseEntity<Object> getUser(){

        try {
            System.out.println("Metodo Query");
            List<Employee> employees = employeeService.getEmployee();
            return new ResponseEntity<>(employees,HttpStatus.OK);
        } catch (Exception e){

            //throw new RuntimeException(e);
            return new ResponseEntity<>(e.getMessage(),
                    HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/users/{id}")
    public ResponseEntity<Object> getUsersBYId(@PathVariable Long id){

        try {
            System.out.println("Metodo url");
            Employee employee = employeeService.getEmployee(id);
            return new ResponseEntity<>(employee,HttpStatus.OK);
        } catch (Exception e){
            return new ResponseEntity<>(e.getMessage(),
                    HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }




    @PostMapping("/users")
    public ResponseEntity<EmployeeResponse> postUser(@RequestBody Employee employee){
        return new ResponseEntity<>(
                new EmployeeResponse("Usuario Creado Exitosamente",
                        employeeService.saveEmployee(employee)), HttpStatus.OK);

    }


    @PatchMapping ("/users/{id}")
    public ResponseEntity<EmployeeResponse> patch(@RequestBody Employee employee, @PathVariable Long id){
        try{
            return new ResponseEntity<>(
                    new EmployeeResponse("Actualizacion Exitosa", employeeService.patchEmployee(employee, id)),
                    HttpStatus.OK);
        } catch (Exception e){
            return new ResponseEntity<>(
                    new EmployeeResponse(e.getMessage(),null),
                    HttpStatus.OK);
        }
    }


    @DeleteMapping("/users/{id}")
    public ResponseEntity<EmployeeResponse> delete(@PathVariable Long id){
        return new ResponseEntity<>(

                new EmployeeResponse(employeeService.delete(id), null),
                HttpStatus.OK);
    }

}
