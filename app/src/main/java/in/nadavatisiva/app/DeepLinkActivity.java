package in.nadavatisiva.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;


/**
 * Created by Siva on 09-12-2015.
 */
public class DeepLinkActivity extends Activity {
    TextView deepLinkUrl;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deep_link);

        deepLinkUrl = (TextView) findViewById(R.id.deep_link);
        Intent intent = getIntent();
        if (intent.getAction() != null) {
            String data = intent.getDataString();
            if (data != null) {
                String value = data.replace("http://", "").replace("example.in/hackString/", "");
                if (!value.equals("")) {
                    deepLinkUrl.setText(value);
                }
            }
        }
    }
}