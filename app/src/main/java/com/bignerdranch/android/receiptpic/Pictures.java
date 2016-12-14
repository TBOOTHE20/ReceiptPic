package com.bignerdranch.android.receiptpic;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.io.File;

/**
 * Created by Talli on 12/11/2016.
 */
public class Pictures extends Activity {

    Button button;
    ImageView imageview;
    static final int CAM_REQUEST = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_picture);
        button = (Button)findViewById(R.id.button);
        imageview = (ImageView)findViewById(R.id.imageView);
        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
            Intent camera_intent = new Intent (MediaStore.ACTION_IMAGE_CAPTURE);
                File file = getFile();
                camera_intent.putExtra(MediaStore.EXTRA_OUTPUT, Uri.fromFile(file));
                startActivityForResult(camera_intent,CAM_REQUEST);


            }
        });
    }

    private File getFile()
    {
        File folder = new File("sdcard/receiptpic_app");
        if (!folder.exists())
        {
            folder.mkdir();

        }
        File image_file= new File(folder,"person_image.jpeg");
        return image_file;
    }
        @Override
        protected void onActivityResult(int requestCode, int resultCode, Intent data)
        {
            String path = "sdcard/camera_app/_image.jpg";
            imageview.setImageDrawable(Drawable.createFromPath(path));
        }
}
