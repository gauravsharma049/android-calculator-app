package com.example.calculator;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;



public class MainActivity extends AppCompatActivity {
    private TextView enterNum;
    private TextView showCalc;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showCalc = findViewById(R.id.showCalculation);
        enterNum = findViewById(R.id.enterNumber);
        enterNum.setCursorVisible(false);
        enterNum.setShowSoftInputOnFocus(false);

        enterNum.setOnClickListener(v -> enterNum.setSoundEffectsEnabled(false));


    }
    public int checkStringFromLast(String sc){
        int i=sc.length()-1;
        while(i>=0){
            if(sc.charAt(i)=='×'||sc.charAt(i)=='+'||sc.charAt(i)=='-'||sc.charAt(i)=='÷' || sc.charAt(i)=='^'){
                System.out.println("returning "+i);
                return i+1;
            }
            i--;
        }
        return 0;
    }
    public void setFontSize(String str){
        if (str.length() >8)
            enterNum.setTextSize(30);
        else enterNum.setTextSize(48);
    }
    public void zeroBtn(View view){
        String str = enterNum.getText().toString();
        String st = str.substring(checkStringFromLast(str));
        setFontSize(str);
        if(st.length()>14)
            return;
        if (getString(R.string.enterNumber).equals(str) || str.startsWith("=") || str.startsWith("-0")) {
            if (str.startsWith("-0")) {
                if (str.startsWith("-0."))
                    enterNum.append("0");
                else
                    enterNum.setText("-0");
            } else
                enterNum.setText("0");
        } else
            enterNum.append("0");

    }
    @SuppressLint("SetTextI18n")
    public void oneBtn(View view){
        String str = enterNum.getText().toString();
        String st = str.substring(checkStringFromLast(str));
        setFontSize(str);
        if(st.length()>14)
            return;
        if(getString(R.string.enterNumber).equals(str)||str.startsWith("=")||str.startsWith("-0")){
            if(str.startsWith("-0")) {
                if(str.startsWith("-0."))
                    enterNum.append("1");
                else
                enterNum.setText("-"+"1");
            }
            else
            enterNum.setText("1");
        }
        else
            enterNum.append("1");
    }
    @SuppressLint("SetTextI18n")
    public void twoBtn(View view){
        String str = enterNum.getText().toString();
        String st = str.substring(checkStringFromLast(str));
        setFontSize(str);
        if(st.length()>14)
            return;
        if(getString(R.string.enterNumber).equals(str)||str.startsWith("=")||str.startsWith("-0")){
            if(str.startsWith("-0")) {
                if(str.startsWith("-0."))
                    enterNum.append("2");
                else
                    enterNum.setText("-"+"2");
            }
            else
            enterNum.setText("2");
        }
        else
            enterNum.append("2");
    }
    @SuppressLint("SetTextI18n")
    public void threeBtn(View view){
        String str = enterNum.getText().toString();
        String st = str.substring(checkStringFromLast(str));
        setFontSize(str);
        if(st.length()>14)
            return;
        if(getString(R.string.enterNumber).equals(str)||str.startsWith("=")||str.startsWith("-0")){
            if(str.startsWith("-0")) {
                if(str.startsWith("-0."))
                    enterNum.append("3");
                else
                    enterNum.setText("-"+"3");
            }
            else
            enterNum.setText("3");
        }
        else
            enterNum.append("3");
    }
    @SuppressLint("SetTextI18n")
    public void fourBtn(View view){
        String str = enterNum.getText().toString();
        String st = str.substring(checkStringFromLast(str));
        setFontSize(str);
        if(st.length()>14)
            return;
        if(getString(R.string.enterNumber).equals(str)||str.startsWith("=")||str.startsWith("-0")){
            if(str.startsWith("-0")) {
                if(str.startsWith("-0."))
                    enterNum.append("4");
                else
                    enterNum.setText("-"+"4");
            }
            else
            enterNum.setText("4");
        }
        else
            enterNum.append("4");
    }
    @SuppressLint("SetTextI18n")
    public void fiveBtn(View view){
        String str = enterNum.getText().toString();
        String st = str.substring(checkStringFromLast(str));
        setFontSize(str);
        if(st.length()>14)
            return;
        if(getString(R.string.enterNumber).equals(str)||str.startsWith("=")||str.startsWith("-0")){
            if(str.startsWith("-0")) {
                if(str.startsWith("-0."))
                    enterNum.append("5");
                else
                    enterNum.setText("-"+"5");
            }
            else
            enterNum.setText("5");
        }
        else
            enterNum.append("5");
    }
    @SuppressLint("SetTextI18n")
    public void sixBtn(View view){
        String str = enterNum.getText().toString();
        String st = str.substring(checkStringFromLast(str));
        setFontSize(str);
        if(st.length()>14)
            return;
        if(getString(R.string.enterNumber).equals(str)||str.startsWith("=")||str.startsWith("-0")){
            if(str.startsWith("-0")) {
                if(str.startsWith("-0."))
                    enterNum.append("6");
                else
                    enterNum.setText("-"+"6");
            }
            else
            enterNum.setText("6");
        }
        else
            enterNum.append("6");
    }
    @SuppressLint("SetTextI18n")
    public void sevenBtn(View view){
        String str = enterNum.getText().toString();
        String st = str.substring(checkStringFromLast(str));
        setFontSize(str);
        if(st.length()>14)
            return;
        if(getString(R.string.enterNumber).equals(str)||str.startsWith("=")||str.startsWith("-0")){
            if(str.startsWith("-0")) {
                if(str.startsWith("-0."))
                    enterNum.append("7");
                else
                    enterNum.setText("-"+"7");
            }
            else
            enterNum.setText("7");
        }
        else
            enterNum.append("7");
    }
    @SuppressLint("SetTextI18n")
    public void eightBtn(View view){
        String str = enterNum.getText().toString();
        String st = str.substring(checkStringFromLast(str));
        setFontSize(str);
        if(st.length()>14)
            return;
        if(getString(R.string.enterNumber).equals(str)||str.startsWith("=")||str.startsWith("-0")){
            if(str.startsWith("-0")) {
                if(str.startsWith("-0."))
                    enterNum.append("8");
                else
                    enterNum.setText("-"+"8");
            }
            else
            enterNum.setText("8");
        }
        else
            enterNum.append("8");

    }
    @SuppressLint("SetTextI18n")
    public void nineBtn(View view){
        String str = enterNum.getText().toString();
        String st = str.substring(checkStringFromLast(str));
        setFontSize(str);
        if(st.length()>14)
            return;
        if(getString(R.string.enterNumber).equals(str)||str.startsWith("=")||str.startsWith("-0")){
            if(str.startsWith("-0")) {
                if(str.startsWith("-0."))
                    enterNum.append("9");
                else
                    enterNum.setText("-"+"9");
            }
            else
            enterNum.setText("9");
        }
        else
            enterNum.append("9");

    }
    public void decimalBtn(View view){
        String str = enterNum.getText().toString();
        if(str.startsWith("= ")){
            enterNum.setText("0.");
            return;
        }
        String st=str.substring(checkStringFromLast(str));
        if(!st.contains(".")){
            enterNum.append(".");
        }
    }
    @SuppressLint("SetTextI18n")
    public void plusBtn(View view){
        String str = enterNum.getText().toString();
        setFontSize(str);
        if(!(str.endsWith("+")||str.endsWith("-")||str.endsWith("^")||str.endsWith("×")||str.endsWith("÷"))){
            if(str.startsWith("="))
                enterNum.setText(str.substring(2)+"+");
            else
            enterNum.append("+");
        }
        else
            enterNum.setText(str.substring(0,str.length()-1)+"+");
    }
    @SuppressLint("SetTextI18n")
    public void minusBtn(View view){
        String str = enterNum.getText().toString();
        setFontSize(str);
        if(!(str.endsWith("+")||str.endsWith("-")||str.endsWith("^")||str.endsWith("×")||str.endsWith("÷"))){
            if(str.startsWith("="))
                enterNum.setText(str.substring(2)+"-");
            else
                enterNum.append("-");
        }
        else
            enterNum.setText(str.substring(0,str.length()-1)+"-");
    }
    @SuppressLint("SetTextI18n")
    public void multiplyBtn(View view){
        String str = enterNum.getText().toString();
        setFontSize(str);
        if(!(str.endsWith("+")||str.endsWith("-")||str.endsWith("^")||str.endsWith("×")||str.endsWith("÷"))){
            if(str.startsWith("="))
                enterNum.setText(str.substring(2)+"×");
            else
                enterNum.append("×");
        }
        else
            enterNum.setText(str.substring(0,str.length()-1)+"×");
    }
    @SuppressLint("SetTextI18n")
    public void divideBtn(View view){
        String str = enterNum.getText().toString();
        setFontSize(str);
        if(!(str.endsWith("+")||str.endsWith("-")||str.endsWith("^")||str.endsWith("×")||str.endsWith("÷"))){
            if(str.startsWith("="))
                enterNum.setText(str.substring(2)+"÷");
            else
                enterNum.append("÷");
        }
        else
            enterNum.setText(str.substring(0,str.length()-1)+"÷");


    }
    @SuppressLint("SetTextI18n")
    public void powerBtn(View view){
        String str = enterNum.getText().toString();
        setFontSize(str);
        if(!(str.endsWith("+")||str.endsWith("-")||str.endsWith("^")||str.endsWith("×")||str.endsWith("÷"))){
            if(str.startsWith("="))
                enterNum.setText(str.substring(2)+"^");
            else
                enterNum.append("^");
        }
        else
            enterNum.setText(str.substring(0,str.length()-1)+"^");
    }
    @SuppressLint("SetTextI18n")
    public void plusMinusBtn(View view){
        String str = enterNum.getText().toString();
        setFontSize(str);
        if(str.startsWith("=")){
            str=str.substring(2);
        }
        boolean notContain=!(str.substring(1).contains("+") || str.substring(1).contains("-") || str.substring(1).contains("^") || str.substring(1).contains("÷") || str.substring(1).contains("×"));
        boolean containOrNot=!(str.contains("+") || str.contains("-") || str.contains("÷") || str.contains("×") || str.contains("^"));
        if(containOrNot){
            enterNum.setText("-"+str);
        }
        else if(str.charAt(0)=='-'&& notContain)
            enterNum.setText(str.substring(1));

    }
    public void clearBtn(View view){
        enterNum.setTextSize(48);
        showCalc.setText("");
        enterNum.setText("0");
    }
    public void backBtn(View view){
        String str = enterNum.getText().toString();
        if(str.length()<=10)
            enterNum.setTextSize(48);
        if(!str.startsWith("= ")) {
            String dStr = str.substring(0, str.length() - 1);
            if (str.length() > 1) {
                if (dStr.equals("-"))
                    enterNum.setText("0");
                else
                    enterNum.setText(dStr);
            } else
                enterNum.setText("0");
        }
    }
    @SuppressLint("SetTextI18n")
    public void reciprocalBtn(View view){
        String str = enterNum.getText().toString();
        String st = str.substring(checkStringFromLast(str));
        if(st.startsWith("= ")){
            st = st.substring(1);
        }
        boolean notContain=!(str.endsWith("+") || str.endsWith("-") || str.endsWith("÷") || str.endsWith("×") || str.endsWith("^"));
        if(notContain) {
            double per = 1 / Double.parseDouble(st);
            st = Double.toString(per);
            enterNum.setText(str.substring(0, checkStringFromLast(str)) + st);
            setFontSize(enterNum.getText().toString());
        }

    }
    @SuppressLint("SetTextI18n")
    public void squareRootBtn(View view){
        String str = enterNum.getText().toString();
        String st = str.substring(checkStringFromLast(str));
        if(st.startsWith("= ")){
            st = st.substring(1);
        }
        boolean notContain=!(str.endsWith("+") || str.endsWith("-") || str.endsWith("÷") || str.endsWith("×") || str.endsWith("^"));
        if(notContain) {
            double sqrt = Double.parseDouble(st);
            sqrt = Math.sqrt(sqrt);
            st = Double.toString(sqrt);
            if (st.endsWith(".0")) {
                st = st.substring(0, st.length() - 2);
            }
            enterNum.setText(str.substring(0, checkStringFromLast(str)) + st);
            setFontSize(enterNum.getText().toString());
        }
    }
    @SuppressLint("SetTextI18n")
    public void factorialBtn(View view){
        String str = enterNum.getText().toString();
        String st = str.substring(checkStringFromLast(str));
        if(st.startsWith("= ")){
            st = st.substring(1);
        }
        boolean notContain=!(str.endsWith("+") || str.endsWith("-") || str.endsWith("÷") || str.endsWith("×") || str.endsWith("^"));
        if(!st.contains(".")&&notContain){
            int fact = Integer.parseInt(st);
            int n=1;
            for(int i=fact; i>0; i--){
                n*=i;
            }
            fact = n;
            st = Integer.toString(fact);
            enterNum.setText(str.substring(0, checkStringFromLast(str)) + st);
            setFontSize(enterNum.getText().toString());
        }
    }
    @SuppressLint("SetTextI18n")
    public void percentBtn(View view){
        String str = enterNum.getText().toString();
        String st = str.substring(checkStringFromLast(str));
        if(st.startsWith("= ")){
            st = st.substring(1);
        }
        boolean notContain=!(str.endsWith("+") || str.endsWith("-") || str.endsWith("÷") || str.endsWith("×") || str.endsWith("^"));
        if(notContain){
            double per = Double.parseDouble(st)/100;
            st = Double.toString(per);
            if(st.endsWith(".0")){
                st = st.substring(0, st.length()-2);
            }
            enterNum.setText(str.substring(0, checkStringFromLast(str)) + st);
            setFontSize(enterNum.getText().toString());
        }
    }
    @SuppressLint("SetTextI18n")
    public void equalBtn(View view){
        String mathExpr = enterNum.getText().toString();
        if(mathExpr.contains("E"))
            return;
        if(mathExpr.startsWith("=")){
            mathExpr=mathExpr.substring(2);
        }
        if(mathExpr.endsWith("+")||mathExpr.endsWith("-")||mathExpr.endsWith("^")||mathExpr.endsWith("×")||mathExpr.endsWith("÷")){
            showCalc.setText(mathExpr);
            mathExpr=mathExpr.substring(0,mathExpr.length()-1);
        }
        else if(mathExpr.endsWith("+.")||mathExpr.endsWith("-.")||mathExpr.endsWith("^.")||mathExpr.endsWith("×.")||mathExpr.endsWith("÷.")){
            mathExpr=mathExpr+"0";
            showCalc.setText(mathExpr.substring(0,mathExpr.length()-1));

        }
        else showCalc.setText(mathExpr);
        mathExpr = mathExpr.replaceAll("÷","/");
        mathExpr = mathExpr.replaceAll("×", "*");

        double result = MathEngine.eval(mathExpr);
        String strResult = Double.toString(result);
        if(strResult.endsWith(".0")){
            strResult=strResult.substring(0,strResult.length()-2);
        }
        if(strResult.equals("-0")){
            enterNum.setText("0");
        }
        else
        enterNum.setText("= "+strResult);
        if(enterNum.getText().toString().length()>14)
            enterNum.setTextSize(24);
        else if (enterNum.getText().toString().length() >9)
            enterNum.setTextSize(30);
        else enterNum.setTextSize(48);

    }

}