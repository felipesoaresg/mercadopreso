package com.mercadopreso.shipping.controller;

import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.mercadopreso.shipping.model.Shipment;
import com.mercadopreso.shipping.service.ShipmentService;

@RestController
@RequestMapping("/api/shipments")
public class ShipmentController {

    private final ShipmentService service;

    public ShipmentController(ShipmentService service) {
        this.service = service;
    }

    @PostMapping
    public Shipment criar(@RequestBody Shipment shipment) {
        return service.criar(shipment);
    }

    @GetMapping
    public List<Shipment> listar() {
        return service.listar();
    }

    @GetMapping("/{id}")
    public Shipment buscar(@PathVariable Long id) {
        return service.buscar(id);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }
}