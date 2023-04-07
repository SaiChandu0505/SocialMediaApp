package SOCIAL.MEDIA.MANAGING.SYSTEM.demoSOCIAL.MEDIA.MANAGING.SYSTEM;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoSocialMediaManagingSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoSocialMediaManagingSystemApplication.class, args);
	}

}
//Create a social media platform
//
//User = UserId, Name, Age, List<Post>, List<Notification>
//
//Post = Content, Time, User, Like;
//
//Notification = Post, Time
//
//
//
//Description: A user will create a post and will receive notification wrt the post (for likes).
//
//
//
//POST API - Add a User
//
//POST API - Add a Post under user given
//
//
//
//1.PUT API - Like a given post
//
//2.POST API - Send a notification each time a post is liked.
//
//3.GET API - Find the most number of notifications received by a user
