using Microsoft.Extensions.Configuration;

namespace DemoNetFirebase.Models {
    public class Settings {

        public string AppSecret { get; set; }
        public string Url { get; set; }
        public IConfigurationRoot configuration { get; set; }

    }
}