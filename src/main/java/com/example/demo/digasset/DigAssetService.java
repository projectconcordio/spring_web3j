package com.example.demo.digasset;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DigAssetService {

    private final DigAssetRepository studentRepository;

    @Autowired // StudentRepository

    public DigAssetService(DigAssetRepository digAssetRepository) {

        this.studentRepository = digAssetRepository;
    }

    public void set(DigAsset digAsset) {

        studentRepository.save(digAsset);

    }

    public List<DigAsset> get() {

        return studentRepository.findAll();
    }


    public List<DigAsset> getStudents() {

        return studentRepository.findAll();
    }

    public void addNewStudent(DigAsset digAsset) {
        System.out.println("Adding new asset");
        digAsset.print();
        studentRepository.save(digAsset); // 1h12m30s
    }

}
