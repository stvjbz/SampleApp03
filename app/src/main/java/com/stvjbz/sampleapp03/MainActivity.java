package com.stvjbz.sampleapp03;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.cardList);

        // コンテンツの変化でRecyclerViewのサイズが変わらない場合は、
        // この設定でパフォーマンスを向上させることが出来る
        recyclerView.setHasFixedSize(true);

        // RecyclerViewにはLayoutManagerが必要
        //LinearLayoutManager llManager = new LinearLayoutManager(this);
        // 横スクロールになる
        // llManager.setOrientation(LinearLayoutManager.VERTICAL);
        // 縦スクロール
        //llManager.setOrientation(LinearLayoutManager.VERTICAL);
        //recyclerView.setLayoutManager(llManager);

        // 項目を格子状に並べる
        GridLayoutManager glManager = new GridLayoutManager(this, 3);
        recyclerView.setLayoutManager(glManager);



        ArrayList<AnbayashiData> anbayashi = new ArrayList<AnbayashiData>();
        for (int i = 0; i < MyData.commentArray.length; i++) {
            anbayashi.add(new AnbayashiData(
                    MyData.numberArray[i],
                    MyData.additionArray[i],
                    MyData.commentArray[i]
            ));
        }

        RecyclerView.Adapter adapter = new AnbayashiAdapter(anbayashi);
        recyclerView.setAdapter(adapter);
        recyclerView.smoothScrollToPosition(anbayashi.size() - 1); // 最後までスクロール
    }
}
