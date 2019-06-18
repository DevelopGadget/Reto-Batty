namespace DemoNetFirebase.Models
{
    public class Hero_Repository : IHero
    {

    }

    public interface IHero
    {
        Task<IEnumerable<Hero>> Get();
        Task<Hero> Get(string _id);
        Task<Hero> Post(Hero hero);
        Task<Hero> Put(string _id, Hero hero);
        Task<Hero> Delete(string _id);
    }
}