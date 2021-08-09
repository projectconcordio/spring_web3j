package com.example.demo.digasset;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping (path="api/v1/nftexchange")
public class DigAssetController {

    private final DigAssetService digAssetService;

    @Autowired
    public DigAssetController(DigAssetService digAssetService) {

        this.digAssetService = digAssetService;
    }

    @GetMapping ("/show_assets")// REST GET
    public List<DigAsset> show_assets() {
        System.out.println("------ XAC : GET SHOW_ASSETS -----");
        // return studentService.getStudents();
        return digAssetService.get();

    }
    @GetMapping // REST GET
    public List<DigAsset> get_default() {

        // return studentService.getStudents();
        System.out.println("------ XAC : DEFAULT GET calls get_default() -----");
        return digAssetService.get();

    }

    @PutMapping
    public void put_default() {

        // return studentService.getStudents();
        System.out.println("------ XAC : DEFAULT PUT put_default() -----");

    }


    @PostMapping
    public void post_default() {

        // return studentService.getStudents();
        System.out.println("------ XAC : DEFAULT POST post_default() -----");

    }

    @PutMapping ("/buybod")// REST PUT
    public void buybod (@RequestBody DigAsset digAsset) {
        // return studentService.getStudents();
        System.out.println("------ XAC : PUT BUY body-----");
        System.out.println("digAsset.id = " + digAsset.getId());
        digAssetService.set(digAsset);
    }

    @PutMapping ("/buy")// REST PUT
    public void buy() {
        // ERC-721 safeTransferFrom(from, to, tokenId)
        // return studentService.getStudents();
        System.out.println("------ XAC : PUT BUY no body-----");


    }
    @PutMapping ("/accept")// REST PUT
    public void accept(@RequestBody DigAsset digAsset) {
        // ERC-721 approve(to, tokenId)
        // return studentService.getStudents();
        System.out.println("------ XAC : PUT ACCEPT -----");
        digAssetService.set(digAsset);

    }


    @PostMapping ("/add_asset") // REST POST http://localhost:8080/api/v1/student hopefully!
    public void registerNewAsset(@RequestBody DigAsset digAsset) {

        digAssetService.addNewStudent(digAsset);
    }

}

