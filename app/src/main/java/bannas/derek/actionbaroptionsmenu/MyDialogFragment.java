package bannas.derek.actionbaroptionsmenu;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;

/**
 * Created by owen-dev on 2015/08/16.
 */
public class MyDialogFragment extends DialogFragment {


    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder theDialog = new AlertDialog.Builder(getActivity());
        theDialog.setTitle("Sample Dialog");
        theDialog.setMessage("Hello, I am the dialog");
        theDialog.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getActivity(), "clicked ok...", Toast.LENGTH_SHORT).show();
            }
        });
        theDialog.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getActivity(), "Clicked Cancel...", Toast.LENGTH_SHORT).show();
            }
        });
        return super.onCreateDialog(savedInstanceState);
    }
}
