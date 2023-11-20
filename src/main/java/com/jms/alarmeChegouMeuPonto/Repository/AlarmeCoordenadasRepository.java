package com.jms.alarmeChegouMeuPonto.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.jms.alarmeChegouMeuPonto.Model.AlarmeCoordenadasModel;

@Repository
public interface AlarmeCoordenadasRepository extends JpaRepository<AlarmeCoordenadasModel, Long> {

}
