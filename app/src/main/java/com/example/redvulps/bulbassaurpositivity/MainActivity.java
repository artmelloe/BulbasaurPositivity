package com.example.redvulps.bulbassaurpositivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.media.MediaPlayer;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView textViewPhrase = (TextView) findViewById(R.id.textview_phrase);

        final MediaPlayer BulbasaurSound = MediaPlayer.create(this, R.raw.bulbasaur);

        Button buttonPokeball = (Button) findViewById(R.id.button_pokeball);

        final String[] arrayPhrase = {
                "Está tudo bem, até mesmo os céus choram as vezes.",
                "Duvide do que vem fácil, e não desista do que é difícil.",
                "Melhor do que ter uma grande beleza, é ter um grande coração.",
                "Alguns falam pra você ficar bem. Outros simplesmente te fazem ficar bem.",
                "Siga o seu coração, mas leve seu cérebro com você.",
                "O importante não é vencer todos os dias, mas lutar sempre.",
                "Maior que a tristeza de não haver vencido é a vergonha de não ter lutado!",
                "O medo de perder tira a vontade de ganhar.",
                "Não basta conquistar a sabedoria, é preciso usá-la.",
                "O primeiro pecado da humanidade foi a fé, a primeira virtude foi a dúvida.",
                "Se não existe vida fora da terra, então o universo é um grande desperdício de espaço.",
                "Um livro é a prova de que os homens são capazes de fazer magia.",
                "Em algum lugar, alguma coisa incrível está esperando para ser conhecida.",
                "O cérebro é como um músculo, quando pensamos bem, nos sentimos bem.",
                "Nós somos feitos de poeira das estrelas.",
                "Nós somos uma maneira do cosmos conhecer a si mesmo.",
                "Todo efeito inteligente tem em sua consequência também uma causa inteligente.",
                "Inteligência é a capacidade de se adaptar à mudança.",
                "A matemática é a única linguagem que temos em comum com a natureza.",
                "O paraíso é um conto de fadas para pessoas com medo do escuro.",
                "Pessoas quietas possuem mentes barulhentas.",
                "Não somos melhores do que o universo, somos parte dele.",
                "A coisa boa que a ciência tem é que é verdade quer você acredite quer não.",
                "Qualquer astrofísico não se sente pequeno olhando para o universo, nos sentimos grandes."
        };

        buttonPokeball.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BulbasaurSound.start();

                Random randomNumberGenerator = new Random();

                int randomPhrase = randomNumberGenerator.nextInt(24);

                textViewPhrase.setText(arrayPhrase[randomPhrase]);
            }
        });
    }
}
