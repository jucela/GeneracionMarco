package com.example.jlavado.generacionmarco.activities;


import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.text.InputFilter;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.jlavado.generacionmarco.R;
import com.example.jlavado.generacionmarco.activities.AdminActivity;
import com.example.jlavado.generacionmarco.modelo.Data;
import com.example.jlavado.generacionmarco.modelo.pojos.Usuario;



public class LoginActivity extends AppCompatActivity {
    private Button ingresarButton;
    private TextInputEditText usuarioEditText;
    private TextInputEditText passwordEditText;
    String userUsuario;
    String passwordUsuario;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        ingresarButton = (Button) findViewById(R.id.login_button_ingresar);
        usuarioEditText = (TextInputEditText) findViewById(R.id.login_textInput_usuario);
        passwordEditText = (TextInputEditText) findViewById(R.id.login_textInput_password);

        usuarioEditText.setFilters(new InputFilter[]{new InputFilter.AllCaps(),new InputFilter.LengthFilter(8)});
        passwordEditText.setFilters(new InputFilter[]{new InputFilter.AllCaps(),new InputFilter.LengthFilter(8)});

        ingresarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                userUsuario = usuarioEditText.getText().toString();
                passwordUsuario = passwordEditText.getText().toString();

                if (validarCampos()){
                    if(userUsuario.equals("ADMIN") && passwordUsuario.equals("12345")){
                        Intent intent = new Intent(LoginActivity.this, AdminActivity.class);
                        startActivity(intent);
                        finish();
                    }else{
                        Data data =  new Data(LoginActivity.this);
                        data.open();
                        Usuario user = data.getUsuario(userUsuario);
                        data.close();
                        if(user == null){
                            usuarioEditText.setText("");
                            passwordEditText.setText("");
                            Toast.makeText(LoginActivity.this, "USUARIO NO EXISTE", Toast.LENGTH_SHORT).show();
                        }else{
                            if(passwordUsuario.equals(user.getClave())){
                                Intent intent = new Intent(LoginActivity.this, MarcoActivity.class);
                                intent.putExtra("nickUsuario",user.getUsuario());
                                intent.putExtra("idUsuario",user.get_id()+"");
                                intent.putExtra("idCargo",user.getCargo_id()+"");
                                startActivity(intent);
                                finish();
                            }else{
                                Toast.makeText(LoginActivity.this, "PASSWORD INCORRECTO", Toast.LENGTH_SHORT).show();
                            }
                        }
                    }
                }else{
                    Toast.makeText(LoginActivity.this, "Debe ingresar USUARIO y CONTRASEÑA", Toast.LENGTH_SHORT).show();
                }



            }
        });
    }

    public boolean validarCampos(){
        boolean valido = true;
        if(usuarioEditText.getText().toString().equals("") || passwordEditText.getText().toString().equals("")) valido = false;
        return valido;
    }
}
