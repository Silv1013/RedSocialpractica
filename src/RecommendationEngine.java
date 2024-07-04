import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RecommendationEngine {
    public List<User> recommendFriends(User user, Graph graph){
        List<User> recommendations = new ArrayList<>();
        for(User potentialFriend : graph.getUsers()){
          if(!user.getFriends().contains(potentialFriend) && !user.equals(potentialFriend)){
            double similarity = calculateSimilarity(user, potentialFriend);
            if(similarity > 0.3){
                recommendations.add(potentialFriend);
            }

          }


        }
        return recommendations;
    }

    private double calculateSimilarity(User user1, User user2) {
        Set<String> interests1 = new HashSet<>(user1.getInterests());
        Set<String> interests2 = new HashSet<>(user2.getInterests());
        
        
        Set<String> intersection = new HashSet<>(interests1);

        intersection.retainAll(interests2);

        Set<String> union = new HashSet<>(interests1);
        union.addAll(interests2);

        double resp = (double) intersection.size() / union.size();
        System.out.println("Valor - " + resp);

        return resp;
      
    }
    
}
