package SOCIAL.MEDIA.MANAGING.SYSTEM.demoSOCIAL.MEDIA.MANAGING.SYSTEM;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import org.springframework.stereotype.Service;
@Service
public class Service {
    @Autowired
    Repository repository;



    public String createUser(User user){
        return repository.createUser(user);
    }

        public String  addPost(int userId, Post post) {
           return repository.addPost(userId,post);
        }

        public void likePost(int userId, int postId) {
            repository.likePost(userId,postId);
            }



        public void sendNotification(int userId, Notification notification) {
            repository.sendNotification(userId,notification);
        }


    public Notification findMostNotification(int userId) {
    return repository.findMostNotification(userId);
    }
}