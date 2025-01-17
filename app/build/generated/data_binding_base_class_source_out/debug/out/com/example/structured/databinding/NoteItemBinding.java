// Generated by view binder compiler. Do not edit!
package com.example.structured.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.structured.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class NoteItemBinding implements ViewBinding {
  @NonNull
  private final CardView rootView;

  @NonNull
  public final CheckBox checkbox;

  @NonNull
  public final TextView contenttextview;

  @NonNull
  public final ImageButton deletebtn;

  @NonNull
  public final TextView titletext;

  @NonNull
  public final ImageButton updatebtn;

  private NoteItemBinding(@NonNull CardView rootView, @NonNull CheckBox checkbox,
      @NonNull TextView contenttextview, @NonNull ImageButton deletebtn,
      @NonNull TextView titletext, @NonNull ImageButton updatebtn) {
    this.rootView = rootView;
    this.checkbox = checkbox;
    this.contenttextview = contenttextview;
    this.deletebtn = deletebtn;
    this.titletext = titletext;
    this.updatebtn = updatebtn;
  }

  @Override
  @NonNull
  public CardView getRoot() {
    return rootView;
  }

  @NonNull
  public static NoteItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static NoteItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.note_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static NoteItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.checkbox;
      CheckBox checkbox = ViewBindings.findChildViewById(rootView, id);
      if (checkbox == null) {
        break missingId;
      }

      id = R.id.contenttextview;
      TextView contenttextview = ViewBindings.findChildViewById(rootView, id);
      if (contenttextview == null) {
        break missingId;
      }

      id = R.id.deletebtn;
      ImageButton deletebtn = ViewBindings.findChildViewById(rootView, id);
      if (deletebtn == null) {
        break missingId;
      }

      id = R.id.titletext;
      TextView titletext = ViewBindings.findChildViewById(rootView, id);
      if (titletext == null) {
        break missingId;
      }

      id = R.id.updatebtn;
      ImageButton updatebtn = ViewBindings.findChildViewById(rootView, id);
      if (updatebtn == null) {
        break missingId;
      }

      return new NoteItemBinding((CardView) rootView, checkbox, contenttextview, deletebtn,
          titletext, updatebtn);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
