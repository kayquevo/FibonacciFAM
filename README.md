# Atividade Fibonacci - 23/09

---

### 🖥️ Leitura no console

<img src="imagem/console4.jpg" width="300px">

---

### Solução Iterativa

<img src="imagem/iterativa.jpg" width="500px">

<p>Esta solução implementa a sequência de Fibonacci de forma <b>iterativa</b>, um dos métodos mais eficientes e robustos. O algoritmo calcula cada termo de maneira progressiva, evitando o re-cálculo de valores e otimizando o uso de memória.</p>

<h4>Como Funciona</h4>
<ol>
    <li><b>Inicialização:</b> O processo começa com os dois primeiros termos da sequência (1, 1), que são adicionados a uma lista.</li>
    <li><b>Loop:</b> Em seguida, um loop <code>for</code> é iniciado para calcular os termos restantes. A cada iteração, o algoritmo:
        <ul>
            <li>Acessa os dois últimos números da lista (<code>último</code> e <code>penúltimo</code>).</li>
            <li>Soma esses dois números para obter o <code>próximo termo</code>.</li>
            <li>Adiciona o <code>próximo termo</code> ao final da lista, estendendo a sequência.</li>
        </ul>
    </li>
    <li><b>Finalização:</b> O loop continua até que a lista contenha o número total de termos desejado. O último valor adicionado é o resultado final.</li>
</ol>

---

### Solução Recursiva

<img src="imagem/recursiva.jpg" width="350px">

<p>Esta solução implementa a sequência de Fibonacci de forma <b>recursiva</b>, um método que se baseia na própria definição matemática da sequência ($F_n = F_{n-1} + F_{n-2}$).</p>

<h4>Como Funciona</h4>
<ol>
    <li><b>Condição de Parada (Caso Base):</b> A função verifica se o número de termos (<code>n</code>) é igual ou menor que 1. Se for, ela retorna o próprio <code>n</code>. Isso é crucial para evitar um loop infinito de chamadas.</li>
    <li><b>Chamada Recursiva:</b> Para qualquer outro valor de <code>n</code>, a função se chama duas vezes: uma para calcular o termo anterior (<code>n - 1</code>) e outra para calcular o termo penúltimo (<code>n - 2</code>).</li>
    <li><b>Soma:</b> Os resultados das duas chamadas recursivas são somados, retornando o valor do termo atual.</li>
</ol>

---

### Fórmula de Binet

<img src="imagem/Binet.jpg" width="420px">

<p>Esta solução implementa a sequência de Fibonacci usando a <b>Fórmula de Binet</b>, que permite calcular qualquer termo da sequência diretamente, sem a necessidade de calcular os termos anteriores.</p>

<h4>Como Funciona</h4>
<ol>
    <li><b>Cálculo das Constantes:</b> O método primeiro calcula os valores de Phi (φ), o Número de Ouro, e Psi (ψ), seu conjugado.</li>
    <li><b>Aplicação da Fórmula:</b> As constantes e o número de termos (<code>n</code>) são utilizados na fórmula matemática $F_n = (\phi^n - \psi^n) / \sqrt{5}$ para encontrar o valor de Fibonacci desejado.</li>
    <li><b>Arredondamento:</b> Como o cálculo usa números de ponto flutuante, o resultado é arredondado para o número inteiro mais próximo, garantindo a precisão do valor final.</li>
</ol>

---

<h4>Tempos de Execução (em segundos)</h4>
        <table class="performance-table">
            <thead>
                <tr>
                    <th>N</th>
                    <th>Iterativa</th>
                    <th>Recursiva</th>
                    <th>Binet</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td>10</td>
                    <td>0.0288</td>
                    <td>0.0453</td>
                    <td class="binet">0.0083</td>
                </tr>
                <tr>
                    <td>20</td>
                    <td>0.0383</td>
                    <td>0.178</td>
                    <td class="binet">0.0094</td>
                </tr>
                <tr>
                    <td>30</td>
                    <td>0.0439</td>
                    <td class="recursiva">7.6597</td>
                    <td class="binet">0.0327</td>
                </tr>
                <tr>
                    <td>40</td>
                    <td>0.053</td>
                    <td class="recursiva">485.0371</td>
                    <td class="binet">0.0169</td>
                </tr>
                <tr>
                    <td>50</td>
                    <td>0.0936</td>
                    <td class="recursiva">4839.2023</td>
                    <td class="binet">0.0229</td>
                </tr>
</tbody>
</table>



### Referencias

<p>
        DevMedia. Sequência de Fibonacci em Java. 2012.<br>
        Disponível em: <a href="https://www.devmedia.com.br/sequencia-de-fibonacci-em-java/23620">https://www.devmedia.com.br/sequencia-de-fibonacci-em-java/23620</a>
    </p>

<p>
        Matemática com Cristiano Marcell. A FÓRMULA PARA DETERMINAR QUALQUER TERMO DA SEQUÊNCIA FIBONACCI. 2021. YouTube.<br>
        Disponível em: <a href="https://www.youtube.com/watch?v=rF4VGqwSTLc">https://www.youtube.com/watch?v=rF4VGqwSTLc</a>
    </p>

<p>
        GUJ - Java Users' Group. Medir o tempo de execução de um método.<br>
        Disponível em: <a href="https://www.guj.com.br/t/medir-o-tempo-de-execucao-de-um-metodo/34531">https://www.guj.com.br/t/medir-o-tempo-de-execucao-de-um-metodo/34531</a>
    </p>
 
---

### 🛠️ Tecnologias Utilizadas

<ul>
    <li>Java</li>
    <li>Eclipse IDE</li>
    <li>Git & GitHub</li>
</ul>
