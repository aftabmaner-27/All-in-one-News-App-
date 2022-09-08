package com.aftabmaner.mynews.ui.TV9_News;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import com.aftabmaner.mynews.R;
import com.aftabmaner.mynews.WebViewController;
import com.aftabmaner.mynews.databinding.FragmentTV9MarathiBinding;


public class TV9MarathiFragment extends Fragment {

    private FragmentTV9MarathiBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentTV9MarathiBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        WebView webView = root.findViewById(R.id.idwebViewTV9_marathi);
        webView.loadUrl("https://www.tv9marathi.com/");
        webView.setWebViewClient(new WebViewController());

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}