package com.example.zsy.listviewtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    private List<Poem> poemList=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initPoem();
        PoemAdapter adapter = new PoemAdapter(MainActivity.this,R.layout.poem_item,poemList);
        ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view,int position,long id){
                Poem poem =poemList.get(position);
                Toast.makeText(MainActivity.this,poem.getName(),Toast.LENGTH_SHORT).show();
            }
        });

    }

    private void initPoem(){
        for (int i=0;i<3;i++){
            Poem poem1 = new Poem("披绣闼",R.drawable.first);
            poemList.add(poem1);
            Poem poem2 = new Poem("俯雕甍",R.drawable.first);
            poemList.add(poem2);
            Poem poem3 = new Poem("山原旷其盈视",R.drawable.first);
            poemList.add(poem3);
            Poem poem4 = new Poem("川泽纡其骇瞩",R.drawable.first);
            poemList.add(poem4);
            Poem poem5 = new Poem("闾阎扑地",R.drawable.first);
            poemList.add(poem5);
            Poem poem6 = new Poem("钟鸣鼎食之家",R.drawable.first);
            poemList.add(poem6);
            Poem poem8 = new Poem("舸舰迷津",R.drawable.first);
            poemList.add(poem8);
            Poem poem9 = new Poem("青雀黄龙之舳",R.drawable.first);
            poemList.add(poem9);
            Poem poem10 = new Poem("云销雨霁",R.drawable.first);
            poemList.add(poem10);
            Poem poem11 = new Poem("彩彻区明",R.drawable.first);
            poemList.add(poem11);
            Poem poem12 = new Poem("落霞与孤鹜齐飞",R.drawable.first);
            poemList.add(poem12);
            Poem poem13 = new Poem("秋水共长天一色",R.drawable.first);
            poemList.add(poem13);
            Poem poem14 = new Poem("台隍枕夷夏之交",R.drawable.first);
            poemList.add(poem14);
            Poem poem15 = new Poem("渔舟唱晚",R.drawable.first);
            poemList.add(poem15);
            Poem poem16 = new Poem("响穷彭蠡之滨",R.drawable.first);
            poemList.add(poem16);
            Poem poem17 = new Poem("雁阵惊寒",R.drawable.first);
            poemList.add(poem17);
            Poem poem18 = new Poem("声断衡阳之浦",R.drawable.first);
            poemList.add(poem18);
        }
    }
}
