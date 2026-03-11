package com.mercadopreso.shipping.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.mercadopreso.shipping.model.Shipment;

public interface ShipmentRepository extends JpaRepository<Shipment, Long> {

}