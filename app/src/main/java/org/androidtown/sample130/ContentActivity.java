package org.androidtown.sample130;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class ContentActivity extends AppCompatActivity {

    String fromwhere;
    Intent getIntent;
    
    //Editing Test

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getIntent = getIntent();
        String name = getIntent.getExtras().getString("loading code");

        setContentView(R.layout.activity_content);

        TextView logoName_textview = (TextView) findViewById(R.id.mainlist_logo_name);


        TextView detail_texttview = (TextView) findViewById(R.id.detail_textview);
        Button questionBtn_button = (Button) findViewById(R.id.questionBtn_content);

        logoName_textview.setText(name);

        //----------------------------고대가요---------------------------------------------

        if (name.equals("공무도하가")) {
            mySetText(R.string.공무도하가_main, R.string.공무도하가_author, R.string.공무도하가_genre, R.string.공무도하가_epoch, R.string.공무도하가_topic, R.string.공무도하가_characteristic);
        }

        //----------------------------------------------------------------------

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_content, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void OnClickBackBtn(View v) {

        getIntent = getIntent();
        fromwhere = getIntent.getExtras().getString("from where");

        if(fromwhere.equals("Mainlist")) {
            Intent intent = new Intent(getApplicationContext(), Mainlist.class);
            startActivity(intent);
            finish();
        } else if (fromwhere.equals("Mylist")){
            Intent intent = new Intent(getApplicationContext(), Mylist.class);
            startActivity(intent);
            finish();
        }
    }

    private void mySetText(int main, int author, int genre, int epoch, int topic, int characteristic) {

        TextView main_textview = (TextView) findViewById(R.id.main_content);
        TextView author_textview = (TextView) findViewById(R.id.author_content);
        TextView genre_textview = (TextView) findViewById(R.id.genre_content);
        TextView epoch_textview = (TextView) findViewById(R.id.epoch_content);
        TextView topic_textview = (TextView) findViewById(R.id.topic_content);
        TextView characteristic_textview = (TextView) findViewById(R.id.characteristic_content);
        TextView detail_textview = (TextView)findViewById(R.id.detail_textview);

        main_textview.setText(main);
        author_textview.setText(author);
        genre_textview.setText(genre);
        epoch_textview.setText(epoch);
        topic_textview.setText(topic);
        characteristic_textview.setText(characteristic);

        Typeface NanumGothic = Typeface.createFromAsset(getAssets(), "fonts/NanumBarunGothic.ttf");

        main_textview.setTypeface(NanumGothic);
        author_textview.setTypeface(NanumGothic);
        genre_textview.setTypeface(NanumGothic);
        epoch_textview.setTypeface(NanumGothic);
        topic_textview.setTypeface(NanumGothic);
        characteristic_textview.setTypeface(NanumGothic);


    }

    private void mySetText(int main, int author, int genre, int epoch, int topic, int characteristic, int detail) {

        TextView main_textview = (TextView) findViewById(R.id.main_content);
        TextView author_textview = (TextView) findViewById(R.id.author_content);
        TextView genre_textview = (TextView) findViewById(R.id.genre_content);
        TextView epoch_textview = (TextView) findViewById(R.id.epoch_content);
        TextView topic_textview = (TextView) findViewById(R.id.topic_content);
        TextView characteristic_textview = (TextView) findViewById(R.id.characteristic_content);
        TextView detail_textview = (TextView)findViewById(R.id.detail_textview);

        main_textview.setText(main);
        author_textview.setText(author);
        genre_textview.setText(genre);
        epoch_textview.setText(epoch);
        topic_textview.setText(topic);
        characteristic_textview.setText(characteristic);
        detail_textview.setText(detail);

        Typeface NanumGothic = Typeface.createFromAsset(getAssets(), "fonts/NanumBarunGothic.ttf");

        main_textview.setTypeface(NanumGothic);
        author_textview.setTypeface(NanumGothic);
        genre_textview.setTypeface(NanumGothic);
        epoch_textview.setTypeface(NanumGothic);
        topic_textview.setTypeface(NanumGothic);
        characteristic_textview.setTypeface(NanumGothic);
        detail_textview.setTypeface(NanumGothic);


    }
}
