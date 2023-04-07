package SOCIAL.MEDIA.MANAGING.SYSTEM.demoSOCIAL.MEDIA.MANAGING.SYSTEM;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class Repository {
    private Map<Integer, User> usersdb = new HashMap<>();

    public String createUser(User user) {
        if(usersdb.containsKey(user.getUserId())) {
            return "user is already present";
        }
        usersdb.put(user.getUserId(), user);
        return "user added successfully";

}
public String addPost(int userId, Post post){
        User user = usersdb.get(userId);
    List<Post> posts= user.getPosts();
    if(posts.contains(post)){
        return " post is already added";
    }
    posts.add(post);
    return "post added successfully";
    }

    public void likePost(int useerId, int postId){
        User user= usersdb.get(useerId);
        List<Post> posts = user.getPosts();
        for(Post post: posts){
            if(post.getPostId() == postId){
            post.setLikes(post.getLikes() + 1);
            Notification notification = new Notification();
            notification.setPost(post);
            user.getNotifications().add(notification);
        }
    }

}
public void sendNotification(int userId, Notification notification){
        User user = usersdb.get(userId);
        user.getNotifications().add(notification);
    }
    public Notification findMostNotification(int userId) {
        User user = usersdb.get(userId);
        List<Notification> notifications = user.getNotifications();
        Notification mostNotification = null;
        int maxNotifications = 0;
        for (Notification notification : notifications) {
            int count = 0;
            for (Notification n : notifications) {
                if (n.getPost().equals(notification.getPost())) {
                    count++;
                }
            }
            if (count > maxNotifications) {
                mostNotification = notification;
                maxNotifications = count;
            }
        }
        return mostNotification;
    }
}


