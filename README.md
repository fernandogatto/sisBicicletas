# sisBicicletas-java
<h1>Universidade Federal Fluminense</h1>
<h2>Disciplina: PROGRAMAÇÃO ORIENTADA A OBJETOS (TCC00328)</h2>
<h3>Professora: Flavia Bernardini – <a href="mailto:fcbernardini@ic.uff.br" target="_blank">fcbernardini@ic.uff.br</a><h3>
<h4>Semestre: 2019.2 – 6as feiras das 18:00 às 22:00</h4>

<h2>Integrantes</h2>
<p>Fernando Gatto</p>
<p>Luann Sapucaia</p>
<p>Matheus Giron</p>

<h2>Trabalho Prático</h2>

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

<h2>O que foi desenvolvido</h2>

<h3>Hierarquia de classes</h3>

<p>Peça</p>
<ul>
  <li>Banco</li>
  <ul>
    <li>BancoCouro</li>
    <li>BancoPlastico</li>
  </ul>
  <li>Guidao</li>
  <ul>
    <li>GuidaoCurvo</li>
    <li>GuidaoReto</li>
  </ul>
  <li>Pedal</li>
  <ul>
    <li>PedalComClip</li>
    <li>PedalSemClip</li>
  </ul>
  <li>Pneu</li>
  <ul>
    <li>PneuGrosso</li>
    <li>PneuFino</li>
  </ul>
  <li>Quadro</li>
  <ul>
    <li>QuadroBMX</li>
    <li>QuadroTrilha</li>
  </ul>
</ul>

<p>Encomenda é a classe responsável pelo modelo de bicicleta montado pelo cliente.</p>

<p>Modelo é a classe responsável pelo modelo de bicicleta da fábrica.</p>

<p>Encomenda e Modelo têm uma lista de peças.</p>

<p>Pedido é a classe responsável por agrupar a lista de encomendas de um cliente.</p>

<p>ListaProjeto é a clase responsável pela lista de modelos de bicicleta prontos na fábrica. Ao se fazer um pedido, é preciso verificar se na fábrica existe um modelo correspondente ao da encomenda. Isso é feito através do método <strong>verificarListaProjeto</strong>. Se existir, essa encomenda é passada para Produção para que ela seja produzida. Senão, é preciso verificar se existem engenheiros disponíveis para que o projeto do novo modelo seja desenvolvido. Então a lista de engenheiros, alocada no RH, é passada por parâmetro e é feita essa verificação através do método <strong>verificarEngenheirosDisponiveis</strong>, que fica na classe Projeto. Se existirem engenheiros disponíves, a encomenda é desenvolvida em <strong>desenvolverProjeto</strong>, que também fica em Projeto. Senão, o RH fica responsável por contratar novos engenheiros.</p>

<p>Em <strong>desenvolverProjeto</strong>, é criado um novo modelo igual ao da encomenda e este modelo é adicionado à lista de modelos prontos da fábrica. Então, o modelo pode ser passado para Produção para que seja desenvolvido.</p>

<h2>Dificuldades práticas</h2>

<p>Entender a relação entre Modelo e Projeto;</p>
<p>Priorizar os métodos de cada classe;</p>
<p>Relacionar Encomenda com Projeto;</p>
<p>Verificar encomendas a partir da lista de modelos prontos de Projeto.</p>
