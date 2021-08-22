package interfaces;

import models.Adicional;

public interface IProduto {

	public void onAdicional(Adicional adicional);
        
	public void onRemoverAdicional(int id);
        
        public void createProduto(String nome, float valor);
        
}
