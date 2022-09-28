package com.example.vehiclebackend.service;

import com.example.vehiclebackend.entity.Model;
import com.example.vehiclebackend.repository.ModelRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class ModelService {

    ModelRepository modelRepository;
    public List<Model> getAllModels() {
        return modelRepository.findAll();
    }


    public Model saveModel(@RequestBody Model model) {
        return modelRepository.save(model);
    }

    public Model getModel(@PathVariable Long modelId) {
        return modelRepository.findById(modelId).orElse(null);
    }

    public List<Model> getModelByBrand(@PathVariable String brand) {
        return modelRepository.findByBrand(brand);
    }
}
