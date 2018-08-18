package com.doodlz.husain.ascendingmemory;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    private Timer _timer = new Timer();

    private int randomnumber = 0;
    private int  randomtext = 0;
    private int minimumnumber = 0;
    private int minimumnoindex = 0;

    Random random = new Random();


    private int level;
    private ArrayList<Integer> numbers = new ArrayList<>();
    private ArrayList<Integer> textview = new ArrayList<>();
    private ArrayList<Integer> randomnumberlist = new ArrayList<>();
    private ArrayList<Integer> copyRandomNumbers = new ArrayList<>();
    private ArrayList<Integer> randomtextlist = new ArrayList<>();
    private ArrayList<Integer> redcolor = new ArrayList<>();
    private ArrayList<Integer> sortedArrayIndexes = new ArrayList<>();
    private ArrayList<Integer> sortedTextViews= new ArrayList<>();
    private int correcttxtview ;
    private int correctTxtViewPointer=0;


    private Button button1;
    private TextView textview1,textview2,textview3,textview4,textview5,textview6,textview7,
            textview8,textview9,textview10,textview11,textview12;




    private Intent replaygame = new Intent();
    private TimerTask timer;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle extras = getIntent().getExtras();
        if (extras != null) { level = extras.getInt("level");Log.d("MainActivity","level:"+" "+level);}

        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();

        initialise();



        start();

        gettextview();

        getnumber();



        Log.d("MainestActivity","The random list number is "+randomnumberlist);
        fillSortedIndexes(randomnumberlist);

        fillNumbersInTextViews();

        sortTextViews();
    }

    private void sortTextViews() {
        Log.d("version2","The sorted text view list number is "+sortedArrayIndexes);
        Log.d("version2","The  text view list number is "+randomtextlist);
        for(int i=0;i<randomtextlist.size();i++){
            int index=sortedArrayIndexes.get(i);
            Log.d("version2","The  text view list number is "+index);
            sortedTextViews.add(randomtextlist.get(index));


        }
        Log.d("version1","The  sorted text views is "+ sortedTextViews);

    }

    private void initialise() {

        button1 = (Button) findViewById(R.id.button1);
        textview1 = (TextView) findViewById(R.id.textview1);
        textview2 = (TextView) findViewById(R.id.textview2);
        textview3 = (TextView) findViewById(R.id.textview3);
        textview4 = (TextView) findViewById(R.id.textview4);
        textview5 = (TextView) findViewById(R.id.textview5);
        textview6 = (TextView) findViewById(R.id.textview6);
        textview7 = (TextView) findViewById(R.id.textview7);
        textview8 = (TextView) findViewById(R.id.textview8);
        textview9 = (TextView) findViewById(R.id.textview9);
        textview10 = (TextView) findViewById(R.id.textview10);
        textview11 = (TextView) findViewById(R.id.textview11);
        textview12 = (TextView) findViewById(R.id.textview12);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


            onStart();

            }
        });

        textview1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                correcttxtview=sortedTextViews.get(correctTxtViewPointer);
                Log.d("version1","the value of correct.."+correcttxtview);
                if (correcttxtview == 0) {
                    textview1.setBackgroundColor(Color.GREEN);
                    correctTxtViewPointer++;
                }
                else {
                    showMessage( "finish");
                    textviewinit();
                    _checkred();
                }

            }
        });

        textview2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                correcttxtview=sortedTextViews.get(correctTxtViewPointer);
                if (correcttxtview == 1) {
                    textview2.setBackgroundColor(Color.GREEN);
                    correctTxtViewPointer++;
                }
                else {
                    showMessage("finish");
                    textviewinit();
                    _checkred();
                }

            }
        });

        textview3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                correcttxtview=sortedTextViews.get(correctTxtViewPointer);
                if (correcttxtview == 2) {
                    textview3.setBackgroundColor(Color.GREEN);
                    correctTxtViewPointer++;
                }
                else {
                    showMessage("finish");
                    textviewinit();
                    _checkred();
                }

            }
        });

        textview4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                correcttxtview=sortedTextViews.get(correctTxtViewPointer);
                if (correcttxtview == 3) {
                    textview4.setBackgroundColor(Color.GREEN);
                    correctTxtViewPointer++;
                }
                else {
                    showMessage("finish");
                    textviewinit();
                    _checkred();
                }

            }
        });

        textview5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                correcttxtview=sortedTextViews.get(correctTxtViewPointer);
                if (correcttxtview == 4) {
                    textview5.setBackgroundColor(Color.GREEN);
                    correctTxtViewPointer++;
                }
                else {
                    showMessage("finish");
                    textviewinit();
                    _checkred();
                }

            }
        });

        textview6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                correcttxtview=sortedTextViews.get(correctTxtViewPointer);
                if (correcttxtview == 5) {
                    textview6.setBackgroundColor(Color.GREEN);
                    correctTxtViewPointer++;
                }
                else {
                    showMessage("finish");
                    textviewinit();
                    _checkred();
                }

            }
        });

        textview7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                correcttxtview=sortedTextViews.get(correctTxtViewPointer);
                if (correcttxtview == 6) {
                    textview7.setBackgroundColor(Color.GREEN);
                    correctTxtViewPointer++;
                }
                else {
                    showMessage("finish");
                    textviewinit();
                    _checkred();
                }

            }
        });

        textview8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                correcttxtview=sortedTextViews.get(correctTxtViewPointer);
                if (correcttxtview == 7) {
                    textview8.setBackgroundColor(Color.GREEN);
                    correctTxtViewPointer++;
                }
                else {
                    showMessage("finish");
                    textviewinit();
                    _checkred();
                }

            }
        });

        textview9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                correcttxtview=sortedTextViews.get(correctTxtViewPointer);
                if (correcttxtview == 8) {
                    textview9.setBackgroundColor(Color.GREEN);
                    correctTxtViewPointer++;
                }
                else {
                    showMessage("finish");
                    textviewinit();
                    _checkred();
                }

            }
        });

        textview10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                correcttxtview=sortedTextViews.get(correctTxtViewPointer);
                if (correcttxtview == 9) {
                    textview10.setBackgroundColor(Color.GREEN);
                    correctTxtViewPointer++;
                }
                else {
                    showMessage("finish");
                    textviewinit();
                    _checkred();
                }

            }
        });

        textview11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                correcttxtview=sortedTextViews.get(correctTxtViewPointer);
                if (correcttxtview == 10) {
                    textview11.setBackgroundColor(Color.GREEN);
                    correctTxtViewPointer++;
                }
                else {
                    showMessage("finish");
                    _checkred();
                }

            }
        });

        textview12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                correcttxtview=sortedTextViews.get(correctTxtViewPointer);
                if (correcttxtview == 11) {
                    textview12.setBackgroundColor(Color.GREEN);
                    correctTxtViewPointer++;
                }
                else {
                    showMessage("finish");
                    _checkred();
                }

            }
        });
    }


    private void start () {
        numbers.clear();
        numbers.add(0);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);
        numbers.add(11);
        numbers.add(12);
        numbers.add(13);
        numbers.add(14);
        numbers.add(15);
        numbers.add(16);

        textview.clear();
        textview.add(0);
        textview.add(1);
        textview.add(2);
        textview.add(3);
        textview.add(4);
        textview.add(5);
        textview.add(6);
        textview.add(7);
        textview.add(8);
        textview.add(9);
        textview.add(10);
        textview.add(11);


    }


    private void fillNumbersInTextViews () {


        Log.d("version1","Filling numbers in textView  ");


        for (int i = 0; i < level; i++) {

            randomtext = randomtextlist.get(i);
            randomnumber = copyRandomNumbers.get(i);
            Log.d("version1","randomText "+randomtext);
            Log.d("version1","randomnumber"+randomnumber);

            if (randomtext == 0) {
                textview1.setText(String.valueOf( randomnumber));
                timer = new TimerTask() {
                    @Override
                    public void run() {
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                textview1.setBackgroundColor(0xFF000000);
                                textview1.setEnabled(true);
                            }
                        });
                    }
                };
                _timer.schedule(timer, (int) (3000));
            }
            if (randomtext == 1) {
                textview2.setText(String.valueOf((long) (randomnumber)));
                timer = new TimerTask() {
                    @Override
                    public void run() {
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                textview2.setBackgroundColor(0xFF000000);
                                textview2.setEnabled(true);
                            }
                        });
                    }
                };
                _timer.schedule(timer, (int) (3000));
            }
            if (randomtext == 2) {
                textview3.setText(String.valueOf((long) (randomnumber)));
                timer = new TimerTask() {
                    @Override
                    public void run() {
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                textview3.setBackgroundColor(0xFF000000);
                                textview3.setEnabled(true);
                            }
                        });
                    }
                };
                _timer.schedule(timer, (int) (3000));
            }
            if (randomtext == 3) {
                textview4.setText(String.valueOf((long) (randomnumber)));
                timer = new TimerTask() {
                    @Override
                    public void run() {
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                textview4.setBackgroundColor(0xFF000000);
                                textview4.setEnabled(true);
                            }
                        });
                    }
                };
                _timer.schedule(timer, (int) (3000));
            }
            if (randomtext == 4) {
                textview5.setText(String.valueOf((long) (randomnumber)));
                timer = new TimerTask() {
                    @Override
                    public void run() {
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                textview5.setBackgroundColor(0xFF000000);
                                textview5.setEnabled(true);
                            }
                        });
                    }
                };
                _timer.schedule(timer, (int) (3000));
            }
            if (randomtext == 5) {
                textview6.setText(String.valueOf((long) (randomnumber)));
                timer = new TimerTask() {
                    @Override
                    public void run() {
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                textview6.setBackgroundColor(0xFF000000);
                                textview6.setEnabled(true);
                            }
                        });
                    }
                };
                _timer.schedule(timer, (int) (3000));
            }
            if (randomtext == 6) {
                textview7.setText(String.valueOf((long) (randomnumber)));
                timer = new TimerTask() {
                    @Override
                    public void run() {
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                textview7.setBackgroundColor(0xFF000000);
                                textview7.setEnabled(true);
                            }
                        });
                    }
                };
                _timer.schedule(timer, (int) (3000));
            }
            if (randomtext == 7) {
                textview8.setText(String.valueOf((long) (randomnumber)));
                timer = new TimerTask() {
                    @Override
                    public void run() {
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                textview8.setBackgroundColor(0xFF000000);
                                textview8.setEnabled(true);
                            }
                        });
                    }
                };
                _timer.schedule(timer, (int) (3000));
            }
            if (randomtext == 8) {
                textview9.setText(String.valueOf((long) (randomnumber)));
                timer = new TimerTask() {
                    @Override
                    public void run() {
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                textview9.setBackgroundColor(0xFF000000);
                                textview9.setEnabled(true);
                            }
                        });
                    }
                };
                _timer.schedule(timer, (int) (3000));
            }
            if (randomtext == 9) {
                textview10.setText(String.valueOf((long) (randomnumber)));
                timer = new TimerTask() {
                    @Override
                    public void run() {
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                textview10.setBackgroundColor(0xFF000000);
                                textview10.setEnabled(true);
                            }
                        });
                    }
                };
                _timer.schedule(timer, (int) (3000));
            }
            if (randomtext == 10) {
                textview11.setText(String.valueOf((long) (randomnumber)));
                timer = new TimerTask() {
                    @Override
                    public void run() {
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                textview11.setBackgroundColor(0xFF000000);
                                textview11.setEnabled(true);
                            }
                        });
                    }
                };
                _timer.schedule(timer, (int) (3000));
            }
            if (randomtext == 11) {
                textview12.setText(String.valueOf((long) (randomnumber)));
                timer = new TimerTask() {
                    @Override
                    public void run() {
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                textview12.setBackgroundColor(0xFF000000);
                                textview12.setEnabled(true);
                            }
                        });
                    }
                };
                _timer.schedule(timer, (int) (3000));
            }
        }
    }
    private void fillSortedIndexes(ArrayList<Integer> numbersList) {


        Log.d("version1", "the number list is" + numbersList);
        int size = numbersList.size();


        for(int j=0;j<size;j++) {
            int smallestNumber = numbersList.get((int)0);


            for (int i = 0; i < numbersList.size(); i++) {
                if (numbersList.get(i) < smallestNumber) {
                    smallestNumber = numbersList.get(i);
                }

            }
            sortedArrayIndexes.add(copyRandomNumbers.indexOf((Object)smallestNumber));
            numbersList.remove((Object)smallestNumber);

        }
        Log.d("version1", "the sorted array list is"+sortedArrayIndexes);
    }
    private void gettextview () {

        for(int i = 0;i<level;i++){
            int randomPointer = getRandom(0,textview.size()-1);
            randomtext = textview.get(randomPointer);
            textview.remove(textview.indexOf(randomtext));
            randomtextlist.add(randomtext);

            redcolor.add(randomtext);

        }

        Log.d("version1","random textview list is "+randomtextlist);
        Log.d("version1","redcolor list is "+redcolor);
    }


    private void getnumber () {

        for(int i = 0;i<level;i++){
            int randomPointer=getRandom(0,numbers.size()-1);

            randomnumber=numbers.get(randomPointer);

            randomnumberlist.add(randomnumber);
            copyRandomNumbers.add(randomnumber);
            numbers.remove(numbers.indexOf(randomnumber));

        }
        Log.d("version1","random number list is "+randomnumberlist);
    }




    private void textviewinit () {
        textview1.setEnabled(false);
        textview2.setEnabled(false);
        textview3.setEnabled(false);
        textview4.setEnabled(false);
        textview5.setEnabled(false);
        textview6.setEnabled(false);
        textview7.setEnabled(false);
        textview8.setEnabled(false);
        textview9.setEnabled(false);
        textview10.setEnabled(false);
        textview11.setEnabled(false);
        textview12.setEnabled(false);
    }


    private void _checkred () {
        if (redcolor.contains(0)) {
            textview1.setBackgroundColor(Color.RED);
        }
        if (redcolor.contains(1)) {
            textview2.setBackgroundColor(Color.RED);
        }
        if (redcolor.contains(2)) {
            textview3.setBackgroundColor(Color.RED);
        }
        if (redcolor.contains(3)) {
            textview4.setBackgroundColor(Color.RED);
        }
        if (redcolor.contains(4)) {
            textview5.setBackgroundColor(Color.RED);
        }
        if (redcolor.contains(5)) {
            textview6.setBackgroundColor(Color.RED);
        }
        if (redcolor.contains(6)) {
            textview7.setBackgroundColor(Color.RED);
        }
        if (redcolor.contains(7)) {
            textview8.setBackgroundColor(Color.RED);
        }
        if (redcolor.contains(8)) {
            textview9.setBackgroundColor(Color.RED);
        }
        if (redcolor.contains(9)) {
            textview10.setBackgroundColor(Color.RED);
        }
        if (redcolor.contains(10)) {
            textview11.setBackgroundColor(Color.RED);
        }
        if (redcolor.contains(11)) {
            textview12.setBackgroundColor(Color.RED);
        }
    }



    public void showMessage(String string) {
        Toast.makeText(getApplicationContext(),string, Toast.LENGTH_LONG).show();
    }



    public int getRandom(int min, int max) {

        return random.nextInt((max - min + 1) + min);
    }

}
