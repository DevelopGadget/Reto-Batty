package comspring.mongodb.DemoMongoDB.Repositories;

import comspring.mongodb.DemoMongoDB.Models.Equipo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * EquipoRepository
 */
public interface EquipoRepository extends MongoRepository<Equipo, String>{

    List<Equipo> findBy_id(String _id);

    @Override
    default List<Equipo> findAll() {
        return null;
    }

    @Override
    default <S extends Equipo> S save(S arg0) {
        return null;
    }

}