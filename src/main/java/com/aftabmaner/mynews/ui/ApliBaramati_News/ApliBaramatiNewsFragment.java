package com.aftabmaner.mynews.ui.ApliBaramati_News;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import com.aftabmaner.mynews.R;
import com.aftabmaner.mynews.WebViewController;
import com.aftabmaner.mynews.databinding.FragmentApliBaramatiNewsBinding;


public class ApliBaramatiNewsFragment extends Fragment {

    private FragmentApliBaramatiNewsBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        binding = FragmentApliBaramatiNewsBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        WebView webView = root.findViewById(R.id.idwebviewApliBaramati);
        webView.loadUrl("https://aaplibaramatinews.com/");
        webView.setWebViewClient(new WebViewController());

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    }
