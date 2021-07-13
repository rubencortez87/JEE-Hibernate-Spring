/**
 * 
 */
package com.platzi.ereservation.vista.resources.vo;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import com.platzi.ereservation.modelo.Reserva;

import lombok.Data;

/**
 * Clase que representa la tabla cliente
 * 
 * @author r.cortez
 *
 */
@Data
public class ClienteVO {
	private String nombreCli;
	private String apellidoCli;
	private String identificacionCli;
	private String direccionCli;
	private String telefonoCli;
	private String emailCli;
	
}