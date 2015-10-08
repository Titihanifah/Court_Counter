package id.tik.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView tvScoreTeamA;
    private TextView tvScoreTeamB;
    private Button btn3A;
    private Button btn2A;
    private Button btnFreeA;
    private Button btn3B;
    private Button btn2B;
    private Button btnFreeB;
    private Button btnReset;
    private int scoreTeamA;
    private int scoreTeamB;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init()
    {
      tvScoreTeamA = (TextView) findViewById(R.id.tv_score_team_a);
      tvScoreTeamB = (TextView) findViewById(R.id.tv_score_team_b);
      btn3A = (Button) findViewById(R.id.btn_3A);
      btn2A = (Button) findViewById(R.id.btn_2A);
      btnFreeA = (Button) findViewById(R.id.btn_freeA);
      btn3B = (Button) findViewById(R.id.btn_3B);
      btn2B = (Button) findViewById(R.id.btn_2B);
      btnFreeB = (Button) findViewById(R.id.btn_freeB);
      scoreTeamA = scoreTeamB = 0;

    }
}
