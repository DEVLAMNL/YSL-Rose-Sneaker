package springboot.thi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import springboot.thi.entity.product;
import springboot.thi.repo.productRepo;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/rest/product")
@CrossOrigin("*")
public class productController {

    @Autowired
    private productRepo productRepo;

    @GetMapping("/getAll")
    public List<product> getAll() {
        return productRepo.findAll();
    }

    @PostMapping("/add")
    public product addproduct(@RequestBody product newProduct) {
        return productRepo.save(newProduct);
    }

    @GetMapping("/{id}")
    public ResponseEntity<product> getProductById(@PathVariable int id) {
        Optional<product> productOptional = productRepo.findById(id);
        if (productOptional.isPresent()) {
            product product = productOptional.get();
            return ResponseEntity.ok().body(product);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<product> updateProduct(@PathVariable("id") int id, @RequestBody product updateProduct) {
        product product = productRepo.save(updateProduct);
        if (product != null) {
            return new ResponseEntity<>(product, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(product, HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") Integer id) {
        productRepo.deleteById(id);
    }

    @GetMapping("/search/{ten}")
    public List<product> searchName(@PathVariable("ten") String ten){
        if (ten != null){
            return productRepo.searchName(ten);
        }else{
            return productRepo.findAll();
        }
    }
}
