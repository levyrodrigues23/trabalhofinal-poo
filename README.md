# FloraCearense

Sistema de classificação de Ferramentas em Java com perguntas no terminal para te guiar e fazer voce compreender sobre plantas de determinada característica.

## Sobre o Projeto

Este é um trabalho final de Programação Orientada a Objetos que implementa um sistema de classificação botânica de forma interativa. O usuário responde a perguntas sobre características de uma planta e o sistema identifica sua classificação, exibindo exemplos de plantas cearenses correspondentes e algumas das suas características para refinar de forma demasiada o contexto do sistma.

## Classificações Botânicas

O sistema classifica plantas em 5 grupos principais:

1. **Briófitas** - plantas que não possuem vasos condutores 
2. **Pteridófitas** - plantas que possuem vasos, mas não possuem sementes
3. **Gimnospermas** - plantas que possuem sementes, mas não possuem frutos
4. **Angiospermas** - plantas com flores e frutos
5. **Angiospermas com Espinhos** - subgrupo de angiospermas (cactos, plantas espinhosas)


### Principais Classes

#### `Planta` (Abstrata)
Classe base com atributos comuns:
- Nome popular
- Bioma
- Classificação botânica

#### `Especie`
Implementação genérica de uma planta com método `exibirFicha()`.

#### Classes Especializadas

- **`Briofita`**: Adiciona `substrato` e `possuiEsporofito`
- **`Pteridofita`**: Adiciona `tipoCrescimento` e `possuiFrondasDivididas`
- **`Gimnosperma`**: Adiciona `tipoFolha` e `produzCone`
- **`Angiosperma`**: Adiciona `temEspinho` e `tipoPlanta`

#### `CatalogoBotanico`
Gerencia uma coleção de plantas cearenses com mais de 100 espécies cadastradas. Essa coleção se baseou em alguns artigos fáceis de serem encontrados na internet, como o catálogo das angiospermas que se encontra no site do governo do Ceará no que tange a flora e um artigo de 1949, ou melhor, um dicionário de plantas do Ceará.

## Como Executar

### Pré-requisitos

- voce precisa ter Java instalado
- IDE Java (IntelliJ IDEA, Eclipse, NetBeans) ou terminal

### Passos

1. **Clone o repositório**
```bash
git clone https://github.com/levyrodrigues23/trabalhofinal-poo.git
cd trabalhofinal-poo
```

2. **Compile o projeto**
```bash
javac -d bin src/*.java
```

3. **Execute o programa**
```bash
java -cp bin Main
```

### Usando uma IDE

1. Abra o projeto na sua IDE preferida
2. Execute a classe `Main.java`
3. Responda às perguntas no console

## 💻 Exemplo de Uso

```
=== sistema de classificação botânica ===

A planta é vascular(possui raiz, folhas e caule)? (s/n): s
A planta possui sementes? (s/n): n

--- Plantas que pertencem a classificacao PTERIDOFITA ---
Planta: Samambaia | Bioma: Serras úmidas | Classificação:  PTERIDOFITA | Tipo de crescimento:  TERRESTRE | Frondes divididas:  Sim
Planta: Avenca | Bioma: Serras úmidas | Classificação: PTERIDOFITA | Tipo de crescimento: TERRESTRE | Frondes divididas:  Sim
...
```



## 🔑 Conceitos de POO Aplicados

### 1. **Herança**
```java
public class Angiosperma extends Especie {
    // Herda atributos e métodos de Especie
}
```

### 2. **Polimorfismo**
```java
@Override
public void exibirFicha() {
    // Cada classe implementa sua própria versão
}
```

### 3. **Encapsulamento**
```java
private List<Planta> plantas;
public List<Planta> getPlantas() {
    return plantas;
}
```

### 4. **Abstração**
```java
public abstract class Planta {
    public abstract void exibirFicha();
}
```

### 5. **Enumerações**
```java
public enum ClassificacaoBotanica {
    BRIOFITA, PTERIDOFITA, GIMNOSPERMA, ANGIOSPERMA
}
```

## 👨‍💻 Autor deste belíssimo código

**Levy Rodrigues**
- GitHub: [@levyrodrigues23](https://github.com/levyrodrigues23)

## 📄 Licença

Este projeto está disponível para quem tiver paciencia de entender um pouco sobre orientação a objetos, então está liberado para fins educacionais.

---


*Sistema de Classificação Botânica - Preservando e ensinando sobre a flora brasileira através da tecnologia* 🌿🇧🇷
