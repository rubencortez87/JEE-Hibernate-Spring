package com.platzi.ereservation.negocio.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.platzi.ereservation.modelo.Reserva;

public interface ReservaRepository extends JpaRepository<Reserva, String> {

	@Query("Select r from Reserva r where r.FechaIngresoRes =:fechaInicio and r.fechaSalidaRes =:fechaSalida")
	public List<Reserva> find(@Param("FechaInicio") Date fechaSalida,@Param("fechaSalida") Date fechaSalida);
}
