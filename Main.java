public class Main {
    public static void main(String[] args) {
        ConfigurationManager config = ConfigurationManager.getInstance();
        config.printAllConfigs();

        System.out.println("Max Players: " + config.getConfig("maxPlayers"));

        LegacyChatService legacyChat = new LegacyChatService();
        ChatService chatService = new ChatServiceAdapter(legacyChat);

        chatService.sendMessage("Hello world!");
    }
}

