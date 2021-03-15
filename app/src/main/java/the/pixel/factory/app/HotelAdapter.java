package the.pixel.factory.app;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class HotelAdapter  extends RecyclerView.Adapter<HotelAdapter.MyViewHolder> {


    private List<HotelData> hotelDataList;

    public  class MyViewHolder extends RecyclerView.ViewHolder{
        public TextView hoteltittle,hoteladdress,hotelrating,hoteloffer,hotelrate;
        public MyViewHolder(View view){
            super(view);
            hoteltittle=(TextView)view.findViewById(R.id.tv_hotelName);
            hoteladdress=(TextView)view.findViewById(R.id.tv_hotelAdd);
            hotelrating=(TextView)view.findViewById(R.id.tv_hotelRate);
            hoteloffer=(TextView)view.findViewById(R.id.tv_offer);
            hotelrate=(TextView)view.findViewById(R.id.tv_rating);
        }
    }

    public  HotelAdapter(List<HotelData> hotelDataList){
        this.hotelDataList= hotelDataList;
    }
    @NonNull
    @Override
    public HotelAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView= LayoutInflater.from(parent.getContext()).inflate(R.layout.itmehotel,parent,false);
        return  new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull HotelAdapter.MyViewHolder holder, int position) {
HotelData  hotelData= hotelDataList.get(position);
holder.hoteltittle.setText(hotelData.getHotelName());
holder.hotelrating.setText((hotelData.getHotelRating()));
//holder.hotelrate.setText((hotelData.getRating()));
holder.hoteloffer.setText((hotelData.getHotelOffer()));
holder.hoteladdress.setText((hotelData.getHotelAdd()));

    }

    @Override
    public int getItemCount() {
        return hotelDataList.size();
    }
}
