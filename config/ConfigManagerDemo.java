package config;

class ConfigManagerDemo {
    public static void main(String[] args) {
        ConfigurationManager config = ConfigurationManager.getInstance();

        config.printAllConfigs();
        System.out.println("maxPlayers: " + config.getConfig("maxPlayers"));
    }
}
