import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
       
        Graph graph = new Graph();
        RecommendationEngine recomendacion = new RecommendationEngine();

        // Crear usuarios
        User user1 = new User("Alice", 30, Arrays.asList("Music", "Art"));
        User user2 = new User("Bob", 25, Arrays.asList("Music", "Sports"));
        User user3 = new User("Charlie", 35, Arrays.asList("Art", "Movies"));
        User user4 = new User("Dave", 40, Arrays.asList("Sports", "Travel"));
        User user5 = new User("Eve", 28, Arrays.asList("Music", "Movies"));

      
        // Añadir nodos al grafo
        graph.addUser(user1);
        graph.addUser(user2);
        graph.addUser(user3);
        graph.addUser(user4);
        graph.addUser(user5);

        // Añadir conexiones
        graph.addConnection(user1, user2);
        graph.addConnection(user1, user3);
        graph.addConnection(user2, user4);
        graph.addConnection(user2, user3);
        graph.addConnection(user3, user5);

        
        
        
        
        System.out.println("Friends of Alice: " + user1.getFriends());
        System.out.println("Friends of Bob: " + user2.getFriends());
        System.out.println("Friends of Charlie: " + user3.getFriends());
        System.out.println("Friends of Dave: " + user4.getFriends());
        System.out.println("Friends of Eve: " + user5.getFriends());
        
        
        List<User> recommendations = recomendacion.recommendFriends(user1, graph);
        System.out.println("Friends recommendations for " + user1 + ": " + recommendations);
        
   
    }
}
