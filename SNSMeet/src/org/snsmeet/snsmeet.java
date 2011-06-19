package org.snsmeet;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.view.*;
import android.view.View.OnClickListener;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class snsmeet extends Activity implements OnClickListener
{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
    	super.onCreate(savedInstanceState);
        setContentView(R.layout.snsmeet);
        //Button aboutbutton=(Button)findViewById(R.id.about_button);
        View aboutbutton=findViewById(R.id.about_button);
        aboutbutton.setOnClickListener(this);
        View nfcbutton=findViewById(R.id.nfc_connect);
        nfcbutton.setOnClickListener(this);
        View qrcodebutton=findViewById(R.id.qrcode_connect);
        qrcodebutton.setOnClickListener(this);
    }
    public void onClick(View v)
    {
    	Intent i;
        switch(v.getId())
        {
            case R.id.about_button:
                i=new Intent(this,about.class);
                startActivity(i);
                break;
            case R.id.nfc_connect:
            	i=new Intent(this,nfc.class);
            	startActivity(i);
            	break;
            case R.id.qrcode_connect:
            	i=new Intent(this,qrcode.class);
            	startActivity(i);
            	break;
        }
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
    	super.onCreateOptionsMenu(menu);
    	MenuInflater inflater=getMenuInflater();
    	inflater.inflate(R.menu.menu,menu);
    	return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
    	switch(item.getItemId())
    	{
    	case R.id.account:
    		startActivity(new Intent(this,account.class));
    		return true;
    	case R.id.setting:
    		startActivity(new Intent(this,setting.class));
    		return true;
    	case R.id.info:
    		startActivity(new Intent(this,info.class));
    		return true;
    	}
    	return false;
    }
}