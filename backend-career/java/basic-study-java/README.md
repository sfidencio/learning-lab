# 🚀 Basic Study Java

## 📚 Visão Geral

Este projeto é uma aplicação Java criada para fins de aprendizado e experimentação. Ele demonstra conceitos básicos de programação Java, estrutura de projetos e uso de ferramentas modernas como o IntelliJ IDEA.

---

## 🧾 Resumo de Tipos em Java

### 🔗 Documentação oficial (Oracle) por tema

- **Tipos primitivos / tipos por referência** (JLS):
  - Tipos (visão geral): https://docs.oracle.com/javase/specs/jls/se21/html/jls-4.html
  - Tipos primitivos: https://docs.oracle.com/javase/specs/jls/se21/html/jls-4.html#jls-4.2
  - Tipos por referência: https://docs.oracle.com/javase/specs/jls/se21/html/jls-4.html#jls-4.3
- **Stack vs heap / áreas de memória da JVM** (JVMS):
  - Runtime Data Areas: https://docs.oracle.com/javase/specs/jvms/se21/html/jvms-2.html#jvms-2.5
- **Wrappers + autoboxing/unboxing** (JLS + API):
  - Boxing conversion: https://docs.oracle.com/javase/specs/jls/se21/html/jls-5.html#jls-5.1.7
  - Unboxing conversion: https://docs.oracle.com/javase/specs/jls/se21/html/jls-5.html#jls-5.1.8
  - `java.lang.Integer` (exemplo): https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Integer.html
- **`String`, `equals()` vs `==`, concatenação** (JLS + API):
  - `String` (API): https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html
  - String literals (JLS): https://docs.oracle.com/javase/specs/jls/se21/html/jls-3.html#jls-3.10.5
  - Operador `+` e concatenação (JLS): https://docs.oracle.com/javase/specs/jls/se21/html/jls-15.html#jls-15.18.1
  - Contrato de `equals()` (API do `Object`): https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#equals(java.lang.Object)
- **Text Blocks (Java 15+)** (JLS):
  - Text Blocks (JLS): https://docs.oracle.com/javase/specs/jls/se21/html/jls-3.html#jls-3.10.6
- **`format` / `printf` / `Formatter`** (API):
  - `java.util.Formatter`: https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Formatter.html
  - `java.io.PrintStream#printf`: https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/io/PrintStream.html#printf(java.lang.String,java.lang.Object...)
  - `String#format`: https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html#format(java.lang.String,java.lang.Object...)
- **Arrays** (JLS + API):
  - Arrays (JLS): https://docs.oracle.com/javase/specs/jls/se21/html/jls-10.html
  - `java.util.Arrays` (API): https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Arrays.html
- **Enums** (JLS + API):
  - Enum Classes (JLS): https://docs.oracle.com/javase/specs/jls/se21/html/jls-8.html#jls-8.9
  - `java.lang.Enum` (API): https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Enum.html
- **Records (Java 16+)** (JLS + API):
  - Record Classes (JLS): https://docs.oracle.com/javase/specs/jls/se21/html/jls-8.html#jls-8.10
  - `java.lang.Record` (API): https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Record.html
- **Generics (tipos parametrizados)** (JLS + Tutorial Oracle):
  - Type Arguments / generics (JLS): https://docs.oracle.com/javase/specs/jls/se21/html/jls-4.html#jls-4.5
  - Java Tutorials (Generics): https://docs.oracle.com/javase/tutorial/java/generics/
- **Casting (conversão de tipos)** (JLS):
  - Conversions and Contexts (JLS): https://docs.oracle.com/javase/specs/jls/se21/html/jls-5.html
  - Cast operator (JLS): https://docs.oracle.com/javase/specs/jls/se21/html/jls-15.html#jls-15.16
- **`switch` (statement vs expression)** (JLS):
  - `switch` statement (JLS): https://docs.oracle.com/javase/specs/jls/se21/html/jls-14.html#jls-14.11
  - `switch` expressions (JLS): https://docs.oracle.com/javase/specs/jls/se21/html/jls-15.html#jls-15.28

### 1) Tipos Primitivos (8)
- **Integrais**: `byte` (8b), `short` (16b), `int` (32b), `long` (64b)
- **Ponto flutuante**: `float` (32b), `double` (64b)
- **Lógico**: `boolean`
- **Caractere**: `char` (16b, Unicode)

#### Tamanhos (bits) e faixas (aprox.)
| Tipo | Bits | Faixa (aprox.) |
|---|---:|---|
| `byte` | 8 | -128 a 127 |
| `short` | 16 | -32.768 a 32.767 |
| `int` | 32 | -2.147.483.648 a 2.147.483.647 |
| `long` | 64 | -9,22e18 a 9,22e18 |
| `float` | 32 | ~6–7 dígitos de precisão (IEEE 754) |
| `double` | 64 | ~15–16 dígitos de precisão (IEEE 754) |
| `char` | 16 | 0 a 65.535 (Unicode code unit) |
| `boolean` | — | `true` / `false` (tamanho não é definido pela linguagem) |

Exemplo:
```java
int idade = 30;
long total = 10_000L;
double preco = 19.90;
boolean ativo = true;
char letra = 'A';
```

#### Onde ficam e como são armazenados (stack vs heap)
Ideia central: **primitivos carregam o valor “direto”** (não são referências). Onde esse valor fica depende do *contexto*.

Desenho (visão simplificada):

```text
STACK (por thread)                             HEAP (compartilhado)
┌───────────────────────────────┐             ┌──────────────────────────────┐
│ frame: main()                 │             │   Object Pessoa              │
│ ────────────────────────────  │             │  ┌─────────────────────────┐ │
│ int i = 42        (valor)     │             │  │ int idade = 30 (inline) │ │
│ double d = 3.14   (valor)     │             │  │ String nome -> ref  ─────┼─┼──┐
│ Pessoa p -> ref ──────────────┼────────────►│  └─────────────────────────┘ │  │
│ int[] a -> ref ───────────────┼────────────►│   int[] (array)              │  │
└───────────────────────────────┘             │  [ 1 ][ 2 ][ 3 ] (inline)    │  │
                                              │                              │  │
                                              │   String "Sara" (objeto) ◄───┘  │
                                              └──────────────────────────────┘

Notas:
- No STACK ficam *slots* com valores primitivos e *referências*.
- No HEAP ficam objetos/arrays; campos primitivos ficam “dentro” do objeto/array (inline).
```

- **Variáveis locais (dentro de métodos)**  
  Normalmente ficam no **stack frame** do método (pilha da thread): slots para `int`, `long` (geralmente 2 slots), `double` (2), etc.  
  *Obs.: a JVM/JIT pode otimizar e manter valores em registradores, eliminar variáveis, etc.*

- **Parâmetros de métodos**  
  Também entram no **stack frame** (como slots), seguindo a mesma lógica de locais.

- **Campos de instância (atributos de objetos)**  
  Ficam **dentro do objeto no heap**. O primitivo é armazenado “inline” no layout do objeto (não há um objeto separado só para o valor).

- **Campos `static`**  
  São associados à **classe**. Na prática ficam em uma área gerenciada pela JVM (normalmente no heap junto com dados da classe), mas o importante é: **não** ficam no stack.

- **Arrays de primitivos (`int[]`, `double[]`, etc.)**  
  O array é um **objeto no heap** e os elementos primitivos ficam armazenados **contiguamente** dentro do próprio array (sem boxing por elemento).

- **Arrays de referência (`String[]`, `Integer[]`)**  
  O array guarda **referências**; os objetos apontados ficam separados no heap.

- **Wrappers (`Integer`, `Double`, ...)**  
  Aqui já não é primitivo: é **objeto no heap** contendo um campo primitivo interno. `Integer x = 10;` pode criar objeto (autoboxing), e `int y = x;` faz unboxing.

Notas:
- “Stack vs heap” é um modelo útil, mas **implementação exata** varia por JVM e otimizações (ex.: *escape analysis* pode alocar/otimizar de forma diferente).
- `boolean` é lógico (`true/false`); o “tamanho físico” pode variar na implementação, embora semanticamente seja um valor simples.

### 2) Wrappers (objetos dos primitivos)
- `Byte`, `Short`, `Integer`, `Long`, `Float`, `Double`, `Boolean`, `Character`
- Usados em **collections/generics** (ex.: `List<Integer>`) e quando `null` é necessário.
- **Autoboxing/Unboxing** acontece automaticamente, mas pode impactar performance em loops.

Exemplo:
```java
Integer x = 10;      // autoboxing (int -> Integer)
int y = x;           // unboxing (Integer -> int)
```

### 3) Tipos por Referência (Classes/Objetos)
- Tudo que **não** é primitivo é referência: classes, interfaces, arrays, enums, records.
- Referências podem ser `null`.

Exemplo:
```java
String nome = "Sara";
Object obj = nome;   // upcast (polimorfismo)
```

### 4) `String` (imutável)
- `String` é **classe** e é imutável; concatenações frequentes prefira `StringBuilder`.

Exemplo:
```java
String s = "a" + "b";          // ok para poucos usos
StringBuilder sb = new StringBuilder().append("a").append("b");
```

#### Por que não é legal usar `==` ao invés de `equals()` (String e outros objetos)
- `==` compara **identidade** (se é o **mesmo objeto** na memória / mesma referência).
- `equals()` compara **igualdade lógica** (conteúdo), *quando a classe implementa isso*.
- **Armadilha:** dois objetos **diferentes** podem ter **conteúdo igual**; nesse caso `==` retorna **false** mesmo “parecendo igual”.
- Em `String`, `==` pode “funcionar” às vezes por causa do **string pool / interning**, mas isso é um detalhe de otimização e torna o código frágil.

Exemplos (String):
```java
String a = "java";
String b = "java";
System.out.println(a == b);        // geralmente true (mesma referência no pool)
System.out.println(a.equals(b));   // true (mesmo conteúdo)

String c = new String("java");
System.out.println(a == c);        // false (objetos diferentes)
System.out.println(a.equals(c));   // true (mesmo conteúdo)
```

Para qualquer outro objeto:
```java
// Por padrão, Object#equals pode ser o mesmo que '==' (identidade),
// a menos que a classe sobrescreva equals() (ex.: String, BigDecimal, etc).
```

Boas práticas:
- Use `a.equals(b)` quando você quer comparar **conteúdo** (e `a` não é `null`).
- Use `java.util.Objects.equals(a, b)` quando pode haver `null` (é null-safe).
- Se você sobrescrever `equals()`, normalmente deve sobrescrever `hashCode()` também (contrato).
- Exceção comum: `enum` pode (e deve) ser comparado com `==` (identidade única por constante).

Dica pra lembrar sempre:
- **`==` pergunta: “é o MESMO objeto?”**  
  **`equals()` pergunta: “tem o MESMO conteúdo?”**
- Regra prática: **se é `String`/objeto e você quer “igualdade”, pense `equals` primeiro.**

### 4.1) Text Blocks (Java 15+)
- **Text Blocks** são literais de `String` multilinha usando `"""`.
- Melhoram legibilidade para textos grandes (JSON, XML, SQL, HTML) e reduzem necessidade de escapes.
- A indentação comum é removida automaticamente (mantém o layout “natural” do bloco).
- Interpolação: use `String#formatted(...)` (ou `String.format(...)`).

Exemplo (JSON):
```java
String json = """
    {
      "nome": "Sara",
      "idade": 30
    }
    """;
```

Exemplo (template com `formatted`):
```java
String nome = "Sara";
String msg = """
    Olá, %s!
    Seja bem-vinda.
    """.formatted(nome);
```

Dicas rápidas:
- Para aspas duplas dentro do bloco, use `\"` (quando necessário).
- Para evitar quebra de linha em um ponto específico, pode-se usar `\` no final da linha.
- Para manter espaço no fim da linha, use `\s`.

### 4.2) `format` / `printf` / placeholders (`Formatter`)
- `System.out.printf(format, args...)` **imprime** formatado (não retorna `String`).
- `String.format(format, args...)` **retorna** uma `String` formatada.
- `"template".formatted(args...)` (Java 15+) é equivalente a `String.format(template, args...)`.

#### Placeholders (conversões) mais usados
- `%d` inteiro (decimal)
- `%f` ponto flutuante
- `%s` string (`toString()`)
- `%n` nova linha (portável; prefira a `\n`)

Exemplo:
```java
int n = 42;
double pi = 3.14159;
String nome = "Sara";

System.out.printf("n=%d pi=%.2f nome=%s%n", n, pi, nome);
String msg = "n=%d pi=%.2f nome=%s%n".formatted(n, pi, nome);
```

#### Largura, precisão e flags (modificadores)
Sintaxe (resumo): `%[arg_index$][flags][width][.precision]conversion`

- `width`: largura mínima (preenche com espaços)
- `.precision`: casas em `%f` (ex.: `%.2f`) ou tamanho máx em `%s` (ex.: `%.5s`)
- flags comuns:
  - `-` alinha à esquerda (`'%-10s'`)
  - `0` completa com zeros (`'%08d'`)
  - `+` sempre mostra sinal (`'%+d'`)
  - `,` separador de milhar (depende de `Locale`) (`'%,.2f'`)

Exemplo:
```java
System.out.printf("'%8d'%n", 42);     // direita
System.out.printf("'%-8d'%n", 42);    // esquerda
System.out.printf("'%08d'%n", 42);    // zeros
System.out.printf("'%.3f'%n", 3.14159);
System.out.printf("'%.5s'%n", "Hello, World!");
```

#### Índice do argumento (reordenação / reutilização)
```java
System.out.printf("%2$s (%1$d)%n", 42, "ID"); // 1º e 2º argumentos reordenados
```

#### Locale (pt-BR)
```java
System.out.printf(java.util.Locale.forLanguageTag("pt-BR"), "%,.2f%n", 1234567.89);
```

#### Datas e horas (conversões `%t...`)
```java
long now = System.currentTimeMillis();
System.out.printf("%1$tF %1$tT%n", now); // %tF=yyyy-MM-dd, %tT=HH:mm:ss
```

### 5) Arrays
- Tamanho fixo e tipo homogêneo.

Exemplo:
```java
int[] nums = {1, 2, 3};
String[] nomes = new String[3];
```

### 6) Enums
- Conjunto finito de constantes com tipo.

Exemplo:
```java
enum Status { NOVO, PROCESSANDO, CONCLUIDO }
```

### 7) Records (Java 16+)
- Modelos de dados imutáveis (boa opção para DTOs).

Exemplo:
```java
record Usuario(String nome, int idade) {}
```

### 8) Generics (tipos parametrizados)
- Garantem type-safety em tempo de compilação (ex.: `List<String>`).

Exemplo:
```java
List<String> tags = List.of("java", "oop");
```

### 9) Casting (conversão de tipos)
- **Widening** (seguro): `int -> long -> double`
- **Narrowing** (pode perder dados): exige cast explícito.

Exemplo:
```java
long a = 10;         // widening (int literal -> long)
int b = (int) 10L;   // narrowing (explícito)
```

#### Tabela de casting (primitivos numéricos) — “de → para” (ambas direções)
Legenda:
- **implícito** = widening (sem cast)
- **explícito** = narrowing (com cast)
- **—** = não aplicável (mesmo tipo)

> `boolean` não converte (cast) para/desde tipos numéricos.  
> `char` é inteiro **não-sinalizado** de 16 bits (Unicode); conversões com `byte/short` exigem cast.

| de \ para | byte | short | char | int | long | float | double |
|---|---:|---:|---:|---:|---:|---:|---:|
| **byte**   | — | implícito | explícito | implícito | implícito | implícito | implícito |
| **short**  | explícito | — | explícito | implícito | implícito | implícito | implícito |
| **char**   | explícito | explícito | — | implícito | implícito | implícito | implícito |
| **int**    | explícito | explícito | explícito | — | implícito | implícito | implícito |
| **long**   | explícito | explícito | explícito | explícito | — | implícito | implícito |
| **float**  | explícito | explícito | explícito | explícito | explícito | — | implícito |
| **double** | explícito | explícito | explícito | explícito | explícito | explícito | — |

Notas rápidas (onde “explícito” importa):
- `double -> float/long/int/...` pode **perder precisão** e/ou **truncar** a parte decimal.
- `long -> int` pode **overflow** (ex.: valores fora do range de `int` “dão a volta”).
- `int -> char` mantém apenas os 16 bits inferiores (faixa 0–65535).

#### “Upcasting” e “Downcasting” para tipos primitivos (na prática: widening vs narrowing)
Em Java, **upcasting/downcasting** é um termo mais usado para **tipos por referência** (herança/interfaces).  
Para **primitivos**, a ideia equivalente é:

- **Upcasting (widening)**: tipo “menor” → tipo “maior” (ou com mais alcance/precisão). **Implícito**.
  - Ex.: `byte -> short -> int -> long -> float -> double` e também `char -> int -> long -> float -> double`
- **Downcasting (narrowing)**: tipo “maior” → tipo “menor”. **Explícito** (exige cast) e pode perder dados.

Tabela curta (regras gerais):
| Operação | Exemplo | Precisa cast? | Risco |
|---|---|---:|---|
| Widening (upcast) | `int -> long`, `int -> double` | não | normalmente seguro (mas `long -> float` pode perder precisão) |
| Narrowing (downcast) | `double -> int`, `long -> int` | sim | truncamento / overflow / perda de precisão |

Exemplos:
```java
int i = 42;
long l = i;           // upcast (widening): int -> long (implícito)
double d = l;         // upcast: long -> double (implícito)

double pi = 3.14159;
int trunc = (int) pi; // downcast (narrowing): double -> int => 3 (trunca)

long big = 3_000_000_000L;
int overflow = (int) big; // downcast: pode “dar a volta” (overflow)
```

Observações:
- `boolean` **não** faz cast para/desde tipos numéricos.
- `char` é **0..65535**; `char -> int` é widening (implícito), mas `int -> char` é narrowing (cast) e mantém só 16 bits.
- Widening não garante “zero perda” em todos os casos: `long -> float` é implícito, porém pode perder precisão (mantissa limitada).

#### Mapa de conversão `byte`/`int` → `char` (quais “caracteres aparecem”)
Regras importantes:
- `char` em Java é um **code unit UTF-16** (0..65535).
- `int -> char`: pega **apenas os 16 bits menos significativos** (truncamento).
  - Ex.: `(char) 65` = `'A'`, `(char) 0x1F600` (😀) vira `0xF600` (não é o emoji).
- `byte -> char`: primeiro o `byte` vira `int` com **sign extension** (ex.: `-1` vira `0xFFFFFFFF`), depois truncamento para 16 bits ao fazer cast para `char`.
  - Ex.: `(char) (byte) -1` = `'\uFFFF'`, `(char) (byte) -128` = `'\uFF80'`.

Faixas típicas (para `int`/`char` 0..65535):
| Intervalo (decimal) | Hex | O que você “vê” normalmente |
|---:|---:|---|
| 0–31 | `0x0000`–`0x001F` | **controles** (NUL, TAB, LF…). Geralmente “não aparece” |
| 32–126 | `0x0020`–`0x007E` | **ASCII imprimível** (espaço, letras, números, pontuação) |
| 127 | `0x007F` | DEL (controle, “não aparece”) |
| 128–159 | `0x0080`–`0x009F` | controles C1 (em geral “não aparece”) |
| 160–255 | `0x00A0`–`0x00FF` | Latin-1 Supplement (muitos acentuados; depende de fonte) |

Exemplos (valores → resultado):
| Valor | Cast | Resultado (visível / escape) |
|---:|---|---|
| 65 | `(char) 65` | `'A'` (`\u0041`) |
| 48 | `(char) 48` | `'0'` (`\u0030`) |
| 10 | `(char) 10` | LF / newline (`\n`, `\u000A`) |
| 9 | `(char) 9` | TAB (`\t`, `\u0009`) |
| 8364 | `(char) 8364` | `'€'` (`\u20AC`) *(se a fonte suportar)* |
| -1 (byte) | `(char) (byte) -1` | `\uFFFF` (não imprimível) |
| -128 (byte) | `(char) (byte) -128` | `\uFF80` (não imprimível) |

Dica para “enxergar” sempre: imprima como código:
```java
System.out.printf("U+%04X%n", (int) c);
```

---

## 🛠️ Pré-requisitos

- [☕ Java JDK 17+](https://adoptium.net/)
- [💡 IntelliJ IDEA](https://www.jetbrains.com/idea/download/)
- 🐙 Git (opcional, para controle de versão)

---

## ⚡ Instalação

1. Clone este repositório:
   ```sh
   git clone https://github.com/seu-usuario/java-myfirst-app.git
   cd java-myfirst-app
   ```
2. Abra o projeto no IntelliJ IDEA.
3. Aguarde o carregamento das dependências (se houver).

---

## ▶️ Como Executar

- No IntelliJ IDEA, localize a classe principal (`Main.java` ou equivalente).
- Clique com o botão direito e selecione **Run 'Main'**.
- Ou utilize o atalho `Shift + F10` para executar a aplicação.

---

## 🧪 Como Testar

- Se houver testes automatizados, execute-os com o atalho `Ctrl + Shift + F10` na classe de testes ou via menu de contexto.
- Certifique-se de que todas as dependências de teste estejam configuradas.

---

## 🤝 Contribuição

Contribuições são bem-vindas! Siga os passos abaixo:

1. 🍴 Fork este repositório.
2. 🌱 Crie uma branch para sua feature ou correção:  
   `git checkout -b minha-feature`
3. 💾 Faça commit das suas alterações:  
   `git commit -m 'Minha contribuição'`
4. 🚀 Faça push para a branch:  
   `git push origin minha-feature`
5. 📩 Abra um Pull Request.

---

## 💻 Dicas e Atalhos do IntelliJ IDEA

- [📝 Dicas e truques do IntelliJ IDEA no dia a dia (Alura)](https://www.alura.com.br/artigos/intellij-idea-dicas-truques-usar-no-dia-a-dia)
- [⌨️ Atalhos de teclado do IntelliJ IDEA (PDF oficial)](https://resources.jetbrains.com/storage/products/intellij-idea/docs/IntelliJIDEA_ReferenceCard.pdf)
- [⌨️ Atalhos de teclado do VS Code (Windows - PDF oficial)](https://code.visualstudio.com/shortcuts/keyboard-shortcuts-windows.pdf)

---

## 📖 Recursos Adicionais

- [📚 Artigos sobre Java (Alura)](https://www.alura.com.br/artigos/java)
- [📄 Documentação oficial do Java](https://docs.oracle.com/en/java/)
- [🏪 Casa do Código](https://www.casadocodigo.com.br/)
- [🎨 Guia de Estilo para Código Java (Google)](https://google.github.io/styleguide/javaguide.html)

---

## 📝 Licença

Este projeto está sob a licença MIT. Veja o arquivo [LICENSE](LICENSE) para mais detalhes.

### 10) `switch` (statement vs expression) e suas evoluções
O `switch` tradicional é um **statement** (comandos). Nas versões mais novas, existe também o `switch` como **expression** (retorna valor).

#### Evoluções importantes (resumo)
- Java 5+: `switch` com `enum`
- Java 7+: `switch` com `String`
- Java 14+: `switch expression` (forma moderna que retorna valor)
- Java 14+: labels com `->` (sem *fall-through* por padrão)
- Java 14+: múltiplos rótulos na mesma branch (`case A, B -> ...`)
- Java 14+: `yield` (para retornar valor de um bloco no `switch expression`)
- Java 21+: *pattern matching for switch* (cases com padrões; útil com hierarquias/`sealed`) *(exige JDK compatível)*

#### `switch` tradicional (statement) — cuidado com fall-through
- **Fall-through na prática**: se você **não** colocar `break` (ou `return`/`throw`) no final de um `case`, a execução **continua** no próximo `case` (e nos seguintes), até encontrar um `break`/`return`/`throw` ou terminar o `switch`.
- Isso pode ser útil em casos específicos, mas na maioria das vezes é fonte de bug quando você “esquece” o `break`.

Exemplo com fall-through (sem `break`):

```java
int dia = 1;
switch (dia) {
  case 1:
    System.out.println("Segunda");
  case 2:
    System.out.println("Terça");
    break;
  default:
    System.out.println("Outro");
}

// Saída (dia = 1):
// Segunda
// Terça
```

Exemplo “normal” (com `break` em cada caso):

```java
int dia = 1;
switch (dia) {
  case 1:
    System.out.println("Segunda");
    break;
  case 2:
    System.out.println("Terça");
    break;
  default:
    System.out.println("Outro");
}
```

#### `switch` moderno (expression) — retorna valor e reduz boilerplate
- Usando `->`, não tem *fall-through*.
- Bom para mapear entrada → saída.

```java
int dia = 1;
String nomeDia = switch (dia) {
  case 1 -> "Segunda";
  case 2 -> "Terça";
  default -> "Outro";
};
```

#### Quando precisa de bloco: use `yield` (no switch expression)
```java
String faixa = switch (dia) {
  case 1, 2 -> "início da semana";
  default -> {
    // ...lógica extra...
    yield "restante";
  }
};
```

#### Outras opções / formas comuns de usar `switch` (com exemplos)

**Tipos suportados (clássico):**
- `byte`, `short`, `char`, `int`
- `enum` (Java 5+)
- `String` (Java 7+)
- wrappers correspondentes (`Integer`, `Character`, etc.) *(cuidado: `null` -> NPE)*
> Não funciona (clássico): `long`, `float`, `double`, `boolean`.

**1) `switch` com `String` (Java 7+)**
```java
String cmd = "start";
switch (cmd) {
  case "start" -> System.out.println("Iniciando...");
  case "stop"  -> System.out.println("Parando...");
  default      -> System.out.println("Comando inválido");
}
```

**2) `switch` com `enum` (boa prática: legibilidade + segurança de tipo)**
```java
enum Status { NOVO, PROCESSANDO, CONCLUIDO }

Status s = Status.NOVO;
switch (s) {
  case NOVO -> System.out.println("Criado agora");
  case PROCESSANDO -> System.out.println("Em andamento");
  case CONCLUIDO -> System.out.println("Finalizado");
}
```

**3) Agrupar casos (múltiplos rótulos)**
```java
int mes = 1;
String trimestre = switch (mes) {
  case 1, 2, 3 -> "T1";
  case 4, 5, 6 -> "T2";
  case 7, 8, 9 -> "T3";
  case 10, 11, 12 -> "T4";
  default -> throw new IllegalArgumentException("Mês inválido: " + mes);
};
```

**4) *Fall-through* intencional (quando faz sentido)**
```java
int nivel = 1;
switch (nivel) {
  case 3:
    System.out.println("Log detalhado");
    // fall-through intencional
  case 2:
    System.out.println("Log normal");
    // fall-through intencional
  case 1:
    System.out.println("Log mínimo");
    break;
  default:
    System.out.println("Sem log");
}
```

**5) `switch` expression com `throw` (sem `default` “silencioso”)**
```java
String role = "ADMIN";
int permissao = switch (role) {
  case "ADMIN" -> 10;
  case "USER"  -> 1;
  default      -> throw new IllegalStateException("Role desconhecida: " + role);
};
```

**6) Pattern matching for switch (Java 21+) — opcional**
Permite `case null`, padrões por tipo e *guards* (`when`). Útil com hierarquias:
```java
// Java 21+: exemplo didático (requer JDK 21+)
static String describe(Object o) {
  return switch (o) {
    case null -> "nulo";
    case Integer i when i > 0 -> "int positivo: " + i;
    case Integer i -> "int: " + i;
    case String s when s.isBlank() -> "string em branco";
    case String s -> "string: " + s;
    default -> "outro tipo: " + o.getClass().getSimpleName();
  };
}
```

#### Pegadinhas rápidas
- `switch` em `String`/`Integer` etc. com valor `null` tende a lançar `NullPointerException` (no modelo tradicional e no expression).
- `default` é recomendado (ou cubra exaustivamente todos os casos).
- Use `->` para evitar *fall-through* acidental; use o `switch` tradicional quando você **quer** *fall-through* de propósito.