package com.example.android.news2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class NewsAdapter extends ArrayAdapter<News> {

    News currentNews;

    public NewsAdapter(Context context, List<News> news) {
        super(context, 0, news);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null)
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.news_list_item, parent, false);

        currentNews = getItem(position);

        //Find the view with id news_title
        TextView titleview = convertView.findViewById(R.id.news_title);
        //displays the news_title in the textView
        titleview.setText(currentNews.getTtitle());

        //Find the view with the id news_author
        TextView authorview = convertView.findViewById(R.id.news_author);
        //displays the news_author in the above view
        authorview.setText(currentNews.getAuthor());

        //Find the view with the id news_action
        TextView sectionview = convertView.findViewById(R.id.news_section);
        //displays the action in the above view.
        sectionview.setText(currentNews.getSection());

        //Find the view with the id news_date
        TextView dateview = convertView.findViewById(R.id.news_date);

        dateview.setText(currentNews.getDdate());

        return convertView;

    }

}