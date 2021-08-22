/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import models.Adicional;
import models.Cadastro;
import models.Pedido;
import models.Produto;

/**
 *
 * @author Kaique
 */
public interface Icaixa {
    
  public float getSaldo();  
  
  public boolean openPedido(Cadastro _cliente);
  
  public void registerPedido(Pedido pedido);
  
  public void adicionarDecorador(int IdProduto, Adicional adicional);
  
}
