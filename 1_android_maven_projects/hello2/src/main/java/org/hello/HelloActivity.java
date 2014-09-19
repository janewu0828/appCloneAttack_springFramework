package org.hello;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import org.joda.time.LocalTime;

public class HelloActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hello_layout);
    }

    @Override
    public void onStart() {
        super.onStart();
        TextView textView = (TextView) findViewById(R.id.text_view);
        textView.setText("Hello world!");

        LocalTime currentTime = new LocalTime();
        TextView textView2 = (TextView) findViewById(R.id.text_view2);
        textView2.setText("The current local time is: " + currentTime);

        // The following example illustrates how to search Google:
        // // The connection URL 
        // String url = "https://ajax.googleapis.com/ajax/" + 
        //     "services/search/web?v=1.0&q={query}";

        // // Create a new RestTemplate instance
        // RestTemplate restTemplate = new RestTemplate();

        // // Add the String message converter
        // restTemplate.getMessageConverters().add(new StringHttpMessageConverter());

        // // Make the HTTP GET request, marshaling the response to a String
        // String result = restTemplate.getForObject(url, String.class, "Android");

    }

}