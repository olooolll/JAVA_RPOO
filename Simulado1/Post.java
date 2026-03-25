package Simulado1;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import Simulado1.UserAccount;


public class Post{
    private String quoteText;
    private LocalDate date;
    private int claps = 0;
    private int boos = 0;
    private UserAccount account;

    public Post(UserAccount account, String quote){
        this.account = account;
        this.quoteText = quote;
        this.date = LocalDate.now();
    }

    private String getDateStr(){
        return this.date.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }

    private String getQuoteText(){
        return this.quoteText;
    }

    private String getClapsStr(){
        return Integer.toString(this.claps);
    }

    private String getBoosStr(){
        return Integer.toString(this.boos);
    }

    public UserAccount getAccount(){
        return this.account;
    }

    private String quote(){
      return "[ " +this.getDateStr()+ " ] " + this.account.getUserName() + " say " + "\""+ this.getQuoteText() + "\" | Claps: " + this.getClapsStr() + " | Boos: " + this.getBoosStr();
    };

    public String show(){
        return this.quote();
    }

    public void clap(){
        this.claps++;
    }

    public void boo(){
        this.boos++;
    }

}