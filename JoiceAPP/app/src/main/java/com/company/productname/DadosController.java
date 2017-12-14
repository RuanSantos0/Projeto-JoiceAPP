package com.company.productname;

import android.content.Context;

import java.util.List;

/**
 * Created by Ruan on 13/12/2017.
 */

public class DadosController {

    public DadosController(Context context){
        //integração com o banco de  dados;
    }

    public boolean create(Dados dados){
        return true;
    }

    public int totalDeCuidadores(){
        return 0;
    }

    public List<Dados> listarCuidador(){

        return null;
    }

    public Dados buscarPeloID(int dadosID){
        return null;
    }

    public boolean update(Dados dados){

        return true;
    }

    public boolean delete(int dadosID){
        return true;
    }




}
