package  com.example


import android.widget.Toast;
import android.view.View;
/**
 * Created by User on 11/3/2016.
 */

public class NumbersClickListners implements View.onClickListener {

    @Override
    public void onClickListener(View view) {
        Toast.makeText(View.getContext(), "list numbers opened", Toast.LENGTH_SHORT.show());

    }
}