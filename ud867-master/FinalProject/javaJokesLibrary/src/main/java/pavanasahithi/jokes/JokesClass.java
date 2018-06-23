package pavanasahithi.jokes;

import java.util.List;
import java.util.Random;

import static java.util.Arrays.asList;

public class JokesClass {
    List<String> jokes=asList("Santa falls in luv with a nurse... After much thinking, he finally writes\n" +
            "a love letter to her: \"I luv u sister.\"","Q: Why dogs don't marry?\n" +
            "A: Because they are already leading a dog's life!","Pappu, " +
            "while filling up a form: Dad, what should I write against mother tongue.?\n" +
            "Santa: Very long!","If every child starts swapping their Daddy-Mummy mobile . " +
            "Soon we will become the country with the highest divorce rate!\n",
            "Girlfriend: My birthday is tomorrow, what gift will you give me?\nBoyfriend: Ring \n" +
            "GF: O really...Sweetheart!\n" +
            "BF: I will give you a Ring but do not accept my call tomorrow,\n" +
            "my mobile balace is very low sweetheart.","Girlfriend: Darling Give me your Diamond Ring.\n" +
            "Boyfriend: Why honey?\n" +
            "Gf: I'm going to miss you see it everyday.\n" +
            "Bf: You would remember me anyway.\n" +
            "Girlfriend: How's that?\n" +
            "Bf: thinking that I had not given you that precious ring.","Manager: What is your qualification? \n" +
            "Pappu: I'm Ph.D.\n Manager: What do you mean by Ph.D.? \nPappu: Passed high school with difficulty.",
            "Interviewer: What is a skeleton?\n Sardar: Sir, skeleton is a person who started dieting, but forgot to stop it.",
            "Wife: whenever we keep the money in the bags our son steals it, I don’t know what to do? \n" +
                    "Husband: Keep it in his books. I know he will never touch them!",
            "Seriously first time in Indian history. Latest funny event occurred Friends, Petrol is cheaper then Onions in India!");
    public String getJoke(){
        Random random=new Random();
        String jokeString=jokes.get(random.nextInt(jokes.size()));
        return jokeString;
    }
}
