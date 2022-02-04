fun main(){
    //Estanciando vendedores

    val filipe:Vendedor = Vendedor()
        filipe.nome = "Filipe Martins"
        filipe.cpf = "875.502.660.23"
        filipe.dataNascimento = "08/06/2000"
        filipe.endereco = "Av. Dom Cláudio José Gonçalvez Ponce de Leão"
        filipe.telefoneComercial = "(51) 99557-0497"
        filipe.salario = 2.050f
        filipe.comissao = "20%"

    val douglas:Vendedor = Vendedor()
        douglas.nome = "Douglas Mello"
        douglas.cpf = "060.169.550-03"
        douglas.dataNascimento = "19/11/2000"
        douglas.endereco = "Assis Brasil 4600"
        douglas.telefoneComercial = "(51) 8348-5739"
        douglas.salario = 2.050f
        douglas.comissao = "20%"

    // Estanciando clientes

    val raquel:Cliente = Cliente()
        raquel.nome = "Raquel Marx"
        raquel.cpf = "687.877.660-52"
        raquel.endereco = "José Alencar 965"
        raquel.dataNascimento = "25/05/2000"
        raquel.telefone = "(51) 9437-5868"

    val luiza:Cliente = Cliente()
        luiza.nome = "Luiza Lepkoski"
        luiza.cpf = "745.402.549-98"
        luiza.endereco = "Doutor Otávio 400"
        luiza.dataNascimento = "26/05/2000"
        luiza.telefone = "(51) 8100-1947"

    //Estanciando Produto

    val casteloLegoHarryPotter:Produto = Produto()
        casteloLegoHarryPotter.nome = "Castelo de Lego do Harry Potter"
        casteloLegoHarryPotter.preco = 1.500f
        casteloLegoHarryPotter.vencimento = null
        casteloLegoHarryPotter.quantidade = 200

    val legoBatman:Produto = Produto()
        legoBatman.nome = "Lego do Batman"
        legoBatman.preco = 579.99f
        legoBatman.vencimento = null
        legoBatman.quantidade = 150

    //Estanciando Fornecedoras

    val panini:Fornecedora = Fornecedora()
        panini.nome = "Panini"
        panini.endereco = "Av Paulista, 1500"
        panini.telefoneComercial = "(51) 98765-0498"
        panini.produto = casteloLegoHarryPotter

    val mbrinq:Fornecedora = Fornecedora()
        mbrinq.nome = "Lego Mbrinq"
        mbrinq.endereco = "Av Salvador Leão, 36"
        mbrinq.telefoneComercial = "(51) 99556-0440"
        mbrinq.produto = legoBatman

    //Estanciando Transportadoras

    val miraTransportes:Transportadora = Transportadora()
        miraTransportes.nome = "Mira Transportes | Brinquedos"
        miraTransportes.endereco = "Rua Ari Barroso, 1.172 - Galpão D"
        miraTransportes.telefoneComercial = "(47) 2123-990"
        miraTransportes.fornecedora = panini
        miraTransportes.produto = casteloLegoHarryPotter

    val soluTudo:Transportadora = Transportadora()
        soluTudo.nome = "Solu Tudo"
        soluTudo.endereco = "Rua Eucalipto, 70, Campestre - Casa São"
        soluTudo.telefoneComercial = "(51) 9912-6387"
        soluTudo.fornecedora = mbrinq
        soluTudo.produto = legoBatman

    //Estanciando Vendas

    val venda1:Venda = Venda()
        venda1.produto = casteloLegoHarryPotter
        venda1.quantidade = 2
        venda1.valorTotal = 3.000f
        venda1.vendedor = douglas

    val venda2:Venda = Venda()
        venda2.produto = legoBatman
        venda2.quantidade = 1
        venda2.valorTotal = 579.99f
        venda2.vendedor = filipe
}