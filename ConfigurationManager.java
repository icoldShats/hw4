class ConfigurationManager {
    private static ConfigurationManager instance;
    private final java.util.Map<String, String> config;

    private ConfigurationManager() {
        config = new java.util.HashMap<>();
        config.put("maxPlayers", "100");
        config.put("defaultLanguage", "en");
        config.put("gameDifficulty", "medium");
    }

    public static ConfigurationManager getInstance() {
        if (instance == null) {
            instance = new ConfigurationManager();
        }
        return instance;
    }

    public String getConfig(String key) {
        return config.get(key);
    }

    public void printAllConfigs() {
        for (String key : config.keySet()) {
            System.out.println(key + " -> " + config.get(key));
        }
    }
}
