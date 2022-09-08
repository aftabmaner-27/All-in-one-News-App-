package com.aftabmaner.mynews.ui.Zee_News;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import com.aftabmaner.mynews.R;
import com.aftabmaner.mynews.WebViewController;
import com.aftabmaner.mynews.databinding.FragmentZeeNewsBinding;


public class ZeeNewsFragment extends Fragment {

    private FragmentZeeNewsBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentZeeNewsBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        WebView webView = root.findViewById(R.id.idwebViewZeeNews);
        webView.loadUrl("https://zeenews.india.com/");
        webView.setWebViewClient(new WebViewController());

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
