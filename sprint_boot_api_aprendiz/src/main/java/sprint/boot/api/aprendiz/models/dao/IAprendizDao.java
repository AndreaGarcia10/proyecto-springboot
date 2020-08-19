package sprint.boot.api.aprendiz.models.dao;

import org.springframework.data.repository.CrudRepository;

import sprint.boot.api.aprendiz.entity.Aprendiz;

public interface IAprendizDao extends CrudRepository<Aprendiz,Long> {

}
