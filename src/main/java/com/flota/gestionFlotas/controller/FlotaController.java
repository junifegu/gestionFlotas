package com.flota.gestionFlotas.controller;

import com.flota.gestionFlotas.model.Conductor;
import com.flota.gestionFlotas.model.Vehiculo;
import com.flota.gestionFlotas.repository.ConductorRepository;
import com.flota.gestionFlotas.repository.VehiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class FlotaController {

    @Autowired
    private VehiculoRepository vehiculoRepo;

    @Autowired
    private ConductorRepository conductorRepo;

    // inicio
    @GetMapping("/inicio")
    public String inicio() {
        return "inicio";
    }

    // listadoss
    @GetMapping("/listadoVehiculos")
    public String listadoVehiculos(Model model) {
        model.addAttribute("vehiculos", vehiculoRepo.findAll());
        return "listadoVehiculos";
    }

    @GetMapping("/listadoConductores")
    public String listadoConductores(Model model) {
        model.addAttribute("conductores", conductorRepo.findAll());
        return "listadoConductores";
    }

    // vehiculo en alta
    @GetMapping("/altaVehiculo")
    public String altaVehiculoForm(Model model) {
        model.addAttribute("vehiculo", new Vehiculo());
        return "altaVehiculo";
    }

    @PostMapping("/altaVehiculo")
    public String altaVehiculoPost(@ModelAttribute Vehiculo vehiculo) {
        vehiculoRepo.save(vehiculo);
        return "redirect:/listadoVehiculos";
    }

    // coductor en alta
    @GetMapping("/altaConductor")
    public String altaConductorForm(Model model) {
        model.addAttribute("conductor", new Conductor());
        return "altaConductor";
    }

    @PostMapping("/altaConductor")
    public String altaConductorPost(@ModelAttribute Conductor conductor) {
        conductorRepo.save(conductor);
        return "redirect:/listadoConductores";
    }
}