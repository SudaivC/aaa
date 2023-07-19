package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText et;
    Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,bAdd,bSub,bMul,bDiv,bEql,bClear,bDot;
    double n1,n2;
    boolean add,sub,mul,div,dec=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et=findViewById(R.id.disp);
        b0=findViewById(R.id.B0);
        b1=findViewById(R.id.B1);
        b2=findViewById(R.id.B2);
        b3=findViewById(R.id.B3);
        b4=findViewById(R.id.B4);
        b5=findViewById(R.id.B5);
        b6=findViewById(R.id.B6);
        b7=findViewById(R.id.B7);
        b8=findViewById(R.id.B8);
        b9=findViewById(R.id.B9);
        bAdd=findViewById(R.id.bSum);
        bDiv=findViewById(R.id.bDiv);
        bDot=findViewById(R.id.bDot);
        bClear=findViewById(R.id.bClr);
        bSub=findViewById(R.id.bDiff);
        bEql=findViewById(R.id.bEql);
        bMul=findViewById(R.id.bProd);


bClear.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {

            et.setText("0");

    }
});
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                      if (Float.parseFloat(et.getText().toString()) == 0) {
                        et.setText("0");
                    } else {
                        et.setText(et.getText() + "0");
                    }
                }

        });


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(Float.parseFloat(et.getText().toString())==0)
                {
                    et.setText("1");
                }
                else
                et.setText( et.getText()+"1");
            }
        });



        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                    if (Float.parseFloat(et.getText().toString()) == 0) {
                        et.setText("2");
                    } else {
                        et.setText(et.getText() + "2");
                    }
               }

        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (Float.parseFloat(et.getText().toString()) == 0) {
                    et.setText("3");
                } else {
                    et.setText(et.getText() + "3");
                }

            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (Float.parseFloat(et.getText().toString()) == 0) {
                    et.setText("4");
                } else {
                    et.setText(et.getText() + "4");

                }
            }
        });



        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (Float.parseFloat(et.getText().toString()) == 0) {
                    et.setText("5");
                } else {
                    et.setText(et.getText() + "5");
                }
            }

        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                    if (Float.parseFloat(et.getText().toString()) == 0) {
                        et.setText("6");
                    } else {
                        et.setText(et.getText() + "6");
                    }
                }

        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                    if (Float.parseFloat(et.getText().toString()) == 0) {
                        et.setText("7");
                    } else {
                        et.setText(et.getText() + "7");
                    }
                }

        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                    if (Float.parseFloat(et.getText().toString()) == 0) {
                        et.setText("8");
                    } else {
                        et.setText(et.getText() + "8");
                    }


            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                    if (Float.parseFloat(et.getText().toString()) == 0) {
                        et.setText("9");
                    } else {
                        et.setText(et.getText() + "9");
                    }

            }
        });
        bDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                    if (!dec) {
                        et.setText(et.getText() + ".");
                        dec = true;
                    }
                    //dec=false;
               }

        });
        bAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                n1=Float.parseFloat(et.getText().toString());
                add=true;
                dec=false;
                et.setText("0");
            }
        });
        bSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                n1=Float.parseFloat(et.getText().toString());
                sub=true;
                dec=false;
                et.setText("0");
            }
        });

        bEql.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(add||sub||mul||div) {
                    n2 = Float.parseFloat(et.getText().toString());
                }
                if(add) {
                    et.setText(n1 + n2 + "");
                    add=false;
                }
                 if(sub) {
                     et.setText(n1 - n2 + "");
                     sub=false;
                 }
                 if(mul) {
                     et.setText(n1 * n2 + "");
                     mul=false;
                 }
                if(div) {
                    if(n2==0)
                        et.setText("Cannot divide by zero");
                    else
                    {
                        et.setText(n1 / n2 + "");
                        div = false;
                    }
                }
            }
        });



        bMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                    n1 = Float.parseFloat(et.getText().toString());
                    mul = true;
                    et.setText(null);

            }
        });

        bDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                    n1 = Float.parseFloat(et.getText().toString());
                    div = true;
                    et.setText(null);
                }

        });



    }
}