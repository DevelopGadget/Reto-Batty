using Microsoft.Extensions.Configuration;
using Microsoft.Extensions.Options;

namespace DemoNetFirebase.Models {
    public class ObjectContext {
        public IConfiguration Configuration { get; set; }

        public ObjectContext (IOptions<Settings> Setting) {
            Configuration = Setting.Value.configuration;
            Setting.Value.ConectionString = Configuration["ConectionMlab"].ToString ();
            Setting.Value.Database = Configuration["Database"].ToString ();
        }
    }
}