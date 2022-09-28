package com.example.vehiclebackend.controller;

import com.example.vehiclebackend.entity.Model;
import com.example.vehiclebackend.service.ModelService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/models")
public class ModelController {

    ModelService modelService;

    public ModelController(ModelService modelService) {
        this.modelService = modelService;
    }

    @GetMapping
    public List<Model> getAllModels() {
        return modelService.getAllModels();
    }

    @PostMapping
    public Model createModel(@RequestBody Model model) {
        return modelService.saveModel(model);
    }

    @GetMapping("/{modelId}")
    public Model getModelById(@PathVariable Long modelId) {
        return modelService.getModel(modelId);
    }

    @GetMapping("/brands/{brand}")
    public List<Model> getModelByBrand(@PathVariable String brand) {
        return modelService.getModelByBrand(brand);
    }

    @DeleteMapping("/{modelId}")
    public void deleteModelById(@PathVariable Long modelId) {
        modelService.deleteModelById(modelId);
    }
}
