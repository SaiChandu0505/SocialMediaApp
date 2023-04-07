package SOCIAL.MEDIA.MANAGING.SYSTEM.demoSOCIAL.MEDIA.MANAGING.SYSTEM;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class Controller {
    @Autowired
    Service userService;

   // import org.springframework.web.bind.annotation.*;

  //  @RestController

    //public class UserController {



        @PostMapping("/create")
        public ResponseEntity createUser(@RequestBody User user) {
            userService.createUser(user);
            return new ResponseEntity<>("created", HttpStatus.CREATED);
        }

        @PostMapping("/{userId}/posts")
        public ResponseEntity addPost(@PathVariable int userId, @RequestBody Post post) {
            userService.addPost(userId, post);
            return  new ResponseEntity<>("added",HttpStatus.CREATED);

        }

        @PutMapping("/{userId}/posts/{postId}/like")
        public void likePost(@PathVariable int userId, @PathVariable int postId) {
            userService.likePost(userId, postId);
        }

        @PostMapping("/{userId}/notifications")
        public void sendNotification(@PathVariable int userId, @RequestBody Notification notification) {
            userService.sendNotification(userId, notification);
        }

        @GetMapping("/{userId}/notifications/most")
        public Notification findMostNotification(@PathVariable int userId) {
            return userService.findMostNotification(userId);
        }
    }

