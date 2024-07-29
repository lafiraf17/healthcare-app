package com.example.healthcare;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;


public class DoctorDetailsActivity extends AppCompatActivity {
   private String[][]doctor_details1 =
           {
                   {"Doctor Name:Karthik","Hospital Address:kk Nagar","Rating:4.7*","Mobile No:7487862635","800"},
                   {"Doctor Name:Jeevaraj","Hospital Address:South Veli Street","Rating:4.4*","Mobile No:9724037588","900"},
                   {"Doctor Name:Lakshmana","Hospital Address:Pykara","Rating:4.3*","Mobile No:7383162199","700"},
                   {"Doctor Name:GV","Hospital Address:Kochadai","Rating:4.1*","Mobile No:7942677883","700"},
                   {"Doctor Name:Boobathi","Hospital Address:Usilampatti","Rating:3.9*","Mobile No:7947127271","600"}
           };
   private String[][]doctor_details2={
           {"Doctor Name:Nalan","Hospital Address:Madurai Bazaar","Rating:5*","Mobile No:8147050383","800"},
           {"Doctor Name:Adithya","Hospital Address:Othakadai","Rating:4.6*","Mobile No:8460445122","700"},
           {"Doctor Name:Nisha","Hospital Address:Villapuram","Rating:5*","Mobile No:7947470447","600"},
           {"Doctor Name:Jai","Hospital Address:K Pudhur","Rating:4.9*","Mobile No:7947428778","900"},
           {"Doctor Name:Mohana","Hospital Address:Narimedu","Rating:4.6*","Mobile No:9751655850","800"}
   };
    private String[][]doctor_details3={
            {"Doctor Name:Noor","Hospital Address:Narimedu","Rating:4.9*","Mobile No:8734814247","700"},
            {"Doctor Name:Rupa","Hospital Address:Chokkikulam","Rating:4.9*","Mobile No:8734814247","800"},
            {"Doctor Name:Xavier","Hospital Address:AnnaNagar","Rating:4.7*","Mobile No:8460477586","900"},
            {"Doctor Name:Luxe","Hospital Address:Iyer Bungalow","Rating:4.9*","Mobile No:8460526073","600"},
            {"Doctor Name:Sumathi","Hospital Address:OVR Compound","Rating:4.6*","Mobile No:7947429203","800"}
    };
    private String[][]doctor_details4={
            {"Doctor Name:Shenbagam","Hospital Address:Anna Nagar","Rating:4.3*","Mobile No:8460032687","800"},
            {"Doctor Name:Shameem","Hospital Address:Anna Nagar","Rating:4.3*","Mobile No:8220714253","900"},
            {"Doctor Name:Easvara","Hospital Address:Tallakulam","Rating:4.8*","Mobile No:7411829378","800"},
            {"Doctor Name:Abhiman","Hospital Address:Munichalai","Rating:4.7*","Mobile No:7947432706","600"},
            {"Doctor Name:Alpha","Hospital Address:Teppakulam","Rating:4.5*","Mobile No:7947432347","700"}
    };
    private String[][]doctor_details5={
            {"Doctor Name:Hannah Joesph","Hospital Address:Tuticorin Ring road","Rating:4.2*","Mobile No:7947434691","1500"},
            {"Doctor Name:Arun","Hospital Address:Munichalai","Rating:5*","Mobile No:7947434676","1600"},
            {"Doctor Name:Bala","Hospital Address:Usilampatti","Rating:3.9*","Mobile No:7947434432","1300"},
            {"Doctor Name:Ragavendar","Hospital Address:Kamarajar Salai","Rating:3.8*","Mobile No:7947434830","1400"},
            {"Doctor Name:Karupaiah","Hospital Address:KK nagar","Rating:5*","Mobile No:8046961837","1600"}
    };

    TextView tv;
    Button btn;
    String[][] doctor_details={};
    HashMap<String,String> item;
    ArrayList list;
    SimpleAdapter sa;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor_details);

        tv=findViewById(R.id.textViewDDTitle);
        btn=findViewById(R.id.buttonLTBack);

        Intent it=getIntent();
        String title =it.getStringExtra("title");
        tv.setText(title);
        if(title.compareTo("Family Physician")==0)
            doctor_details=doctor_details1;
        else
        if(title.compareTo("Dietician")==0)
            doctor_details=doctor_details2;
        else
        if(title.compareTo("Dentist")==0)
            doctor_details=doctor_details3;
        else
        if(title.compareTo("Surgeon")==0)
            doctor_details=doctor_details4;
        else
            doctor_details=doctor_details5;


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DoctorDetailsActivity.this,FindDoctorActivity.class));
            }
        });
        list=new ArrayList<>();
        for (int i=0;i<doctor_details.length;i++){
            item=new HashMap<String,String>();
            item.put("line1",doctor_details[i][0]);
            item.put("line2",doctor_details[i][1]);
            item.put("line3",doctor_details[i][2]);
            item.put("line4",doctor_details[i][3]);
            item.put("line5","Cons Fees:"+doctor_details[i][4]+"/-");
            list.add(item);
        }
        sa=new SimpleAdapter(this,list,
                R.layout.multi_lines,
                new String[]{"line1","line2","line3","line4","line5"},
                new int[]{R.id.line_a,R.id.line_b,R.id.line_c,R.id.line_d,R.id.line_e}
                );
        ListView lst=findViewById(R.id.listViewOD);
        lst.setAdapter(sa);

        lst.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent it=new Intent(DoctorDetailsActivity.this,BookAppointmentActivity.class);
                it.putExtra("text1",title);
                it.putExtra("text2",doctor_details[i][0]);
                it.putExtra("text3",doctor_details[i][1]);
                it.putExtra("text4",doctor_details[i][3]);
                it.putExtra("text5",doctor_details[i][4]);
                startActivity(it);
            }
        });
    }
}