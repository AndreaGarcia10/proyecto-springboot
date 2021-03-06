package sprint.boot.api.aprendiz.services;

import java.util.List;

import sprint.boot.api.aprendiz.entity.Aprendiz;

public interface IAprendizService {
	
	public List<Aprendiz> findAll();

	public Aprendiz save(Aprendiz aprendiz);
	
	public Aprendiz findById(Long id);
	
	public void delete(Long id);
}
