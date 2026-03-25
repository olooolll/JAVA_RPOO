package Simulado1;
import Simulado1.Post;
import java.util.ArrayList;



public class UserAccount{

    private int MAX_POSTS = 10;
    private String email;
    private String userName;
    private Post[] post = new Post[MAX_POSTS];
    private ArrayList<UserAccount> follower= new ArrayList<UserAccount>();
    private int pointer = 0;

    public UserAccount(String email, String userName){
        this.email = email;
        this.userName = userName;

    }

    public String getUserName(){
        return this.userName;
    };

    private String getEmail(){
        return this.email;
    };

    public void publish(String quote){
        Post post = new Post(this, quote);
        this.updateTimeline(post);
        int size = this.follower.size();
        for(int i=0; i<size; i++){
            this.follower.get(i).updateTimeline(post);
        }
    }

    public boolean delete(int postidx){
        if(this.post[postidx] != null){
            this.post[postidx] = null;
            return true;
        }
        return false;
    }

    public String showTimeline(){
        String posts = "";
        for(int i=0; i<MAX_POSTS; i++){
            if(this.post[i] != null) {
                posts += this.post[i].show() + "\n";
            }
        }

        return posts;
    }

    public String showMyPosts(){
        String posts = "";
        for(int i=0; i<MAX_POSTS; i++){
            if(this.post[i] != null) {
                posts += (this.post[i].getAccount() == this) ? this.post[i].show() + "\n" : "";
            }
        }

        return posts;
    }

    public String showMyFriends(){
        String followers = "";
        int size = this.follower.size();

        for(int i=0; i<size; i++){
            followers += "User: " + this.follower.get(i).getUserName() + " | E-mail: " + this.follower.get(i).getEmail() + "\n";
        }

        return followers;
    }

    public void clapPost(int postIdx){
        if(this.post[postIdx] != null) {
            this.post[postIdx].clap();
        }
    }

    public void booPost(int postIdx){
        if(this.post[postIdx] != null) {
            this.post[postIdx].boo();
        }
    }

    private void updateTimeline(Post newPost){
        this.post[pointer] = newPost;
        pointer = (pointer == 9) ? 0 : (pointer += 1);
    }

    public void acceptFollower(UserAccount newFollower){
        this.follower.add(newFollower);
    }

    public void blockFollower(UserAccount Follower){
        this.follower.remove(Follower);
    }
}