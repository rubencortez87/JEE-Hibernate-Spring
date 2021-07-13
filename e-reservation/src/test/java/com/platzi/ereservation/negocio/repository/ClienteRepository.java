/**
 * 
 */
package com.platzi.ereservation.negocio.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.platzi.ereservation.modelo.Cliente;

/**
 * Interface para definir las operaciones de bdd relacionadas con cliente
 * @author r.cortez
 *
 */
public interface ClienteRepository extends JpaRepository<Cliente, String>{

	/**
	 * Definicion de metodo para buscar los clientes por su apellido
	 * @param apellidoCli
	 * @return
	 * */
	public List<Cliente> findByApellidoCli(String apellidoCli);
	
	public Cliente findByIdentificacion(String identificacionCli);
	
}
