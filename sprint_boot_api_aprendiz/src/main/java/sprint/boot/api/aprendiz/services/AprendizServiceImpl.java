package sprint.boot.api.aprendiz.services;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import sprint.boot.api.aprendiz.entity.Aprendiz;
import sprint.boot.api.aprendiz.models.dao.IAprendizDao;
@Service
public class AprendizServiceImpl implements IAprendizService {

	@Autowired
	private IAprendizDao dao;
	@Override
	@Transactional(readOnly=true)
	public List<Aprendiz> findAll() {
		// TODO Auto-generated method stub
		return (List<Aprendiz>)dao.findAll();
	}
	@Override
	public Aprendiz save(Aprendiz aprendiz) {
		// TODO Auto-generated method stub
		return  dao.save(aprendiz);
	}
	@Override
	public Aprendiz findById(Long id) {
		// TODO Auto-generated method stub
		return dao.findById(id).orElse(null);
	}
	
	@Override
	public void delete(Long id) {
		dao.deleteById(id);
		
	}

}
