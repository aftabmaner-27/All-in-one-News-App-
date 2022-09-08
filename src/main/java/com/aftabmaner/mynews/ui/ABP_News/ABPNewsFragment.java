package com.aftabmaner.mynews.ui.ABP_News;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;


import com.aftabmaner.mynews.R;
import com.aftabmaner.mynews.WebViewController;
import com.aftabmaner.mynews.databinding.FragmentAbpNewsBinding;


public class ABPNewsFragment extends Fragment {

    private FragmentAbpNewsBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {


        binding = FragmentAbpNewsBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        WebView webView = root.findViewById(R.id.idwebViewABPnews);
        webView.loadUrl("https://www.abplive.com/");
        webView.setWebViewClient(new WebViewController());
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}