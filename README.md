# sisBicicletas-java
<h1>Universidade Federal Fluminense</h1>
<h2>Disciplina: PROGRAMAÇÃO ORIENTADA A OBJETOS (TCC00328)</h2>
<h3>Professora: Flavia Bernardini – <a href="mailto:fcbernardini@ic.uff.br" target="_blank">fcbernardini@ic.uff.br</a><h3>
<h4>Semestre: 2019.2 – 6as feiras das 18:00 às 22:00</h4>

<p>Trabalho Prático</p>

<p>O objetivo do trabalho prático de cada grupo é desenvolver uma parte de um sistema computacional para uma fábrica de bicicletas.</p>

<p>Os grupos foram dividos em:</p>
<ul>
<li>Financeiro</li>
<li>Projeto</li>
<li>Produção</li>
<li>Estoque</li>
<li>RH</li>
<li>Pedido</li>
<li>Teste e Entrega do Produto</li>
<li>Compras</li>
</ul>

<p>Na etapa Pedido, o setor de vendas recebe uma encomenda de um cliente, armazena seus dados e a quantidade de bicicletas a serem produzidas. O setor de vendas deve verificar se existem bicicletas daquele modelo prontas para entrega no estoque. Caso existam, o pedido é imediatamente processado e passa para a etapa de entrega. Caso contrário, o setor deve encaminhar a encomenda para o setor de PCP. Deve ser feita uma baixa de itens vendidos no sistema, após a venda ser concluída.</p>

<p>Na etapa Projeto e Produção, o setor de PCP deve verificar se existe um projeto que atenda os itens solicitados na encomenda. Se existir, o item deve ser encaminhado para a produção. Se não existir, o projeto é desenvolvido, e a capacidade de produção é verificada. Deve ser verificada a quantidade em estoque de materiais para a produção do item encomendado (banco, rodas, pneus, dentre outros). Caso haja falta de materiais, o setor de PCP deve encaminhar para o setor de Compras um pedido de novos materiais. Esse setor também é responsável por alocar o corpo técnico para a produção, o que implica em saber como está a alocação atual, e para qual prazo deve ocorrer essa nova alocação. Além do corpo técnico, um gerente de produção também deve ser alocado. Caso haja indisponibilidade de mão de obra, o setor de PCP encaminha para o setor de RH um pedido de contratação. Caso todas as informações estejam disponibilizadas, o produto deve entrar em produção, sendo o projeto executado com pessoas e materiais necessários disponíveis. Após a produção, testes são realizados nos produtos. Se o produto está funcionando, pode ser entregue; se o produto não estiver funcionando, a produção deve ser reiniciada.</p>

<p>Na etapa Produto, após a realização dos testes para verificação e validação do produto, o setor Financeiro emite a nota fiscal, recebe o pagamento e expede o produto para entrega. Em caso de ausência no pagamento, o produto não será entregue e será expedida uma nota de aviso ao comprador.</p>

<p>Admite-se que não faltam recursos financeiros para a produção, e assim nunca há impedimento de compras e contratações (setor de RH);</p>

<p>Os diversos setores podem ser atendidos por um mesmo módulo do sistema, ou um único setor pode ser atendido por mais de um módulo do sistema, ficando a critério do projeto de software implementado.</p>
