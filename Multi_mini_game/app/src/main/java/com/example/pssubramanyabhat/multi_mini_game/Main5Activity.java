package com.example.pssubramanyabhat.multi_mini_game;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main5Activity extends AppCompatActivity {
    Button sw1,sw2,sw3,sw4,sw6,sw7,sw8,sw9,score;
    TextView move,move1,move2;
    //boolean p1=false,p2=false,p3=false,p4=false,p6=false,p7=false,p8=false,p9=false;
    //boolean p1=true,p2=true;
    //boolean p1,p2,p3,p4,p6,p7,p8,p9;
    int p1,p2,p3,p4,p6,p7,p8,p9;
    int click=0;
    int c1=0;
    int flag1,flag2,flag3,flag4;
    int fin;
    //String str1,str2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        sw1 =(Button)findViewById(R.id.sw1);
        sw2=(Button)findViewById(R.id.sw2);
        sw3 =(Button)findViewById(R.id.sw3);
        sw4 =(Button)findViewById(R.id.sw4);
        sw6 =(Button)findViewById(R.id.sw6);
        sw7 =(Button)findViewById(R.id.sw7);
        sw8 =(Button)findViewById(R.id.sw8);
        sw9 =(Button)findViewById(R.id.sw9);
        score = (Button)findViewById(R.id.score);

        move = (TextView)findViewById(R.id.move);
        move1 = (TextView)findViewById(R.id.move1);
        move2 = (TextView)findViewById(R.id.move2);

        sw1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*click++;
                //p1 = true;
                p1 = 1;
                c1++;*/
                sw1.setText("A");
                click++;
                p1 = 1;
                c1++;

                //move.setText(Integer.toString(p1)+", "+Integer.toString(p4));
                //move1.setText(Integer.toString(click));
                move2.setText(Integer.toString(c1));
                //sw1.setEnabled(false);
                checkclick();
            }
        });
        //click++;
        //c1++;

        sw2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sw2.setText("B");
                click++;
                //p2 = true;
                p2 = 1;
                c1++;

                //move.setText(Integer.toString(p2)+", "+Integer.toString(p7));
                //move1.setText(Integer.toString(click));
                move2.setText(Integer.toString(c1));
                //sw1.setEnabled(false);
                checkclick();
            }
        });

        sw3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sw3.setText("C");
                click++;
                //p3 = true;
                p3 = 1;
                c1++;

                //move.setText(Integer.toString(p1)+", "+Integer.toString(p4));
                //move1.setText(Integer.toString(click));
                move2.setText(Integer.toString(c1));
                //sw1.setEnabled(false);
                checkclick();
            }
        });

        sw4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*click++;
                //p4 = true;
                p4 = 1;
                c1++;*/
                sw4.setText("A");
                click++;
                p4 = 1;
                c1++;

                //move.setText(Integer.toString(p1)+", "+Integer.toString(p4));
                //move1.setText(Integer.toString(click));
                move2.setText(Integer.toString(c1));
                /*p4=0;
                sw1.setText("");
                sw4.setText("");*/
                checkclick();
            }
        });


        sw6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sw6.setText("C");
                click++;
                //p6 = true;
                p6 = 1;
                c1++;

                //move.setText(Integer.toString(p1)+", "+Integer.toString(p4));
                //move1.setText(Integer.toString(click));
                move2.setText(Integer.toString(c1));
                //sw1.setEnabled(false);
                checkclick();
            }
        });


        sw7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sw7.setText("B");
                click++;
                //p7 = true;
                p7 = 1;
                c1++;

                //move.setText(Integer.toString(p1)+", "+Integer.toString(p4));
                //move1.setText(Integer.toString(click));
                move2.setText(Integer.toString(c1));
                //sw1.setEnabled(false);
                checkclick();
            }
        });


        sw8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sw8.setText("D");
                click++;
                //p8 = true;
                p8 = 1;
                c1++;

                //move.setText(Integer.toString(p1)+", "+Integer.toString(p4));
                //move1.setText(Integer.toString(click));
                move2.setText(Integer.toString(c1));
                //sw1.setEnabled(false);
                checkclick();
            }
        });


        sw9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sw9.setText("D");
                click++;
                //p9=true;
                p9 = 1;
                c1++;

                //move.setText(Integer.toString(p1)+", "+Integer.toString(p4));
                //move1.setText(Integer.toString(click));
                move2.setText(Integer.toString(c1));
                //sw1.setEnabled(false);
                checkclick();
            }
        });



    }

    public void checkclick()
    {
        if (click==2)
        {

            if (p1==1 && p4==1)
            {
                //int enb1=1;
                sw1.setText("A");
                sw4.setText("A");
                sw1.setEnabled(false);
                sw4.setEnabled(false);
                /*if (enb1==1)
                {
                    sw1.setEnabled(false);
                    sw4.setEnabled(false);
                }*/
                click=0;
                flag1=1;
                fin = c1/2;
                if (flag1==1 && flag2==1 && flag3==1 && flag4==1)
                {
                    move.setText("Total number of moves taken is: "+Integer.toString(fin));
                }
                //move1.setText(Integer.toString(click));

            }

            else if (p2==1 && p7==1)
            {
                //int enb2=1;
                sw2.setText("B");
                sw7.setText("B");
                sw2.setEnabled(false);
                sw7.setEnabled(false);
                /*if (enb2==1)
                {
                    sw2.setEnabled(false);
                    sw7.setEnabled(false);
                }*/
                click=0;
                flag2=1;
                fin = c1/2;
                if (flag1==1 && flag2==1 && flag3==1 && flag4==1)
                {
                    move.setText("Total number of moves taken is: "+Integer.toString(fin));
                }
                //move1.setText(Integer.toString(click));

            }

            else if (p3==1 && p6==1)
            {
                //int enb3=1;
                sw3.setText("C");
                sw6.setText("C");
                sw3.setEnabled(false);
                sw6.setEnabled(false);
                /*if (enb3==1)
                {
                    sw3.setEnabled(false);
                    sw6.setEnabled(false);
                }*/
                click=0;
                flag3=1;
                fin = c1/2;
                if (flag1==1 && flag2==1 && flag3==1 && flag4==1)
                {
                    move.setText("Total number of moves taken is: "+Integer.toString(fin));
                }
                //move1.setText(Integer.toString(click));

            }

            else if (p8==1 && p9==1)
            {
                //int enb4=1;
                sw8.setText("D");
                sw9.setText("D");
                sw8.setEnabled(false);
                sw9.setEnabled(false);
                /*if (enb4==1)
                {
                    sw8.setEnabled(false);
                    sw9.setEnabled(false);
                }*/
                click=0;
                flag4=1;
                fin = c1/2;
                if (flag1==1 && flag2==1 && flag3==1 && flag4==1)
                {
                    move.setText("Total number of moves taken is: "+Integer.toString(fin));
                }
                //move1.setText(Integer.toString(click));

            }


            else if (p1!=1 || p4!=1)
            {
                p1=0;
                p4=0;
                sw1.setText("");
                sw4.setText("");
                p2=0;
                p7=0;
                sw2.setText("");
                sw7.setText("");
                p3=0;
                p6=0;
                sw3.setText("");
                sw6.setText("");
                p8=0;
                p9=0;
                sw8.setText("");
                sw9.setText("");
                click=0;
            }

            else if (p2!=1 || p7!=1)
            {
                p1=0;
                p4=0;
                sw1.setText("");
                sw4.setText("");
                p2=0;
                p7=0;
                sw2.setText("");
                sw7.setText("");
                p3=0;
                p6=0;
                sw3.setText("");
                sw6.setText("");
                p8=0;
                p9=0;
                sw8.setText("");
                sw9.setText("");
                click=0;
            }

            else if (p3!=1 || p6!=1)
            {
                p1=0;
                p4=0;
                sw1.setText("");
                sw4.setText("");
                p2=0;
                p7=0;
                sw2.setText("");
                sw7.setText("");
                p3=0;
                p6=0;
                sw3.setText("");
                sw6.setText("");
                p8=0;
                p9=0;
                sw8.setText("");
                sw9.setText("");
                click=0;
            }

            else if (p8!=1 || p9!=1)
            {
                p1=0;
                p4=0;
                sw1.setText("");
                sw4.setText("");
                p2=0;
                p7=0;
                sw2.setText("");
                sw7.setText("");
                p3=0;
                p6=0;
                sw3.setText("");
                sw6.setText("");
                p8=0;
                p9=0;
                sw8.setText("");
                sw9.setText("");
                click=0;
            }

        }

        //Code to display the Score
        //fin = c1/2;
        //move.setText("Total number of moves taken is: "+Integer.toString(fin));
        //move1.setText(Integer.toString(click));
        //move2.setText(Integer.toString(c1));


        /*score.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //move.setText("Total number of moves taken is: "+Integer.toString(fin));
                Intent intent = new Intent(Main5Activity.this,Scorecard.class);
                startActivity(intent);
            }
        });*/
    }

}
