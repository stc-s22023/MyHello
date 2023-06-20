package jp.suntech.s22023.myhello;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

 public class MainActivity extends AppCompatActivity {

  @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btClick = findViewById(R.id.btClick);
        //リスナ・オブジェクトの用意
        HelloListener Listener = new HelloListener();
        //ボタンにリスナを設定
        btClick.setOnClickListener(Listener);

        Button btClear = findViewById(R.id.btClear);

        btClear.setOnClickListener(Listener);
    }

    //ボタンクリックしたときのリスナクラス
    private class HelloListener implements View.OnClickListener{
      @Override
        public void onClick(View view) {
            EditText input = findViewById(R.id.etName);
            TextView output = findViewById(R.id.tvOutput);

            int id = view.getId();

           /* switch (id) {
                case R.id.btClick:
                    String inputStr = input.getText().toString();
                    output.setText(inputStr + "さん、こんにちは!");
                    break;

                case R.id.btClear:
                    input.setText("");
                    output.setText("");
                    break;
            */
            //}
          }
        }
    }

