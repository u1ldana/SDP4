package task6;

public class Main {

    public static void main(String[] args) {

        ChatMediator chatRoom = new ChatRoom();

        User user1 = new ChatUser(chatRoom, "Uldana");
        User user2 = new ChatUser(chatRoom, "Adema");
        User user3 = new ChatUser(chatRoom, "Nuray");
        User user4 = new ChatUser(chatRoom, "Zhanel");

        chatRoom.addUser(user1);
        chatRoom.addUser(user2);
        chatRoom.addUser(user3);
        chatRoom.addUser(user4);

        user1.send("Hello everyone!");
        user3.send("Hi Uldana!");
    }
}
