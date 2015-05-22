package blog.dcubica.com.listapersonalizada;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;


public class MainActivity extends ActionBarActivity {


    // Variables de la clase
    private ArrayList<TitularItems> Items;
    private Adaptador Adaptador;
    private ListView listaItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Vinculamos el objeto ListView con el objeto del archivo XML
        listaItems = (ListView)findViewById(R.id.listItems);
        // Llamamos al método loadItems()
        loadItems();
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

    // Método cargar Items
    private void loadItems(){
        Items = new ArrayList<TitularItems>(); // Creamos un objeto ArrayList de tipo TitularItems

        // Agregamos elementos al ArrayList
        Items.add(new TitularItems("Python", "Descripción de Python", this.getResources().getIdentifier("ic_python", "drawable", this.getPackageName())));
        Items.add(new TitularItems("Desempeño", "Descripción de Desempeño", this.getResources().getIdentifier("ic_level", "drawable", this.getPackageName())));
        Items.add(new TitularItems("Google Plus", "Descripción de Google Plus", this.getResources().getIdentifier("ic_google_plus", "drawable", this.getPackageName())));

        // Creamos un nuevo Adaptador y le pasamos el ArrayList
        Adaptador = new Adaptador(this, Items);
        // Desplegamos los elementos en el ListView
        listaItems.setAdapter(Adaptador);
    }
}
