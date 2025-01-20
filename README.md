## Estudo em "Padrões de Projeto".
Pedi ao ChatGPT algumas ideias para aplicar os padrões, então aqui estão:

#### Abstract Factory
**Cenário**: Você está construindo uma toolkit de UI para múltiplas plataformas, onde você precisa de diferentes estilos e comportamentos de botões para iOS e Android. Você quer uma interface consistente para criar componentes de UI, mas cada plataforma exige implementações específicas.
**Ideia**: Use o padrão de Abstract Factory para criar widgets como botões, campos de texto e caixas de seleção, onde cada plataforma tem seu próprio conjunto de implementações.

#### Builder
**Cenário**: Você está criando um sistema de configuração para uma aplicação onde um objeto de configuração complexo precisa ser construído passo a passo (ex.: configurando uma arquitetura de servidor de múltiplos níveis).
**Ideia**: Use o padrão de Builder para construir a configuração do servidor, com chamadas de métodos encadeados, como configurar memória, armazenamento, núcleos de CPU e conexões de banco de dados.

#### Factory Method
**Cenário**: Você está desenvolvendo um sistema de logística onde diferentes tipos de serviços de entrega (Aéreo, Terrestre, Marítimo) precisam ser criados dependendo das preferências do cliente.
**Ideia**: Use o padrão de Factory Method para instanciar a estratégia de entrega correta sem precisar conhecer a classe concreta com antecedência.

#### Prototype
**Cenário**: Você tem um jogo de simulação onde os objetos do jogo (ex.: inimigos, recursos) são complexos e devem ser clonados com variações em tempo de execução.
**Ideia**: Use o padrão de Prototype para clonar e modificar objetos do jogo rapidamente, sem precisar recriar do zero.

#### Singleton
**Cenário**: Você precisa garantir que um gerente de configuração ou um serviço de log seja instanciado apenas uma vez em toda a aplicação.
**Ideia**: Implemente o padrão Singleton para controlar a criação da instância do gerente de configuração ou do logger, evitando múltiplas instâncias.

#### Adapter
**Cenário**: Você tem uma biblioteca que fornece processamento de pagamentos (como Stripe), mas precisa integrá-la a um sistema existente que espera uma API completamente diferente (como PayPal).
**Ideia**: Use o padrão Adapter para fornecer uma interface comum que permita ao sistema de processamento de pagamentos trabalhar tanto com Stripe quanto com PayPal.

#### Bridge
**Cenário**: Você está criando uma aplicação de desenho onde os usuários podem desenhar diferentes formas (ex.: Círculo, Quadrado) usando vários motores de renderização (ex.: OpenGL, DirectX, Vulkan).
**Ideia**: Use o padrão Bridge para separar a abstração (formas) da implementação (motores de renderização), evitando criar subclasses para cada combinação possível.

#### Composite
**Cenário**: Você está construindo um navegador de sistema de arquivos, onde pastas podem conter arquivos e outras pastas.
**Ideia**: Use o padrão Composite para tratar arquivos e pastas de maneira uniforme, permitindo operações recursivas como "excluir" ou "mover" em toda a estrutura de arquivos.

#### Decorator
**Cenário**: Você está criando um editor de texto que suporta diferentes estilos e formatos (ex.: negrito, itálico, sublinhado). Os usuários podem aplicar múltiplos estilos a um texto.
**Ideia**: Use o padrão Decorator para adicionar ou combinar dinamicamente diferentes estilos (negrito, itálico, etc.) a um objeto de texto.

#### Facade
**Cenário**: Você tem uma biblioteca complexa de processamento de mídia, com vários subsistemas para áudio, vídeo e imagens. Um usuário quer realizar uma tarefa simples, como converter um arquivo de vídeo para outro formato.
**Ideia**: Ofereça uma classe de fachada que simplifique a API para o usuário final, expondo apenas os métodos relevantes e ocultando a complexidade dos subsistemas subjacentes.

#### Flyweight
**Cenário**: Você está desenvolvendo um jogo onde muitos objetos compartilham propriedades comuns (ex.: árvores ou NPCs que usam o mesmo texto, animação e comportamento).
**Ideia**: Use o padrão Flyweight para garantir que o estado compartilhado seja armazenado em um único lugar, enquanto o estado único (posição, saúde, etc.) é mantido separadamente.

#### Proxy
**Cenário**: Você está criando um sistema de processamento de imagens em larga escala que precisa lidar com imagens de alta resolução. Você deseja carregá-las de maneira preguiçosa para evitar sobrecarga de memória.
**Ideia**: Use o padrão Proxy, onde o objeto proxy representa a imagem e controla o acesso ao objeto real da imagem, carregando-o apenas quando necessário.

#### Chain of Responsibility
**Cenário**: Você está criando um sistema de tratamento de eventos, onde os eventos podem ser processados por múltiplos manipuladores em sequência, e cada manipulador pode ou processar o evento ou passá-lo para o próximo.
**Ideia**: Use o padrão Chain of Responsibility para permitir que diferentes manipuladores processem tipos específicos de eventos de maneira desacoplada.

#### Command
**Cenário**: Você está criando um sistema de interface de usuário onde os usuários podem acionar uma série de ações (como Salvar, Abrir e Imprimir) por meio de botões. Você precisa armazenar o histórico de ações para permitir desfazer/refazer.
**Ideia**: Use o padrão Command para encapsular ações como objetos de comando, permitindo fácil funcionalidade de desfazer/refazer e separando o invocador (botão) da ação.

#### Interpreter
**Cenário**: Você está criando uma linguagem específica de domínio (DSL) para consultas a um banco de dados (algo semelhante ao SQL). Os usuários escrevem consultas de forma textual e você precisa interpretá-las.
**Ideia**: Use o padrão Interpreter para definir a gramática e semântica da sua DSL e implementar um interpretador para processar as consultas.

#### Iterator
**Cenário**: Você está trabalhando em uma biblioteca que oferece diferentes tipos de coleções (listas, conjuntos, mapas). Você precisa de uma maneira padrão de iterar sobre os elementos em qualquer coleção.
**Ideia**: Use o padrão Iterator para fornecer uma interface uniforme para percorrer vários tipos de coleções sem expor suas estruturas internas.

#### Mediator
**Cenário**: Você está criando uma aplicação de chat onde múltiplos usuários se comunicam entre si. Os usuários devem se comunicar indiretamente por meio de um serviço central de mensagens para evitar a comunicação direta entre eles.
**Ideia**: Use o padrão Mediator para centralizar a lógica de comunicação e coordenar a interação entre os usuários, garantindo que eles não precisem se conhecer diretamente.

#### Memento
**Cenário**: Você está criando um editor de texto com funcionalidade de desfazer e refazer. Cada alteração no documento deve ser salva para que o usuário possa voltar aos estados anteriores.
**Ideia**: Use o padrão Memento para armazenar o estado do documento em diferentes pontos no tempo e restaurá-lo quando necessário.

#### State
**Cenário**: Você está criando um jogo de estratégia baseado em turnos onde as unidades podem estar em diferentes estados (inativo, movendo, atacando, etc.), e o comportamento delas muda conforme o estado.
**Ideia**: Use o padrão State para permitir que a unidade altere seu comportamento com base no estado atual, sem precisar de uma série de condicionais.

#### Strategy
**Cenário**: Você está criando uma aplicação para calcular custos de envio. A estratégia de cálculo pode variar dependendo do destino, peso e método de entrega (ex.: expresso, padrão, econômico).
**Ideia**: Use o padrão Strategy para permitir que o cliente escolha diferentes estratégias de cálculo de custos de envio dinamicamente.

#### Template Method
**Cenário**: Você está criando um framework de web onde diferentes tipos de páginas (página inicial, página de produto, página de checkout) exigem diferentes sequências de etapas (ex.: buscar dados, renderizar UI, tratar envio de formulário).
**Ideia**: Use o padrão Template Method para definir o esqueleto do processo, permitindo que subclasses sobrescrevam etapas específicas (ex.: buscar dados), mas mantendo outras etapas (como renderizar) constantes.

#### Visitor
**Cenário**: Você tem uma estrutura de dados em forma de árvore (ex.: um conjunto de documentos com diferentes seções como títulos, parágrafos e imagens), e precisa aplicar várias operações sobre ela (ex.: renderizar, imprimir ou calcular estatísticas).
**Ideia**: Use o padrão Visitor para definir uma nova operação sobre os elementos da estrutura da árvore, sem precisar modificar as classes dos elementos em si.

> [!IMPORTANT]
> O conteúdo em texto deste repositório é baseado nos conteúdos de refactoring.guru. Não tenho os direitos de uso ou de propriedade dos materias escritos, e os códigos são testes meus para aprender o conteúdo, não há interesse algum financeiro neste repositório. 