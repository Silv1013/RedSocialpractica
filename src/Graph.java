import java.util.ArrayList;
import java.util.List;

public class Graph {
    private List<User> users;

    public Graph(){
        this.users = new ArrayList<>();
    }

    //Metodo para agregar un nodo
    public User addUser(User user){
        users.add(user);
        return user;
    }
    
    public List<User> getUsers() {
        return users;
    }

    //Metodo para agregar una arista // un pana
    public void addConnection(User user1, User user2){
        user1.addFriend(user2);
       // user2.addFriend(user1);
    }
    public List<User> getFriends(User user){



        return user.getFriends();

    }

    
    public List<User> recommendFriends(User user){


        return new ArrayList<>();
    }
    
}
