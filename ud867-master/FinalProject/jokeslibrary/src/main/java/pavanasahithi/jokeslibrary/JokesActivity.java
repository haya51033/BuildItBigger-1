package pavanasahithi.jokeslibrary;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class JokesActivity extends AppCompatActivity {
    TextView joke_tv;
    public static final String KEY_JOKE="joke";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jokes);
        joke_tv=(TextView)findViewById(R.id.id_tv_joke);
        if(getIntent().getStringExtra("joke")!=null)
        {
            String myJoke=getIntent().getStringExtra(KEY_JOKE);
            joke_tv.setText(myJoke);
        }
    }
}
