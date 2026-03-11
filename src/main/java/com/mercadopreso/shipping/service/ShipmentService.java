package com.mercadopreso.shipping.service;

import org.springframework.stereotype.Service;
import java.util.List;
import com.mercadopreso.shipping.model.Shipment;
import com.mercadopreso.shipping.repository.ShipmentRepository;

@Service
public class ShipmentService {

    private final ShipmentRepository repository;

    public ShipmentService(ShipmentRepository repository) {
        this.repository = repository;
    }

    public Shipment criar(Shipment shipment) {
        return repository.save(shipment);
    }

    public List<Shipment> listar() {
        return repository.findAll();
    }

    public Shipment buscar(Long id) {
        return repository.findById(id).orElse(null);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}
