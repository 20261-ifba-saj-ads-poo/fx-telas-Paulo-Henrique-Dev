package br.edu.ifba.saj.ads.poo.modelo;

import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private Cliente cliente;
    private List<ItemCardapio> itens;

    public Pedido(Cliente cliente) {
        this.cliente = cliente;
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(ItemCardapio item) {
        itens.add(item);
    }

    public void removerItem(ItemCardapio item) {
        itens.remove(item);
    }

    public double calcularTotal() {

        double total = 0;

        for (ItemCardapio item : itens) {
            total += item.getPreco();
        }

        return total;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public List<ItemCardapio> getItens() {
        return itens;
    }
}