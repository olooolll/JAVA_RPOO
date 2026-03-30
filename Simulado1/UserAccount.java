package Simulado1;
import Simulado1.Post;
import java.util.ArrayList;



public class UserAccount{

    private int MAX_POSTS = 10;
    private String email;
    private String userName;
    private Post[] post = new Post[MAX_POSTS];
    // TODO na prova você NÃO deve usar ArrayList, mas array, como acima. ArrayList é uma lista, não um array.
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
        this.updateTimeline(post); // TODO aqui você deve adicionar a sua lista de posts, não na sua timeline
        int size = this.follower.size();
        for(int i=0; i<size; i++){ // TODO pode fazer o inline aqui i < follower.size() / followers.length
            this.follower.get(i).updateTimeline(post); // TODO não precisa do this sempre, só quando o nome colide com algum nome de dentro do método ou parâmetro.
        }
    }

    public boolean delete(int postidx){
        if(this.post[postidx] != null){
            this.post[postidx] = null; // TODO melhor limpar o array, ao invés de deixá-lo todo esburacado de null.
            return true;
        }
        return false;
    }

    public String showTimeline(){
        String posts = "";
        for(int i=0; i<MAX_POSTS; i++){
            if(this.post[i] != null) {
                posts += this.post[i].show() + "\n"; // TODO você deve usar StringBuilder para evitar concatenação com + em loops
            }
        }

        return posts;
    }

    public String showMyPosts(){
        String posts = "";
        for(int i=0; i<MAX_POSTS; i++){
            if(this.post[i] != null) {
                // TODO idem aqui. Além disso, se tá no seu array de posts, é porque é seu.
                posts += (this.post[i].getAccount() == this) ? this.post[i].show() + "\n" : "";
            }
        }

        return posts;
    }

    public String showMyFriends(){
        String followers = "";
        int size = this.follower.size();

        for(int i=0; i<size; i++){
            // TODO idem
            followers += "User: " + this.follower.get(i).getUserName() + " | E-mail: " + this.follower.get(i).getEmail() + "\n";
        }

        return followers;
    }

    public void clapPost(int postIdx){
        if(this.post[postIdx] != null) { // TODO tem que ver inclusive se o índice existe
            this.post[postIdx].clap();
        }
    }

    public void booPost(int postIdx){
        if(this.post[postIdx] != null) { // TODO idem
            this.post[postIdx].boo();
        }
    }

    private void updateTimeline(Post newPost){
        this.post[pointer] = newPost;
        pointer = (pointer == 9) ? 0 : (pointer += 1); // TODO isso está errado. Olhe com cuidado para ver o porquê
    }

    public void acceptFollower(UserAccount newFollower){
        this.follower.add(newFollower);
    }

    public void blockFollower(UserAccount Follower){
        this.follower.remove(Follower);
    }
}