package br.com.theoldpinkeye.intenttests;

import android.content.Intent;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.appcompat.widget.Toolbar;

public class DisplayMessageActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_display_message);

    // Captura o intent vindo da outra activity e extrai conteúdo extra
    Intent intent = getIntent();
    String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

    // Captura o TextView e joga  texto vindo do intent
    TextView textView = findViewById(R.id.textView);
    textView.setText(message);

    // Configurrando a Toolbar definida no Arquivo de Layout
    Toolbar myChildToolbar =
        findViewById(R.id.display_message_toolbar);
    setSupportActionBar(myChildToolbar);

    // Adquite uma supportActionBar compatível com nossa toolbar
    ActionBar ab = getSupportActionBar();

    // Ativa o botão voltar
    ab.setDisplayHomeAsUpEnabled(true);



  }
}
