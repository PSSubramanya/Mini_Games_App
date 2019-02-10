package com.example.pssubramanyabhat.multi_mini_game;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    Boolean p=true;
    int k;
    int t1,t2;
    int n=0;
    int m=0;
    Boolean x1=false,x2=false,x3=false,x4=false,x5=false,x6=false,x7=false,x8=false,x9=false;
    Boolean o1=false,o2=false,o3=false,o4=false,o5=false,o6=false,o7=false,o8=false,o9=false;
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9;
    Button regame;
    TextView disp,res;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        disp = (TextView)findViewById(R.id.disp);
        res = (TextView)findViewById(R.id.res);
        b1 = (Button)findViewById(R.id.b1);
        b2 = (Button)findViewById(R.id.b2);
        b3 = (Button)findViewById(R.id.b3);
        b4 = (Button)findViewById(R.id.b4);
        b5 = (Button)findViewById(R.id.b5);
        b6 = (Button)findViewById(R.id.b6);
        b7 = (Button)findViewById(R.id.b7);
        b8 = (Button)findViewById(R.id.b8);
        b9 = (Button)findViewById(R.id.b9);
        regame = (Button)findViewById(R.id.regame);

        regame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b1.setText("");
                b2.setText("");
                b3.setText("");
                b4.setText("");
                b5.setText("");
                b6.setText("");
                b7.setText("");
                b8.setText("");
                b9.setText("");

                b1.setEnabled(true);
                b2.setEnabled(true);
                b3.setEnabled(true);
                b4.setEnabled(true);
                b5.setEnabled(true);
                b6.setEnabled(true);
                b7.setEnabled(true);
                b8.setEnabled(true);
                b9.setEnabled(true);

                x1=false;
                x2=false;
                x3=false;
                x4=false;
                x5=false;
                x6=false;
                x7=false;
                x8=false;
                x9=false;

                o1=false;
                o2=false;
                o3=false;
                o4=false;
                o5=false;
                o6=false;
                o7=false;
                o8=false;
                o9=false;

                res.setText("");

                n=0;
                m=0;
                p=true;
                t1=0;
                t2=0;
                player1();
            }
        });

        for (k=0;k<=4;k++)
        {
            //p=true;
            player1();

        }
    }
    public void checking()
    {
        //if (n==5)
        //{
          //  disp.setText("Game DRAW");
        //}
        if (n==5 && t1!=1)
        {
            disp.setText("Game DRAW");
        }
    }
    public void evaluatte()
    {

        if ((x1==true && x2==true && x3==true)||
            (x4==true && x5==true && x6==true)||
            (x7==true && x8==true && x9==true)||
            (x1==true && x4==true && x7==true)||
            (x2==true && x5==true && x8==true)||
            (x3==true && x6==true && x9==true)||
            (x1==true && x5==true && x9==true)||
            (x3==true && x5==true && x7==true))
        {
            res.setText("Player 1 WINS");
            disp.setText("");
            t1=1;

            b1.setEnabled(false);
            b2.setEnabled(false);
            b3.setEnabled(false);
            b4.setEnabled(false);
            b5.setEnabled(false);
            b6.setEnabled(false);
            b7.setEnabled(false);
            b8.setEnabled(false);
            b9.setEnabled(false);
        }
        else if ((o1==true && o2==true && o3==true)||
                 (o4==true && o5==true && o6==true)||
                 (o7==true && o8==true && o9==true)||
                 (o1==true && o4==true && o7==true)||
                 (o2==true && o5==true && o8==true)||
                 (o3==true && o6==true && o9==true)||
                 (o1==true && o5==true && o9==true)||
                 (o3==true && o5==true && o7==true))
        {
            res.setText("Player 2 WINS");
            disp.setText("");
            t2=1;

            b1.setEnabled(false);
            b2.setEnabled(false);
            b3.setEnabled(false);
            b4.setEnabled(false);
            b5.setEnabled(false);
            b6.setEnabled(false);
            b7.setEnabled(false);
            b8.setEnabled(false);
            b9.setEnabled(false);
        }
    }
    public void player1()
    {
        if (p==true && n<=4)
        {
            if (t2!=1)
            {
                disp.setText("Player 1's Turn");
            }
            b1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    x1 = true;
                    b1.setText("X");
                    evaluatte();
                    if (t1!=1)
                    {
                        disp.setText("Player 2's Turn");
                    }
                    //disp.setText(x1.toString());
                    n++;
                    p=false;
                    checking();
                    b1.setEnabled(false);
                    player2();
                    //break;
                }
            });
        }
        //disp.setText(p.toString());

        if (p==true && n<=4)
        {
            if (t2!=1)
            {
                disp.setText("Player 1's Turn");
            }
            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    x2 = true;
                    b2.setText("X");
                    evaluatte();
                    if (t1!=1)
                    {
                        disp.setText("Player 2's Turn");
                    }
                    n++;
                    p=false;
                    checking();
                    b2.setEnabled(false);
                    player2();
                    //break;
                }
            });
        }

        if (p==true && n<=4)
        {
            if (t2!=1)
            {
                disp.setText("Player 1's Turn");
            }
            b3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    x3= true;
                    b3.setText("X");
                    evaluatte();
                    if (t1!=1)
                    {
                        disp.setText("Player 2's Turn");
                    }
                    n++;
                    p=false;
                    checking();
                    b3.setEnabled(false);
                    player2();
                    //break;
                }
            });
        }

        if (p==true && n<=4)
        {
            if (t2!=1)
            {
                disp.setText("Player 1's Turn");
            }
            b4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    x4 = true;
                    b4.setText("X");
                    evaluatte();
                    if (t1!=1)
                    {
                        disp.setText("Player 2's Turn");
                    }
                    n++;
                    p=false;
                    checking();
                    b4.setEnabled(false);
                    player2();
                    //break;
                }
            });
        }

        if (p==true && n<=4)
        {
            if (t2!=1)
            {
                disp.setText("Player 1's Turn");
            }
            b5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    x5 = true;
                    b5.setText("X");
                    evaluatte();
                    if (t1!=1)
                    {
                        disp.setText("Player 2's Turn");
                    }
                    n++;
                    p=false;
                    checking();
                    b5.setEnabled(false);
                    player2();
                    //break;
                }
            });
        }

        if (p==true && n<=4)
        {
            if (t2!=1)
            {
                disp.setText("Player 1's Turn");
            }
            b6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    x6 = true;
                    b6.setText("X");
                    evaluatte();
                    if (t1!=1)
                    {
                        disp.setText("Player 2's Turn");
                    }
                    n++;
                    p=false;
                    checking();
                    b6.setEnabled(false);
                    player2();
                    //break;
                }
            });
        }

        if (p==true && n<=4)
        {
            if (t2!=1)
            {
                disp.setText("Player 1's Turn");
            }
            b7.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    x7 = true;
                    b7.setText("X");
                    evaluatte();
                    if (t1!=1)
                    {
                        disp.setText("Player 2's Turn");
                    }
                    n++;
                    p=false;
                    checking();
                    b7.setEnabled(false);
                    player2();
                    //break;
                }
            });
        }

        if (p==true && n<=4)
        {
            if (t2!=1)
            {
                disp.setText("Player 1's Turn");
            }
            b8.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    x8 = true;
                    b8.setText("X");
                    evaluatte();
                    if (t1!=1)
                    {
                        disp.setText("Player 2's Turn");
                    }
                    n++;
                    p=false;
                    checking();
                    b8.setEnabled(false);
                    player2();
                    //break;
                }
            });
        }

        if (p==true && n<=4)
        {
            if (t2!=1)
            {
                disp.setText("Player 1's Turn");
            }
            b9.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    x9 = true;
                    b9.setText("X");
                    evaluatte();
                    if (t1!=1)
                    {
                        disp.setText("Player 2's Turn");
                    }
                    n++;
                    p=false;
                    checking();
                    b9.setEnabled(false);
                    player2();
                    //break;
                }
            });
        }
    }
    public void player2()
    {
        //Players 2's entry


        if(p==false && m<4)
        {
            //disp.setText("Player 1's Turn");
            b1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    o1 = true;
                    b1.setText("O");
                    evaluatte();
                    //disp.setText("Player 2's Turn");
                    m++;
                    p=true;
                    b1.setEnabled(false);
                    player1();
                    //break;
                }
            });
        }

        if (p==false && m<4)
        {
            //disp.setText("Player 1's Turn");
            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    o2 = true;
                    b2.setText("O");
                    evaluatte();
                    //disp.setText("Player 2's Turn");
                    m++;
                    p=true;
                    b2.setEnabled(false);
                    player1();
                    //break;
                }
            });
        }

        if (p==false && m<4)
        {
            //disp.setText("Player 1's Turn");
            b3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    o3 = true;
                    b3.setText("O");
                    evaluatte();
                    //disp.setText("Player 2's Turn");
                    m++;
                    p=true;
                    b3.setEnabled(false);
                    player1();
                    //break;
                }
            });
        }

        if (p==false && m<4)
        {
            //disp.setText("Player 1's Turn");
            b4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    o4 = true;
                    b4.setText("O");
                    evaluatte();
                    //disp.setText("Player 2's Turn");
                    m++;
                    p=true;
                    b4.setEnabled(false);
                    player1();
                    //break;
                }
            });
        }

        if (p==false && m<4)
        {
            //disp.setText("Player 1's Turn");
            b5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    o5 = true;
                    b5.setText("O");
                    evaluatte();
                    //disp.setText("Player 2's Turn");
                    m++;
                    p=true;
                    b5.setEnabled(false);
                    player1();
                    //break;
                }
            });
        }

        if (p==false && m<4)
        {
            //disp.setText("Player 1's Turn");
            b6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    o6 = true;
                    b6.setText("O");
                    evaluatte();
                    //disp.setText("Player 2's Turn");
                    m++;
                    p=true;
                    b6.setEnabled(false);
                    player1();
                    //break;
                }
            });
        }

        if (p==false && m<4)
        {
            //disp.setText("Player 1's Turn");
            b7.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    o7 = true;
                    b7.setText("O");
                    evaluatte();
                    //disp.setText("Player 2's Turn");
                    m++;
                    p=true;
                    b7.setEnabled(false);
                    player1();
                    //break;
                }
            });
        }

        if (p==false && m<4)
        {
            //disp.setText("Player 1's Turn");
            b8.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    o8 = true;
                    b8.setText("O");
                    evaluatte();
                    //disp.setText("Player 2's Turn");
                    m++;
                    p=true;
                    b8.setEnabled(false);
                    player1();
                    //break;
                }
            });
        }

        if (p==false && m<4)
        {
            //disp.setText("Player 1's Turn");
            b9.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    o9 = true;
                    b9.setText("O");
                    evaluatte();
                    //disp.setText("Player 2's Turn");
                    m++;
                    p=true;
                    b9.setEnabled(false);
                    player1();
                    //break;
                }
            });
        }

    }
}
