package com.example.my_profile;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class second extends AppCompatActivity{
    Button github,lnk,bl;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        github=findViewById(R.id.github);
        lnk=findViewById(R.id.bl);
        bl=findViewById(R.id.bl);
        github.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goLink("https://github.com/ravindrahvasudeva");
            }
        });

        bl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goLink("http://surl.li/dlbtn");
            }
        });

        lnk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 goLink("https://www.linkedin.com/in/ravindrahv/");
         }
                              }



        );
    }


    private void goLink(String s) {
        Uri uri =Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}
