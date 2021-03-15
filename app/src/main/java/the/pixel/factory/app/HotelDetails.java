package the.pixel.factory.app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class HotelDetails extends AppCompatActivity {
    List<HotelData> hotelDataList=new ArrayList<>();
    RecyclerView recyclerView;
    HotelAdapter mAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel_details);

        recyclerView =(RecyclerView)findViewById(R.id.rv_hotetList);
        mAdapter =new HotelAdapter(hotelDataList);
        RecyclerView.LayoutManager mLayoutManager =new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);
        
        hotelData();

    }

    private void hotelData() {

        HotelData hotelData = new HotelData("Ram Aasharaya","Sion","4.5","30%",0,0);
        hotelDataList.add(hotelData);
        hotelData = new HotelData("Sarada Bhavan", "Matunga", "4", "20%", 0, 0);
        hotelDataList.add(hotelData);
         hotelData = new HotelData("Manni","Dadar","3.4","10%",0,0);
        hotelDataList.add(hotelData);
        mAdapter.notifyDataSetChanged();
    }
}