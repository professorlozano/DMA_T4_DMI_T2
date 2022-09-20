package pck_principal;

public class Principal {
    public static void main(String[] args) {
        DAO_Produtos obj_produtos = new DAO_Produtos();

        //consultar produtos
        //obj_produtos.consultar();

        //inserir produtos
        //Produto novoProduto = new Produto(6, "Pera",30.00, 10.0,2);
        //obj_produtos.inserir(novoProduto);

        //alterar produtos
        //Produto produtoAlterado = new Produto(6,"Pera Alterada", 25.00,5.0,3);
        //obj_produtos.alterar(produtoAlterado);

        //excluir produtos
        //obj_produtos.excluir(6);

        DAO_Unidades obj_unidades = new DAO_Unidades();

        //consultar unidades
        //obj_unidades.consultar();

        //inserir unidade
        //Unidade novaUnidade = new Unidade(7,"unidade nova");
        //obj_unidades.inserir(novaUnidade);

        //alterar unidade
        //Unidade unidadeAlterada = new Unidade(7,"unidade nova alterada");
        //obj_unidades.alterar(unidadeAlterada);

        //excluir unidade
        obj_unidades.excluir(7);


    }
}
