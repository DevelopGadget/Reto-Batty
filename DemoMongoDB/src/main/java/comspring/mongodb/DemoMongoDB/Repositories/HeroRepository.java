package comspring.mongodb.DemoMongoDB.Repositories;

import comspring.mongodb.DemoMongoDB.Models.Hero;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * EquipoRepository
 */
public interface HeroRepository extends MongoRepository<Hero, String>{}