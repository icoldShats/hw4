class ChatAdapterDemo {
    public static void main(String[] args) {
        LegacyChatService oldChat = new LegacyChatService();
        ChatService chatAdapter = new ChatServiceAdapter(oldChat);

        chatAdapter.sendMessage("Hello world!");
    }
}