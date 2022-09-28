package com.example.vehiclebackend.service;

import com.example.vehiclebackend.entity.Model;
import com.example.vehiclebackend.repository.ModelRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class ModelService {

    private final ModelRepository modelRepository;

    public ModelService(ModelRepository modelRepository) {
        this.modelRepository = modelRepository;
    }

    public List<Model> getAllModels() {
        return modelRepository.findAll();
    }


    public Model saveModel( Model model) {
        return modelRepository.save(model);
    }

    public Model getModel(@PathVariable Long modelId) {
        return modelRepository.findById(modelId).orElse(null);
    }

    public List<Model> getModelByBrand( String brand) {
        return modelRepository.findByBrand(brand);
    }

    public void deleteModelById(Long modelId) {
        try {
            modelRepository.deleteById(modelId);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
