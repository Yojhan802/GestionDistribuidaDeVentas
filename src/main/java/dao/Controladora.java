/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import dto.Cliente;
import java.util.List;


public class Controladora {
    
    ClienteJpaController control = new ClienteJpaController();
    
    public List<Cliente> tarerClientes(){
        return control.findClienteEntities();
    }
}
