
package comspring.mongodb.DemoMongoDB.Controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import comspring.mongodb.DemoMongoDB.Models.Hero;
import comspring.mongodb.DemoMongoDB.Repositories.HeroRepository;

/**
 * HeroController
 */
@RestController
@RequestMapping(value = "/Hero")
public class HeroController {

    @Autowired
    private HeroRepository HeroService;

    public HeroController(HeroRepository HeroService) {
        this.HeroService = HeroService;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<Hero> getAllHeros() {
        return HeroService.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Optional<Hero> getHero(@PathVariable("id") String id) {
        return HeroService.findById(id);
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public Hero postHero(@Valid @RequestBody Hero hero) {
        return HeroService.insert(hero);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public Hero putHero(@PathVariable("id") String id, @Valid @RequestBody Hero hero) {
        hero.set_id(id);
        return HeroService.save(hero);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void putHero(@PathVariable("id") String id) {
        HeroService.deleteById(id);
    }

}