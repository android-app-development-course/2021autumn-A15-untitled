// Generated by view binder compiler. Do not edit!
package com.lnm011223.foods_secret.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.lnm011223.foods_secret.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class AnalyseFragmentBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView dayText;

  @NonNull
  public final ImageView imageView3;

  @NonNull
  public final RecyclerView resultView;

  private AnalyseFragmentBinding(@NonNull ConstraintLayout rootView, @NonNull TextView dayText,
      @NonNull ImageView imageView3, @NonNull RecyclerView resultView) {
    this.rootView = rootView;
    this.dayText = dayText;
    this.imageView3 = imageView3;
    this.resultView = resultView;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static AnalyseFragmentBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static AnalyseFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.analyse_fragment, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static AnalyseFragmentBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.day_text;
      TextView dayText = ViewBindings.findChildViewById(rootView, id);
      if (dayText == null) {
        break missingId;
      }

      id = R.id.imageView3;
      ImageView imageView3 = ViewBindings.findChildViewById(rootView, id);
      if (imageView3 == null) {
        break missingId;
      }

      id = R.id.result_view;
      RecyclerView resultView = ViewBindings.findChildViewById(rootView, id);
      if (resultView == null) {
        break missingId;
      }

      return new AnalyseFragmentBinding((ConstraintLayout) rootView, dayText, imageView3,
          resultView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
