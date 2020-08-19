package sprint.boot.api.aprendiz.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import sprint.boot.api.aprendiz.entity.Aprendiz;
import sprint.boot.api.aprendiz.services.IAprendizService;

@RestController
@RequestMapping("/api")
public class AprendizController {
	
	@Autowired
	private IAprendizService service;
	
	
	
	@GetMapping("/aprendices")
	public List<Aprendiz> index(){
		return service.findAll();
	}

	@PostMapping("/aprendices")
	@ResponseStatus(HttpStatus.CREATED)
	public Aprendiz create(@RequestBody Aprendiz aprendiz) {
		aprendiz.setCreate_at(new Date());
		return service.save(aprendiz);
	}
	@PostMapping("/aprendices/{id}")
	public Aprendiz show(@PathVariable Long id) {
		 	return service.findById(id);
	}
	
	@DeleteMapping("/aprendices/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
	 	 service.delete(id);
	}
	
	@PutMapping("/aprendices/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Aprendiz update(@PathVariable Long id,@RequestBody Aprendiz aprendiz) {
		Aprendiz apActual= service.findById(id);
		apActual.setNombre(aprendiz.getNombre());
		apActual.setApellido(aprendiz.getApellido());
		apActual.setEmail(aprendiz.getEmail());
		return service.save(apActual);
	}
	
}
