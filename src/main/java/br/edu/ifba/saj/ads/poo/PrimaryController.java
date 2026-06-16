package br.edu.ifba.saj.ads.poo;

import br.edu.ifba.saj.ads.poo.modelo.Cliente;
import br.edu.ifba.saj.ads.poo.modelo.ItemCardapio;
import br.edu.ifba.saj.ads.poo.modelo.Pedido;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

public class PrimaryController {

    @FXML
    private ListView<ItemCardapio> listCardapio;

    @FXML
    private ListView<ItemCardapio> listPedido;

    @FXML
    private Label lblTotal;

    private Pedido pedido;

    @FXML
    public void initialize() {

        Cliente cliente = new Cliente("Paulo");

        pedido = new Pedido(cliente);

        listCardapio.getItems().addAll(
                new ItemCardapio("Pizza", "Calabresa", 35),
                new ItemCardapio("Pizza", "Marguerita", 35),
                new ItemCardapio("Hamburguer", "Artesanal", 20),
                new ItemCardapio("Pastel", "queijo", 7),
                new ItemCardapio("Coca Cola", "350ml", 6)
                
                
        );
    }

    @FXML
    private void adicionarItem() {

        ItemCardapio item =
                listCardapio.getSelectionModel().getSelectedItem();

        if(item != null){
            pedido.adicionarItem(item);

            listPedido.getItems().add(item);

            lblTotal.setText(
                    "Total: R$ " + pedido.calcularTotal()
            );
        }
    }
}