package co.edu.uan.caradepapa;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

public class MainActivity extends Activity implements View.OnClickListener {
CheckBox chulomano,chuloojo,chulobigote,chuloceja,chulodientes,chulogafas,chulonariz,chulooreja,chulosombrero,chulozapatos;
ImageView imagenmano,imagenojo,imagenbigote,imagenceja,imagendientes,imagengafas,imagennariz,imagenoreja,imagensombrero,imagenzapatos;;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //MANOS
        chulomano= (CheckBox) findViewById(R.id.checkBoxmano);
        imagenmano= (ImageView) findViewById(R.id.imageViewmano);
        chulomano.setOnClickListener(this);
        //OJOS
        chuloojo = (CheckBox) findViewById(R.id.checkBoxojo);
        imagenojo= (ImageView) findViewById(R.id.imageViewojo);
        chuloojo.setOnClickListener(this);
        //BIGOTE
        chulobigote = (CheckBox) findViewById(R.id.checkBoxbigote);
        imagenbigote= (ImageView) findViewById(R.id.imageViewbigote);
        chulobigote.setOnClickListener(this);

        // CEJA
        chuloceja = (CheckBox) findViewById(R.id.checkBoxceja);
        imagenceja= (ImageView) findViewById(R.id.imageViewceja);
        chuloceja.setOnClickListener(this);
        // DIENTES
        chulodientes = (CheckBox) findViewById(R.id.checkBoxdientes);
        imagendientes= (ImageView) findViewById(R.id.imageViewdientes);
        chulodientes.setOnClickListener(this);
        // GAFAS
        chulogafas = (CheckBox) findViewById(R.id.checkBoxgafas);
        imagengafas= (ImageView) findViewById(R.id.imageViewgafas);
        chulogafas.setOnClickListener(this);
        // NARIZ
        chulonariz = (CheckBox) findViewById(R.id.checkBoxnariz);
        imagennariz= (ImageView) findViewById(R.id.imageViewnariz);
        chulonariz.setOnClickListener(this);
        // OREJA
        chulooreja = (CheckBox) findViewById(R.id.checkBoxoreja);
        imagenoreja= (ImageView) findViewById(R.id.imageVieworeja);
        chulooreja.setOnClickListener(this);
        // SOMBRERO
        chulosombrero = (CheckBox) findViewById(R.id.checkBoxsombrero);
        imagensombrero= (ImageView) findViewById(R.id.imageViewsombrero);
        chulosombrero.setOnClickListener(this);
        // ZAPATOS
        chulozapatos = (CheckBox) findViewById(R.id.checkBoxzapatos);
        imagenzapatos= (ImageView) findViewById(R.id.imageViewzapatos);
        chulozapatos.setOnClickListener(this);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void onClick(View v) {

//Mano
            if (chulomano.isChecked() == true) {
                partes(1);
            }else{partes(11);}

//Ojo
            if (chuloojo.isChecked() == true) {
            partes(2);
            }else{partes(22);}
//Bigote
            if (chulobigote.isChecked() == true) {
            partes(3);
            }else{partes(33);}
//Cejas
            if (chuloceja.isChecked() == true) {
            partes(4);
            }else{partes(44);}
//Dientes
            if (chulodientes.isChecked() == true) {
            partes(5);
            }else{partes(55);}
//Gafas
            if (chulogafas.isChecked() == true) {
            partes(6);
            }else{partes(66);}

//Nariz
            if (chulonariz.isChecked() == true) {
            partes(7);
            }else{partes(77);}
//Oreja
            if (chulooreja.isChecked() == true) {
            partes(8);
            }else{partes(88);}
//Sombrero
            if (chulosombrero.isChecked() == true) {
            partes(9);
            }else{partes(99);}
//Zapatos
            if (chulozapatos.isChecked() == true) {
            partes(10);
            }else{partes(110);}


    }





    public void partes(int op)
    {
        float r;
        switch(op) {
            //Case Mano
            case 1:
                imagenmano.setVisibility(View.VISIBLE);
                break;
            case 11:
                imagenmano.setVisibility(View.INVISIBLE);
                break;
            //Case OJo
            case 2:
                imagenojo.setVisibility(View.VISIBLE);
                break;
            case 22:
                imagenojo.setVisibility(View.INVISIBLE);
                break;
            //CaseBigote
            case 3:
                imagenbigote.setVisibility(View.VISIBLE);
                break;
            case 33:
                imagenbigote.setVisibility(View.INVISIBLE);
                break;
            //CaseCejas
            case 4:
                imagenceja.setVisibility(View.VISIBLE);
                break;
            case 44:
                imagenceja.setVisibility(View.INVISIBLE);
                break;
            //CaseDientes
            case 5:
                imagendientes.setVisibility(View.VISIBLE);
                break;
            case 55:
                imagendientes.setVisibility(View.INVISIBLE);
                break;
            //CaseDientes
            case 6:
                imagengafas.setVisibility(View.VISIBLE);
                break;
            case 66:
                imagengafas.setVisibility(View.INVISIBLE);
                break;
            //CaseNariz
            case 7:
                imagennariz.setVisibility(View.VISIBLE);
                break;
            case 77:
                imagennariz.setVisibility(View.INVISIBLE);
                break;
            //Case Orejas
            case 8:
                imagenoreja.setVisibility(View.VISIBLE);
                break;
            case 88:
                imagenoreja.setVisibility(View.INVISIBLE);
                break;
            // Case Sombrero
            case 9:
                imagensombrero.setVisibility(View.VISIBLE);
                break;
            case 99:
                imagensombrero.setVisibility(View.INVISIBLE);
                break;
            // Case Zapatos
            case 10:
                imagenzapatos.setVisibility(View.VISIBLE);
                break;
            case 110:
                imagenzapatos.setVisibility(View.INVISIBLE);
                break;

        }


    }
}
