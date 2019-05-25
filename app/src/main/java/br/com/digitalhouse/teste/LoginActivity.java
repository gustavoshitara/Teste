package br.com.digitalhouse.teste;

import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity {

    private TextInputLayout textInputLayoutEmail;
    private TextInputLayout textInputLayoutPassword;
    private Button btnLogin;
    //private Button btnLoginFacebook;
    //private Button btnLoginGoogle;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        initViews();

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validateAndGoToNextActivity();
            }
        });
    }

    private void initViews(){
        textInputLayoutEmail = findViewById(R.id.textInputLayoutEmail);
        textInputLayoutPassword = findViewById(R.id.textInputLayoutPassword);
        btnLogin = findViewById(R.id.btnLogin);
        //btnLoginFacebook = findViewById(R.id.btnLoginFacebook);
        //btnLoginGoogle = findViewById(R.id.btnLoginGoogle);
    }

    private void validateAndGoToNextActivity(){
        String email = textInputLayoutEmail.getEditText().getText().toString();
        String password = textInputLayoutPassword.getEditText().getText().toString();

        if(email.isEmpty()){
            textInputLayoutEmail.setError("Email não pode ser vazio");
            return;
        }

        if(password.isEmpty()){
            textInputLayoutPassword.setError("Senha não pode ser vazia");
            return;
        }

        /*Comando para seguir para a tela de cadastro quando o botão 'Criar Senha' for clicado
        if(email != null && password != null){
            Intent intent = new Intent(LoginActivity.this,ProfileActivity.class);
            startActivity(intent);
        }else {
            Snackbar.make(textInputLayoutEmail, "Email ou Senha inválidos", Snackbar.LENGTH_SHORT);
        }
        */
    }
}
