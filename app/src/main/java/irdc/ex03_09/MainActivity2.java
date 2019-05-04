package irdc.ex03_09;
import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mylayout);

        Button b2 = (Button)findViewById(R.id.button2);
        b2.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity2.this, MainActivity.class);
                startActivity(intent);
                MainActivity2.this.finish();
        }
    });
    }
}
