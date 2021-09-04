 package com.example.meuprojeto;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Produtos_Info {

        String Produto, Quantidade, Código, Local, Descrição, Img_url;

        public Produtos_Info() {
        }

        public Produtos_Info(String produto, String quantidade, String código, String local,
                             String descrição, String img_url) {
                Produto = produto;
                Quantidade = quantidade;
                Código = código;
                Local = local;
                Descrição = descrição;
                Img_url = img_url;
        }

        public String getImg_url() {
                return Img_url;
        }

        public void setImg_url(String img_url) {
                Img_url = img_url;
        }

        public String getProduto() {
                return Produto;
        }

        public void setProduto(String produto) {
                Produto = produto;
        }

        public String getQuantidade() {
                return Quantidade;
        }

        public void setQuantidade(String quantidade) {
                Quantidade = quantidade;
        }

        public String getCódigo() {
                return Código;
        }

        public void setCódigo(String código) {
                Código = código;
        }

        public String getLocal() {
                return Local;
        }

        public void setLocal(String local) {
                Local = local;
        }

        public String getDescrição() {
                return Descrição;
        }

        public void setDescrição(String descrição) {
                Descrição = descrição;
        }

        public void salvar() {
                DatabaseReference reference = FirebaseDatabase.getInstance().getReference();
                reference.child("Produtos").child(getProduto()).setValue(this);
        }
}
