package com.youngkevin.kevinandroidcv;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.VideoView;

import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Button button = findViewById(R.id.button3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SecondActivity.this,MainActivity.class);
                startActivities(new Intent[]{intent});

                YouTubePlayerView youTubePlayerView = findViewById(R.id.youtube_player_view);
                getLifecycle().addObserver(youTubePlayerView);

                youTubePlayerView.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
                    @Override
                    public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                        String videoId = "dQw4w9WgXcQ";
                        youTubePlayer.loadVideo(videoId, 0);
                    }
                });
            }


        });
    }
    public void onButtonClick(View view) {
        VideoView video_view = findViewById(R.id.youtube_player_view);
        if (video_view.getVisibility() == View.VISIBLE) {
            video_view.setVisibility(View.INVISIBLE);
        } else {
            video_view.setVisibility(View.VISIBLE);
        }
    }

}
