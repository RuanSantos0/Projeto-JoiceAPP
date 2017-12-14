package com.company.productname;

import android.graphics.PixelFormat;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

import com.unity3d.player.UnityPlayer;

/**
 * Created by Ruan on 20/09/2017.
 */

public class MainGame extends UnityPlayerActivity {

    private Button butao;

    @Override
 protected void onCreate (final Bundle savedInstanceState){
     super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        butao = (Button) findViewById(R.id.btnTest);

        butao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

               // mUnityPlayer = new UnityPlayer(this);
                setContentView(mUnityPlayer);
                mUnityPlayer.requestFocus();

               // UnityPlayerActivity unit = new UnityPlayerActivity();
               // unit.onCreate(savedInstanceState);
            }
        });


 }

}
