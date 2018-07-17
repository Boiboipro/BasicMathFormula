package sg.edu.rp.c346.basicmathformula;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by 16020271 on 17/7/2018.
 */

public class CustomAdapter extends ArrayAdapter{

    Context parent_context;
    int layout_id;
    ArrayList<FormulaItem> formulaList;

    public CustomAdapter(@NonNull Context context, int resource, @NonNull ArrayList<FormulaItem> objects) {
        super(context, resource, objects);
        parent_context = context;
        layout_id = resource;
        formulaList = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(layout_id, parent, false);
        TextView tvFormula = rowView.findViewById(R.id.textViewFormula);
        TextView tvExplanation = rowView.findViewById(R.id.textViewExplanation);
        FormulaItem currentItem = formulaList.get(position);
        String formula = currentItem.getFormula();
        String explanation = currentItem.getExplanation();
        tvFormula.setText(formula);
        tvExplanation.setText(explanation);
        return rowView;


    }
}
