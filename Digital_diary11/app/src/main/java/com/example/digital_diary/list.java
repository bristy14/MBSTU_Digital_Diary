package com.example.digital_diary;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.ContentProviderOperation;
import android.content.Context;
import android.content.Intent;
import android.content.OperationApplicationException;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.RemoteException;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class list extends AppCompatActivity {
    TextView textViewName,textViewPosition,textViewNumber,textViewmail;

    public static void clear() {
    }

    public static void add(stu item) {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

         textViewName = findViewById(R.id.textview1_id);
        textViewPosition = findViewById(R.id.textview2_id);
         textViewNumber = findViewById(R.id.textview3_id);
        textViewmail = findViewById(R.id.textview4_id);

        Intent intent = getIntent();
        String selectedData = intent.getStringExtra("selectedData");

        // Extract individual values from the selectedData string
        String[] dataElements = selectedData.split("\n\t\t\t");
        String name = dataElements[1];
        String position = dataElements[2];
         String number = dataElements[3];
        final String mail=dataElements[4];

        // Display the extracted data in the TextViews
        textViewName.setText(name);
        textViewPosition.setText(position);
        textViewNumber.setText(number);
        textViewmail.setText(mail);

        ActivityCompat.requestPermissions(this,new String[]{Manifest.permission.WRITE_CONTACTS},
                PackageManager.PERMISSION_GRANTED);


        Button copyButton = findViewById(R.id.copyButton);
        copyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Copy the number to clipboard when the button is clicked
                ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("Number", number);
                clipboard.setPrimaryClip(clip);
                Toast.makeText(getApplicationContext(), "Number copied to clipboard", Toast.LENGTH_SHORT).show();
            }
        });

    }
    public void buttonadd(View view)
    {
        Intent intent = getIntent();
        String selectedData = intent.getStringExtra("selectedData");

        // Extract individual values from the selectedData string
        String[] dataElements = selectedData.split("\n\t\t\t");
        String name = dataElements[1];
        String position = dataElements[2];
        String number = dataElements[3];
        final String mail=dataElements[4];

        ArrayList<ContentProviderOperation>contentProviderOperations=
                new ArrayList<ContentProviderOperation>();
        contentProviderOperations.add(ContentProviderOperation.newInsert(ContactsContract.RawContacts.CONTENT_URI).withValue(ContactsContract.RawContacts.ACCOUNT_TYPE,null)
                .withValue(ContactsContract.RawContacts.ACCOUNT_NAME,null)
                .build());
        //add name
        contentProviderOperations.add(ContentProviderOperation
                .newInsert(ContactsContract.Data.CONTENT_URI)
                .withValueBackReference(ContactsContract.Data.RAW_CONTACT_ID,0)
                .withValue(ContactsContract.Data.MIMETYPE,
                        ContactsContract.CommonDataKinds.StructuredName.CONTENT_ITEM_TYPE)
                .withValue(ContactsContract.CommonDataKinds.StructuredName.DISPLAY_NAME,textViewName.getText().toString())
                .build());
        //add number
        contentProviderOperations.add(ContentProviderOperation
                .newInsert(ContactsContract.Data.CONTENT_URI)
                .withValueBackReference(ContactsContract.Data.RAW_CONTACT_ID,0)
                .withValue(ContactsContract.Data.MIMETYPE,
                        ContactsContract.CommonDataKinds.Phone.CONTENT_ITEM_TYPE)
                .withValue(ContactsContract.CommonDataKinds.Phone.NUMBER,textViewNumber.getText().toString())
                .build());

        try {
            getContentResolver().applyBatch(ContactsContract.AUTHORITY,contentProviderOperations);
        } catch (OperationApplicationException e) {
            throw new RuntimeException(e);
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
        Toast.makeText(getApplicationContext(), "Added to Contact", Toast.LENGTH_SHORT).show();


    }

}
