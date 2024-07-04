import java.util.LinkedList;
import java.util.List;

public class User {
    public String name;
    public int age;
    public List<String> interests;
    public List<User> friends;

    public User (String name, int age, List<String> interests){
        this.name = name;
        this.age = age;
        this.interests = interests;
        this.friends = new LinkedList<>();

    }
    public User (String name, int age){
        this(name, age, new LinkedList<>());
    }
    public User (String name){
        this(name, 0, new LinkedList<>());
    }
    public User (){
        this("", 0, new LinkedList<>());
    }
        

    public void addFriend(User friend){
        if (!friends.contains(friend)) {
            friends.add(friend);
            friend.addFriend(this);
        }

    }

    public List<User> getFriends(){
        return friends;
    }
    public String getName() {
        return name;
    }
    
    public List<String> getInterests() {
        return interests;
    }
    @Override
    public String toString() {
        return name;
    }
    
}
