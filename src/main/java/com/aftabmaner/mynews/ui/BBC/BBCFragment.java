package com.aftabmaner.mynews.ui.BBC;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;


import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.aftabmaner.mynews.R;
import com.aftabmaner.mynews.WebViewController;
import com.aftabmaner.mynews.databinding.FragmentBbcNewsBinding;


public class BBCFragment extends Fragment {

    private FragmentBbcNewsBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {


        binding = FragmentBbcNewsBinding.inflate(inflater, container, false);
        View root = binding.getRoot();


        WebView webView = root.findViewById(R.id.idwebViewBBC);
        webView.loadUrl("https://www.bbc.com/");
        webView.setWebViewClient(new WebViewController());

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}