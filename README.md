
# 🚀 Trilha de Java Básico

Este repositório foi criado para registrar meus estudos e prática com a linguagem **Java**, focando nos **conceitos fundamentais**. A ideia é aprender de forma prática, com explicações simples e exemplos de código para fixar o conteúdo.

---

## 📚 Conteúdo

- [✅ Introdução ao Java](#introdução-ao-java)
- [🧱 Estrutura básica de um programa](#estrutura-básica-de-um-programa)
- [📦 Classes e Objetos](#classes-e-objetos)
- [⚙️ Métodos](#métodos)
- [🧠 Variáveis e Tipos](#variáveis-e-tipos)
- [🧮 Operadores em Java](#operadores-em-java)
- [🔁 Condições e Laços](#condições-e-laços)
- [📦 Arrays](#arrays)
- [📋 Listas (`List` e `ArrayList`)](#listas-list-e-arraylist)
- [📥 Entrada e Saída](#entrada-e-saída)
- [🧪 Exercícios e Exemplos](#exercícios-e-exemplos)

---

## ✅ Introdução ao Java

Java é uma linguagem de programação orientada a objetos, multiplataforma e amplamente utilizada no desenvolvimento de sistemas, jogos, apps e muito mais.

---

## 🧱 Estrutura básica de um programa

```java
public class MinhaClasse {
    public static void main(String[] args) {
        System.out.println("Olá, mundo!");
    }
}
```

- `public class` → define a classe
- `main` → é o ponto de entrada do programa (PSVM - public static void main)
- `System.out.println()` → imprime no console

---

## 📦 Classes e Objetos

```java
public class Pessoa {
    String nome;
    int idade;

    void dizerOi() {
        System.out.println("Oi, meu nome é " + nome);
    }
}
```

- **Classe** → é como um molde
- **Objeto** → é uma instância da classe

```java
Pessoa p = new Pessoa();
p.nome = "Pedro";
p.dizerOi();
```

---

## ⚙️ Métodos

```java
public int somar(int a, int b) {
    return a + b;
}
```

- Métodos podem ter parâmetros e retornar valores
- Use `void` quando não retornar nada

---

## 🧠 Variáveis e Tipos

| Tipo      | Exemplo          |
|-----------|------------------|
| `int`     | 10               |
| `double`  | 3.14             |
| `String`  | "Olá"            |
| `boolean` | true / false     |

---

## 🧮 Operadores em Java

### ➕ Operadores Aritméticos
| Operador | Exemplo  | Descrição         |
|----------|----------|-------------------|
| `+`      | `a + b`  | Soma              |
| `-`      | `a - b`  | Subtração         |
| `*`      | `a * b`  | Multiplicação     |
| `/`      | `a / b`  | Divisão           |
| `%`      | `a % b`  | Resto da divisão  |


### 🔍 Operadores Relacionais
| Operador | Exemplo   | Descrição           |
|----------|-----------|---------------------|
| `==`     | `a == b`  | Igual a             |
| `!=`     | `a != b`  | Diferente de        |
| `>`      | `a > b`   | Maior que           |
| `<`      | `a < b`   | Menor que           |
| `>=`     | `a >= b`  | Maior ou igual a    |
| `<=`     | `a <= b`  | Menor ou igual a    |


### 🔀 Operadores Lógicos
| Operador | Exemplo   | Descrição               |
|----------|-----------|-------------------------|
| `&&`     | `a && b`  | E lógico (AND)          |
| `&#124;&#124;` | `a &#124;&#124; b` | Ou lógico (OR) |
| `!`      | `!a`      | Negação lógica (NOT)    |


### 📝 Operadores de Atribuição
| Operador | Exemplo   | Descrição             |
|----------|-----------|-----------------------|
| `=`      | `a = 10`  | Atribuição simples     |
| `+=`     | `a += 5`  | Soma e atribui         |
| `-=`     | `a -= 3`  | Subtrai e atribui      |
| `*=`     | `a *= 2`  | Multiplica e atribui   |
| `/=`     | `a /= 4`  | Divide e atribui       |
| `%=`     | `a %= 3`  | Resto e atribui        |

### 🔁 Operadores de Incremento e Decremento
| Operador | Exemplo        | Descrição         |
|----------|----------------|-------------------|
| `++`     | `a++` ou `++a` | Incrementa 1      |
| `--`     | `a--` ou `--a` | Decrementa 1      |

---

## 🔁 Condições e Laços

### `if`, `else if`, `else`

```java
if (idade >= 18) {
    System.out.println("Maior de idade");
} else {
    System.out.println("Menor de idade");
}
```

### `for`

```java
for (int i = 0; i < 5; i++) {
    System.out.println(i);
}
```

### `while`

```java
int i = 0;
while (i < 5) {
    System.out.println(i);
    i++;
}
```

---

## 📦 Arrays

```java
int[] numeros = new int[3];
numeros[0] = 10;
numeros[1] = 20;
numeros[2] = 30;
```

- Índices começam do 0
- Tamanho fixo

---

## 📋 Listas (`List` e `ArrayList`)

```java
import java.util.ArrayList;
import java.util.List;

List<String> nomes = new ArrayList<>();
nomes.add("Pedro");
nomes.add("Henrique");

System.out.println(nomes.get(0)); // Pedro
```

- Tamanho flexível
- Usa métodos como `.add()`, `.remove()`, `.get()`, `.size()`

---

## 📥 Entrada e Saída

### Saída no console

```java
System.out.println("Olá");
System.out.printf("Nome: %s", nome);
```

### Entrada com Scanner

```java
import java.util.Scanner;

Scanner scanner = new Scanner(System.in);
String nome = scanner.nextLine();
int idade = scanner.nextInt();
```

---

## ✍️ Autor

Desenvolvido por [Pedro Trimboli](https://github.com/pedrotrimboli) — Estudante de Análise e Desenvolvimento de Sistemas, aprendendo Java com projetos práticos.

---

## ⭐ Contribuições

Este projeto é pessoal, mas se quiser sugerir melhorias ou exercícios, fique à vontade para abrir uma *issue* ou *pull request*.
