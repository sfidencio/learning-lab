# Portifólio (HTML/CSS)

Este diretório reúne páginas e exercícios simples em HTML e CSS para praticar estruturação, semântica e estilos.

## Arquivos

### Páginas HTML

- [01.html](01.html) a [20.html](20.html): exercícios e exemplos incrementais.
- [layout-1.html](layout-1.html), [layout-2.html](layout-2.html), [layout-3.html](layout-3.html): variações de layout.

### CSS

Os estilos ficam em [css/](css/):

- [portifolio-v1.css](css/portifolio-v1.css)
- [portifolio-v2.css](css/portifolio-v2.css)
- [portifolio-v3.css](css/portifolio-v3.css)
- [portifolio-v4.css](css/portifolio-v4.css)
- [portifolio-v5.css](css/portifolio-v5.css)
- [portifolio-v6.css](css/portifolio-v6.css)

### Imagens

- [img/](img/): imagens usadas nos exemplos.

## Como visualizar

- Opção 1 (simples): abra qualquer arquivo `.html` no navegador.
 

### Extensões VS Code (links)

Referência: artigo da Alura: https://www.alura.com.br/artigos/extensoes-vs-code-descubra-as-mais-usadas

- ESLint — https://marketplace.visualstudio.com/items?itemName=dbaeumer.vscode-eslint
- Live Server — https://marketplace.visualstudio.com/items?itemName=ritwickdey.LiveServer
- Visual Studio IntelliCode — https://visualstudio.microsoft.com/pt-br/services/intellicode/
- GitLens — https://marketplace.visualstudio.com/items?itemName=eamodio.gitlens
- VS Code Icons — https://marketplace.visualstudio.com/items?itemName=vscode-icons-team.vscode-icons
- Beautify — https://marketplace.visualstudio.com/items?itemName=HookyQR.beautify
- IntelliSense for CSS class names in HTML — https://marketplace.visualstudio.com/items?itemName=Zignd.html-css-class-completion
- Bookmarks — https://marketplace.visualstudio.com/items?itemName=alefragnani.Bookmarks
- Auto import — https://marketplace.visualstudio.com/items?itemName=NuclleaR.vscode-extension-auto-import

<!-- preconnect melhora o handshake (opcional, mas comum) -->
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>

<!-- exemplo: Inter com pesos 400 e 700 -->
<link href="https://fonts.googleapis.com/css2?family=Inter:wght@400;700&display=swap" rel="stylesheet">

### Aula 2 — Documentação HTML 📝

Nessa aula, você aprendeu:

- 📚 A importância da documentação (W3Schools).
- 🏷️ O que é HTML e por que é considerada uma linguagem de marcação.
- 🧱 Estruturar um documento HTML com tags e elementos.
- 🧾 A utilidade da introdução `<!DOCTYPE html>`.
- 🧠 A diferença entre a metainformação presente no `<head>` e o conteúdo presente no `<body>`.
- ♿ Criar textos alternativos (`alt`) para uma imagem.
- 🧰 Acessar a Developer Tools (Ferramentas para Desenvolvedores) do navegador.
- 🧩 Quirks Mode (modo de compatibilidade/peculiaridade).
- 🧩 Utilizar extensões no Visual Studio Code (ex.: Live Server).

### Dicas rápidas (VS Code) ⚡

- ✨ Emmet: digite `!` e pressione Enter para gerar um template HTML5.
- ⌨️ Expandir abreviações: digite a abreviação e pressione `Tab` (ou `Enter`, dependendo da configuração).
- 🧱 Elemento + classe/id:
  - `div.container` → `<div class="container"></div>`
  - `header#topo` → `<header id="topo"></header>`
- 🧬 Filho/irmão/subir nível:
  - `ul>li` (filho) → `<ul><li></li></ul>`
  - `h1+p` (irmão) → `<h1></h1><p></p>`
  - `nav>ul>li^p` (`^` sobe um nível) → `<nav><ul><li></li></ul><p></p></nav>`
- 🔁 Repetição:
  - `li*3` → 3 itens `<li></li>`
- 🔢 Numeração:
  - `ul>li.item$*3` → `item1`, `item2`, `item3`
- 🧷 Atributos:
  - `a[href="https://exemplo.com"]{Link}` → `<a href="...">Link</a>`
  - `img[src="img/image.png"][alt="Descrição"]` → `<img src="..." alt="...">`
  - `img[src="img/image.png"][alt="Descrição"]` → `<img src="..." alt="...">`
- 📝 Texto “lorem”:
  - `lorem` / `lorem10` → texto placeholder (10 palavras)

### Tags semânticas (HTML) 🧩

- ✅ **O que são:** tags que descrevem o papel do conteúdo, melhorando acessibilidade e SEO.
- 🧭 **`<header>`**: cabeçalho da página ou de uma seção (logo, título, navegação).
- 🧱 **`<main>`**: conteúdo principal da página (único por página).
- 🧾 **`<footer>`**: rodapé com créditos, links, contato, etc.
- 🧭 **`<nav>`**: blocos de navegação (menus).
- 📰 **`<section>`**: agrupamento temático de conteúdo.
- 🧾 **`<article>`**: conteúdo independente (post, notícia, card).
- 🧩 **`<aside>`**: conteúdo complementar (sidebar, notas).
- 🖼️ **`<figure>` / `<figcaption>`**: mídia e legenda.
- 💪 **`<strong>`**: indica forte importância/ênfase semântica (geralmente renderizado em negrito).

### CSS em HTML — 3 tipos (exemplos) 🎨

- ✅ **Inline (no elemento):**
  - `<p style="color: red;">Texto vermelho</p>`
- ✅ **Interno (no `<style>`):**
  - `<head><style>p { color: blue; }</style></head>`
- ✅ **Externo (arquivo `.css`):**
  - `<head><link rel="stylesheet" href="style.css"></head>`

### Destaque de texto com `<span>` (HTML/CSS) ✨

- ✅ **Por que usar**: marca trechos específicos sem aplicar negrito automático (diferente de `<strong>`).
- ✅ **Exemplo**:

```html
<h1>Formação de <span>Front-end</span></h1>
```

```css
h1 {
  font-weight: bold;
}

span {
  color: #22D4FD;
  border: 1px solid #22D4FD;
  padding: 10px;
}
```

- ✅ **Explicando o CSS**:
  - `font-weight: bold;` → texto em negrito.
  - `color: #22D4FD;` → cor do texto azul.
  - `border: 1px solid #22D4FD;` → borda azul sólida de 1px.
  - `padding: 10px;` → espaçamento interno de 10px.

### Text highlight with `<span>` (HTML/CSS) ✨

- ✅ **Why use it**: marks specific text without default bold (unlike `<strong>`).
- ✅ **Example**:

```html
<h1>Front-end <span>Training</span></h1>
```

```css
h1 {
  font-weight: bold;
}

span {
  color: #22D4FD;
  border: 1px solid #22D4FD;
  padding: 10px;
}
```

- ✅ **CSS explained**:
  - `font-weight: bold;` → bold text.
  - `color: #22D4FD;` → blue text color.
  - `border: 1px solid #22D4FD;` → 1px solid blue border.
  - `padding: 10px;` → 10px inner spacing.

### Exercícios — Cores no CSS 🧪

1) **Harmonia de cores no CSS**  
   - Use a **Roda de Cores da Adobe** para criar uma paleta.  
   - Escolha **1 cor principal** (background) e **2 secundárias** (títulos e parágrafos).  
   - Exemplo no `style.css`:
```css
/* ...existing code... */
body { background-color: #E6F0FF; }
h1, h2 { color: #2B303A; }
p { color: #0C7C59; }
/* ...existing code... */
```

2) **Corrigindo erro de legibilidade**  
   - Problema: `background-color: #000000;` e `color: black;`  
   - Solução: trocar `color` para uma cor clara.  
```css
/* ...existing code... */
body { background-color: #000000; color: #F6F6F6; }
/* ...existing code... */
```

3) **RGB no CSS (hex)**  
   - Escolha duas cores em **hex** (fundo e texto).  
   - Exemplo:
```css
/* ...existing code... */
body { background-color: #FF5733; color: #00FF00; }
/* ...existing code... */
```

### Seletores CSS — tag, classe e id 🧩

- ✅ **Seletor de tag**: aplica a todos os elementos daquela tag.  
  - Ex.: `p { color: #333; }`
- ✅ **Seletor de classe**: aplica a elementos com `class="..."`.  
  - Ex.: `.destaque { color: #22D4FD; }`
- ✅ **Seletor de id**: aplica ao elemento com `id="..."` (idealmente único na página).  
  - Ex.: `#cabecalho { background: #000; }`

### CSS selectors — tag, class, and id 🧩

- ✅ **Tag selector**: applies to all elements of that tag.  
  - Ex.: `p { color: #333; }`
- ✅ **Class selector**: applies to elements with `class="..."`.  
  - Ex.: `.highlight { color: #22D4FD; }`
- ✅ **ID selector**: applies to the element with `id="..."` (ideally unique on the page).  
  - Ex.: `#header { background: #000; }`

### Âncora (`<a>`) no HTML 🔗

- ✅ **O que é**: elemento usado para criar links.
- ✅ **Como funciona**: o atributo `href` define o destino (URL ou seção da página).
- ✅ **Exemplo**:
  - `<a href="https://example.com">Ir para o site</a>`
  - `<a href="#contato">Ir para contato</a>` (âncora interna)

### HTML anchor (`<a>`) 🔗

- ✅ **What it is**: element used to create links.
- ✅ **How it works**: the `href` attribute defines the destination (URL or page section).
- ✅ **Example**:
  - `<a href="https://example.com">Go to site</a>`
  - `<a href="#contact">Go to contact</a>` (internal anchor)

### Reset CSS 🧼

- ✅ **O que é**: conjunto de estilos básicos para padronizar a aparência inicial entre navegadores.
- ✅ **Por que usar**: reduz diferenças de margens, paddings e fontes padrão.
- ✅ **Exemplo simples**:
  - `* { margin: 0; padding: 0; box-sizing: border-box; }`

### Box Model (modelo de caixa) 📦

- ✅ **O que é**: todo elemento é uma caixa composta por **content**, **padding**, **border** e **margin**.
- ✅ **Como funciona**:
  - **content**: área do conteúdo.
  - **padding**: espaço interno entre conteúdo e borda.
  - **border**: a borda do elemento.
  - **margin**: espaço externo entre elementos.

### CSS Reset 🧼

- ✅ **What it is**: a basic style set to normalize default styles across browsers.
- ✅ **Why use it**: reduces differences in default margins, paddings, and fonts.
- ✅ **Simple example**:
  - `* { margin: 0; padding: 0; box-sizing: border-box; }`

### Box Model 📦

- ✅ **What it is**: every element is a box made of **content**, **padding**, **border**, and **margin**.
- ✅ **How it works**:
  - **content**: content area.
  - **padding**: inner space around content.
  - **border**: element border.
  - **margin**: outer space between elements.

### Medidas no CSS (unidades) 📏

- ✅ **Unidades absolutas**: não mudam com o layout ou fonte.  
  - Exemplos: `px`, `cm`, `mm`, `in`, `pt`.
- ✅ **Unidades relativas**: variam conforme contexto (tamanho da fonte, viewport, etc.).  
  - **`%`**: relativo ao elemento pai.  
  - **`em`**: relativo ao tamanho da fonte do elemento.  
  - **`rem`**: relativo ao tamanho da fonte do `html` (raiz).  
  - **`vw` / `vh`**: relativo à largura/altura da viewport.  
  - **`vmin` / `vmax`**: menor/maior dimensão da viewport.
- ✅ **Viewport (explicação simples)**:
  - **O que é**: a área visível da página no navegador (a “tela útil”).
  - **Exemplos**:
    - Se a janela tem **1200px de largura** e **800px de altura**:
      - `100vw` = 1200px (toda a largura visível)
      - `50vw` = 600px (metade da largura)
      - `100vh` = 800px (toda a altura visível)
      - `50vh` = 400px (metade da altura)
    - Se a tela é **360px x 640px** (celular):
      - `100vw` = 360px
      - `100vh` = 640px
      - `vmin` = 360px, `vmax` = 640px
- ✅ **Quando usar**:
  - **`px`**: ajustes precisos.
  - **`rem` / `em`**: tipografia responsiva.
  - **`%` / `vw` / `vh`**: layouts fluidos.
- ✅ **Exemplos fáceis**:
  - `p { font-size: 16px; }` → texto com 16 pixels.
  - `h1 { font-size: 2rem; }` → 2x o tamanho base da página.
  - `.box { width: 50%; }` → metade da largura do elemento pai.
  - `.card { padding: 1em; }` → espaçamento interno igual ao tamanho da fonte.
  - `.hero { height: 100vh; }` → ocupa 100% da altura da tela.
  - `.sidebar { width: 30vw; }` → 30% da largura da tela.

### CSS units (measurements) 📏

- ✅ **Absolute units**: fixed regardless of layout or font.  
  - Examples: `px`, `cm`, `mm`, `in`, `pt`.
- ✅ **Relative units**: depend on context (font size, viewport, etc.).  
  - **`%`**: relative to the parent.  
  - **`em`**: relative to the element’s font size.  
  - **`rem`**: relative to the root (`html`) font size.  
  - **`vw` / `vh`**: relative to viewport width/height.  
  - **`vmin` / `vmax`**: smallest/largest viewport dimension.
- ✅ **Viewport (simple explanation)**:
  - **What it is**: the visible area of the page in the browser (the “usable screen”).
  - **Examples**:
    - If the window is **1200px wide** and **800px tall**:
      - `100vw` = 1200px (full visible width)
      - `50vw` = 600px (half width)
      - `100vh` = 800px (full visible height)
      - `50vh` = 400px (half height)
    - If the screen is **360px x 640px** (mobile):
      - `100vw` = 360px
      - `100vh` = 640px
      - `vmin` = 360px, `vmax` = 640px
- ✅ **Quando usar**:
  - **`px`**: ajustes precisos.
  - **`rem` / `em`**: tipografia responsiva.
  - **`%` / `vw` / `vh`**: layouts fluidos.
- ✅ **Exemplos fáceis**:
  - `p { font-size: 16px; }` → texto com 16 pixels.
  - `h1 { font-size: 2rem; }` → 2x o tamanho base da página.
  - `.box { width: 50%; }` → metade da largura do elemento pai.
  - `.card { padding: 1em; }` → espaçamento interno igual ao tamanho da fonte.
  - `.hero { height: 100vh; }` → ocupa 100% da altura da tela.
  - `.sidebar { width: 30vw; }` → 30% da largura da tela.

### box-sizing no CSS 🧰

- ✅ **O que é**: define como o navegador calcula o tamanho total do elemento.
- ✅ **`content-box` (padrão)**: largura/altura **não** incluem `padding` e `border`.
- ✅ **`border-box`**: largura/altura **incluem** `padding` e `border`.
- ✅ **Exemplo**:
  - `.card { width: 200px; padding: 20px; box-sizing: border-box; }`  
    → a caixa continua com 200px de largura total.
- ✅ **Exemplos práticos (bem simples)**:
  - **Sem `border-box`**:  
    `div { width: 200px; padding: 20px; border: 5px solid; }`  
    → largura total vira **250px** (200 + 20 + 20 + 5 + 5).
  - **Com `border-box`**:  
    `div { width: 200px; padding: 20px; border: 5px solid; box-sizing: border-box; }`  
    → largura total **permanece 200px**.
  - **Aplicar no projeto todo**:  
    `* { box-sizing: border-box; }`  
    → facilita calcular tamanhos de caixas.
- ✅ **Boas práticas (mercado)**:
  - **Defina globalmente**: use `* { box-sizing: border-box; }` para previsibilidade.
  - **Seja consistente**: evite misturar `content-box` e `border-box` sem motivo claro.
  - **Componentes reutilizáveis**: documente o padrão de `box-sizing` no design system.
  - **Layouts responsivos**: prefira `border-box` para evitar “estouro” de largura/altura.

### CSS `box-sizing` 🧰

- ✅ **What it is**: defines how the browser calculates an element’s total size.
- ✅ **`content-box` (default)**: width/height **exclude** `padding` and `border`.
- ✅ **`border-box`**: width/height **include** `padding` and `border`.
- ✅ **Example**:
  - `.card { width: 200px; padding: 20px; box-sizing: border-box; }`  
    → total width stays 200px.
- ✅ **Practical examples (simple)**:
  - **Without `border-box`**:  
    `div { width: 200px; padding: 20px; border: 5px solid; }`  
    → total width becomes **250px** (200 + 20 + 20 + 5 + 5).
  - **With `border-box`**:  
    `div { width: 200px; padding: 20px; border: 5px solid; box-sizing: border-box; }`  
    → total width **stays 200px**.
  - **Apply to the whole project**:  
    `* { box-sizing: border-box; }`  
    → easier to size elements.
- ✅ **Best practices (industry)**:
  - **Set globally**: use `* { box-sizing: border-box; }` for predictable sizing.
  - **Be consistent**: avoid mixing `content-box` and `border-box` without a clear reason.
  - **Reusable components**: document the `box-sizing` standard in your design system.
  - **Responsive layouts**: prefer `border-box` to prevent overflow issues.

### Flexbox (CSS) — simples e profundo 🧭

- ✅ **O que é**: um modelo de layout em **1 dimensão** (linha ou coluna) para alinhar e distribuir itens.
- ✅ **Ideia central**: um **container flex** controla o posicionamento dos **itens flex**.
- ✅ **Eixos**:
  - **Main axis** (eixo principal): direção definida por `flex-direction`.
  - **Cross axis** (eixo cruzado): perpendicular ao eixo principal.
- ✅ **Como os eixos mudam (detalhado)**:
  - **`flex-direction: row` (padrão)**:
    - **Eixo principal**: horizontal (esquerda → direita).
    - **Eixo cruzado**: vertical (topo → baixo).
  - **`flex-direction: row-reverse`**:
    - **Eixo principal**: horizontal (direita → esquerda).
  - **`flex-direction: column`**:
    - **Eixo principal**: vertical (topo → baixo).
    - **Eixo cruzado**: horizontal (esquerda → direita).
  - **`flex-direction: column-reverse`**:
    - **Eixo principal**: vertical (baixo → topo).
- ✅ **Quando usar**: menus, cards alinhados, centralização, componentes em linha/coluna.

**Propriedades do container (todas):**
| Propriedade | Valores | Descrição |
|-------------|---------|-----------|
| `display` | `flex`, `inline-flex` | Ativa flexbox |
| `flex-direction` | `row`, `row-reverse`, `column`, `column-reverse` | Direção do eixo principal |
| `flex-wrap` | `nowrap`, `wrap`, `wrap-reverse` | Quebra de linha |
| `flex-flow` | `<direction> <wrap>` | Atalho para direction + wrap |
| `justify-content` | `flex-start`, `flex-end`, `center`, `space-between`, `space-around`, `space-evenly` | Alinha no eixo principal |
| `align-items` | `stretch`, `flex-start`, `flex-end`, `center`, `baseline` | Alinha no eixo cruzado |
| `align-content` | `stretch`, `flex-start`, `flex-end`, `center`, `space-between`, `space-around` | Alinha **múltiplas linhas** (só com `flex-wrap: wrap` e múltiplas linhas) |
| `gap` | `<row-gap> <column-gap>` | Espaçamento entre itens |

**Propriedades dos itens (todas):**
| Propriedade | Valores | Descrição |
|-------------|---------|-----------|
| `order` | número (padrão: 0) | Ordem de exibição (menor = primeiro) |
| `flex-grow` | número (padrão: 0) | Quanto cresce quando sobra espaço |
| `flex-shrink` | número (padrão: 1) | Quanto encolhe quando falta espaço |
| `flex-basis` | tamanho ou `auto` | Tamanho base antes de crescer/encolher |
| `flex` | `<grow> <shrink> <basis>` | Atalho (ex.: `flex: 1 1 auto`) |
| `align-self` | `auto`, `flex-start`, `flex-end`, `center`, `baseline`, `stretch` | Sobrescreve `align-items` para um item |

**Valores de `justify-content` (visual):**
```
flex-start:    [A][B][C]____________
flex-end:      ____________[A][B][C]
center:        ______[A][B][C]______
space-between: [A]______[B]______[C]
space-around:  __[A]____[B]____[C]__
space-evenly:  ___[A]___[B]___[C]___
```

**Valores de `align-items` (visual, em `row`):**
```
stretch:    |AAAA|  (estica para preencher altura)
flex-start: |A   |  (alinha no topo)
flex-end:   |   A|  (alinha embaixo)
center:     | A  |  (alinha no centro)
baseline:   texto alinhado pela linha de base da fonte
```

**`align-content` vs `align-items`:**
- `align-items`: alinha itens **dentro de cada linha**.
- `align-content`: distribui **as linhas** no container (só funciona com `flex-wrap: wrap` e múltiplas linhas).

**`order` — reordenando itens:**
```css
.item-a { order: 2; }  /* aparece por último */
.item-b { order: 1; }  /* aparece no meio */
.item-c { order: 0; }  /* aparece primeiro (padrão) */
```

**`flex-shrink` — como funciona:**
- Quando a soma das `basis` > largura do container, os itens **encolhem**.
- `flex-shrink: 0` → item **não** encolhe (mantém `basis`).
- `flex-shrink: 2` → encolhe **2x mais** que um item com `shrink: 1`.

**Valores comuns de `flex` (atalhos):**
| Valor | Equivalente | Uso |
|-------|-------------|-----|
| `flex: 1` | `1 1 0%` | Cresce/encolhe igualmente, ignora conteúdo |
| `flex: auto` | `1 1 auto` | Cresce/encolhe, respeita conteúdo |
| `flex: none` | `0 0 auto` | Tamanho fixo, não flexível |
| `flex: 0 1 auto` | padrão | Não cresce, pode encolher |

**Truques úteis:**
```css
/* Centralização perfeita (1 linha) */
.center { display: flex; justify-content: center; align-items: center; }

/* Último item à direita (push) */
.spacer { margin-left: auto; }

/* Rodapé fixo no fim da página */
body { display: flex; flex-direction: column; min-height: 100vh; }
main { flex: 1; }

/* Igual altura para cards */
.cards { display: flex; align-items: stretch; }
```

**Debugging Flexbox:**
- Use DevTools → inspecione o container → veja o badge "flex".
- Clique no badge para visualizar eixos e espaçamento.

### CSS do 16.html — explicação detalhada (PT-BR) 🎯

- `* { margin: 0; padding: 0; box-sizing: border-box; }`  
  → remove margens/paddings padrão do navegador e evita “estouro” ao somar borda/padding no tamanho.
- `body { background-color: black; }`  
  → define fundo escuro para destacar as caixas e o texto.
- `.container { height: 100vh; width: 100vw; display: flex; ... }`  
  → ocupa toda a tela e coloca os filhos lado a lado (linha).
- `border: 1px solid red; color: white;`  
  → borda vermelha para visualizar o container e texto branco para contraste.
- `.container > div { flex: 1; ... }`  
  → cada coluna cresce igualmente (metade da largura).
- `border: 1px solid blue; margin: 5px; padding: 5px;`  
  → borda azul para visualizar cada coluna, margem externa e respiro interno.

### 16.html CSS — detailed explanation (EN) 🎯

- `* { margin: 0; padding: 0; box-sizing: border-box; }`  
  → removes default margins/paddings and prevents size overflow when adding borders/padding.
- `body { background-color: black; }`  
  → dark background to highlight boxes and text.
- `.container { height: 100vh; width: 100vw; display: flex; ... }`  
  → fills the viewport and lays children side by side (row).
- `border: 1px solid red; color: white;`  
  → red border to visualize the container, white text for contrast.
- `.container > div { flex: 1; ... }`  
  → each column grows equally (half the width).
- `border: 1px solid blue; margin: 5px; padding: 5px;`  
  → blue border for each column, outer spacing and inner padding.

### Herança no CSS (inheritance) 🧬

- ✅ **PT-BR**: algumas propriedades são herdadas dos pais para os filhos (ex.: `color`, `font-family`).  
  - Ex.: se `.container { color: white; }`, o texto dos filhos fica branco.
- ✅ **EN**: some properties are inherited from parent to child (e.g., `color`, `font-family`).  
  - Example: if `.container { color: white; }`, child text becomes white.

### Seletor de filho direto `>` (CSS) 👶

- ✅ **PT-BR**: seleciona **apenas** filhos imediatos (não netos).  
  - Ex.: `.container > div { ... }` aplica só às `<div>` dentro da `.container`.
- ✅ **EN**: selects **only** direct children (not grandchildren).  
  - Example: `.container > div { ... }` applies only to `<div>` directly inside `.container`.

**Exemplo rápido / Quick example:**
```css
/* ...existing code... */
.container > div { border: 1px solid blue; }
/* ...existing code... */
```

### Flex shorthand (`flex: grow shrink basis`) — exemplo claro 🧭

**PT-BR (contexto do 16.html):**
- **O que cresce/encolhe?** a **largura** do item (eixo principal em `row`).
- **Cresce quando?** quando sobra espaço no container.
- **Encolhe quando?** quando falta espaço no container.
- `flex: 1 1 300px;` → base 300px; cresce 1 parte e pode encolher.
- `flex: 2 1 200px;` → base 200px; cresce 2 partes e pode encolher.
- **Exemplo detalhado (container 1000px, 2 itens):**
  - **Somatório das bases**: 300 + 200 = 500px.
  - **Espaço livre**: 1000 - 500 = 500px.
  - **Partes de crescimento**: 1 + 2 = 3 partes.
  - **Distribuição do extra**:
    - Item 1 recebe **1/3** de 500 ≈ **166,7px**.
    - Item 2 recebe **2/3** de 500 ≈ **333,3px**.
  - **Tamanho final**:
    - Item 1: 300 + 166,7 ≈ **466,7px**.
    - Item 2: 200 + 333,3 ≈ **533,3px**.
- **Resumo curto**: o `grow` define **quanto** cada item leva do espaço livre; o `basis` define o **ponto de partida**.

**EN (16.html context):**
- **What grows/shrinks?** the item’s **width** (main axis in `row`).
- **Grows when?** when there is extra space in the container.
- **Shrinks when?** when there isn’t enough space in the container.
- `flex: 1 1 300px;` → 300px base; grows by 1 part and can shrink.
- `flex: 2 1 200px;` → 200px base; grows by 2 parts and can shrink.
- **Detailed example (1000px container, 2 items):**
  - **Base sum**: 300 + 200 = 500px.
  - **Free space**: 1000 - 500 = 500px.
  - **Growth parts**: 1 + 2 = 3 parts.
  - **Extra space split**:
    - Item 1 gets **1/3** of 500 ≈ **166.7px**.
    - Item 2 gets **2/3** of 500 ≈ **333.3px**.
  - **Final sizes**:
    - Item 1: 300 + 166.7 ≈ **466.7px**.
    - Item 2: 200 + 333.3 ≈ **533.3px**.
- **Short summary**: `grow` controls **how much** extra space each item receives; `basis` is the **starting point**.

### Exercícios — Cores no CSS 🧪

1) **Harmonia de cores no CSS**  
   - Use a **Roda de Cores da Adobe** para criar uma paleta.  
   - Escolha **1 cor principal** (background) e **2 secundárias** (títulos e parágrafos).  
   - Exemplo no `style.css`:
```css
/* ...existing code... */
body { background-color: #E6F0FF; }
h1, h2 { color: #2B303A; }
p { color: #0C7C59; }
/* ...existing code... */
```

2) **Corrigindo erro de legibilidade**  
   - Problema: `background-color: #000000;` e `color: black;`  
   - Solução: trocar `color` para uma cor clara.  
```css
/* ...existing code... */
body { background-color: #000000; color: #F6F6F6; }
/* ...existing code... */
```

3) **RGB no CSS (hex)**  
   - Escolha duas cores em **hex** (fundo e texto).  
   - Exemplo:
```css
/* ...existing code... */
body { background-color: #FF5733; color: #00FF00; }
/* ...existing code... */
```

### Seletores CSS — tag, classe e id 🧩

- ✅ **Seletor de tag**: aplica a todos os elementos daquela tag.  
  - Ex.: `p { color: #333; }`
- ✅ **Seletor de classe**: aplica a elementos com `class="..."`.  
  - Ex.: `.destaque { color: #22D4FD; }`
- ✅ **Seletor de id**: aplica ao elemento com `id="..."` (idealmente único na página).  
  - Ex.: `#cabecalho { background: #000; }`

### CSS selectors — tag, class, and id 🧩

- ✅ **Tag selector**: applies to all elements of that tag.  
  - Ex.: `p { color: #333; }`
- ✅ **Class selector**: applies to elements with `class="..."`.  
  - Ex.: `.highlight { color: #22D4FD; }`
- ✅ **ID selector**: applies to the element with `id="..."` (ideally unique on the page).  
  - Ex.: `#header { background: #000; }`

### Âncora (`<a>`) no HTML 🔗

- ✅ **O que é**: elemento usado para criar links.
- ✅ **Como funciona**: o atributo `href` define o destino (URL ou seção da página).
- ✅ **Exemplo**:
  - `<a href="https://example.com">Ir para o site</a>`
  - `<a href="#contato">Ir para contato</a>` (âncora interna)

### HTML anchor (`<a>`) 🔗

- ✅ **What it is**: element used to create links.
- ✅ **How it works**: the `href` attribute defines the destination (URL or page section).
- ✅ **Example**:
  - `<a href="https://example.com">Go to site</a>`
  - `<a href="#contact">Go to contact</a>` (internal anchor)

### Reset CSS 🧼

- ✅ **O que é**: conjunto de estilos básicos para padronizar a aparência inicial entre navegadores.
- ✅ **Por que usar**: reduz diferenças de margens, paddings e fontes padrão.
- ✅ **Exemplo simples**:
  - `* { margin: 0; padding: 0; box-sizing: border-box; }`

### Box Model (modelo de caixa) 📦

- ✅ **O que é**: todo elemento é uma caixa composta por **content**, **padding**, **border** e **margin**.
- ✅ **Como funciona**:
  - **content**: área do conteúdo.
  - **padding**: espaço interno entre conteúdo e borda.
  - **border**: a borda do elemento.
  - **margin**: espaço externo entre elementos.

### CSS Reset 🧼

- ✅ **What it is**: a basic style set to normalize default styles across browsers.
- ✅ **Why use it**: reduces differences in default margins, paddings, and fonts.
- ✅ **Simple example**:
  - `* { margin: 0; padding: 0; box-sizing: border-box; }`

### Box Model 📦

- ✅ **What it is**: every element is a box made of **content**, **padding**, **border**, and **margin**.
- ✅ **How it works**:
  - **content**: content area.
  - **padding**: inner space around content.
  - **border**: element border.
  - **margin**: outer space between elements.

### Medidas no CSS (unidades) 📏

- ✅ **Unidades absolutas**: não mudam com o layout ou fonte.  
  - Exemplos: `px`, `cm`, `mm`, `in`, `pt`.
- ✅ **Unidades relativas**: variam conforme contexto (tamanho da fonte, viewport, etc.).  
  - **`%`**: relativo ao elemento pai.  
  - **`em`**: relativo ao tamanho da fonte do elemento.  
  - **`rem`**: relativo ao tamanho da fonte do `html` (raiz).  
  - **`vw` / `vh`**: relativo à largura/altura da viewport.  
  - **`vmin` / `vmax`**: menor/maior dimensão da viewport.
- ✅ **Viewport (explicação simples)**:
  - **O que é**: a área visível da página no navegador (a “tela útil”).
  - **Exemplos**:
    - Se a janela tem **1200px de largura** e **800px de altura**:
      - `100vw` = 1200px (toda a largura visível)
      - `50vw` = 600px (metade da largura)
      - `100vh` = 800px (toda a altura visível)
      - `50vh` = 400px (metade da altura)
    - Se a tela é **360px x 640px** (celular):
      - `100vw` = 360px
      - `100vh` = 640px
      - `vmin` = 360px, `vmax` = 640px
- ✅ **Quando usar**:
  - **`px`**: ajustes precisos.
  - **`rem` / `em`**: tipografia responsiva.
  - **`%` / `vw` / `vh`**: layouts fluidos.
- ✅ **Exemplos fáceis**:
  - `p { font-size: 16px; }` → texto com 16 pixels.
  - `h1 { font-size: 2rem; }` → 2x o tamanho base da página.
  - `.box { width: 50%; }` → metade da largura do elemento pai.
  - `.card { padding: 1em; }` → espaçamento interno igual ao tamanho da fonte.
  - `.hero { height: 100vh; }` → ocupa 100% da altura da tela.
  - `.sidebar { width: 30vw; }` → 30% da largura da tela.

### CSS units (measurements) 📏

- ✅ **Absolute units**: fixed regardless of layout or font.  
  - Examples: `px`, `cm`, `mm`, `in`, `pt`.
- ✅ **Relative units**: depend on context (font size, viewport, etc.).  
  - **`%`**: relative to the parent.  
  - **`em`**: relative to the element’s font size.  
  - **`rem`**: relative to the root (`html`) font size.  
  - **`vw` / `vh`**: relative to viewport width/height.  
  - **`vmin` / `vmax`**: smallest/largest viewport dimension.
- ✅ **Viewport (simple explanation)**:
  - **What it is**: the visible area of the page in the browser (the “usable screen”).
  - **Examples**:
    - If the window is **1200px wide** and **800px tall**:
      - `100vw` = 1200px (full visible width)
      - `50vw` = 600px (half width)
      - `100vh` = 800px (full visible height)
      - `50vh` = 400px (half height)
    - If the screen is **360px x 640px** (mobile):
      - `100vw` = 360px
      - `100vh` = 640px
      - `vmin` = 360px, `vmax` = 640px
- ✅ **Quando usar**:
  - **`px`**: ajustes precisos.
  - **`rem` / `em`**: tipografia responsiva.
  - **`%` / `vw` / `vh`**: layouts fluidos.
- ✅ **Exemplos fáceis**:
  - `p { font-size: 16px; }` → texto com 16 pixels.
  - `h1 { font-size: 2rem; }` → 2x o tamanho base da página.
  - `.box { width: 50%; }` → metade da largura do elemento pai.
  - `.card { padding: 1em; }` → espaçamento interno igual ao tamanho da fonte.
  - `.hero { height: 100vh; }` → ocupa 100% da altura da tela.
  - `.sidebar { width: 30vw; }` → 30% da largura da tela.

### box-sizing no CSS 🧰

- ✅ **O que é**: define como o navegador calcula o tamanho total do elemento.
- ✅ **`content-box` (padrão)**: largura/altura **não** incluem `padding` e `border`.
- ✅ **`border-box`**: largura/altura **incluem** `padding` e `border`.
- ✅ **Exemplo**:
  - `.card { width: 200px; padding: 20px; box-sizing: border-box; }`  
    → a caixa continua com 200px de largura total.
- ✅ **Exemplos práticos (bem simples)**:
  - **Sem `border-box`**:  
    `div { width: 200px; padding: 20px; border: 5px solid; }`  
    → largura total vira **250px** (200 + 20 + 20 + 5 + 5).
  - **Com `border-box`**:  
    `div { width: 200px; padding: 20px; border: 5px solid; box-sizing: border-box; }`  
    → largura total **permanece 200px**.
  - **Aplicar no projeto todo**:  
    `* { box-sizing: border-box; }`  
    → facilita calcular tamanhos de caixas.
- ✅ **Boas práticas (mercado)**:
  - **Defina globalmente**: use `* { box-sizing: border-box; }` para previsibilidade.
  - **Seja consistente**: evite misturar `content-box` e `border-box` sem motivo claro.
  - **Componentes reutilizáveis**: documente o padrão de `box-sizing` no design system.
  - **Layouts responsivos**: prefira `border-box` para evitar “estouro” de largura/altura.

### CSS `box-sizing` 🧰

- ✅ **What it is**: defines how the browser calculates an element’s total size.
- ✅ **`content-box` (default)**: width/height **exclude** `padding` and `border`.
- ✅ **`border-box`**: width/height **include** `padding` and `border`.
- ✅ **Example**:
  - `.card { width: 200px; padding: 20px; box-sizing: border-box; }`  
    → total width stays 200px.
- ✅ **Practical examples (simple)**:
  - **Without `border-box`**:  
    `div { width: 200px; padding: 20px; border: 5px solid; }`  
    → total width becomes **250px** (200 + 20 + 20 + 5 + 5).
  - **With `border-box`**:  
    `div { width: 200px; padding: 20px; border: 5px solid; box-sizing: border-box; }`  
    → total width **stays 200px**.
  - **Apply to the whole project**:  
    `* { box-sizing: border-box; }`  
    → easier to size elements.
- ✅ **Best practices (industry)**:
  - **Set globally**: use `* { box-sizing: border-box; }` for predictable sizing.
  - **Be consistent**: avoid mixing `content-box` and `border-box` without a clear reason.
  - **Reusable components**: document the `box-sizing` standard in your design system.
  - **Responsive layouts**: prefer `border-box` to prevent overflow issues.

### Flexbox (CSS) — simples e profundo 🧭

- ✅ **O que é**: um modelo de layout em **1 dimensão** (linha ou coluna) para alinhar e distribuir itens.
- ✅ **Ideia central**: um **container flex** controla o posicionamento dos **itens flex**.
- ✅ **Eixos**:
  - **Main axis** (eixo principal): direção definida por `flex-direction`.
  - **Cross axis** (eixo cruzado): perpendicular ao eixo principal.
- ✅ **Como os eixos mudam (detalhado)**:
  - **`flex-direction: row` (padrão)**:
    - **Eixo principal**: horizontal (esquerda → direita).
    - **Eixo cruzado**: vertical (topo → baixo).
  - **`flex-direction: row-reverse`**:
    - **Eixo principal**: horizontal (direita → esquerda).
  - **`flex-direction: column`**:
    - **Eixo principal**: vertical (topo → baixo).
    - **Eixo cruzado**: horizontal (esquerda → direita).
  - **`flex-direction: column-reverse`**:
    - **Eixo principal**: vertical (baixo → topo).
- ✅ **Quando usar**: menus, cards alinhados, centralização, componentes em linha/coluna.

**Propriedades do container (todas):**
| Propriedade | Valores | Descrição |
|-------------|---------|-----------|
| `display` | `flex`, `inline-flex` | Ativa flexbox |
| `flex-direction` | `row`, `row-reverse`, `column`, `column-reverse` | Direção do eixo principal |
| `flex-wrap` | `nowrap`, `wrap`, `wrap-reverse` | Quebra de linha |
| `flex-flow` | `<direction> <wrap>` | Atalho para direction + wrap |
| `justify-content` | `flex-start`, `flex-end`, `center`, `space-between`, `space-around`, `space-evenly` | Alinha no eixo principal |
| `align-items` | `stretch`, `flex-start`, `flex-end`, `center`, `baseline` | Alinha no eixo cruzado |
| `align-content` | `stretch`, `flex-start`, `flex-end`, `center`, `space-between`, `space-around` | Alinha **múltiplas linhas** (só com `flex-wrap: wrap` e múltiplas linhas) |
| `gap` | `<row-gap> <column-gap>` | Espaçamento entre itens |

**Propriedades dos itens (todas):**
| Propriedade | Valores | Descrição |
|-------------|---------|-----------|
| `order` | número (padrão: 0) | Ordem de exibição (menor = primeiro) |
| `flex-grow` | número (padrão: 0) | Quanto cresce quando sobra espaço |
| `flex-shrink` | número (padrão: 1) | Quanto encolhe quando falta espaço |
| `flex-basis` | tamanho ou `auto` | Tamanho base antes de crescer/encolher |
| `flex` | `<grow> <shrink> <basis>` | Atalho (ex.: `flex: 1 1 auto`) |
| `align-self` | `auto`, `flex-start`, `flex-end`, `center`, `baseline`, `stretch` | Sobrescreve `align-items` para um item |

**Valores de `justify-content` (visual):**
```
flex-start:    [A][B][C]____________
flex-end:      ____________[A][B][C]
center:        ______[A][B][C]______
space-between: [A]______[B]______[C]
space-around:  __[A]____[B]____[C]__
space-evenly:  ___[A]___[B]___[C]___
```

**Valores de `align-items` (visual, em `row`):**
```
stretch:    |AAAA|  (estica para preencher altura)
flex-start: |A   |  (alinha no topo)
flex-end:   |   A|  (alinha embaixo)
center:     | A  |  (alinha no centro)
baseline:   texto alinhado pela linha de base da fonte
```

**`align-content` vs `align-items`:**
- `align-items`: alinha itens **dentro de cada linha**.
- `align-content`: distribui **as linhas** no container (só funciona com `flex-wrap: wrap` e múltiplas linhas).

**`order` — reordenando itens:**
```css
.item-a { order: 2; }  /* aparece por último */
.item-b { order: 1; }  /* aparece no meio */
.item-c { order: 0; }  /* aparece primeiro (padrão) */
```

**`flex-shrink` — como funciona:**
- Quando a soma das `basis` > largura do container, os itens **encolhem**.
- `flex-shrink: 0` → item **não** encolhe (mantém `basis`).
- `flex-shrink: 2` → encolhe **2x mais** que um item com `shrink: 1`.

**Valores comuns de `flex` (atalhos):**
| Valor | Equivalente | Uso |
|-------|-------------|-----|
| `flex: 1` | `1 1 0%` | Cresce/encolhe igualmente, ignora conteúdo |
| `flex: auto` | `1 1 auto` | Cresce/encolhe, respeita conteúdo |
| `flex: none` | `0 0 auto` | Tamanho fixo, não flexível |
| `flex: 0 1 auto` | padrão | Não cresce, pode encolher |

**Truques úteis:**
```css
/* Centralização perfeita (1 linha) */
.center { display: flex; justify-content: center; align-items: center; }

/* Último item à direita (push) */
.spacer { margin-left: auto; }

/* Rodapé fixo no fim da página */
body { display: flex; flex-direction: column; min-height: 100vh; }
main { flex: 1; }

/* Igual altura para cards */
.cards { display: flex; align-items: stretch; }
```

**Debugging Flexbox:**
- Use DevTools → inspecione o container → veja o badge "flex".
- Clique no badge para visualizar eixos e espaçamento.

### CSS do 16.html — explicação detalhada (PT-BR) 🎯

- `* { margin: 0; padding: 0; box-sizing: border-box; }`  
  → remove margens/paddings padrão do navegador e evita “estouro” ao somar borda/padding no tamanho.
- `body { background-color: black; }`  
  → define fundo escuro para destacar as caixas e o texto.
- `.container { height: 100vh; width: 100vw; display: flex; ... }`  
  → ocupa toda a tela e coloca os filhos lado a lado (linha).
- `border: 1px solid red; color: white;`  
  → borda vermelha para visualizar o container e texto branco para contraste.
- `.container > div { flex: 1; ... }`  
  → cada coluna cresce igualmente (metade da largura).
- `border: 1px solid blue; margin: 5px; padding: 5px;`  
  → borda azul para visualizar cada coluna, margem externa e respiro interno.

### 16.html CSS — detailed explanation (EN) 🎯

- `* { margin: 0; padding: 0; box-sizing: border-box; }`  
  → removes default margins/paddings and prevents size overflow when adding borders/padding.
- `body { background-color: black; }`  
  → dark background to highlight boxes and text.
- `.container { height: 100vh; width: 100vw; display: flex; ... }`  
  → fills the viewport and lays children side by side (row).
- `border: 1px solid red; color: white;`  
  → red border to visualize the container, white text for contrast.
- `.container > div { flex: 1; ... }`  
  → each column grows equally (half the width).
- `border: 1px solid blue; margin: 5px; padding: 5px;`  
  → blue border for each column, outer spacing and inner padding.

### Herança no CSS (inheritance) 🧬

- ✅ **PT-BR**: algumas propriedades são herdadas dos pais para os filhos (ex.: `color`, `font-family`).  
  - Ex.: se `.container { color: white; }`, o texto dos filhos fica branco.
- ✅ **EN**: some properties are inherited from parent to child (e.g., `color`, `font-family`).  
  - Example: if `.container { color: white; }`, child text becomes white.

### Seletor de filho direto `>` (CSS) 👶

- ✅ **PT-BR**: seleciona **apenas** filhos imediatos (não netos).  
  - Ex.: `.container > div { ... }` aplica só às `<div>` dentro da `.container`.
- ✅ **EN**: selects **only** direct children (not grandchildren).  
  - Example: `.container > div { ... }` applies only to `<div>` directly inside `.container`.

**Exemplo rápido / Quick example:**
```css
/* ...existing code... */
.container > div { border: 1px solid blue; }
/* ...existing code... */
```

### Flex shorthand (`flex: grow shrink basis`) — exemplo claro 🧭

**PT-BR (contexto do 16.html):**
- **O que cresce/encolhe?** a **largura** do item (eixo principal em `row`).
- **Cresce quando?** quando sobra espaço no container.
- **Encolhe quando?** quando falta espaço no container.
- `flex: 1 1 300px;` → base 300px; cresce 1 parte e pode encolher.
- `flex: 2 1 200px;` → base 200px; cresce 2 partes e pode encolher.
- **Exemplo detalhado (container 1000px, 2 itens):**
  - **Somatório das bases**: 300 + 200 = 500px.
  - **Espaço livre**: 1000 - 500 = 500px.
  - **Partes de crescimento**: 1 + 2 = 3 partes.
  - **Distribuição do extra**:
    - Item 1 recebe **1/3** de 500 ≈ **166,7px**.
    - Item 2 recebe **2/3** de 500 ≈ **333,3px**.
  - **Tamanho final**:
    - Item 1: 300 + 166,7 ≈ **466,7px**.
    - Item 2: 200 + 333,3 ≈ **533,3px**.
- **Resumo curto**: o `grow` define **quanto** cada item leva do espaço livre; o `basis` define o **ponto de partida**.

**EN (16.html context):**
- **What grows/shrinks?** the item’s **width** (main axis in `row`).
- **Grows when?** when there is extra space in the container.
- **Shrinks when?** when there isn’t enough space in the container.
- `flex: 1 1 300px;` → 300px base; grows by 1 part and can shrink.
- `flex: 2 1 200px;` → 200px base; grows by 2 parts and can shrink.
- **Detailed example (1000px container, 2 items):**
  - **Base sum**: 300 + 200 = 500px.
  - **Free space**: 1000 - 500 = 500px.
  - **Growth parts**: 1 + 2 = 3 parts.
  - **Extra space split**:
    - Item 1 gets **1/3** of 500 ≈ **166.7px**.
    - Item 2 gets **2/3** of 500 ≈ **333.3px**.
  - **Final sizes**:
    - Item 1: 300 + 166.7 ≈ **466.7px**.
    - Item 2: 200 + 333.3 ≈ **533.3px**.
- **Short summary**: `grow` controls **how much** extra space each item receives; `basis` is the **starting point**.

### Exercícios — Cores no CSS 🧪

1) **Harmonia de cores no CSS**  
   - Use a **Roda de Cores da Adobe** para criar uma paleta.  
   - Escolha **1 cor principal** (background) e **2 secundárias** (títulos e parágrafos).  
   - Exemplo no `style.css`:
```css
/* ...existing code... */
body { background-color: #E6F0FF; }
h1, h2 { color: #2B303A; }
p { color: #0C7C59; }
/* ...existing code... */
```

2) **Corrigindo erro de legibilidade**  
   - Problema: `background-color: #000000;` e `color: black;`  
   - Solução: trocar `color` para uma cor clara.  
```css
/* ...existing code... */
body { background-color: #000000; color: #F6F6F6; }
/* ...existing code... */
```

3) **RGB no CSS (hex)**  
   - Escolha duas cores em **hex** (fundo e texto).  
   - Exemplo:
```css
/* ...existing code... */
body { background-color: #FF5733; color: #00FF00; }
/* ...existing code... */
```

### Seletores CSS — tag, classe e id 🧩

- ✅ **Seletor de tag**: aplica a todos os elementos daquela tag.  
  - Ex.: `p { color: #333; }`
- ✅ **Seletor de classe**: aplica a elementos com `class="..."`.  
  - Ex.: `.destaque { color: #22D4FD; }`
- ✅ **Seletor de id**: aplica ao elemento com `id="..."` (idealmente único na página).  
  - Ex.: `#cabecalho { background: #000; }`

### CSS selectors — tag, class, and id 🧩

- ✅ **Tag selector**: applies to all elements of that tag.  
  - Ex.: `p { color: #333; }`
- ✅ **Class selector**: applies to elements with `class="..."`.  
  - Ex.: `.highlight { color: #22D4FD; }`
- ✅ **ID selector**: applies to the element with `id="..."` (ideally unique on the page).  
  - Ex.: `#header { background: #000; }`

### Âncora (`<a>`) no HTML 🔗

- ✅ **O que é**: elemento usado para criar links.
- ✅ **Como funciona**: o atributo `href` define o destino (URL ou seção da página).
- ✅ **Exemplo**:
  - `<a href="https://example.com">Ir para o site</a>`
  - `<a href="#contato">Ir para contato</a>` (âncora interna)

### HTML anchor (`<a>`) 🔗

- ✅ **What it is**: element used to create links.
- ✅ **How it works**: the `href` attribute defines the destination (URL or page section).
- ✅ **Example**:
  - `<a href="https://example.com">Go to site</a>`
  - `<a href="#contact">Go to contact</a>` (internal anchor)

### Reset CSS 🧼

- ✅ **O que é**: conjunto de estilos básicos para padronizar a aparência inicial entre navegadores.
- ✅ **Por que usar**: reduz diferenças de margens, paddings e fontes padrão.
- ✅ **Exemplo simples**:
  - `* { margin: 0; padding: 0; box-sizing: border-box; }`

### Box Model (modelo de caixa) 📦

- ✅ **O que é**: todo elemento é uma caixa composta por **content**, **padding**, **border** e **margin**.
- ✅ **Como funciona**:
  - **content**: área do conteúdo.
  - **padding**: espaço interno entre conteúdo e borda.
  - **border**: a borda do elemento.
  - **margin**: espaço externo entre elementos.

### CSS Reset 🧼

- ✅ **What it is**: a basic style set to normalize default styles across browsers.
- ✅ **Why use it**: reduces differences in default margins, paddings, and fonts.
- ✅ **Simple example**:
  - `* { margin: 0; padding: 0; box-sizing: border-box; }`

### Box Model 📦

- ✅ **What it is**: every element is a box made of **content**, **padding**, **border**, and **margin**.
- ✅ **How it works**:
  - **content**: content area.
  - **padding**: inner space around content.
  - **border**: element border.
  - **margin**: outer space between elements.

### Medidas no CSS (unidades) 📏

- ✅ **Unidades absolutas**: não mudam com o layout ou fonte.  
  - Exemplos: `px`, `cm`, `mm`, `in`, `pt`.
- ✅ **Unidades relativas**: variam conforme contexto (tamanho da fonte, viewport, etc.).  
  - **`%`**: relativo ao elemento pai.  
  - **`em`**: relativo ao tamanho da fonte do elemento.  
  - **`rem`**: relativo ao tamanho da fonte do `html` (raiz).  
  - **`vw` / `vh`**: relativo à largura/altura da viewport.  
  - **`vmin` / `vmax`**: menor/maior dimensão da viewport.
- ✅ **Viewport (explicação simples)**:
  - **O que é**: a área visível da página no navegador (a “tela útil”).
  - **Exemplos**:
    - Se a janela tem **1200px de largura** e **800px de altura**:
      - `100vw` = 1200px (toda a largura visível)
      - `50vw` = 600px (metade da largura)
      - `100vh` = 800px (toda a altura visível)
      - `50vh` = 400px (metade da altura)
    - Se a tela é **360px x 640px** (celular):
      - `100vw` = 360px
      - `100vh` = 640px
      - `vmin` = 360px, `vmax` = 640px
- ✅ **Quando usar**:
  - **`px`**: ajustes precisos.
  - **`rem` / `em`**: tipografia responsiva.
  - **`%` / `vw` / `vh`**: layouts fluidos.
- ✅ **Exemplos fáceis**:
  - `p { font-size: 16px; }` → texto com 16 pixels.
  - `h1 { font-size: 2rem; }` → 2x o tamanho base da página.
  - `.box { width: 50%; }` → metade da largura do elemento pai.
  - `.card { padding: 1em; }` → espaçamento interno igual ao tamanho da fonte.
  - `.hero { height: 100vh; }` → ocupa 100% da altura da tela.
  - `.sidebar { width: 30vw; }` → 30% da largura da tela.

### CSS units (measurements) 📏

- ✅ **Absolute units**: fixed regardless of layout or font.  
  - Examples: `px`, `cm`, `mm`, `in`, `pt`.
- ✅ **Relative units**: depend on context (font size, viewport, etc.).  
  - **`%`**: relative to the parent.  
  - **`em`**: relative to the element’s font size.  
  - **`rem`**: relative to the root (`html`) font size.  
  - **`vw` / `vh`**: relative to viewport width/height.  
  - **`vmin` / `vmax`**: smallest/largest viewport dimension.
- ✅ **Viewport (simple explanation)**:
  - **What it is**: the visible area of the page in the browser (the “usable screen”).
  - **Examples**:
    - If the window is **1200px wide** and **800px tall**:
      - `100vw` = 1200px (full visible width)
      - `50vw` = 600px (half width)
      - `100vh` = 800px (full visible height)
      - `50vh` = 400px (half height)
    - If the screen is **360px x 640px** (mobile):
      - `100vw` = 360px
      - `100vh` = 640px
      - `vmin` = 360px, `vmax` = 640px
- ✅ **Quando usar**:
  - **`px`**: ajustes precisos.
  - **`rem` / `em`**: tipografia responsiva.
  - **`%` / `vw` / `vh`**: layouts fluidos.
- ✅ **Exemplos fáceis**:
  - `p { font-size: 16px; }` → texto com 16 pixels.
  - `h1 { font-size: 2rem; }` → 2x o tamanho base da página.
  - `.box { width: 50%; }` → metade da largura do elemento pai.
  - `.card { padding: 1em; }` → espaçamento interno igual ao tamanho da fonte.
  - `.hero { height: 100vh; }` → ocupa 100% da altura da tela.
  - `.sidebar { width: 30vw; }` → 30% da largura da tela.

### box-sizing no CSS 🧰

- ✅ **O que é**: define como o navegador calcula o tamanho total do elemento.
- ✅ **`content-box` (padrão)**: largura/altura **não** incluem `padding` e `border`.
- ✅ **`border-box`**: largura/altura **incluem** `padding` e `border`.
- ✅ **Exemplo**:
  - `.card { width: 200px; padding: 20px; box-sizing: border-box; }`  
    → a caixa continua com 200px de largura total.
- ✅ **Exemplos práticos (bem simples)**:
  - **Sem `border-box`**:  
    `div { width: 200px; padding: 20px; border: 5px solid; }`  
    → largura total vira **250px** (200 + 20 + 20 + 5 + 5).
  - **Com `border-box`**:  
    `div { width: 200px; padding: 20px; border: 5px solid; box-sizing: border-box; }`  
    → largura total **permanece 200px**.
  - **Aplicar no projeto todo**:  
    `* { box-sizing: border-box; }`  
    → facilita calcular tamanhos de caixas.
- ✅ **Boas práticas (mercado)**:
  - **Defina globalmente**: use `* { box-sizing: border-box; }` para previsibilidade.
  - **Seja consistente**: evite misturar `content-box` e `border-box` sem motivo claro.
  - **Componentes reutilizáveis**: documente o padrão de `box-sizing` no design system.
  - **Layouts responsivos**: prefira `border-box` para evitar “estouro” de largura/altura.

### CSS `box-sizing` 🧰

- ✅ **What it is**: defines how the browser calculates an element’s total size.
- ✅ **`content-box` (default)**: width/height **exclude** `padding` and `border`.
- ✅ **`border-box`**: width/height **include** `padding` and `border`.
- ✅ **Example**:
  - `.card { width: 200px; padding: 20px; box-sizing: border-box; }`  
    → total width stays 200px.
- ✅ **Practical examples (simple)**:
  - **Without `border-box`**:  
    `div { width: 200px; padding: 20px; border: 5px solid; }`  
    → total width becomes **250px** (200 + 20 + 20 + 5 + 5).
  - **With `border-box`**:  
    `div { width: 200px; padding: 20px; border: 5px solid; box-sizing: border-box; }`  
    → total width **stays 200px**.
  - **Apply to the whole project**:  
    `* { box-sizing: border-box; }`  
    → easier to size elements.
- ✅ **Best practices (industry)**:
  - **Set globally**: use `* { box-sizing: border-box; }` for predictable sizing.
  - **Be consistent**: avoid mixing `content-box` and `border-box` without a clear reason.
  - **Reusable components**: document the `box-sizing` standard in your design system.
  - **Responsive layouts**: prefer `border-box` to prevent overflow issues.

### Flexbox (CSS) — simples e profundo 🧭

- ✅ **O que é**: um modelo de layout em **1 dimensão** (linha ou coluna) para alinhar e distribuir itens.
- ✅ **Ideia central**: um **container flex** controla o posicionamento dos **itens flex**.
- ✅ **Eixos**:
  - **Main axis** (eixo principal): direção definida por `flex-direction`.
  - **Cross axis** (eixo cruzado): perpendicular ao eixo principal.
- ✅ **Como os eixos mudam (detalhado)**:
  - **`flex-direction: row` (padrão)**:
    - **Eixo principal**: horizontal (esquerda → direita).
    - **Eixo cruzado**: vertical (topo → baixo).
  - **`flex-direction: row-reverse`**:
    - **Eixo principal**: horizontal (direita → esquerda).
  - **`flex-direction: column`**:
    - **Eixo principal**: vertical (topo → baixo).
    - **Eixo cruzado**: horizontal (esquerda → direita).
  - **`flex-direction: column-reverse`**:
    - **Eixo principal**: vertical (baixo → topo).
- ✅ **Quando usar**: menus, cards alinhados, centralização, componentes em linha/coluna.

**Propriedades do container (todas):**
| Propriedade | Valores | Descrição |
|-------------|---------|-----------|
| `display` | `flex`, `inline-flex` | Ativa flexbox |
| `flex-direction` | `row`, `row-reverse`, `column`, `column-reverse` | Direção do eixo principal |
| `flex-wrap` | `nowrap`, `wrap`, `wrap-reverse` | Quebra de linha |
| `flex-flow` | `<direction> <wrap>` | Atalho para direction + wrap |
| `justify-content` | `flex-start`, `flex-end`, `center`, `space-between`, `space-around`, `space-evenly` | Alinha no eixo principal |
| `align-items` | `stretch`, `flex-start`, `flex-end`, `center`, `baseline` | Alinha no eixo cruzado |
| `align-content` | `stretch`, `flex-start`, `flex-end`, `center`, `space-between`, `space-around` | Alinha **múltiplas linhas** (só com `flex-wrap: wrap` e múltiplas linhas) |
| `gap` | `<row-gap> <column-gap>` | Espaçamento entre itens |

**Propriedades dos itens (todas):**
| Propriedade | Valores | Descrição |
|-------------|---------|-----------|
| `order` | número (padrão: 0) | Ordem de exibição (menor = primeiro) |
| `flex-grow` | número (padrão: 0) | Quanto cresce quando sobra espaço |
| `flex-shrink` | número (padrão: 1) | Quanto encolhe quando falta espaço |
| `flex-basis` | tamanho ou `auto` | Tamanho base antes de crescer/encolher |
| `flex` | `<grow> <shrink> <basis>` | Atalho (ex.: `flex: 1 1 auto`) |
| `align-self` | `auto`, `flex-start`, `flex-end`, `center`, `baseline`, `stretch` | Sobrescreve `align-items` para um item |

**Valores de `justify-content` (visual):**
```
flex-start:    [A][B][C]____________
flex-end:      ____________[A][B][C]
center:        ______[A][B][C]______
space-between: [A]______[B]______[C]
space-around:  __[A]____[B]____[C]__
space-evenly:  ___[A]___[B]___[C]___
```

**Valores de `align-items` (visual, em `row`):**
```
stretch:    |AAAA|  (estica para preencher altura)
flex-start: |A   |  (alinha no topo)
flex-end:   |   A|  (alinha embaixo)
center:     | A  |  (alinha no centro)
baseline:   texto alinhado pela linha de base da fonte
```

**`align-content` vs `align-items`:**
- `align-items`: alinha itens **dentro de cada linha**.
- `align-content`: distribui **as linhas** no container (só funciona com `flex-wrap: wrap` e múltiplas linhas).

**`order` — reordenando itens:**
```css
.item-a { order: 2; }  /* aparece por último */
.item-b { order: 1; }  /* aparece no meio */
.item-c { order: 0; }  /* aparece primeiro (padrão) */
```

**`flex-shrink` — como funciona:**
- Quando a soma das `basis` > largura do container, os itens **encolhem**.
- `flex-shrink: 0` → item **não** encolhe (mantém `basis`).
- `flex-shrink: 2` → encolhe **2x mais** que um item com `shrink: 1`.

**Valores comuns de `flex` (atalhos):**
| Valor | Equivalente | Uso |
|-------|-------------|-----|
| `flex: 1` | `1 1 0%` | Cresce/encolhe igualmente, ignora conteúdo |
| `flex: auto` | `1 1 auto` | Cresce/encolhe, respeita conteúdo |
| `flex: none` | `0 0 auto` | Tamanho fixo, não flexível |
| `flex: 0 1 auto` | padrão | Não cresce, pode encolher |

**Truques úteis:**
```css
/* Centralização perfeita (1 linha) */
.center { display: flex; justify-content: center; align-items: center; }

/* Último item à direita (push) */
.spacer { margin-left: auto; }

/* Rodapé fixo no fim da página */
body { display: flex; flex-direction: column; min-height: 100vh; }
main { flex: 1; }

/* Igual altura para cards */
.cards { display: flex; align-items: stretch; }
```

**Debugging Flexbox:**
- Use DevTools → inspecione o container → veja o badge "flex".
- Clique no badge para visualizar eixos e espaçamento.

### CSS do 16.html — explicação detalhada (PT-BR) 🎯

- `* { margin: 0; padding: 0; box-sizing: border-box; }`  
  → remove margens/paddings padrão do navegador e evita “estouro” ao somar borda/padding no tamanho.
- `body { background-color: black; }`  
  → define fundo escuro para destacar as caixas e o texto.
- `.container { height: 100vh; width: 100vw; display: flex; ... }`  
  → ocupa toda a tela e coloca os filhos lado a lado (linha).
- `border: 1px solid red; color: white;`  
  → borda vermelha para visualizar o container e texto branco para contraste.
- `.container > div { flex: 1; ... }`  
  → cada coluna cresce igualmente (metade da largura).
- `border: 1px solid blue; margin: 5px; padding: 5px;`  
  → borda azul para visualizar cada coluna, margem externa e respiro interno.

### 16.html CSS — detailed explanation (EN) 🎯

- `* { margin: 0; padding: 0; box-sizing: border-box; }`  
  → removes default margins/paddings and prevents size overflow when adding borders/padding.
- `body { background-color: black; }`  
  → dark background to highlight boxes and text.
- `.container { height: 100vh; width: 100vw; display: flex; ... }`  
  → fills the viewport and lays children side by side (row).
- `border: 1px solid red; color: white;`  
  → red border to visualize the container, white text for contrast.
- `.container > div { flex: 1; ... }`  
  → each column grows equally (half the width).
- `border: 1px solid blue; margin: 5px; padding: 5px;`  
  → blue border for each column, outer spacing and inner padding.

### Herança no CSS (inheritance) 🧬

- ✅ **PT-BR**: algumas propriedades são herdadas dos pais para os filhos (ex.: `color`, `font-family`).  
  - Ex.: se `.container { color: white; }`, o texto dos filhos fica branco.
- ✅ **EN**: some properties are inherited from parent to child (e.g., `color`, `font-family`).  
  - Example: if `.container { color: white; }`, child text becomes white.

### Seletor de filho direto `>` (CSS) 👶

- ✅ **PT-BR**: seleciona **apenas** filhos imediatos (não netos).  
  - Ex.: `.container > div { ... }` aplica só às `<div>` dentro da `.container`.
- ✅ **EN**: selects **only** direct children (not grandchildren).  
  - Example: `.container > div { ... }` applies only to `<div>` directly inside `.container`.

**Exemplo rápido / Quick example:**
```css
/* ...existing code... */
.container > div { border: 1px solid blue; }
/* ...existing code... */
```

### Flex shorthand (`flex: grow shrink basis`) — exemplo claro 🧭

**PT-BR (contexto do 16.html):**
- **O que cresce/encolhe?** a **largura** do item (eixo principal em `row`).
- **Cresce quando?** quando sobra espaço no container.
- **Encolhe quando?** quando falta espaço no container.
- `flex: 1 1 300px;` → base 300px; cresce 1 parte e pode encolher.
- `flex: 2 1 200px;` → base 200px; cresce 2 partes e pode encolher.
- **Exemplo detalhado (container 1000px, 2 itens):**
  - **Somatório das bases**: 300 + 200 = 500px.
  - **Espaço livre**: 1000 - 500 = 500px.
  - **Partes de crescimento**: 1 + 2 = 3 partes.
  - **Distribuição do extra**:
    - Item 1 recebe **1/3** de 500 ≈ **166,7px**.
    - Item 2 recebe **2/3** de 500 ≈ **333,3px**.
  - **Tamanho final**:
    - Item 1: 300 + 166,7 ≈ **466,7px**.
    - Item 2: 200 + 333,3 ≈ **533,3px**.
- **Resumo curto**: o `grow` define **quanto** cada item leva do espaço livre; o `basis` define o **ponto de partida**.

**EN (16.html context):**
- **What grows/shrinks?** the item’s **width** (main axis in `row`).
- **Grows when?** when there is extra space in the container.
- **Shrinks when?** when there isn’t enough space in the container.
- `flex: 1 1 300px;` → 300px base; grows by 1 part and can shrink.
- `flex: 2 1 200px;` → 200px base; grows by 2 parts and can shrink.
- **Detailed example (1000px container, 2 items):**
  - **Base sum**: 300 + 200 = 500px.
  - **Free space**: 1000 - 500 = 500px.
  - **Growth parts**: 1 + 2 = 3 parts.
  - **Extra space split**:
    - Item 1 gets **1/3** of 500 ≈ **166.7px**.
    - Item 2 gets **2/3** of 500 ≈ **333.3px**.
  - **Final sizes**:
    - Item 1: 300 + 166.7 ≈ **466.7px**.
    - Item 2: 200 + 333.3 ≈ **533.3px**.
- **Short summary**: `grow` controls **how much** extra space each item receives; `basis` is the **starting point**.

### Exercícios — Cores no CSS 🧪

1) **Harmonia de cores no CSS**  
   - Use a **Roda de Cores da Adobe** para criar uma paleta.  
   - Escolha **1 cor principal** (background) e **2 secundárias** (títulos e parágrafos).  
   - Exemplo no `style.css`:
```css
/* ...existing code... */
body { background-color: #E6F0FF; }
h1, h2 { color: #2B303A; }
p { color: #0C7C59; }
/* ...existing code... */
```

2) **Corrigindo erro de legibilidade**  
   - Problema: `background-color: #000000;` e `color: black;`  
   - Solução: trocar `color` para uma cor clara.  
```css
/* ...existing code... */
body { background-color: #000000; color: #F6F6F6; }
/* ...existing code... */
```

3) **RGB no CSS (hex)**  
   - Escolha duas cores em **hex** (fundo e texto).  
   - Exemplo:
```css
/* ...existing code... */
body { background-color: #FF5733; color: #00FF00; }
/* ...existing code... */
```

### Seletores CSS — tag, classe e id 🧩

- ✅ **Seletor de tag**: aplica a todos os elementos daquela tag.  
  - Ex.: `p { color: #333; }`
- ✅ **Seletor de classe**: aplica a elementos com `class="..."`.  
  - Ex.: `.destaque { color: #22D4FD; }`
- ✅ **Seletor de id**: aplica ao elemento com `id="..."` (idealmente único na página).  
  - Ex.: `#cabecalho { background: #000; }`

### CSS selectors — tag, class, and id 🧩

- ✅ **Tag selector**: applies to all elements of that tag.  
  - Ex.: `p { color: #333; }`
- ✅ **Class selector**: applies to elements with `class="..."`.  
  - Ex.: `.highlight { color: #22D4FD; }`
- ✅ **ID selector**: applies to the element with `id="..."` (ideally unique on the page).  
  - Ex.: `#header { background: #000; }`

### Âncora (`<a>`) no HTML 🔗

- ✅ **O que é**: elemento usado para criar links.
- ✅ **Como funciona**: o atributo `href` define o destino (URL ou seção da página).
- ✅ **Exemplo**:
  - `<a href="https://example.com">Ir para o site</a>`
  - `<a href="#contato">Ir para contato</a>` (âncora interna)

### HTML anchor (`<a>`) 🔗

- ✅ **What it is**: element used to create links.
- ✅ **How it works**: the `href` attribute defines the destination (URL or page section).
- ✅ **Example**:
  - `<a href="https://example.com">Go to site</a>`
  - `<a href="#contact">Go to contact</a>` (internal anchor)

### Reset CSS 🧼

- ✅ **O que é**: conjunto de estilos básicos para padronizar a aparência inicial entre navegadores.
- ✅ **Por que usar**: reduz diferenças de margens, paddings e fontes padrão.
- ✅ **Exemplo simples**:
  - `* { margin: 0; padding: 0; box-sizing: border-box; }`

### Box Model (modelo de caixa) 📦

- ✅ **O que é**: todo elemento é uma caixa composta por **content**, **padding**, **border** e **margin**.
- ✅ **Como funciona**:
  - **content**: área do conteúdo.
  - **padding**: espaço interno entre conteúdo e borda.
  - **border**: a borda do elemento.
  - **margin**: espaço externo entre elementos.

### CSS Reset 🧼

- ✅ **What it is**: a basic style set to normalize default styles across browsers.
- ✅ **Why use it**: reduces differences in default margins, paddings, and fonts.
- ✅ **Simple example**:
  - `* { margin: 0; padding: 0; box-sizing: border-box; }`

### Box Model 📦

- ✅ **What it is**: every element is a box made of **content**, **padding**, **border**, and **margin**.
- ✅ **How it works**:
  - **content**: content area.
  - **padding**: inner space around content.
  - **border**: element border.
  - **margin**: outer space between elements.

### Medidas no CSS (unidades) 📏

- ✅ **Unidades absolutas**: não mudam com o layout ou fonte.  
  - Exemplos: `px`, `cm`, `mm`, `in`, `pt`.
- ✅ **Unidades relativas**: variam conforme contexto (tamanho da fonte, viewport, etc.).  
  - **`%`**: relativo ao elemento pai.  
  - **`em`**: relativo ao tamanho da fonte do elemento.  
  - **`rem`**: relativo ao tamanho da fonte do `html` (raiz).  
  - **`vw` / `vh`**: relativo à largura/altura da viewport.  
  - **`vmin` / `vmax`**: menor/maior dimensão da viewport.
- ✅ **Viewport (explicação simples)**:
  - **O que é**: a área visível da página no navegador (a “tela útil”).
  - **Exemplos**:
    - Se a janela tem **1200px de largura** e **800px de altura**:
      - `100vw` = 1200px (toda a largura visível)
      - `50vw` = 600px (metade da largura)
      - `100vh` = 800px (toda a altura visível)
      - `50vh` = 400px (metade da altura)
    - Se a tela é **360px x 640px** (celular):
      - `100vw` = 360px
      - `100vh` = 640px
      - `vmin` = 360px, `vmax` = 640px
- ✅ **Quando usar**:
  - **`px`**: ajustes precisos.
  - **`rem` / `em`**: tipografia responsiva.
  - **`%` / `vw` / `vh`**: layouts fluidos.
- ✅ **Exemplos fáceis**:
  - `p { font-size: 16px; }` → texto com 16 pixels.
  - `h1 { font-size: 2rem; }` → 2x o tamanho base da página.
  - `.box { width: 50%; }` → metade da largura do elemento pai.
  - `.card { padding: 1em; }` → espaçamento interno igual ao tamanho da fonte.
  - `.hero { height: 100vh; }` → ocupa 100% da altura da tela.
  - `.sidebar { width: 30vw; }` → 30% da largura da tela.

### CSS units (measurements) 📏

- ✅ **Absolute units**: fixed regardless of layout or font.  
  - Examples: `px`, `cm`, `mm`, `in`, `pt`.
- ✅ **Relative units**: depend on context (font size, viewport, etc.).  
  - **`%`**: relative to the parent.  
  - **`em`**: relative to the element’s font size.  
  - **`rem`**: relative to the root (`html`) font size.  
  - **`vw` / `vh`**: relative to viewport width/height.  
  - **`vmin` / `vmax`**: smallest/largest viewport dimension.
- ✅ **Viewport (simple explanation)**:
  - **What it is**: the visible area of the page in the browser (the “usable screen”).
  - **Examples**:
    - If the window is **1200px wide** and **800px tall**:
      - `100vw` = 1200px (full visible width)
      - `50vw` = 600px (half width)
      - `100vh` = 800px (full visible height)
      - `50vh` = 400px (half height)
    - If the screen is **360px x 640px** (mobile):
      - `100vw` = 360px
      - `100vh` = 640px
      - `vmin` = 360px, `vmax` = 640px
- ✅ **Quando usar**:
  - **`px`**: ajustes precisos.
  - **`rem` / `em`**: tipografia responsiva.
  - **`%` / `vw` / `vh`**: layouts fluidos.
- ✅ **Exemplos fáceis**:
  - `p { font-size: 16px; }` → texto com 16 pixels.
  - `h1 { font-size: 2rem; }` → 2x o tamanho base da página.
  - `.box { width: 50%; }` → metade da largura do elemento pai.
  - `.card { padding: 1em; }` → espaçamento interno igual ao tamanho da fonte.
  - `.hero { height: 100vh; }` → ocupa 100% da altura da tela.
  - `.sidebar { width: 30vw; }` → 30% da largura da tela.

### box-sizing no CSS 🧰

- ✅ **O que é**: define como o navegador calcula o tamanho total do elemento.
- ✅ **`content-box` (padrão)**: largura/altura **não** incluem `padding` e `border`.
- ✅ **`border-box`**: largura/altura **incluem** `padding` e `border`.
- ✅ **Exemplo**:
  - `.card { width: 200px; padding: 20px; box-sizing: border-box; }`  
    → a caixa continua com 200px de largura total.
- ✅ **Exemplos práticos (bem simples)**:
  - **Sem `border-box`**:  
    `div { width: 200px; padding: 20px; border: 5px solid; }`  
    → largura total vira **250px** (200 + 20 + 20 + 5 + 5).
  - **Com `border-box`**:  
    `div { width: 200px; padding: 20px; border: 5px solid; box-sizing: border-box; }`  
    → largura total **permanece 200px**.
  - **Aplicar no projeto todo**:  
    `* { box-sizing: border-box; }`  
    → facilita calcular tamanhos de caixas.
- ✅ **Boas práticas (mercado)**:
  - **Defina globalmente**: use `* { box-sizing: border-box; }` para previsibilidade.
  - **Seja consistente**: evite misturar `content-box` e `border-box` sem motivo claro.
  - **Componentes reutilizáveis**: documente o padrão de `box-sizing` no design system.
  - **Layouts responsivos**: prefira `border-box` para evitar “estouro” de largura/altura.

### CSS `box-sizing` 🧰

- ✅ **What it is**: defines how the browser calculates an element’s total size.
- ✅ **`content-box` (default)**: width/height **exclude** `padding` and `border`.
- ✅ **`border-box`**: width/height **include** `padding` and `border`.
- ✅ **Example**:
  - `.card { width: 200px; padding: 20px; box-sizing: border-box; }`  
    → total width stays 200px.
- ✅ **Practical examples (simple)**:
  - **Without `border-box`**:  
    `div { width: 200px; padding: 20px; border: 5px solid; }`  
    → total width becomes **250px** (200 + 20 + 20 + 5 + 5).
  - **With `border-box`**:  
    `div { width: 200px; padding: 20px; border: 5px solid; box-sizing: border-box; }`  
    → total width **stays 200px**.
  - **Apply to the whole project**:  
    `* { box-sizing: border-box; }`  
    → easier to size elements.
- ✅ **Best practices (industry)**:
  - **Set globally**: use `* { box-sizing: border-box; }` for predictable sizing.
  - **Be consistent**: avoid mixing `content-box` and `border-box` without a clear reason.
  - **Reusable components**: document the `box-sizing` standard in your design system.
  - **Responsive layouts**: prefer `border-box` to prevent overflow issues.

### Flexbox (CSS) — simples e profundo 🧭

- ✅ **O que é**: um modelo de layout em **1 dimensão** (linha ou coluna) para alinhar e distribuir itens.
- ✅ **Ideia central**: um **container flex** controla o posicionamento dos **itens flex**.
- ✅ **Eixos**:
  - **Main axis** (eixo principal): direção definida por `flex-direction`.
  - **Cross axis** (eixo cruzado): perpendicular ao eixo principal.
- ✅ **Como os eixos mudam (detalhado)**:
  - **`flex-direction: row` (padrão)**:
    - **Eixo principal**: horizontal (esquerda → direita).
    - **Eixo cruzado**: vertical (topo → baixo).
  - **`flex-direction: row-reverse`**:
    - **Eixo principal**: horizontal (direita → esquerda).
  - **`flex-direction: column`**:
    - **Eixo principal**: vertical (topo → baixo).
    - **Eixo cruzado**: horizontal (esquerda → direita).
  - **`flex-direction: column-reverse`**:
    - **Eixo principal**: vertical (baixo → topo).
- ✅ **Quando usar**: menus, cards alinhados, centralização, componentes em linha/coluna.

**Propriedades do container (todas):**
| Propriedade | Valores | Descrição |
|-------------|---------|-----------|
| `display` | `flex`, `inline-flex` | Ativa flexbox |
| `flex-direction` | `row`, `row-reverse`, `column`, `column-reverse` | Direção do eixo principal |
| `flex-wrap` | `nowrap`, `wrap`, `wrap-reverse` | Quebra de linha |
| `flex-flow` | `<direction> <wrap>` | Atalho para direction + wrap |
| `justify-content` | `flex-start`, `flex-end`, `center`, `space-between`, `space-around`, `space-evenly` | Alinha no eixo principal |
| `align-items` | `stretch`, `flex-start`, `flex-end`, `center`, `baseline` | Alinha no eixo cruzado |
| `align-content` | `stretch`, `flex-start`, `flex-end`, `center`, `space-between`, `space-around` | Alinha **múltiplas linhas** (só com `flex-wrap: wrap` e múltiplas linhas) |
| `gap` | `<row-gap> <column-gap>` | Espaçamento entre itens |

**Propriedades dos itens (todas):**
| Propriedade | Valores | Descrição |
|-------------|---------|-----------|
| `order` | número (padrão: 0) | Ordem de exibição (menor = primeiro) |
| `flex-grow` | número (padrão: 0) | Quanto cresce quando sobra espaço |
| `flex-shrink` | número (padrão: 1) | Quanto encolhe quando falta espaço |
| `flex-basis` | tamanho ou `auto` | Tamanho base antes de crescer/encolher |
| `flex` | `<grow> <shrink> <basis>` | Atalho (ex.: `flex: 1 1 auto`) |
| `align-self` | `auto`, `flex-start`, `flex-end`, `center`, `baseline`, `stretch` | Sobrescreve `align-items` para um item |

**Valores de `justify-content` (visual):**
```
flex-start:    [A][B][C]____________
flex-end:      ____________[A][B][C]
center:        ______[A][B][C]______
space-between: [A]______[B]______[C]
space-around:  __[A]____[B]____[C]__
space-evenly:  ___[A]___[B]___[C]___
```

**Valores de `align-items` (visual, em `row`):**
```
stretch:    |AAAA|  (estica para preencher altura)
flex-start: |A   |  (alinha no topo)
flex-end:   |   A|  (alinha embaixo)
center:     | A  |  (alinha no centro)
baseline:   texto alinhado pela linha de base da fonte
```

**`align-content` vs `align-items`:**
- `align-items`: alinha itens **dentro de cada linha**.
- `align-content`: distribui **as linhas** no container (só funciona com `flex-wrap: wrap` e múltiplas linhas).

**`order` — reordenando itens:**
```css
.item-a { order: 2; }  /* aparece por último */
.item-b { order: 1; }  /* aparece no meio */
.item-c { order: 0; }  /* aparece primeiro (padrão) */
```

**`flex-shrink` — como funciona:**
- Quando a soma das `basis` > largura do container, os itens **encolhem**.
- `flex-shrink: 0` → item **não** encolhe (mantém `basis`).
- `flex-shrink: 2` → encolhe **2x mais** que um item com `shrink: 1`.

**Valores comuns de `flex` (atalhos):**
| Valor | Equivalente | Uso |
|-------|-------------|-----|
| `flex: 1` | `1 1 0%` | Cresce/encolhe igualmente, ignora conteúdo |
| `flex: auto` | `1 1 auto` | Cresce/encolhe, respeita conteúdo |
| `flex: none` | `0 0 auto` | Tamanho fixo, não flexível |
| `flex: 0 1 auto` | padrão | Não cresce, pode encolher |

**Truques úteis:**
```css
/* Centralização perfeita (1 linha) */
.center { display: flex; justify-content: center; align-items: center; }

/* Último item à direita (push) */
.spacer { margin-left: auto; }

/* Rodapé fixo no fim da página */
body { display: flex; flex-direction: column; min-height: 100vh; }
main { flex: 1; }

/* Igual altura para cards */
.cards { display: flex; align-items: stretch; }
```

**Debugging Flexbox:**
- Use DevTools → inspecione o container → veja o badge "flex".
- Clique no badge para visualizar eixos e espaçamento.

### CSS do 16.html — explicação detalhada (PT-BR) 🎯

- `* { margin: 0; padding: 0; box-sizing: border-box; }`  
  → remove margens/paddings padrão do navegador e evita “estouro” ao somar borda/padding no tamanho.
- `body { background-color: black; }`  
  → define fundo escuro para destacar as caixas e o texto.
- `.container { height: 100vh; width: 100vw; display: flex; ... }`  
  → ocupa toda a tela e coloca os filhos lado a lado (linha).
- `border: 1px solid red; color: white;`  
  → borda vermelha para visualizar o container e texto branco para contraste.
- `.container > div { flex: 1; ... }`  
  → cada coluna cresce igualmente (metade da largura).
- `border: 1px solid blue; margin: 5px; padding: 5px;`  
  → borda azul para visualizar cada coluna, margem externa e respiro interno.

### 16.html CSS — detailed explanation (EN) 🎯

- `* { margin: 0; padding: 0; box-sizing: border-box; }`  
  → removes default margins/paddings and prevents size overflow when adding borders/padding.
- `body { background-color: black; }`  
  → dark background to highlight boxes and text.
- `.container { height: 100vh; width: 100vw; display: flex; ... }`  
  → fills the viewport and lays children side by side (row).
- `border: 1px solid red; color: white;`  
  → red border to visualize the container, white text for contrast.
- `.container > div { flex: 1; ... }`  
  → each column grows equally (half the width).
- `border: 1px solid blue; margin: 5px; padding: 5px;`  
  → blue border for each column, outer spacing and inner padding.

### Herança no CSS (inheritance) 🧬

- ✅ **PT-BR**: algumas propriedades são herdadas dos pais para os filhos (ex.: `color`, `font-family`).  
  - Ex.: se `.container { color: white; }`, o texto dos filhos fica branco.
- ✅ **EN**: some properties are inherited from parent to child (e.g., `color`, `font-family`).  
  - Example: if `.container { color: white; }`, child text becomes white.

### Seletor de filho direto `>` (CSS) 👶

- ✅ **PT-BR**: seleciona **apenas** filhos imediatos (não netos).  
  - Ex.: `.container > div { ... }` aplica só às `<div>` dentro da `.container`.
- ✅ **EN**: selects **only** direct children (not grandchildren).  
  - Example: `.container > div { ... }` applies only to `<div>` directly inside `.container`.

**Exemplo rápido / Quick example:**
```css
/* ...existing code... */
.container > div { border: 1px solid blue; }
/* ...existing code... */
```

### Flex shorthand (`flex: grow shrink basis`) — exemplo claro 🧭

**PT-BR (contexto do 16.html):**
- **O que cresce/encolhe?** a **largura** do item (eixo principal em `row`).
- **Cresce quando?** quando sobra espaço no container.
- **Encolhe quando?** quando falta espaço no container.
- `flex: 1 1 300px;` → base 300px; cresce 1 parte e pode encolher.
- `flex: 2 1 200px;` → base 200px; cresce 2 partes e pode encolher.
- **Exemplo detalhado (container 1000px, 2 itens):**
  - **Somatório das bases**: 300 + 200 = 500px.
  - **Espaço livre**: 1000 - 500 = 500px.
  - **Partes de crescimento**: 1 + 2 = 3 partes.
  - **Distribuição do extra**:
    - Item 1 recebe **1/3** de 500 ≈ **166,7px**.
    - Item 2 recebe **2/3** de 500 ≈ **333,3px**.
  - **Tamanho final**:
    - Item 1: 300 + 166,7 ≈ **466,7px**.
    - Item 2: 200 + 333,3 ≈ **533,3px**.
- **Resumo curto**: o `grow` define **quanto** cada item leva do espaço livre; o `basis` define o **ponto de partida**.

**EN (16.html context):**
- **What grows/shrinks?** the item’s **width** (main axis in `row`).
- **Grows when?** when there is extra space in the container.
- **Shrinks when?** when there isn’t enough space in the container.
- `flex: 1 1 300px;` → 300px base; grows by 1 part and can shrink.
- `flex: 2 1 200px;` → 200px base; grows by 2 parts and can shrink.
- **Detailed example (1000px container, 2 items):**
  - **Base sum**: 300 + 200 = 500px.
  - **Free space**: 1000 - 500 = 500px.
  - **Growth parts**: 1 + 2 = 3 parts.
  - **Extra space split**:
    - Item 1 gets **1/3** of 500 ≈ **166.7px**.
    - Item 2 gets **2/3** of 500 ≈ **333.3px**.
  - **Final sizes**:
    - Item 1: 300 + 166.7 ≈ **466.7px**.
    - Item 2: 200 + 333.3 ≈ **533.3px**.
- **Short summary**: `grow` controls **how much** extra space each item receives; `basis` is the **starting point**.

### Exercícios — Cores no CSS 🧪

1) **Harmonia de cores no CSS**  
   - Use a **Roda de Cores da Adobe** para criar uma paleta.  
   - Escolha **1 cor principal** (background) e **2 secundárias** (títulos e parágrafos).  
   - Exemplo no `style.css`:
```css
/* ...existing code... */
body { background-color: #E6F0FF; }
h1, h2 { color: #2B303A; }
p { color: #0C7C59; }
/* ...existing code... */
```

2) **Corrigindo erro de legibilidade**  
   - Problema: `background-color: #000000;` e `color: black;`  
   - Solução: trocar `color` para uma cor clara.  
```css
/* ...existing code... */
body { background-color: #000000; color: #F6F6F6; }
/* ...existing code... */
```

3) **RGB no CSS (hex)**  
   - Escolha duas cores em **hex** (fundo e texto).  
   - Exemplo:
```css
/* ...existing code... */
body { background-color: #FF5733; color: #00FF00; }
/* ...existing code... */
```

### Seletores CSS — tag, classe e id 🧩

- ✅ **Seletor de tag**: aplica a todos os elementos daquela tag.  
  - Ex.: `p { color: #333; }`
- ✅ **Seletor de classe**: aplica a elementos com `class="..."`.  
  - Ex.: `.destaque { color: #22D4FD; }`
- ✅ **Seletor de id**: aplica ao elemento com `id="..."` (idealmente único na página).  
  - Ex.: `#cabecalho { background: #000; }`

### CSS selectors — tag, class, and id 🧩

- ✅ **Tag selector**: applies to all elements of that tag.  
  - Ex.: `p { color: #333; }`
- ✅ **Class selector**: applies to elements with `class="..."`.  
  - Ex.: `.highlight { color: #22D4FD; }`
- ✅ **ID selector**: applies to the element with `id="..."` (ideally unique on the page).  
  - Ex.: `#header { background: #000; }`

### Âncora (`<a>`) no HTML 🔗

- ✅ **O que é**: elemento usado para criar links.
- ✅ **Como funciona**: o atributo `href` define o destino (URL ou seção da página).
- ✅ **Exemplo**:
  - `<a href="https://example.com">Ir para o site</a>`
  - `<a href="#contato">Ir para contato</a>` (âncora interna)

### HTML anchor (`<a>`) 🔗

- ✅ **What it is**: element used to create links.
- ✅ **How it works**: the `href` attribute defines the destination (URL or page section).
- ✅ **Example**:
  - `<a href="https://example.com">Go to site</a>`
  - `<a href="#contact">Go to contact</a>` (internal anchor)

### Reset CSS 🧼

- ✅ **O que é**: conjunto de estilos básicos para padronizar a aparência inicial entre navegadores.
- ✅ **Por que usar**: reduz diferenças de margens, paddings e fontes padrão.
- ✅ **Exemplo simples**:
  - `* { margin: 0; padding: 0; box-sizing: border-box; }`

### Box Model (modelo de caixa) 📦

- ✅ **O que é**: todo elemento é uma caixa composta por **content**, **padding**, **border** e **margin**.
- ✅ **Como funciona**:
  - **content**: área do conteúdo.
  - **padding**: espaço interno entre conteúdo e borda.
  - **border**: a borda do elemento.
  - **margin**: espaço externo entre elementos.

### CSS Reset 🧼

- ✅ **What it is**: a basic style set to normalize default styles across browsers.
- ✅ **Why use it**: reduces differences in default margins, paddings, and fonts.
- ✅ **Simple example**:
  - `* { margin: 0; padding: 0; box-sizing: border-box; }`

### Box Model 📦

- ✅ **What it is**: every element is a box made of **content**, **padding**, **border**, and **margin**.
- ✅ **How it works**:
  - **content**: content area.
  - **padding**: inner space around content.
  - **border**: element border.
  - **margin**: outer space between elements.

### Medidas no CSS (unidades) 📏

- ✅ **Unidades absolutas**: não mudam com o layout ou fonte.  
  - Exemplos: `px`, `cm`, `mm`, `in`, `pt`.
- ✅ **Unidades relativas**: variam conforme contexto (tamanho da fonte, viewport, etc.).  
  - **`%`**: relativo ao elemento pai.  
  - **`em`**: relativo ao tamanho da fonte do elemento.  
  - **`rem`**: relativo ao tamanho da fonte do `html` (raiz).  
  - **`vw` / `vh`**: relativo à largura/altura da viewport.  
  - **`vmin` / `vmax`**: menor/maior dimensão da viewport.
- ✅ **Viewport (explicação simples)**:
  - **O que é**: a área visível da página no navegador (a “tela útil”).
  - **Exemplos**:
    - Se a janela tem **1200px de largura** e **800px de altura**:
      - `100vw` = 1200px (toda a largura visível)
      - `50vw` = 600px (metade da largura)
      - `100vh` = 800px (toda a altura visível)
      - `50vh` = 400px (metade da altura)
    - Se a tela é **360px x 640px** (celular):
      - `100vw` = 360px
      - `100vh` = 640px
      - `vmin` = 360px, `vmax` = 640px
- ✅ **Quando usar**:
  - **`px`**: ajustes precisos.
  - **`rem` / `em`**: tipografia responsiva.
  - **`%` / `vw` / `vh`**: layouts fluidos.
- ✅ **Exemplos fáceis**:
  - `p { font-size: 16px; }` → texto com 16 pixels.
  - `h1 { font-size: 2rem; }` → 2x o tamanho base da página.
  - `.box { width: 50%; }` → metade da largura do elemento pai.
  - `.card { padding: 1em; }` → espaçamento interno igual ao tamanho da fonte.
  - `.hero { height: 100vh; }` → ocupa 100% da altura da tela.
  - `.sidebar { width: 30vw; }` → 30% da largura da tela.

### CSS units (measurements) 📏

- ✅ **Absolute units**: fixed regardless of layout or font.  
  - Examples: `px`, `cm`, `mm`, `in`, `pt`.
- ✅ **Relative units**: depend on context (font size, viewport, etc.).  
  - **`%`**: relative to the parent.  
  - **`em`**: relative to the element’s font size.  
  - **`rem`**: relative to the root (`html`) font size.  
  - **`vw` / `vh`**: relative to viewport width/height.  
  - **`vmin` / `vmax`**: smallest/largest viewport dimension.
- ✅ **Viewport (simple explanation)**:
  - **What it is**: the visible area of the page in the browser (the “usable screen”).
  - **Examples**:
    - If the window is **1200px wide** and **800px tall**:
      - `100vw` = 1200px (full visible width)
      - `50vw` = 600px (half width)
      - `100vh` = 800px (full visible height)
      - `50vh` = 400px (half height)
    - If the screen is **360px x 640px** (mobile):
      - `100vw` = 360px
      - `100vh` = 640px
      - `vmin` = 360px, `vmax` = 640px
- ✅ **Quando usar**:
  - **`px`**: ajustes precisos.
  - **`rem` / `em`**: tipografia responsiva.
  - **`%` / `vw` / `vh`**: layouts fluidos.
- ✅ **Exemplos fáceis**:
  - `p { font-size: 16px; }` → texto com 16 pixels.
  - `h1 { font-size: 2rem; }` → 2x o tamanho base da página.
  - `.box { width: 50%; }` → metade da largura do elemento pai.
  - `.card { padding: 1em; }` → espaçamento interno igual ao tamanho da fonte.
  - `.hero { height: 100vh; }` → ocupa 100% da altura da tela.
  - `.sidebar { width: 30vw; }` → 30% da largura da tela.

### box-sizing no CSS 🧰

- ✅ **O que é**: define como o navegador calcula o tamanho total do elemento.
- ✅ **`content-box` (padrão)**: largura/altura **não** incluem `padding` e `border`.
- ✅ **`border-box`**: largura/altura **incluem** `padding` e `border`.
- ✅ **Exemplo**:
  - `.card { width: 200px; padding: 20px; box-sizing: border-box; }`  
    → a caixa continua com 200px de largura total.
- ✅ **Exemplos práticos (bem simples)**:
  - **Sem `border-box`**:  
    `div { width: 200px; padding: 20px; border: 5px solid; }`  
    → largura total vira **250px** (200 + 20 + 20 + 5 + 5).
  - **Com `border-box`**:  
    `div { width: 200px; padding: 20px; border: 5px solid; box-sizing: border-box; }`  
    → largura total **permanece 200px**.
  - **Aplicar no projeto todo**:  
    `* { box-sizing: border-box; }`  
    → facilita calcular tamanhos de caixas.
- ✅ **Boas práticas (mercado)**:
  - **Defina globalmente**: use `* { box-sizing: border-box; }` para previsibilidade.
  - **Seja consistente**: evite misturar `content-box` e `border-box` sem motivo claro.
  - **Componentes reutilizáveis**: documente o padrão de `box-sizing` no design system.
  - **Layouts responsivos**: prefira `border-box` para evitar “estouro” de largura/altura.

### CSS `box-sizing` 🧰

- ✅ **What it is**: defines how the browser calculates an element’s total size.
- ✅ **`content-box` (default)**: width/height **exclude** `padding` and `border`.
- ✅ **`border-box`**: width/height **include** `padding` and `border`.
- ✅ **Example**:
  - `.card { width: 200px; padding: 20px; box-sizing: border-box; }`  
    → total width stays 200px.
- ✅ **Practical examples (simple)**:
  - **Without `border-box`**:  
    `div { width: 200px; padding: 20px; border: 5px solid; }`  
    → total width becomes **250px** (200 + 20 + 20 + 5 + 5).
  - **With `border-box`**:  
    `div { width: 200px; padding: 20px; border: 5px solid; box-sizing: border-box; }`  
    → total width **stays 200px**.
  - **Apply to the whole project**:  
    `* { box-sizing: border-box; }`  
    → easier to size elements.
- ✅ **Best practices (industry)**:
  - **Set globally**: use `* { box-sizing: border-box; }` for predictable sizing.
  - **Be consistent**: avoid mixing `content-box` and `border-box` without a clear reason.
  - **Reusable components**: document the `box-sizing` standard in your design system.
  - **Responsive layouts**: prefer `border-box` to prevent overflow issues.

### Flexbox (CSS) — simples e profundo 🧭

- ✅ **O que é**: um modelo de layout em **1 dimensão** (linha ou coluna) para alinhar e distribuir itens.
- ✅ **Ideia central**: um **container flex** controla o posicionamento dos **itens flex**.
- ✅ **Eixos**:
  - **Main axis** (eixo principal): direção definida por `flex-direction`.
  - **Cross axis** (eixo cruzado): perpendicular ao eixo principal.
- ✅ **Como os eixos mudam (detalhado)**:
  - **`flex-direction: row` (padrão)**:
    - **Eixo principal**: horizontal (esquerda → direita).
    - **Eixo cruzado**: vertical (topo → baixo).
  - **`flex-direction: row-reverse`**:
    - **Eixo principal**: horizontal (direita → esquerda).
  - **`flex-direction: column`**:
    - **Eixo principal**: vertical (topo → baixo).
    - **Eixo cruzado**: horizontal (esquerda → direita).
  - **`flex-direction: column-reverse`**:
    - **Eixo principal**: vertical (baixo → topo).
- ✅ **Quando usar**: menus, cards alinhados, centralização, componentes em linha/coluna.

**Propriedades do container (todas):**
| Propriedade | Valores | Descrição |
|-------------|---------|-----------|
| `display` | `flex`, `inline-flex` | Ativa flexbox |
| `flex-direction` | `row`, `row-reverse`, `column`, `column-reverse` | Direção do eixo principal |
| `flex-wrap` | `nowrap`, `wrap`, `wrap-reverse` | Quebra de linha |
| `flex-flow` | `<direction> <wrap>` | Atalho para direction + wrap |
| `justify-content` | `flex-start`, `flex-end`, `center`, `space-between`, `space-around`, `space-evenly` | Alinha no eixo principal |
| `align-items` | `stretch`, `flex-start`, `flex-end`, `center`, `baseline` | Alinha no eixo cruzado |
| `align-content` | `stretch`, `flex-start`, `flex-end`, `center`, `space-between`, `space-around` | Alinha **múltiplas linhas** (só com `flex-wrap: wrap` e múltiplas linhas) |
| `gap` | `<row-gap> <column-gap>` | Espaçamento entre itens |

**Propriedades dos itens (todas):**
| Propriedade | Valores | Descrição |
|-------------|---------|-----------|
| `order` | número (padrão: 0) | Ordem de exibição (menor = primeiro) |
| `flex-grow` | número (padrão: 0) | Quanto cresce quando sobra espaço |
| `flex-shrink` | número (padrão: 1) | Quanto encolhe quando falta espaço |
| `flex-basis` | tamanho ou `auto` | Tamanho base antes de crescer/encolher |
| `flex` | `<grow> <shrink> <basis>` | Atalho (ex.: `flex: 1 1 auto`) |
| `align-self` | `auto`, `flex-start`, `flex-end`, `center`, `baseline`, `stretch` | Sobrescreve `align-items` para um item |

**Valores de `justify-content` (visual):**
```
flex-start:    [A][B][C]____________
flex-end:      ____________[A][B][C]
center:        ______[A][B][C]______
space-between: [A]______[B]______[C]
space-around:  __[A]____[B]____[C]__
space-evenly:  ___[A]___[B]___[C]___
```

**Valores de `align-items` (visual, em `row`):**
```
stretch:    |AAAA|  (estica para preencher altura)
flex-start: |A   |  (alinha no topo)
flex-end:   |   A|  (alinha embaixo)
center:     | A  |  (alinha no centro)
baseline:   texto alinhado pela linha de base da fonte
```

**`align-content` vs `align-items`:**
- `align-items`: alinha itens **dentro de cada linha**.
- `align-content`: distribui **as linhas** no container (só funciona com `flex-wrap: wrap` e múltiplas linhas).

**`order` — reordenando itens:**
```css
.item-a { order: 2; }  /* aparece por último */
.item-b { order: 1; }  /* aparece no meio */
.item-c { order: 0; }  /* aparece primeiro (padrão) */
```

**`flex-shrink` — como funciona:**
- Quando a soma das `basis` > largura do container, os itens **encolhem**.
- `flex-shrink: 0` → item **não** encolhe (mantém `basis`).
- `flex-shrink: 2` → encolhe **2x mais** que um item com `shrink: 1`.

**Valores comuns de `flex` (atalhos):**
| Valor | Equivalente | Uso |
|-------|-------------|-----|
| `flex: 1` | `1 1 0%` | Cresce/encolhe igualmente, ignora conteúdo |
| `flex: auto` | `1 1 auto` | Cresce/encolhe, respeita conteúdo |
| `flex: none` | `0 0 auto` | Tamanho fixo, não flexível |
| `flex: 0 1 auto` | padrão | Não cresce, pode encolher |

**Truques úteis:**
```css
/* Centralização perfeita (1 linha) */
.center { display: flex; justify-content: center; align-items: center; }

/* Último item à direita (push) */
.spacer { margin-left: auto; }

/* Rodapé fixo no fim da página */
body { display: flex; flex-direction: column; min-height: 100vh; }
main { flex: 1; }

/* Igual altura para cards */
.cards { display: flex; align-items: stretch; }
```

**Debugging Flexbox:**
- Use DevTools → inspecione o container → veja o badge "flex".
- Clique no badge para visualizar eixos e espaçamento.

### CSS do 16.html — explicação detalhada (PT-BR) 🎯

- `* { margin: 0; padding: 0; box-sizing: border-box; }`  
  → remove margens/paddings padrão do navegador e evita “estouro” ao somar borda/padding no tamanho.
- `body { background-color: black; }`  
  → define fundo escuro para destacar as caixas e o texto.
- `.container { height: 100vh; width: 100vw; display: flex; ... }`  
  → ocupa toda a tela e coloca os filhos lado a lado (linha).
- `border: 1px solid red; color: white;`  
  → borda vermelha para visualizar o container e texto branco para contraste.
- `.container > div { flex: 1; ... }`  
  → cada coluna cresce igualmente (metade da largura).
- `border: 1px solid blue; margin: 5px; padding: 5px;`  
  → borda azul para visualizar cada coluna, margem externa e respiro interno.

### 16.html CSS — detailed explanation (EN) 🎯

- `* { margin: 0; padding: 0; box-sizing: border-box; }`  
  → removes default margins/paddings and prevents size overflow when adding borders/padding.
- `body { background-color: black; }`  
  → dark background to highlight boxes and text.
- `.container { height: 100vh; width: 100vw; display: flex; ... }`  
  → fills the viewport and lays children side by side (row).
- `border: 1px solid red; color: white;`  
  → red border to visualize the container, white text for contrast.
- `.container > div { flex: 1; ... }`  
  → each column grows equally (half the width).
- `border: 1px solid blue; margin: 5px; padding: 5px;`  
  → blue border for each column, outer spacing and inner padding.

### Herança no CSS (inheritance) 🧬

- ✅ **PT-BR**: algumas propriedades são herdadas dos pais para os filhos (ex.: `color`, `font-family`).  
  - Ex.: se `.container { color: white; }`, o texto dos filhos fica branco.
- ✅ **EN**: some properties are inherited from parent to child (e.g., `color`, `font-family`).  
  - Example: if `.container { color: white; }`, child text becomes white.

### Seletor de filho direto `>` (CSS) 👶

- ✅ **PT-BR**: seleciona **apenas** filhos imediatos (não netos).  
  - Ex.: `.container > div { ... }` aplica só às `<div>` dentro da `.container`.
- ✅ **EN**: selects **only** direct children (not grandchildren).  
  - Example: `.container > div { ... }` applies only to `<div>` directly inside `.container`.

**Exemplo rápido / Quick example:**
```css
/* ...existing code... */
.container > div { border: 1px solid blue; }
/* ...existing code... */
```

### Flex shorthand (`flex: grow shrink basis`) — exemplo claro 🧭

**PT-BR (contexto do 16.html):**
- **O que cresce/encolhe?** a **largura** do item (eixo principal em `row`).
- **Cresce quando?** quando sobra espaço no container.
- **Encolhe quando?** quando falta espaço no container.
- `flex: 1 1 300px;` → base 300px; cresce 1 parte e pode encolher.
- `flex: 2 1 200px;` → base 200px; cresce 2 partes e pode encolher.
- **Exemplo detalhado (container 1000px, 2 itens):**
  - **Somatório das bases**: 300 + 200 = 500px.
  - **Espaço livre**: 1000 - 500 = 500px.
  - **Partes de crescimento**: 1 + 2 = 3 partes.
  - **Distribuição do extra**:
    - Item 1 recebe **1/3** de 500 ≈ **166,7px**.
    - Item 2 recebe **2/3** de 500 ≈ **333,3px**.
  - **Tamanho final**:
    - Item 1: 300 + 166,7 ≈ **466,7px**.
    - Item 2: 200 + 333,3 ≈ **533,3px**.
- **Resumo curto**: o `grow` define **quanto** cada item leva do espaço livre; o `basis` define o **ponto de partida**.

**EN (16.html context):**
- **What grows/shrinks?** the item’s **width** (main axis in `row`).
- **Grows when?** when there is extra space in the container.
- **Shrinks when?** when there isn’t enough space in the container.
- `flex: 1 1 300px;` → 300px base; grows by 1 part and can shrink.
- `flex: 2 1 200px;` → 200px base; grows by 2 parts and can shrink.
- **Detailed example (1000px container, 2 items):**
  - **Base sum**: 300 + 200 = 500px.
  - **Free space**: 1000 - 500 = 500px.
  - **Growth parts**: 1 + 2 = 3 parts.
  - **Extra space split**:
    - Item 1 gets **1/3** of 500 ≈ **166.7px**.
    - Item 2 gets **2/3** of 500 ≈ **333.3px**.
  - **Final sizes**:
    - Item 1: 300 + 166.7 ≈ **466.7px**.
    - Item 2: 200 + 333.3 ≈ **533.3px**.
- **Short summary**: `grow` controls **how much** extra space each item receives; `basis` is the **starting point**.

### Exercícios — Cores no CSS 🧪

1) **Harmonia de cores no CSS**  
   - Use a **Roda de Cores da Adobe** para criar uma paleta.  
   - Escolha **1 cor principal** (background) e **2 secundárias** (títulos e parágrafos).  
   - Exemplo no `style.css`:
```css
/* ...existing code... */
body { background-color: #E6F0FF; }
h1, h2 { color: #2B303A; }
p { color: #0C7C59; }
/* ...existing code... */
```

2) **Corrigindo erro de legibilidade**  
   - Problema: `background-color: #000000;` e `color: black;`  
   - Solução: trocar `color` para uma cor clara.  
```css
/* ...existing code... */
body { background-color: #000000; color: #F6F6F6; }
/* ...existing code... */
```

3) **RGB no CSS (hex)**  
   - Escolha duas cores em **hex** (fundo e texto).  
   - Exemplo:
```css
/* ...existing code... */
body { background-color: #FF5733; color: #00FF00; }
/* ...existing code... */
```

### Seletores CSS — tag, classe e id 🧩

- ✅ **Seletor de tag**: aplica a todos os elementos daquela tag.  
  - Ex.: `p { color: #333; }`
- ✅ **Seletor de classe**: aplica a elementos com `class="..."`.  
  - Ex.: `.destaque { color: #22D4FD; }`
- ✅ **Seletor de id**: aplica ao elemento com `id="..."` (idealmente único na página).  
  - Ex.: `#cabecalho { background: #000; }`

### CSS selectors — tag, class, and id 🧩

- ✅ **Tag selector**: applies to all elements of that tag.  
  - Ex.: `p { color: #333; }`
- ✅ **Class selector**: applies to elements with `class="..."`.  
  - Ex.: `.highlight { color: #22D4FD; }`
- ✅ **ID selector**: applies to the element with `id="..."` (ideally unique on the page).  
  - Ex.: `#header { background: #000; }`

### Âncora (`<a>`) no HTML 🔗

- ✅ **O que é**: elemento usado para criar links.
- ✅ **Como funciona**: o atributo `href` define o destino (URL ou seção da página).
- ✅ **Exemplo**:
  - `<a href="https://example.com">Ir para o site</a>`
  - `<a href="#contato">Ir para contato</a>` (âncora interna)

### HTML anchor (`<a>`) 🔗

- ✅ **What it is**: element used to create links.
- ✅ **How it works**: the `href` attribute defines the destination (URL or page section).
- ✅ **Example**:
  - `<a href="https://example.com">Go to site</a>`
  - `<a href="#contact">Go to contact</a>` (internal anchor)

### Reset CSS 🧼

- ✅ **O que é**: conjunto de estilos básicos para padronizar a aparência inicial entre navegadores.
- ✅ **Por que usar**: reduz diferenças de margens, paddings e fontes padrão.
- ✅ **Exemplo simples**:
  - `* { margin: 0; padding: 0; box-sizing: border-box; }`

### Box Model (modelo de caixa) 📦

- ✅ **O que é**: todo elemento é uma caixa composta por **content**, **padding**, **border** e **margin**.
- ✅ **Como funciona**:
  - **content**: área do conteúdo.
  - **padding**: espaço interno entre conteúdo e borda.
  - **border**: a borda do elemento.
  - **margin**: espaço externo entre elementos.

### CSS Reset 🧼

- ✅ **What it is**: a basic style set to normalize default styles across browsers.
- ✅ **Why use it**: reduces differences in default margins, paddings, and fonts.
- ✅ **Simple example**:
  - `* { margin: 0; padding: 0; box-sizing: border-box; }`

### Box Model 📦

- ✅ **What it is**: every element is a box made of **content**, **padding**, **border**, and **margin**.
- ✅ **How it works**:
  - **content**: content area.
  - **padding**: inner space around content.
  - **border**: element border.
  - **margin**: outer space between elements.

### Medidas no CSS (unidades) 📏

- ✅ **Unidades absolutas**: não mudam com o layout ou fonte.  
  - Exemplos: `px`, `cm`, `mm`, `in`, `pt`.
- ✅ **Unidades relativas**: variam conforme contexto (tamanho da fonte, viewport, etc.).  
  - **`%`**: relativo ao elemento pai.  
  - **`em`**: relativo ao tamanho da fonte do elemento.  
  - **`rem`**: relativo ao tamanho da fonte do `html` (raiz).  
  - **`vw` / `vh`**: relativo à largura/altura da viewport.  
  - **`vmin` / `vmax`**: menor/maior dimensão da viewport.
- ✅ **Viewport (explicação simples)**:
  - **O que é**: a área visível da página no navegador (a “tela útil”).
  - **Exemplos**:
    - Se a janela tem **1200px de largura** e **800px de altura**:
      - `100vw` = 1200px (toda a largura visível)
      - `50vw` = 600px (metade da largura)
      - `100vh` = 800px (toda a altura visível)
      - `50vh` = 400px (metade da altura)
    - Se a tela é **360px x 640px** (celular):
      - `100vw` = 360px
      - `100vh` = 640px
      - `vmin` = 360px, `vmax` = 640px
- ✅ **Quando usar**:
  - **`px`**: ajustes precisos.
  - **`rem` / `em`**: tipografia responsiva.
  - **`%` / `vw` / `vh`**: layouts fluidos.
- ✅ **Exemplos fáceis**:
  - `p { font-size: 16px; }` → texto com 16 pixels.
  - `h1 { font-size: 2rem; }` → 2x o tamanho base da página.
  - `.box { width: 50%; }` → metade da largura do elemento pai.
  - `.card { padding: 1em; }` → espaçamento interno igual ao tamanho da fonte.
  - `.hero { height: 100vh; }` → ocupa 100% da altura da tela.
  - `.sidebar { width: 30vw; }` → 30% da largura da tela.

### CSS units (measurements) 📏

- ✅ **Absolute units**: fixed regardless of layout or font.  
  - Examples: `px`, `cm`, `mm`, `in`, `pt`.
- ✅ **Relative units**: depend on context (font size, viewport, etc.).  
  - **`%`**: relative to the parent.  
  - **`em`**: relative to the element’s font size.  
  - **`rem`**: relative to the root (`html`) font size.  
  - **`vw` / `vh`**: relative to viewport width/height.  
  - **`vmin` / `vmax`**: smallest/largest viewport dimension.
- ✅ **Viewport (simple explanation)**:
  - **What it is**: the visible area of the page in the browser (the “usable screen”).
  - **Examples**:
    - If the window is **1200px wide** and **800px tall**:
      - `100vw` = 1200px (full visible width)
      - `50vw` = 600px (half width)
      - `100vh` = 800px (full visible height)
      - `50vh` = 400px (half height)
    - If the screen is **360px x 640px** (mobile):
      - `100vw` = 360px
      - `100vh` = 640px
      - `vmin` = 360px, `vmax` = 640px
- ✅ **Quando usar**:
  - **`px`**: ajustes precisos.
  - **`rem` / `em`**: tipografia responsiva.
  - **`%` / `vw` / `vh`**: layouts fluidos.
- ✅ **Exemplos fáceis**:
  - `p { font-size: 16px; }` → texto com 16 pixels.
  - `h1 { font-size: 2rem; }` → 2x o tamanho base da página.
  - `.box { width: 50%; }` → metade da largura do elemento pai.
  - `.card { padding: 1em; }` → espaçamento interno igual ao tamanho da fonte.
  - `.hero { height: 100vh; }` → ocupa 100% da altura da tela.
  - `.sidebar { width: 30vw; }` → 30% da largura da tela.

### box-sizing no CSS 🧰

- ✅ **O que é**: define como o navegador calcula o tamanho total do elemento.
- ✅ **`content-box` (padrão)**: largura/altura **não** incluem `padding` e `border`.
- ✅ **`border-box`**: largura/altura **incluem** `padding` e `border`.
- ✅ **Exemplo**:
  - `.card { width: 200px; padding: 20px; box-sizing: border-box; }`  
    → a caixa continua com 200px de largura total.
- ✅ **Exemplos práticos (bem simples)**:
  - **Sem `border-box`**:  
    `div { width: 200px; padding: 20px; border: 5px solid; }`  
    → largura total vira **250px** (200 + 20 + 20 + 5 + 5).
  - **Com `border-box`**:  
    `div { width: 200px; padding: 20px; border: 5px solid; box-sizing: border-box; }`  
    → largura total **permanece 200px**.
  - **Aplicar no projeto todo**:  
    `* { box-sizing: border-box; }`  
    → facilita calcular tamanhos de caixas.
- ✅ **Boas práticas (mercado)**:
  - **Defina globalmente**: use `* { box-sizing: border-box; }` para previsibilidade.
  - **Seja consistente**: evite misturar `content-box` e `border-box` sem motivo claro.
  - **Componentes reutilizáveis**: documente o padrão de `box-sizing` no design system.
  - **Layouts responsivos**: prefira `border-box` para evitar “estouro” de largura/altura.

### CSS `box-sizing` 🧰

- ✅ **What it is**: defines how the browser calculates an element’s total size.
- ✅ **`content-box` (default)**: width/height **exclude** `padding` and `border`.
- ✅ **`border-box`**: width/height **include** `padding` and `border`.
- ✅ **Example**:
  - `.card { width: 200px; padding: 20px; box-sizing: border-box; }`  
    → total width stays 200px.
- ✅ **Practical examples (simple)**:
  - **Without `border-box`**:  
    `div { width: 200px; padding: 20px; border: 5px solid; }`  
    → total width becomes **250px** (200 + 20 + 20 + 5 + 5).
  - **With `border-box`**:  
    `div { width: 200px; padding: 20px; border: 5px solid; box-sizing: border-box; }`  
    → total width **stays 200px**.
  - **Apply to the whole project**:  
    `* { box-sizing: border-box; }`  
    → easier to size elements.
- ✅ **Best practices (industry)**:
  - **Set globally**: use `* { box-sizing: border-box; }` for predictable sizing.
  - **Be consistent**: avoid mixing `content-box` and `border-box` without a clear reason.
  - **Reusable components**: document the `box-sizing` standard in your design system.
  - **Responsive layouts**: prefer `border-box` to prevent overflow issues.

### Flexbox (CSS) — simples e profundo 🧭

- ✅ **O que é**: um modelo de layout em **1 dimensão** (linha ou coluna) para alinhar e distribuir itens.
- ✅ **Ideia central**: um **container flex** controla o posicionamento dos **itens flex**.
- ✅ **Eixos**:
  - **Main axis** (eixo principal): direção definida por `flex-direction`.
  - **Cross axis** (eixo cruzado): perpendicular ao eixo principal.
- ✅ **Como os eixos mudam (detalhado)**:
  - **`flex-direction: row` (padrão)**:
    - **Eixo principal**: horizontal (esquerda → direita).
    - **Eixo cruzado**: vertical (topo → baixo).
  - **`flex-direction: row-reverse`**:
    - **Eixo principal**: horizontal (direita → esquerda).
  - **`flex-direction: column`**:
    - **Eixo principal**: vertical (topo → baixo).
    - **Eixo cruzado**: horizontal (esquerda → direita).
  - **`flex-direction: column-reverse`**:
    - **Eixo principal**: vertical (baixo → topo).
- ✅ **Quando usar**: menus, cards alinhados, centralização, componentes em linha/coluna.

**Propriedades do container (todas):**
| Propriedade | Valores | Descrição |
|-------------|---------|-----------|
| `display` | `flex`, `inline-flex` | Ativa flexbox |
| `flex-direction` | `row`, `row-reverse`, `column`, `column-reverse` | Direção do eixo principal |
| `flex-wrap` | `nowrap`, `wrap`, `wrap-reverse` | Quebra de linha |
| `flex-flow` | `<direction> <wrap>` | Atalho para direction + wrap |
| `justify-content` | `flex-start`, `flex-end`, `center`, `space-between`, `space-around`, `space-evenly` | Alinha no eixo principal |
| `align-items` | `stretch`, `flex-start`, `flex-end`, `center`, `baseline` | Alinha no eixo cruzado |
| `align-content` | `stretch`, `flex-start`, `flex-end`, `center`, `space-between`, `space-around` | Alinha **múltiplas linhas** (só com `flex-wrap: wrap` e múltiplas linhas) |
| `gap` | `<row-gap> <column-gap>` | Espaçamento entre itens |

**Propriedades dos itens (todas):**
| Propriedade | Valores | Descrição |
|-------------|---------|-----------|
| `order` | número (padrão: 0) | Ordem de exibição (menor = primeiro) |
| `flex-grow` | número (padrão: 0) | Quanto cresce quando sobra espaço |
| `flex-shrink` | número (padrão: 1) | Quanto encolhe quando falta espaço |
| `flex-basis` | tamanho ou `auto` | Tamanho base antes de crescer/encolher |
| `flex` | `<grow> <shrink> <basis>` | Atalho (ex.: `flex: 1 1 auto`) |
| `align-self` | `auto`, `flex-start`, `flex-end`, `center`, `baseline`, `stretch` | Sobrescreve `align-items` para um item |

**Valores de `justify-content` (visual):**
```
flex-start:    [A][B][C]____________
flex-end:      ____________[A][B][C]
center:        ______[A][B][C]______
space-between: [A]______[B]______[C]
space-around:  __[A]____[B]____[C]__
space-evenly:  ___[A]___[B]___[C]___
```

**Valores de `align-items` (visual, em `row`):**
```
stretch:    |AAAA|  (estica para preencher altura)
flex-start: |A   |  (alinha no topo)
flex-end:   |   A|  (alinha embaixo)
center:     | A  |  (alinha no centro)
baseline:   texto alinhado pela linha de base da fonte
```

**`align-content` vs `align-items`:**
- `align-items`: alinha itens **dentro de cada linha**.
- `align-content`: distribui **as linhas** no container (só funciona com `flex-wrap: wrap` e múltiplas linhas).

**`order` — reordenando itens:**
```css
.item-a { order: 2; }  /* aparece por último */
.item-b { order: 1; }  /* aparece no meio */
.item-c { order: 0; }  /* aparece primeiro (padrão) */
```

**`flex-shrink` — como funciona:**
- Quando a soma das `basis` > largura do container, os itens **encolhem**.
- `flex-shrink: 0` → item **não** encolhe (mantém `basis`).
- `flex-shrink: 2` → encolhe **2x mais** que um item com `shrink: 1`.

**Valores comuns de `flex` (atalhos):**
| Valor | Equivalente | Uso |
|-------|-------------|-----|
| `flex: 1` | `1 1 0%` | Cresce/encolhe igualmente, ignora conteúdo |
| `flex: auto` | `1 1 auto` | Cresce/encolhe, respeita conteúdo |
| `flex: none` | `0 0 auto` | Tamanho fixo, não flexível |
| `flex: 0 1 auto` | padrão | Não cresce, pode encolher |

**Truques úteis:**
```css
/* Centralização perfeita (1 linha) */
.center { display: flex; justify-content: center; align-items: center; }

/* Último item à direita (push) */
.spacer { margin-left: auto; }

/* Rodapé fixo no fim da página */
body { display: flex; flex-direction: column; min-height: 100vh; }
main { flex: 1; }

/* Igual altura para cards */
.cards { display: flex; align-items: stretch; }
```

**Debugging Flexbox:**
- Use DevTools → inspecione o container → veja o badge "flex".
- Clique no badge para visualizar eixos e espaçamento.

### CSS do 16.html — explicação detalhada (PT-BR) 🎯

- `* { margin: 0; padding: 0; box-sizing: border-box; }`  
  → remove margens/paddings padrão do navegador e evita “estouro” ao somar borda/padding no tamanho.
- `body { background-color: black; }`  
  → define fundo escuro para destacar as caixas e o texto.
- `.container { height: 100vh; width: 100vw; display: flex; ... }`  
  → ocupa toda a tela e coloca os filhos lado a lado (linha).
- `border: 1px solid red; color: white;`  
  → borda vermelha para visualizar o container e texto branco para contraste.
- `.container > div { flex: 1; ... }`  
  → cada coluna cresce igualmente (metade da largura).
- `border: 1px solid blue; margin: 5px; padding: 5px;`  
  → borda azul para visualizar cada coluna, margem externa e respiro interno.

### 16.html CSS — detailed explanation (EN) 🎯

- `* { margin: 0; padding: 0; box-sizing: border-box; }`  
  → removes default margins/paddings and prevents size overflow when adding borders/padding.
- `body { background-color: black; }`  
  → dark background to highlight boxes and text.
- `.container { height: 100vh; width: 100vw; display: flex; ... }`  
  → fills the viewport and lays children side by side (row).
- `border: 1px solid red; color: white;`  
  → red border to visualize the container, white text for contrast.
- `.container > div { flex: 1; ... }`  
  → each column grows equally (half the width).
- `border: 1px solid blue; margin: 5px; padding: 5px;`  
  → blue border for each column, outer spacing and inner padding.

### Herança no CSS (inheritance) 🧬

- ✅ **PT-BR**: algumas propriedades são herdadas dos pais para os filhos (ex.: `color`, `font-family`).  
  - Ex.: se `.container { color: white; }`, o texto dos filhos fica branco.
- ✅ **EN**: some properties are inherited from parent to child (e.g., `color`, `font-family`).  
  - Example: if `.container { color: white; }`, child text becomes white.

### Seletor de filho direto `>` (CSS) 👶

- ✅ **PT-BR**: seleciona **apenas** filhos imediatos (não netos).  
  - Ex.: `.container > div { ... }` aplica só às `<div>` dentro da `.container`.
- ✅ **EN**: selects **only** direct children (not grandchildren).  
  - Example: `.container > div { ... }` applies only to `<div>` directly inside `.container`.

**Exemplo rápido / Quick example:**
```css
/* ...existing code... */
.container > div { border: 1px solid blue; }
/* ...existing code... */
```

### Flex shorthand (`flex: grow shrink basis`) — exemplo claro 🧭

**PT-BR (contexto do 16.html):**
- **O que cresce/encolhe?** a **largura** do item (eixo principal em `row`).
- **Cresce quando?** quando sobra espaço no container.
- **Encolhe quando?** quando falta espaço no container.
- `flex: 1 1 300px;` → base 300px; cresce 1 parte e pode encolher.
- `flex: 2 1 200px;` → base 200px; cresce 2 partes e pode encolher.
- **Exemplo detalhado (container 1000px, 2 itens):**
  - **Somatório das bases**: 300 + 200 = 500px.
  - **Espaço livre**: 1000 - 500 = 500px.
  - **Partes de crescimento**: 1 + 2 = 3 partes.
  - **Distribuição do extra**:
    - Item 1 recebe **1/3** de 500 ≈ **166,7px**.
    - Item 2 recebe **2/3** de 500 ≈ **333,3px**.
  - **Tamanho final**:
    - Item 1: 300 + 166,7 ≈ **466,7px**.
    - Item 2: 200 + 333,3 ≈ **533,3px**.
- **Resumo curto**: o `grow` define **quanto** cada item leva do espaço livre; o `basis` define o **ponto de partida**.

**EN (16.html context):**
- **What grows/shrinks?** the item’s **width** (main axis in `row`).
- **Grows when?** when there is extra space in the container.
- **Shrinks when?** when there isn’t enough space in the container.
- `flex: 1 1 300px;` → 300px base; grows by 1 part and can shrink.
- `flex: 2 1 200px;` → 200px base; grows by 2 parts and can shrink.
- **Detailed example (1000px container, 2 items):**
  - **Base sum**: 300 + 200 = 500px.
  - **Free space**: 1000 - 500 = 500px.
  - **Growth parts**: 1 + 2 = 3 parts.
  - **Extra space split**:
    - Item 1 gets **1/3** of 500 ≈ **166.7px**.
    - Item 2 gets **2/3** of 500 ≈ **333.3px**.
  - **Final sizes**:
    - Item 1: 300 + 166.7 ≈ **466.7px**.
    - Item 2: 200 + 333.3 ≈ **533.3px**.
- **Short summary**: `grow` controls **how much** extra space each item receives; `basis` is the **starting point**.

### Exercícios — Cores no CSS 🧪

1) **Harmonia de cores no CSS**  
   - Use a **Roda de Cores da Adobe** para criar uma paleta.  
   - Escolha **1 cor principal** (background) e **2 secundárias** (títulos e parágrafos).  
   - Exemplo no `style.css`:
```css
/* ...existing code... */
body { background-color: #E6F0FF; }
h1, h2 { color: #2B303A; }
p { color: #0C7C59; }
/* ...existing code... */
```

2) **Corrigindo erro de legibilidade**  
   - Problema: `background-color: #000000;` e `color: black;`  
   - Solução: trocar `color` para uma cor clara.  
```css
/* ...existing code... */
body { background-color: #000000; color: #F6F6F6; }
/* ...existing code... */
```

3) **RGB no CSS (hex)**  
   - Escolha duas cores em **hex** (fundo e texto).  
   - Exemplo:
```css
/* ...existing code... */
body { background-color: #FF5733; color: #00FF00; }
/* ...existing code... */
```

### Seletores CSS — tag, classe e id 🧩

- ✅ **Seletor de tag**: aplica a todos os elementos daquela tag.  
  - Ex.: `p { color: #333; }`
- ✅ **Seletor de classe**: aplica a elementos com `class="..."`.  
  - Ex.: `.destaque { color: #22D4FD; }`
- ✅ **Seletor de id**: aplica ao elemento com `id="..."` (idealmente único na página).  
  - Ex.: `#cabecalho { background: #000; }`

### CSS selectors — tag, class, and id 🧩

- ✅ **Tag selector**: applies to all elements of that tag.  
  - Ex.: `p { color: #333; }`
- ✅ **Class selector**: applies to elements with `class="..."`.  
  - Ex.: `.highlight { color: #22D4FD; }`
- ✅ **ID selector**: applies to the element with `id="..."` (ideally unique on the page).  
  - Ex.: `#header { background: #000; }`

### Âncora (`<a>`) no HTML 🔗

- ✅ **O que é**: elemento usado para criar links.
- ✅ **Como funciona**: o atributo `href` define o destino (URL ou seção da página).
- ✅ **Exemplo**:
  - `<a href="https://example.com">Ir para o site</a>`
  - `<a href="#contato">Ir para contato</a>` (âncora interna)

### HTML anchor (`<a>`) 🔗

- ✅ **What it is**: element used to create links.
- ✅ **How it works**: the `href` attribute defines the destination (URL or page section).
- ✅ **Example**:
  - `<a href="https://example.com">Go to site</a>`
  - `<a href="#contact">Go to contact</a>` (internal anchor)

### Reset CSS 🧼

- ✅ **O que é**: conjunto de estilos básicos para padronizar a aparência inicial entre navegadores.
- ✅ **Por que usar**: reduz diferenças de margens, paddings e fontes padrão.
- ✅ **Exemplo simples**:
  - `* { margin: 0; padding: 0; box-sizing: border-box; }`

### Box Model (modelo de caixa) 📦

- ✅ **O que é**: todo elemento é uma caixa composta por **content**, **padding**, **border** e **margin**.
- ✅ **Como funciona**:
  - **content**: área do conteúdo.
  - **padding**: espaço interno entre conteúdo e borda.
  - **border**: a borda do elemento.
  - **margin**: espaço externo entre elementos.

### CSS Reset 🧼

- ✅ **What it is**: a basic style set to normalize default styles across browsers.
- ✅ **Why use it**: reduces differences in default margins, paddings, and fonts.
- ✅ **Simple example**:
  - `* { margin: 0; padding: 0; box-sizing: border-box; }`

### Box Model 📦

- ✅ **What it is**: every element is a box made of **content**, **padding**, **border**, and **margin**.
- ✅ **How it works**:
  - **content**: content area.
  - **padding**: inner space around content.
  - **border**: element border.
  - **margin**: outer space between elements.

### Medidas no CSS (unidades) 📏

- ✅ **Unidades absolutas**: não mudam com o layout ou fonte.  
  - Exemplos: `px`, `cm`, `mm`, `in`, `pt`.
- ✅ **Unidades relativas**: variam conforme contexto (tamanho da fonte, viewport, etc.).  
  - **`%`**: relativo ao elemento pai.  
  - **`em`**: relativo ao tamanho da fonte do elemento.  
  - **`rem`**: relativo ao tamanho da fonte do `html` (raiz).  
  - **`vw` / `vh`**: relativo à largura/altura da viewport.  
  - **`vmin` / `vmax`**: menor/maior dimensão da viewport.
- ✅ **Viewport (explicação simples)**:
  - **O que é**: a área visível da página no navegador (a “tela útil”).
  - **Exemplos**:
    - Se a janela tem **1200px de largura** e **800px de altura**:
      - `100vw` = 1200px (toda a largura visível)
      - `50vw` = 600px (metade da largura)
      - `100vh` = 800px (toda a altura visível)
      - `50vh` = 400px (metade da altura)
    - Se a tela é **360px x 640px** (celular):
      - `100vw` = 360px
      - `100vh` = 640px
      - `vmin` = 360px, `vmax` = 640px
- ✅ **Quando usar**:
  - **`px`**: ajustes precisos.
  - **`rem` / `em`**: tipografia responsiva.
  - **`%` / `vw` / `vh`**: layouts fluidos.
- ✅ **Exemplos fáceis**:
  - `p { font-size: 16px; }` → texto com 16 pixels.
  - `h1 { font-size: 2rem; }` → 2x o tamanho base da página.
  - `.box { width: 50%; }` → metade da largura do elemento pai.
  - `.card { padding: 1em; }` → espaçamento interno igual ao tamanho da fonte.
  - `.hero { height: 100vh; }` → ocupa 100% da altura da tela.
  - `.sidebar { width: 30vw; }` → 30% da largura da tela.

### CSS units (measurements) 📏

- ✅ **Absolute units**: fixed regardless of layout or font.  
  - Examples: `px`, `cm`, `mm`, `in`, `pt`.
- ✅ **Relative units**: depend on context (font size, viewport, etc.).  
  - **`%`**: relative to the parent.  
  - **`em`**: relative to the element’s font size.  
  - **`rem`**: relative to the root (`html`) font size.  
  - **`vw` / `vh`**: relative to viewport width/height.  
  - **`vmin` / `vmax`**: smallest/largest viewport dimension.
- ✅ **Viewport (simple explanation)**:
  - **What it is**: the visible area of the page in the browser (the “usable screen”).
  - **Examples**:
    - If the window is **1200px wide** and **800px tall**:
      - `100vw` = 1200px (full visible width)
      - `50vw` = 600px (half width)
      - `100vh` = 800px (full visible height)
      - `50vh` = 400px (half height)
    - If the screen is **360px x 640px** (mobile):
      - `100vw` = 360px
      - `100vh` = 640px
      - `vmin` = 360px, `vmax` = 640px
- ✅ **Quando usar**:
  - **`px`**: ajustes precisos.
  - **`rem` / `em`**: tipografia responsiva.
  - **`%` / `vw` / `vh`**: layouts fluidos.
- ✅ **Exemplos fáceis**:
  - `p { font-size: 16px; }` → texto com 16 pixels.
  - `h1 { font-size: 2rem; }` → 2x o tamanho base da página.
  - `.box { width: 50%; }` → metade da largura do elemento pai.
  - `.card { padding: 1em; }` → espaçamento interno igual ao tamanho da fonte.
  - `.hero { height: 100vh; }` → ocupa 100% da altura da tela.
  - `.sidebar { width: 30vw; }` → 30% da largura da tela.

### box-sizing no CSS 🧰

- ✅ **O que é**: define como o navegador calcula o tamanho total do elemento.
- ✅ **`content-box` (padrão)**: largura/altura **não** incluem `padding` e `border`.
- ✅ **`border-box`**: largura/altura **incluem** `padding` e `border`.
- ✅ **Exemplo**:
  - `.card { width: 200px; padding: 20px; box-sizing: border-box; }`  
    → a caixa continua com 200px de largura total.
- ✅ **Exemplos práticos (bem simples)**:
  - **Sem `border-box`**:  
    `div { width: 200px; padding: 20px; border: 5px solid; }`  
    → largura total vira **250px** (200 + 20 + 20 + 5 + 5).
  - **Com `border-box`**:  
    `div { width: 200px; padding: 20px; border: 5px solid; box-sizing: border-box; }`  
    → largura total **permanece 200px**.
  - **Aplicar no projeto todo**:  
    `* { box-sizing: border-box; }`  
    → facilita calcular tamanhos de caixas.
- ✅ **Boas práticas (mercado)**:
  - **Defina globalmente**: use `* { box-sizing: border-box; }` para previsibilidade.
  - **Seja consistente**: evite misturar `content-box` e `border-box` sem motivo claro.
  - **Componentes reutilizáveis**: documente o padrão de `box-sizing` no design system.
  - **Layouts responsivos**: prefira `border-box` para evitar “estouro” de largura/altura.

### CSS `box-sizing` 🧰

- ✅ **What it is**: defines how the browser calculates an element’s total size.
- ✅ **`content-box` (default)**: width/height **exclude** `padding` and `border`.
- ✅ **`border-box`**: width/height **include** `padding` and `border`.
- ✅ **Example**:
  - `.card { width: 200px; padding: 20px; box-sizing: border-box; }`  
    → total width stays 200px.
- ✅ **Practical examples (simple)**:
  - **Without `border-box`**:  
    `div { width: 200px; padding: 20px; border: 5px solid; }`  
    → total width becomes **250px** (200 + 20 + 20 + 5 + 5).
  - **With `border-box`**:  
    `div { width: 200px; padding: 20px; border: 5px solid; box-sizing: border-box; }`  
    → total width **stays 200px**.
  - **Apply to the whole project**:  
    `* { box-sizing: border-box; }`  
    → easier to size elements.
- ✅ **Best practices (industry)**:
  - **Set globally**: use `* { box-sizing: border-box; }` for predictable sizing.
  - **Be consistent**: avoid mixing `content-box` and `border-box` without a clear reason.
  - **Reusable components**: document the `box-sizing` standard in your design system.
  - **Responsive layouts**: prefer `border-box` to prevent overflow issues.

### Flexbox (CSS) — simples e profundo 🧭

- ✅ **O que é**: um modelo de layout em **1 dimensão** (linha ou coluna) para alinhar e distribuir itens.
- ✅ **Ideia central**: um **container flex** controla o posicionamento dos **itens flex**.
- ✅ **Eixos**:
  - **Main axis** (eixo principal): direção definida por `flex-direction`.
  - **Cross axis** (eixo cruzado): perpendicular ao eixo principal.
- ✅ **Como os eixos mudam (detalhado)**:
  - **`flex-direction: row` (padrão)**:
    - **Eixo principal**: horizontal (esquerda → direita).
    - **Eixo cruzado**: vertical (topo → baixo).
  - **`flex-direction: row-reverse`**:
    - **Eixo principal**: horizontal (direita → esquerda).
  - **`flex-direction: column`**:
    - **Eixo principal**: vertical (topo → baixo).
    - **Eixo cruzado**: horizontal (esquerda → direita).
  - **`flex-direction: column-reverse`**:
    - **Eixo principal**: vertical (baixo → topo).
- ✅ **Quando usar**: menus, cards alinhados, centralização, componentes em linha/coluna.

**Propriedades do container (todas):**
| Propriedade | Valores | Descrição |
|-------------|---------|-----------|
| `display` | `flex`, `inline-flex` | Ativa flexbox |
| `flex-direction` | `row`, `row-reverse`, `column`, `column-reverse` | Direção do eixo principal |
| `flex-wrap` | `nowrap`, `wrap`, `wrap-reverse` | Quebra de linha |
| `flex-flow` | `<direction> <wrap>` | Atalho para direction + wrap |
| `justify-content` | `flex-start`, `flex-end`, `center`, `space-between`, `space-around`, `space-evenly` | Alinha no eixo principal |
| `align-items` | `stretch`, `flex-start`, `flex-end`, `center`, `baseline` | Alinha no eixo cruzado |
| `align-content` | `stretch`, `flex-start`, `flex-end`, `center`, `space-between`, `space-around` | Alinha **múltiplas linhas** (só com `flex-wrap: wrap` e múltiplas linhas) |
| `gap` | `<row-gap> <column-gap>` | Espaçamento entre itens |

**Propriedades dos itens (todas):**
| Propriedade | Valores | Descrição |
|-------------|---------|-----------|
| `order` | número (padrão: 0) | Ordem de exibição (menor = primeiro) |
| `flex-grow` | número (padrão: 0) | Quanto cresce quando sobra espaço |
| `flex-shrink` | número (padrão: 1) | Quanto encolhe quando falta espaço |
| `flex-basis` | tamanho ou `auto` | Tamanho base antes de crescer/encolher |
| `flex` | `<grow> <shrink> <basis>` | Atalho (ex.: `flex: 1 1 auto`) |
| `align-self` | `auto`, `flex-start`, `flex-end`, `center`, `baseline`, `stretch` | Sobrescreve `align-items` para um item |

**Valores de `justify-content` (visual):**
```
flex-start:    [A][B][C]____________
flex-end:      ____________[A][B][C]
center:        ______[A][B][C]______
space-between: [A]______[B]______[C]
space-around:  __[A]____[B]____[C]__
space-evenly:  ___[A]___[B]___[C]___
```

**Valores de `align-items` (visual, em `row`):**
```
stretch:    |AAAA|  (estica para preencher altura)
flex-start: |A   |  (alinha no topo)
flex-end:   |   A|  (alinha embaixo)
center:     | A  |  (alinha no centro)
baseline:   texto alinhado pela linha de base da fonte
```

**`align-content` vs `align-items`:**
- `align-items`: alinha itens **dentro de cada linha**.
- `align-content`: distribui **as linhas** no container (só funciona com `flex-wrap: wrap` e múltiplas linhas).

**`order` — reordenando itens:**
```css
.item-a { order: 2; }  /* aparece por último */
.item-b { order: 1; }  /* aparece no meio */
.item-c { order: 0; }  /* aparece primeiro (padrão) */
```

**`flex-shrink` — como funciona:**
- Quando a soma das `basis` > largura do container, os itens **encolhem**.
- `flex-shrink: 0` → item **não** encolhe (mantém `basis`).
- `flex-shrink: 2` → encolhe **2x mais** que um item com `shrink: 1`.

**Valores comuns de `flex` (atalhos):**
| Valor | Equivalente | Uso |
|-------|-------------|-----|
| `flex: 1` | `1 1 0%` | Cresce/encolhe igualmente, ignora conteúdo |
| `flex: auto` | `1 1 auto` | Cresce/encolhe, respeita conteúdo |
| `flex: none` | `0 0 auto` | Tamanho fixo, não flexível |
| `flex: 0 1 auto` | padrão | Não cresce, pode encolher |

**Truques úteis:**
```css
/* Centralização perfeita (1 linha) */
.center { display: flex; justify-content: center; align-items: center; }

/* Último item à direita (push) */
.spacer { margin-left: auto; }

/* Rodapé fixo no fim da página */
body { display: flex; flex-direction: column; min-height: 100vh; }
main { flex: 1; }

/* Igual altura para cards */
.cards { display: flex; align-items: stretch; }
```

**Debugging Flexbox:**
- Use DevTools → inspecione o container → veja o badge "flex".
- Clique no badge para visualizar eixos e espaçamento.

### CSS do 16.html — explicação detalhada (PT-BR) 🎯

- `* { margin: 0; padding: 0; box-sizing: border-box; }`  
  → remove margens/paddings padrão do navegador e evita “estouro” ao somar borda/padding no tamanho.
- `body { background-color: black; }`  
  → define fundo escuro para destacar as caixas e o texto.
- `.container { height: 100vh; width: 100vw; display: flex; ... }`  
  → ocupa toda a tela e coloca os filhos lado a lado (linha).
- `border: 1px solid red; color: white;`  
  → borda vermelha para visualizar o container e texto branco para contraste.
- `.container > div { flex: 1; ... }`  
  → cada coluna cresce igualmente (metade da largura).
- `border: 1px solid blue; margin: 5px; padding: 5px;`  
  → borda azul para visualizar cada coluna, margem externa e respiro interno.

### 16.html CSS — detailed explanation (EN) 🎯

- `* { margin: 0; padding: 0; box-sizing: border-box; }`  
  → removes default margins/paddings and prevents size overflow when adding borders/padding.
- `body { background-color: black; }`  
  → dark background to highlight boxes and text.
- `.container { height: 100vh; width: 100vw; display: flex; ... }`  
  → fills the viewport and lays children side by side (row).
- `border: 1px solid red; color: white;`  
  → red border to visualize the container, white text for contrast.
- `.container > div { flex: 1; ... }`  
  → each column grows equally (half the width).
- `border: 1px solid blue; margin: 5px; padding: 5px;`  
  → blue border for each column, outer spacing and inner padding.

### Herança no CSS (inheritance) 🧬

- ✅ **PT-BR**: algumas propriedades são herdadas dos pais para os filhos (ex.: `color`, `font-family`).  
  - Ex.: se `.container { color: white; }`, o texto dos filhos fica branco.
- ✅ **EN**: some properties are inherited from parent to child (e.g., `color`, `font-family`).  
  - Example: if `.container { color: white; }`, child text becomes white.

### Seletor de filho direto `>` (CSS) 👶

- ✅ **PT-BR**: seleciona **apenas** filhos imediatos (não netos).  
  - Ex.: `.container > div { ... }` aplica só às `<div>` dentro da `.container`.
- ✅ **EN**: selects **only** direct children (not grandchildren).  
  - Example: `.container > div { ... }` applies only to `<div>` directly inside `.container`.

**Exemplo rápido / Quick example:**
```css
/* ...existing code... */
.container > div { border: 1px solid blue; }
/* ...existing code... */
```

### Flex shorthand (`flex: grow shrink basis`) — exemplo claro 🧭

**PT-BR (contexto do 16.html):**
- **O que cresce/encolhe?** a **largura** do item (eixo principal em `row`).
- **Cresce quando?** quando sobra espaço no container.
- **Encolhe quando?** quando falta espaço no container.
- `flex: 1 1 300px;` → base 300px; cresce 1 parte e pode encolher.
- `flex: 2 1 200px;` → base 200px; cresce 2 partes e pode encolher.
- **Exemplo detalhado (container 1000px, 2 itens):**
  - **Somatório das bases**: 300 + 200 = 500px.
  - **Espaço livre**: 1000 - 500 = 500px.
  - **Partes de crescimento**: 1 + 2 = 3 partes.
  - **Distribuição do extra**:
    - Item 1 recebe **1/3** de 500 ≈ **166,7px**.
    - Item 2 recebe **2/3** de 500 ≈ **333,3px**.
  - **Tamanho final**:
    - Item 1: 300 + 166,7 ≈ **466,7px**.
    - Item 2: 200 + 333,3 ≈ **533,3px**.
- **Resumo curto**: o `grow` define **quanto** cada item leva do espaço livre; o `basis` define o **ponto de partida**.

**EN (16.html context):**
- **What grows/shrinks?** the item’s **width** (main axis in `row`).
- **Grows when?** when there is extra space in the container.
- **Shrinks when?** when there isn’t enough space in the container.
- `flex: 1 1 300px;` → 300px base; grows by 1 part and can shrink.
- `flex: 2 1 200px;` → 200px base; grows by 2 parts and can shrink.
- **Detailed example (1000px container, 2 items):**
  - **Base sum**: 300 + 200 = 500px.
  - **Free space**: 1000 - 500 = 500px.
  - **Growth parts**: 1 + 2 = 3 parts.
  - **Extra space split**:
    - Item 1 gets **1/3** of 500 ≈ **166.7px**.
    - Item 2 gets **2/3** of 500 ≈ **333.3px**.
  - **Final sizes**:
    - Item 1: 300 + 166.7 ≈ **466.7px**.
    - Item 2: 200 + 333.3 ≈ **533.3px**.
- **Short summary**: `grow` controls **how much** extra space each item receives; `basis` is the **starting point**.

### Exercícios — Cores no CSS 🧪

1) **Harmonia de cores no CSS**  
   - Use a **Roda de Cores da Adobe** para criar uma paleta.  
   - Escolha **1 cor principal** (background) e **2 secundárias** (títulos e parágrafos).  
   - Exemplo no `style.css`:
```css
/* ...existing code... */
body { background-color: #E6F0FF; }
h1, h2 { color: #2B303A; }
p { color: #0C7C59; }
/* ...existing code... */
```

2) **Corrigindo erro de legibilidade**  
   - Problema: `background-color: #000000;` e `color: black;`  
   - Solução: trocar `color` para uma cor clara.  
```css
/* ...existing code... */
body { background-color: #000000; color: #F6F6F6; }
/* ...existing code... */
```

3) **RGB no CSS (hex)**  
   - Escolha duas cores em **hex** (fundo e texto).  
   - Exemplo:
```css
/* ...existing code... */
body { background-color: #FF5733; color: #00FF00; }
/* ...existing code... */
```

### Seletores CSS — tag, classe e id 🧩

- ✅ **Seletor de tag**: aplica a todos os elementos daquela tag.  
  - Ex.: `p { color: #333; }`
- ✅ **Seletor de classe**: aplica a elementos com `class="..."`.  
  - Ex.: `.destaque { color: #22D4FD; }`
- ✅ **Seletor de id**: aplica ao elemento com `id="..."` (idealmente único na página).  
  - Ex.: `#cabecalho { background: #000; }`

### CSS selectors — tag, class, and id 🧩

- ✅ **Tag selector**: applies to all elements of that tag.  
  - Ex.: `p { color: #333; }`
- ✅ **Class selector**: applies to elements with `class="..."`.  
  - Ex.: `.highlight { color: #22D4FD; }`
- ✅ **ID selector**: applies to the element with `id="..."` (ideally unique on the page).  
  - Ex.: `#header { background: #000; }`

### Âncora (`<a>`) no HTML 🔗

- ✅ **O que é**: elemento usado para criar links.
- ✅ **Como funciona**: o atributo `href` define o destino (URL ou seção da página).
- ✅ **Exemplo**:
  - `<a href="https://example.com">Ir para o site</a>`
  - `<a href="#contato">Ir para contato</a>` (âncora interna)

### HTML anchor (`<a>`) 🔗

- ✅ **What it is**: element used to create links.
- ✅ **How it works**: the `href` attribute defines the destination (URL or page section).
- ✅ **Example**:
  - `<a href="https://example.com">Go to site</a>`
  - `<a href="#contact">Go to contact</a>` (internal anchor)

### Reset CSS 🧼

- ✅ **O que é**: conjunto de estilos básicos para padronizar a aparência inicial entre navegadores.
- ✅ **Por que usar**: reduz diferenças de margens, paddings e fontes padrão.
- ✅ **Exemplo simples**:
  - `* { margin: 0; padding: 0; box-sizing: border-box; }`

### Box Model (modelo de caixa) 📦

- ✅ **O que é**: todo elemento é uma caixa composta por **content**, **padding**, **border** e **margin**.
- ✅ **Como funciona**:
  - **content**: área do conteúdo.
  - **padding**: espaço interno entre conteúdo e borda.
  - **border**: a borda do elemento.
  - **margin**: espaço externo entre elementos.

### CSS Reset 🧼

- ✅ **What it is**: a basic style set to normalize default styles across browsers.
- ✅ **Why use it**: reduces differences in default margins, paddings, and fonts.
- ✅ **Simple example**:
  - `* { margin: 0; padding: 0; box-sizing: border-box; }`

### Box Model 📦

- ✅ **What it is**: every element is a box made of **content**, **padding**, **border**, and **margin**.
- ✅ **How it works**:
  - **content**: content area.
  - **padding**: inner space around content.
  - **border**: element border.
  - **margin**: outer space between elements.

### Medidas no CSS (unidades) 📏

- ✅ **Unidades absolutas**: não mudam com o layout ou fonte.  
  - Exemplos: `px`, `cm`, `mm`, `in`, `pt`.
- ✅ **Unidades relativas**: variam conforme contexto (tamanho da fonte, viewport, etc.).  
  - **`%`**: relativo ao elemento pai.  
  - **`em`**: relativo ao tamanho da fonte do elemento.  
  - **`rem`**: relativo ao tamanho da fonte do `html` (raiz).  
  - **`vw` / `vh`**: relativo à largura/altura da viewport.  
  - **`vmin` / `vmax`**: menor/maior dimensão da viewport.
- ✅ **Viewport (explicação simples)**:
  - **O que é**: a área visível da página no navegador (a “tela útil”).
  - **Exemplos**:
    - Se a janela tem **1200px de largura** e **800px de altura**:
      - `100vw` = 1200px (toda a largura visível)
      - `50vw` = 600px (metade da largura)
      - `100vh` = 800px (toda a altura visível)
      - `50vh` = 400px (metade da altura)
    - Se a tela é **360px x 640px** (celular):
      - `100vw` = 360px
      - `100vh` = 640px
      - `vmin` = 360px, `vmax` = 640px
- ✅ **Quando usar**:
  - **`px`**: ajustes precisos.
  - **`rem` / `em`**: tipografia responsiva.
  - **`%` / `vw` / `vh`**: layouts fluidos.
- ✅ **Exemplos fáceis**:
  - `p { font-size: 16px; }` → texto com 16 pixels.
  - `h1 { font-size: 2rem; }` → 2x o tamanho base da página.
  - `.box { width: 50%; }` → metade da largura do elemento pai.
  - `.card { padding: 1em; }` → espaçamento interno igual ao tamanho da fonte.
  - `.hero { height: 100vh; }` → ocupa 100% da altura da tela.
  - `.sidebar { width: 30vw; }` → 30% da largura da tela.

### CSS units (measurements) 📏

- ✅ **Absolute units**: fixed regardless of layout or font.  
  - Examples: `px`, `cm`, `mm`, `in`, `pt`.
- ✅ **Relative units**: depend on context (font size, viewport, etc.).  
  - **`%`**: relative to the parent.  
  - **`em`**: relative to the element’s font size.  
  - **`rem`**: relative to the root (`html`) font size.  
  - **`vw` / `vh`**: relative to viewport width/height.  
  - **`vmin` / `vmax`**: smallest/largest viewport dimension.
- ✅ **Viewport (simple explanation)**:
  - **What it is**: the visible area of the page in the browser (the “usable screen”).
  - **Examples**:
    - If the window is **1200px wide** and **800px tall**:
      - `100vw` = 1200px (full visible width)
      - `50vw` = 600px (half width)
      - `100vh` = 800px (full visible height)
      - `50vh` = 400px (half height)
    - If the screen is **360px x 640px** (mobile):
      - `100vw` = 360px
      - `100vh` = 640px
      - `vmin` = 360px, `vmax` = 640px
- ✅ **Quando usar**:
  - **`px`**: ajustes precisos.
  - **`rem` / `em`**: tipografia responsiva.
  - **`%` / `vw` / `vh`**: layouts fluidos.
- ✅ **Exemplos fáceis**:
  - `p { font-size: 16px; }` → texto com 16 pixels.
  - `h1 { font-size: 2rem; }` → 2x o tamanho base da página.
  - `.box { width: 50%; }` → metade da largura do elemento pai.
  - `.card { padding: 1em; }` → espaçamento interno igual ao tamanho da fonte.
  - `.hero { height: 100vh; }` → ocupa 100% da altura da tela.
  - `.sidebar { width: 30vw; }` → 30% da largura da tela.

### box-sizing no CSS 🧰

- ✅ **O que é**: define como o navegador calcula o tamanho total do elemento.
- ✅ **`content-box` (padrão)**: largura/altura **não** incluem `padding` e `border`.
- ✅ **`border-box`**: largura/altura **incluem** `padding` e `border`.
- ✅ **Exemplo**:
  - `.card { width: 200px; padding: 20px; box-sizing: border-box; }`  
    → a caixa continua com 200px de largura total.
- ✅ **Exemplos práticos (bem simples)**:
  - **Sem `border-box`**:  
    `div { width: 200px; padding: 20px; border: 5px solid; }`  
    → largura total vira **250px** (200 + 20 + 20 + 5 + 5).
  - **Com `border-box`**:  
    `div { width: 200px; padding: 20px; border: 5px solid; box-sizing: border-box; }`  
    → largura total **permanece 200px**.
  - **Aplicar no projeto todo**:  
    `* { box-sizing: border-box; }`  
    → facilita calcular tamanhos de caixas.
- ✅ **Boas práticas (mercado)**:
  - **Defina globalmente**: use `* { box-sizing: border-box; }` para previsibilidade.
  - **Seja consistente**: evite misturar `content-box` e `border-box` sem motivo claro.
  - **Componentes reutilizáveis**: documente o padrão de `box-sizing` no design system.
  - **Layouts responsivos**: prefira `border-box` para evitar “estouro” de largura/altura.

### CSS `box-sizing` 🧰

- ✅ **What it is**: defines how the browser calculates an element’s total size.
- ✅ **`content-box` (default)**: width/height **exclude** `padding` and `border`.
- ✅ **`border-box`**: width/height **include** `padding` and `border`.
- ✅ **Example**:
  - `.card { width: 200px; padding: 20px; box-sizing: border-box; }`  
    → total width stays 200px.
- ✅ **Practical examples (simple)**:
  - **Without `border-box`**:  
    `div { width: 200px; padding: 20px; border: 5px solid; }`  
    → total width becomes **250px** (200 + 20 + 20 + 5 + 5).
  - **With `border-box`**:  
    `div { width: 200px; padding: 20px; border: 5px solid; box-sizing: border-box; }`  
    → total width **stays 200px**.
  - **Apply to the whole project**:  
    `* { box-sizing: border-box; }`  
    → easier to size elements.
- ✅ **Best practices (industry)**:
  - **Set globally**: use `* { box-sizing: border-box; }` for predictable sizing.
  - **Be consistent**: avoid mixing `content-box` and `border-box` without a clear reason.
  - **Reusable components**: document the `box-sizing` standard in your design system.
  - **Responsive layouts**: prefer `border-box` to prevent overflow issues.

### Flexbox (CSS) — simples e profundo 🧭

- ✅ **O que é**: um modelo de layout em **1 dimensão** (linha ou coluna) para alinhar e distribuir itens.
- ✅ **Ideia central**: um **container flex** controla o posicionamento dos **itens flex**.
- ✅ **Eixos**:
  - **Main axis** (eixo principal): direção definida por `flex-direction`.
  - **Cross axis** (eixo cruzado): perpendicular ao eixo principal.
- ✅ **Como os eixos mudam (detalhado)**:
  - **`flex-direction: row` (padrão)**:
    - **Eixo principal**: horizontal (esquerda → direita).
    - **Eixo cruzado**: vertical (topo → baixo).
  - **`flex-direction: row-reverse`**:
    - **Eixo principal**: horizontal (direita → esquerda).
  - **`flex-direction: column`**:
    - **Eixo principal**: vertical (topo → baixo).
    - **Eixo cruzado**: horizontal (esquerda → direita).
  - **`flex-direction: column-reverse`**:
    - **Eixo principal**: vertical (baixo → topo).
- ✅ **Quando usar**: menus, cards alinhados, centralização, componentes em linha/coluna.

**Propriedades do container (todas):**
| Propriedade | Valores | Descrição |
|-------------|---------|-----------|
| `display` | `flex`, `inline-flex` | Ativa flexbox |
| `flex-direction` | `row`, `row-reverse`, `column`, `column-reverse` | Direção do eixo principal |
| `flex-wrap` | `nowrap`, `wrap`, `wrap-reverse` | Quebra de linha |
| `flex-flow` | `<direction> <wrap>` | Atalho para direction + wrap |
| `justify-content` | `flex-start`, `flex-end`, `center`, `space-between`, `space-around`, `space-evenly` | Alinha no eixo principal |
| `align-items` | `stretch`, `flex-start`, `flex-end`, `center`, `baseline` | Alinha no eixo cruzado |
| `align-content` | `stretch`, `flex-start`, `flex-end`, `center`, `space-between`, `space-around` | Alinha **múltiplas linhas** (só com `flex-wrap: wrap` e múltiplas linhas) |
| `gap` | `<row-gap> <column-gap>` | Espaçamento entre itens |

**Propriedades dos itens (todas):**
| Propriedade | Valores | Descrição |
|-------------|---------|-----------|
| `order` | número (padrão: 0) | Ordem de exibição (menor = primeiro) |
| `flex-grow` | número (padrão: 0) | Quanto cresce quando sobra espaço |
| `flex-shrink` | número (padrão: 1) | Quanto encolhe quando falta espaço |
| `flex-basis` | tamanho ou `auto` | Tamanho base antes de crescer/encolher |
| `flex` | `<grow> <shrink> <basis>` | Atalho (ex.: `flex: 1 1 auto`) |
| `align-self` | `auto`, `flex-start`, `flex-end`, `center`, `baseline`, `stretch` | Sobrescreve `align-items` para um item |

**Valores de `justify-content` (visual):**
```
flex-start:    [A][B][C]____________
flex-end:      ____________[A][B][C]
center:        ______[A][B][C]______
space-between: [A]______[B]______[C]
space-around:  __[A]____[B]____[C]__
space-evenly:  ___[A]___[B]___[C]___
```

**Valores de `align-items` (visual, em `row`):**
```
stretch:    |AAAA|  (estica para preencher altura)
flex-start: |A   |  (alinha no topo)
flex-end:   |   A|  (alinha embaixo)
center:     | A  |  (alinha no centro)
baseline:   texto alinhado pela linha de base da fonte
```

**`align-content` vs `align-items`:**
- `align-items`: alinha itens **dentro de cada linha**.
- `align-content`: distribui **as linhas** no container (só funciona com `flex-wrap: wrap` e múltiplas linhas).

**`order` — reordenando itens:**
```css
.item-a { order: 2; }  /* aparece por último */
.item-b { order: 1; }  /* aparece no meio */
.item-c { order: 0; }  /* aparece primeiro (padrão) */
```

**`flex-shrink` — como funciona:**
- Quando a soma das `basis` > largura do container, os itens **encolhem**.
- `flex-shrink: 0` → item **não** encolhe (mantém `basis`).
- `flex-shrink: 2` → encolhe **2x mais** que um item com `shrink: 1`.

**Valores comuns de `flex` (atalhos):**
| Valor | Equivalente | Uso |
|-------|-------------|-----|
| `flex: 1` | `1 1 0%` | Cresce/encolhe igualmente, ignora conteúdo |
| `flex: auto` | `1 1 auto` | Cresce/encolhe, respeita conteúdo |
| `flex: none` | `0 0 auto` | Tamanho fixo, não flexível |
| `flex: 0 1 auto` | padrão | Não cresce, pode encolher |

**Truques úteis:**
```css
/* Centralização perfeita (1 linha) */
.center { display: flex; justify-content: center; align-items: center; }

/* Último item à direita (push) */
.spacer { margin-left: auto; }

/* Rodapé fixo no fim da página */
body { display: flex; flex-direction: column; min-height: 100vh; }
main { flex: 1; }

/* Igual altura para cards */
.cards { display: flex; align-items: stretch; }
```

**Debugging Flexbox:**
- Use DevTools → inspecione o container → veja o badge "flex".
- Clique no badge para visualizar eixos e espaçamento.

### CSS do 16.html — explicação detalhada (PT-BR) 🎯

- `* { margin: 0; padding: 0; box-sizing: border-box; }`  
  → remove margens/paddings padrão do navegador e evita “estouro” ao somar borda/padding no tamanho.
- `body { background-color: black; }`  
  → define fundo escuro para destacar as caixas e o texto.
- `.container { height: 100vh; width: 100vw; display: flex; ... }`  
  → ocupa toda a tela e coloca os filhos lado a lado (linha).
- `border: 1px solid red; color: white;`  
  → borda vermelha para visualizar o container e texto branco para contraste.
- `.container > div { flex: 1; ... }`  
  → cada coluna cresce igualmente (metade da largura).
- `border: 1px solid blue; margin: 5px; padding: 5px;`  
  → borda azul para visualizar cada coluna, margem externa e respiro interno.

### 16.html CSS — detailed explanation (EN) 🎯

- `* { margin: 0; padding: 0; box-sizing: border-box; }`  
  → removes default margins/paddings and prevents size overflow when adding borders/padding.
- `body { background-color: black; }`  
  → dark background to highlight boxes and text.
- `.container { height: 100vh; width: 100vw; display: flex; ... }`  
  → fills the viewport and lays children side by side (row).
- `border: 1px solid red; color: white;`  
  → red border to visualize the container, white text for contrast.
- `.container > div { flex: 1; ... }`  
  → each column grows equally (half the width).
- `border: 1px solid blue; margin: 5px; padding: 5px;`  
  → blue border for each column, outer spacing and inner padding.

### Herança no CSS (inheritance) 🧬

- ✅ **PT-BR**: algumas propriedades são herdadas dos pais para os filhos (ex.: `color`, `font-family`).  
  - Ex.: se `.container { color: white; }`, o texto dos filhos fica branco.
- ✅ **EN**: some properties are inherited from parent to child (e.g., `color`, `font-family`).  
  - Example: if `.container { color: white; }`, child text becomes white.

### Seletor de filho direto `>` (CSS) 👶

- ✅ **PT-BR**: seleciona **apenas** filhos imediatos (não netos).  
  - Ex.: `.container > div { ... }` aplica só às `<div>` dentro da `.container`.
- ✅ **EN**: selects **only** direct children (not grandchildren).  
  - Example: `.container > div { ... }` applies only to `<div>` directly inside `.container`.

**Exemplo rápido / Quick example:**
```css
/* ...existing code... */
.container > div { border: 1px solid blue; }
/* ...existing code... */
```

### Flex shorthand (`flex: grow shrink basis`) — exemplo claro 🧭

**PT-BR (contexto do 16.html):**
- **O que cresce/encolhe?** a **largura** do item (eixo principal em `row`).
- **Cresce quando?** quando sobra espaço no container.
- **Encolhe quando?** quando falta espaço no container.
- `flex: 1 1 300px;` → base 300px; cresce 1 parte e pode encolher.
- `flex: 2 1 200px;` → base 200px; cresce 2 partes e pode encolher.
- **Exemplo detalhado (container 1000px, 2 itens):**
  - **Somatório das bases**: 300 + 200 = 500px.
  - **Espaço livre**: 1000 - 500 = 500px.
  - **Partes de crescimento**: 1 + 2 = 3 partes.
  - **Distribuição do extra**:
    - Item 1 recebe **1/3** de 500 ≈ **166,7px**.
    - Item 2 recebe **2/3** de 500 ≈ **333,3px**.
  - **Tamanho final**:
    - Item 1: 300 + 166,7 ≈ **466,7px**.
    - Item 2: 200 + 333,3 ≈ **533,3px**.
- **Resumo curto**: o `grow` define **quanto** cada item leva do espaço livre; o `basis` define o **ponto de partida**.

**EN (16.html context):**
- **What grows/shrinks?** the item’s **width** (main axis in `row`).
- **Grows when?** when there is extra space in the container.
- **Shrinks when?** when there isn’t enough space in the container.
- `flex: 1 1 300px;` → 300px base; grows by 1 part and can shrink.
- `flex: 2 1 200px;` → 200px base; grows by 2 parts and can shrink.
- **Detailed example (1000px container, 2 items):**
  - **Base sum**: 300 + 200 = 500px.
  - **Free space**: 1000 - 500 = 500px.
  - **Growth parts**: 1 + 2 = 3 parts.
  - **Extra space split**:
    - Item 1 gets **1/3** of 500 ≈ **166.7px**.
    - Item 2 gets **2/3** of 500 ≈ **333.3px**.
  - **Final sizes**:
    - Item 1: 300 + 166.7 ≈ **466.7px**.
    - Item 2: 200 + 333.3 ≈ **533.3px**.
- **Short summary**: `grow` controls **how much** extra space each item receives; `basis` is the **starting point**.

### Exercícios — Cores no CSS 🧪

1) **Harmonia de cores no CSS**  
   - Use a **Roda de Cores da Adobe** para criar uma paleta.  
   - Escolha **1 cor principal** (background) e **2 secundárias** (títulos e parágrafos).  
   - Exemplo no `style.css`:
```css
/* ...existing code... */
body { background-color: #E6F0FF; }
h1, h2 { color: #2B303A; }
p { color: #0C7C59; }
/* ...existing code... */
```

2) **Corrigindo erro de legibilidade**  
   - Problema: `background-color: #000000;` e `color: black;`  
   - Solução: trocar `color` para uma cor clara.  
```css
/* ...existing code... */
body { background-color: #000000; color: #F6F6F6; }
/* ...existing code... */
```

3) **RGB no CSS (hex)**  
   - Escolha duas cores em **hex** (fundo e texto).  
   - Exemplo:
```css
/* ...existing code... */
body { background-color: #FF5733; color: #00FF00; }
/* ...existing code... */
```

### Seletores CSS — tag, classe e id 🧩

- ✅ **Seletor de tag**: aplica a todos os elementos daquela tag.  
  - Ex.: `p { color: #333; }`
- ✅ **Seletor de classe**: aplica a elementos com `class="..."`.  
  - Ex.: `.destaque { color: #22D4FD; }`
- ✅ **Seletor de id**: aplica ao elemento com `id="..."` (idealmente único na página).  
  - Ex.: `#cabecalho { background: #000; }`

### CSS selectors — tag, class, and id 🧩

- ✅ **Tag selector**: applies to all elements of that tag.  
  - Ex.: `p { color: #333; }`
- ✅ **Class selector**: applies to elements with `class="..."`.  
  - Ex.: `.highlight { color: #22D4FD; }`
- ✅ **ID selector**: applies to the element with `id="..."` (ideally unique on the page).  
  - Ex.: `#header { background: #000; }`

### Âncora (`<a>`) no HTML 🔗

- ✅ **O que é**: elemento usado para criar links.
- ✅ **Como funciona**: o atributo `href` define o destino (URL ou seção da página).
- ✅ **Exemplo**:
  - `<a href="https://example.com">Ir para o site</a>`
  - `<a href="#contato">Ir para contato</a>` (âncora interna)

### HTML anchor (`<a>`) 🔗

- ✅ **What it is**: element used to create links.
- ✅ **How it works**: the `href` attribute defines the destination (URL or page section).
- ✅ **Example**:
  - `<a href="https://example.com">Go to site</a>`
  - `<a href="#contact">Go to contact</a>` (internal anchor)

### Reset CSS 🧼

- ✅ **O que é**: conjunto de estilos básicos para padronizar a aparência inicial entre navegadores.
- ✅ **Por que usar**: reduz diferenças de margens, paddings e fontes padrão.
- ✅ **Exemplo simples**:
  - `* { margin: 0; padding: 0; box-sizing: border-box; }`

### Box Model (modelo de caixa) 📦

- ✅ **O que é**: todo elemento é uma caixa composta por **content**, **padding**, **border** e **margin**.
- ✅ **Como funciona**:
  - **content**: área do conteúdo.
  - **padding**: espaço interno entre conteúdo e borda.
  - **border**: a borda do elemento.
  - **margin**: espaço externo entre elementos.

### CSS Reset 🧼

- ✅ **What it is**: a basic style set to normalize default styles across browsers.
- ✅ **Why use it**: reduces differences in default margins, paddings, and fonts.
- ✅ **Simple example**:
  - `* { margin: 0; padding: 0; box-sizing: border-box; }`

### Box Model 📦

- ✅ **What it is**: every element is a box made of **content**, **padding**, **border**, and **margin**.
- ✅ **How it works**:
  - **content**: content area.
  - **padding**: inner space around content.
  - **border**: element border.
  - **margin**: outer space between elements.

### Medidas no CSS (unidades) 📏

- ✅ **Unidades absolutas**: não mudam com o layout ou fonte.  
  - Exemplos: `px`, `cm`, `mm`, `in`, `pt`.
- ✅ **Unidades relativas**: variam conforme contexto (tamanho da fonte, viewport, etc.).  
  - **`%`**: relativo ao elemento pai.  
  - **`em`**: relativo ao tamanho da fonte do elemento.  
  - **`rem`**: relativo ao tamanho da fonte do `html` (raiz).  
  - **`vw` / `vh`**: relativo à largura/altura da viewport.  
  - **`vmin` / `vmax`**: menor/maior dimensão da viewport.
- ✅ **Viewport (explicação simples)**:
  - **O que é**: a área visível da página no navegador (a “tela útil”).
  - **Exemplos**:
    - Se a janela tem **1200px de largura** e **800px de altura**:
      - `100vw` = 1200px (toda a largura visível)
      - `50vw` = 600px (metade da largura)
      - `100vh` = 800px (toda a altura visível)
      - `50vh` = 400px (metade da altura)
    - Se a tela é **360px x 640px** (celular):
      - `100vw` = 360px
      - `100vh` = 640px
      - `vmin` = 360px, `vmax` = 640px
- ✅ **Quando usar**:
  - **`px`**: ajustes precisos.
  - **`rem` / `em`**: tipografia responsiva.
  - **`%` / `vw` / `vh`**: layouts fluidos.
- ✅ **Exemplos fáceis**:
  - `p { font-size: 16px; }` → texto com 16 pixels.
  - `h1 { font-size: 2rem; }` → 2x o tamanho base da página.
  - `.box { width: 50%; }` → metade da largura do elemento pai.
  - `.card { padding: 1em; }` → espaçamento interno igual ao tamanho da fonte.
  - `.hero { height: 100vh; }` → ocupa 100% da altura da tela.
  - `.sidebar { width: 30vw; }` → 30% da largura da tela.

### CSS units (measurements) 📏

- ✅ **Absolute units**: fixed regardless of layout or font.  
  - Examples: `px`, `cm`, `mm`, `in`, `pt`.
- ✅ **Relative units**: depend on context (font size, viewport, etc.).  
  - **`%`**: relative to the parent.  
  - **`em`**: relative to the element’s font size.  
  - **`rem`**: relative to the root (`html`) font size.  
  - **`vw` / `vh`**: relative to viewport width/height.  
  - **`vmin` / `vmax`**: smallest/largest viewport dimension.
- ✅ **Viewport (simple explanation)**:
  - **What it is**: the visible area of the page in the browser (the “usable screen”).
  - **Examples**:
    - If the window is **1200px wide** and **800px tall**:
      - `100vw` = 1200px (full visible width)
      - `50vw` = 600px (half width)
      - `100vh` = 800px (full visible height)
      - `50vh` = 400px (half height)
    - If the screen is **360px x 640px** (mobile):
      - `100vw` = 360px
      - `100vh` = 640px
      - `vmin` = 360px, `vmax` = 640px
- ✅ **Quando usar**:
  - **`px`**: ajustes precisos.
  - **`rem` / `em`**: tipografia responsiva.
  - **`%` / `vw` / `vh`**: layouts fluidos.
- ✅ **Exemplos fáceis**:
  - `p { font-size: 16px; }` → texto com 16 pixels.
  - `h1 { font-size: 2rem; }` → 2x o tamanho base da página.
  - `.box { width: 50%; }` → metade da largura do elemento pai.
  - `.card { padding: 1em; }` → espaçamento interno igual ao tamanho da fonte.
  - `.hero { height: 100vh; }` → ocupa 100% da altura da tela.
  - `.sidebar { width: 30vw; }` → 30% da largura da tela.

### box-sizing no CSS 🧰

- ✅ **O que é**: define como o navegador calcula o tamanho total do elemento.
- ✅ **`content-box` (padrão)**: largura/altura **não** incluem `padding` e `border`.
- ✅ **`border-box`**: largura/altura **incluem** `padding` e `border`.
- ✅ **Exemplo**:
  - `.card { width: 200px; padding: 20px; box-sizing: border-box; }`  
    → a caixa continua com 200px de largura total.
- ✅ **Exemplos práticos (bem simples)**:
  - **Sem `border-box`**:  
    `div { width: 200px; padding: 20px; border: 5px solid; }`  
    → largura total vira **250px** (200 + 20 + 20 + 5 + 5).
  - **Com `border-box`**:  
    `div { width: 200px; padding: 20px; border: 5px solid; box-sizing: border-box; }`  
    → largura total **permanece 200px**.
  - **Aplicar no projeto todo**:  
    `* { box-sizing: border-box; }`  
    → facilita calcular tamanhos de caixas.
- ✅ **Boas práticas (mercado)**:
  - **Defina globalmente**: use `* { box-sizing: border-box; }` para previsibilidade.
  - **Seja consistente**: evite misturar `content-box` e `border-box` sem motivo claro.
  - **Componentes reutilizáveis**: documente o padrão de `box-sizing` no design system.
  - **Layouts responsivos**: prefira `border-box` para evitar “estouro” de largura/altura.

### CSS `box-sizing` 🧰

- ✅ **What it is**: defines how the browser calculates an element’s total size.
- ✅ **`content-box` (default)**: width/height **exclude** `padding` and `border`.
- ✅ **`border-box`**: width/height **include** `padding` and `border`.
- ✅ **Example**:
  - `.card { width: 200px; padding: 20px; box-sizing: border-box; }`  
    → total width stays 200px.
- ✅ **Practical examples (simple)**:
  - **Without `border-box`**:  
    `div { width: 200px; padding: 20px; border: 5px solid; }`  
    → total width becomes **250px** (200 + 20 + 20 + 5 + 5).
  - **With `border-box`**:  
    `div { width: 200px; padding: 20px; border: 5px solid; box-sizing: border-box; }`  
    → total width **stays 200px**.
  - **Apply to the whole project**:  
    `* { box-sizing: border-box; }`  
    → easier to size elements.
- ✅ **Best practices (industry)**:
  - **Set globally**: use `* { box-sizing: border-box; }` for predictable sizing.
  - **Be consistent**: avoid mixing `content-box` and `border-box` without a clear reason.
  - **Reusable components**: document the `box-sizing` standard in your design system.
  - **Responsive layouts**: prefer `border-box` to prevent overflow issues.

### Flexbox (CSS) — simples e profundo 🧭

- ✅ **O que é**: um modelo de layout em **1 dimensão** (linha ou coluna) para alinhar e distribuir itens.
- ✅ **Ideia central**: um **container flex** controla o posicionamento dos **itens flex**.
- ✅ **Eixos**:
  - **Main axis** (eixo principal): direção definida por `flex-direction`.
  - **Cross axis** (eixo cruzado): perpendicular ao eixo principal.
- ✅ **Como os eixos mudam (detalhado)**:
  - **`flex-direction: row` (padrão)**:
    - **Eixo principal**: horizontal (esquerda → direita).
    - **Eixo cruzado**: vertical (topo → baixo).
  - **`flex-direction: row-reverse`**:
    - **Eixo principal**: horizontal (direita → esquerda).
  - **`flex-direction: column`**:
    - **Eixo principal**: vertical (topo → baixo).
    - **Eixo cruzado**: horizontal (esquerda → direita).
  - **`flex-direction: column-reverse`**:
    - **Eixo principal**: vertical (baixo → topo).
- ✅ **Quando usar**: menus, cards alinhados, centralização, componentes em linha/coluna.

**Propriedades do container (todas):**
| Propriedade | Valores | Descrição |
|-------------|---------|-----------|
| `display` | `flex`, `inline-flex` | Ativa flexbox |
| `flex-direction` | `row`, `row-reverse`, `column`, `column-reverse` | Direção do eixo principal |
| `flex-wrap` | `nowrap`, `wrap`, `wrap-reverse` | Quebra de linha |
| `flex-flow` | `<direction> <wrap>` | Atalho para direction + wrap |
| `justify-content` | `flex-start`, `flex-end`, `center`, `space-between`, `space-around`, `space-evenly` | Alinha no eixo principal |
| `align-items` | `stretch`, `flex-start`, `flex-end`, `center`, `baseline` | Alinha no eixo cruzado |
| `align-content` | `stretch`, `flex-start`, `flex-end`, `center`, `space-between`, `space-around` | Alinha **múltiplas linhas** (só com `flex-wrap: wrap` e múltiplas linhas) |
| `gap` | `<row-gap> <column-gap>` | Espaçamento entre itens |

**Propriedades dos itens (todas):**
| Propriedade | Valores | Descrição |
|-------------|---------|-----------|
| `order` | número (padrão: 0) | Ordem de exibição (menor = primeiro) |
| `flex-grow` | número (padrão: 0) | Quanto cresce quando sobra espaço |
| `flex-shrink` | número (padrão: 1) | Quanto encolhe quando falta espaço |
| `flex-basis` | tamanho ou `auto` | Tamanho base antes de crescer/encolher |
| `flex` | `<grow> <shrink> <basis>` | Atalho (ex.: `flex: 1 1 auto`) |
| `align-self` | `auto`, `flex-start`, `flex-end`, `center`, `baseline`, `stretch` | Sobrescreve `align-items` para um item |

**Valores de `justify-content` (visual):**
```
flex-start:    [A][B][C]____________
flex-end:      ____________[A][B][C]
center:        ______[A][B][C]______
space-between: [A]______[B]______[C]
space-around:  __[A]____[B]____[C]__
space-evenly:  ___[A]___[B]___[C]___
```

**Valores de `align-items` (visual, em `row`):**
```
stretch:    |AAAA|  (estica para preencher altura)
flex-start: |A   |  (alinha no topo)
flex-end:   |   A|  (alinha embaixo)
center:     | A  |  (alinha no centro)
baseline:   texto alinhado pela linha de base da fonte
```

**`align-content` vs `align-items`:**
- `align-items`: alinha itens **dentro de cada linha**.
- `align-content`: distribui **as linhas** no container (só funciona com `flex-wrap: wrap` e múltiplas linhas).

**`order` — reordenando itens:**
```css
.item-a { order: 2; }  /* aparece por último */
.item-b { order: 1; }  /* aparece no meio */
.item-c { order: 0; }  /* aparece primeiro (padrão) */
```

**`flex-shrink` — como funciona:**
- Quando a soma das `basis` > largura do container, os itens **encolhem**.
- `flex-shrink: 0` → item **não** encolhe (mantém `basis`).
- `flex-shrink: 2` → encolhe **2x mais** que um item com `shrink: 1`.

**Valores comuns de `flex` (atalhos):**
| Valor | Equivalente | Uso |
|-------|-------------|-----|
| `flex: 1` | `1 1 0%` | Cresce/encolhe igualmente, ignora conteúdo |
| `flex: auto` | `1 1 auto` | Cresce/encolhe, respeita conteúdo |
| `flex: none` | `0 0 auto` | Tamanho fixo, não flexível |
| `flex: 0 1 auto` | padrão | Não cresce, pode encolher |

**Truques úteis:**
```css
/* Centralização perfeita (1 linha) */
.center { display: flex; justify-content: center; align-items: center; }

/* Último item à direita (push) */
.spacer { margin-left: auto; }

/* Rodapé fixo no fim da página */
body { display: flex; flex-direction: column; min-height: 100vh; }
main { flex: 1; }

/* Igual altura para cards */
.cards { display: flex; align-items: stretch; }
```

**Debugging Flexbox:**
- Use DevTools → inspecione o container → veja o badge "flex".
- Clique no badge para visualizar eixos e espaçamento.

### CSS do 16.html — explicação detalhada (PT-BR) 🎯

- `* { margin: 0; padding: 0; box-sizing: border-box; }`  
  → remove margens/paddings padrão do navegador e evita “estouro” ao somar borda/padding no tamanho.
- `body { background-color: black; }`  
  → define fundo escuro para destacar as caixas e o texto.
- `.container { height: 100vh; width: 100vw; display: flex; ... }`  
  → ocupa toda a tela e coloca os filhos lado a lado (linha).
- `border: 1px solid red; color: white;`  
  → borda vermelha para visualizar o container e texto branco para contraste.
- `.container > div { flex: 1; ... }`  
  → cada coluna cresce igualmente (metade da largura).
- `border: 1px solid blue; margin: 5px; padding: 5px;`  
  → borda azul para visualizar cada coluna, margem externa e respiro interno.

### 16.html CSS — detailed explanation (EN) 🎯

- `* { margin: 0; padding: 0; box-sizing: border-box; }`  
  → removes default margins/paddings and prevents size overflow when adding borders/padding.
- `body { background-color: black; }`  
  → dark background to highlight boxes and text.
- `.container { height: 100vh; width: 100vw; display: flex; ... }`  
  → fills the viewport and lays children side by side (row).
- `border: 1px solid red; color: white;`  
  → red border to visualize the container, white text for contrast.
- `.container > div { flex: 1; ... }`  
  → each column grows equally (half the width).
- `border: 1px solid blue; margin: 5px; padding: 5px;`  
  → blue border for each column, outer spacing and inner padding.

### Herança no CSS (inheritance) 🧬

- ✅ **PT-BR**: algumas propriedades são herdadas dos pais para os filhos (ex.: `color`, `font-family`).  
  - Ex.: se `.container { color: white; }`, o texto dos filhos fica branco.
- ✅ **EN**: some properties are inherited from parent to child (e.g., `color`, `font-family`).  
  - Example: if `.container { color: white; }`, child text becomes white.

### Seletor de filho direto `>` (CSS) 👶

- ✅ **PT-BR**: seleciona **apenas** filhos imediatos (não netos).  
  - Ex.: `.container > div { ... }` aplica só às `<div>` dentro da `.container`.
- ✅ **EN**: selects **only** direct children (not grandchildren).  
  - Example: `.container > div { ... }` applies only to `<div>` directly inside `.container`.

**Exemplo rápido / Quick example:**
```css
/* ...existing code... */
.container > div { border: 1px solid blue; }
/* ...existing code... */
```

### Flex shorthand (`flex: grow shrink basis`) — exemplo claro 🧭

**PT-BR (contexto do 16.html):**
- **O que cresce/encolhe?** a **largura** do item (eixo principal em `row`).
- **Cresce quando?** quando sobra espaço no container.
- **Encolhe quando?** quando falta espaço no container.
- `flex: 1 1 300px;` → base 300px; cresce 1 parte e pode encolher.
- `flex: 2 1 200px;` → base 200px; cresce 2 partes e pode encolher.
- **Exemplo detalhado (container 1000px, 2 itens):**
  - **Somatório das bases**: 300 + 200 = 500px.
  - **Espaço livre**: 1000 - 500 = 500px.
  - **Partes de crescimento**: 1 + 2 = 3 partes.
  - **Distribuição do extra**:
    - Item 1 recebe **1/3** de 500 ≈ **166,7px**.
    - Item 2 recebe **2/3** de 500 ≈ **333,3px**.
  - **Tamanho final**:
    - Item 1: 300 + 166,7 ≈ **466,7px**.
    - Item 2: 200 + 333,3 ≈ **533,3px**.
- **Resumo curto**: o `grow` define **quanto** cada item leva do espaço livre; o `basis` define o **ponto de partida**.

**EN (16.html context):**
- **What grows/shrinks?** the item’s **width** (main axis in `row`).
- **Grows when?** when there is extra space in the container.
- **Shrinks when?** when there isn’t enough space in the container.
- `flex: 1 1 300px;` → 300px base; grows by 1 part and can shrink.
- `flex: 2 1 200px;` → 200px base; grows by 2 parts and can shrink.
- **Detailed example (1000px container, 2 items):**
  - **Base sum**: 300 + 200 = 500px.
  - **Free space**: 1000 - 500 = 500px.
  - **Growth parts**: 1 + 2 = 3 parts.
  - **Extra space split**:
    - Item 1 gets **1/3** of 500 ≈ **166.7px**.
    - Item 2 gets **2/3** of 500 ≈ **333.3px**.
  - **Final sizes**:
    - Item 1: 300 + 166.7 ≈ **466.7px**.
    - Item 2: 200 + 333.3 ≈ **533.3px**.
- **Short summary**: `grow` controls **how much** extra space each item receives; `basis` is the **starting point**.

### Exercícios — Cores no CSS 🧪

1) **Harmonia de cores no CSS**  
   - Use a **Roda de Cores da Adobe** para criar uma paleta.  
   - Escolha **1 cor principal** (background) e **2 secundárias** (títulos e parágrafos).  
   - Exemplo no `style.css`:
```css
/* ...existing code... */
body { background-color: #E6F0FF; }
h1, h2 { color: #2B303A; }
p { color: #0C7C59; }
/* ...existing code... */
```

2) **Corrigindo erro de legibilidade**  
   - Problema: `background-color: #000000;` e `color: black;`  
   - Solução: trocar `color` para uma cor clara.  
```css
/* ...existing code... */
body { background-color: #000000; color: #F6F6F6; }
/* ...existing code... */
```

3) **RGB no CSS (hex)**  
   - Escolha duas cores em **hex** (fundo e texto).  
   - Exemplo:
```css
/* ...existing code... */
body { background-color: #FF5733; color: #00FF00; }
/* ...existing code... */
```

### Seletores CSS — tag, classe e id 🧩

- ✅ **Seletor de tag**: aplica a todos os elementos daquela tag.  
  - Ex.: `p { color: #333; }`
- ✅ **Seletor de classe**: aplica a elementos com `class="..."`.  
  - Ex.: `.destaque { color: #22D4FD; }`
- ✅ **Seletor de id**: aplica ao elemento com `id="..."` (idealmente único na página).  
  - Ex.: `#cabecalho { background: #000; }`

### CSS selectors — tag, class, and id 🧩

- ✅ **Tag selector**: applies to all elements of that tag.  
  - Ex.: `p { color: #333; }`
- ✅ **Class selector**: applies to elements with `class="..."`.  
  - Ex.: `.highlight { color: #22D4FD; }`
- ✅ **ID selector**: applies to the element with `id="..."` (ideally unique on the page).  
  - Ex.: `#header { background: #000; }`

### Âncora (`<a>`) no HTML 🔗

- ✅ **O que é**: elemento usado para criar links.
- ✅ **Como funciona**: o atributo `href` define o destino (URL ou seção da página).
- ✅ **Exemplo**:
  - `<a href="https://example.com">Ir para o site</a>`
  - `<a href="#contato">Ir para contato</a>` (âncora interna)

### HTML anchor (`<a>`) 🔗

- ✅ **What it is**: element used to create links.
- ✅ **How it works**: the `href` attribute defines the destination (URL or page section).
- ✅ **Example**:
  - `<a href="https://example.com">Go to site</a>`
  - `<a href="#contact">Go to contact</a>` (internal anchor)

### Reset CSS 🧼

- ✅ **O que é**: conjunto de estilos básicos para padronizar a aparência inicial entre navegadores.
- ✅ **Por que usar**: reduz diferenças de margens, paddings e fontes padrão.
- ✅ **Exemplo simples**:
  - `* { margin: 0; padding: 0; box-sizing: border-box; }`

### Box Model (modelo de caixa) 📦

- ✅ **O que é**: todo elemento é uma caixa composta por **content**, **padding**, **border** e **margin**.
- ✅ **Como funciona**:
  - **content**: área do conteúdo.
  - **padding**: espaço interno entre conteúdo e borda.
  - **border**: a borda do elemento.
  - **margin**: espaço externo entre elementos.

### CSS Reset 🧼

- ✅ **What it is**: a basic style set to normalize default styles across browsers.
- ✅ **Why use it**: reduces differences in default margins, paddings, and fonts.
- ✅ **Simple example**:
  - `* { margin: 0; padding: 0; box-sizing: border-box; }`

### Box Model 📦

- ✅ **What it is**: every element is a box made of **content**, **padding**, **border**, and **margin**.
- ✅ **How it works**:
  - **content**: content area.
  - **padding**: inner space around content.
  - **border**: element border.
  - **margin**: outer space between elements.

### Medidas no CSS (unidades) 📏

- ✅ **Unidades absolutas**: não mudam com o layout ou fonte.  
  - Exemplos: `px`, `cm`, `mm`, `in`, `pt`.
- ✅ **Unidades relativas**: variam conforme contexto (tamanho da fonte, viewport, etc.).  
  - **`%`**: relativo ao elemento pai.  
  - **`em`**: relativo ao tamanho da fonte do elemento.  
  - **`rem`**: relativo ao tamanho da fonte do `html` (raiz).  
  - **`vw` / `vh`**: relativo à largura/altura da viewport.  
  - **`vmin` / `vmax`**: menor/maior dimensão da viewport.
- ✅ **Viewport (explicação simples)**:
  - **O que é**: a área visível da página no navegador (a “tela útil”).
  - **Exemplos**:
    - Se a janela tem **1200px de largura** e **800px de altura**:
      - `100vw` = 1200px (toda a largura visível)
      - `50vw` = 600px (metade da largura)
      - `100vh` = 800px (toda a altura visível)
      - `50vh` = 400px (metade da altura)
    - Se a tela é **360px x 640px** (celular):
      - `100vw` = 360px
      - `100vh` = 640px
      - `vmin` = 360px, `vmax` = 640px
- ✅ **Quando usar**:
  - **`px`**: ajustes precisos.
  - **`rem` / `em`**: tipografia responsiva.
  - **`%` / `vw` / `vh`**: layouts fluidos.
- ✅ **Exemplos fáceis**:
  - `p { font-size: 16px; }` → texto com 16 pixels.
  - `h1 { font-size: 2rem; }` → 2x o tamanho base da página.
  - `.box { width: 50%; }` → metade da largura do elemento pai.
  - `.card { padding: 1em; }` → espaçamento interno igual ao tamanho da fonte.
  - `.hero { height: 100vh; }` → ocupa 100% da altura da tela.
  - `.sidebar { width: 30vw; }` → 30% da largura da tela.

### CSS units (measurements) 📏

- ✅ **Absolute units**: fixed regardless of layout or font.  
  - Examples: `px`, `cm`, `mm`, `in`, `pt`.
- ✅ **Relative units**: depend on context (font size, viewport, etc.).  
  - **`%`**: relative to the parent.  
  - **`em`**: relative to the element’s font size.  
  - **`rem`**: relative to the root (`html`) font size.  
  - **`vw` / `vh`**: relative to viewport width/height.  
  - **`vmin` / `vmax`**: smallest/largest viewport dimension.
- ✅ **Viewport (simple explanation)**:
  - **What it is**: the visible area of the page in the browser (the “usable screen”).
  - **Examples**:
    - If the window is **1200px wide** and **800px tall**:
      - `100vw` = 1200px (full visible width)
      - `50vw` = 600px (half width)
      - `100vh` = 800px (full visible height)
      - `50vh` = 400px (half height)
    - If the screen is **360px x 640px** (mobile):
      - `100vw` = 360px
      - `100vh` = 640px
      - `vmin` = 360px, `vmax` = 640px
- ✅ **Quando usar**:
  - **`px`**: ajustes precisos.
  - **`rem` / `em`**: tipografia responsiva.
  - **`%` / `vw` / `vh`**: layouts fluidos.
- ✅ **Exemplos fáceis**:
  - `p { font-size: 16px; }` → texto com 16 pixels.
  - `h1 { font-size: 2rem; }` → 2x o tamanho base da página.
  - `.box { width: 50%; }` → metade da largura do elemento pai.
  - `.card { padding: 1em; }` → espaçamento interno igual ao tamanho da fonte.
  - `.hero { height: 100vh; }` → ocupa 100% da altura da tela.
  - `.sidebar { width: 30vw; }` → 30% da largura da tela.

### box-sizing no CSS 🧰

- ✅ **O que é**: define como o navegador calcula o tamanho total do elemento.
- ✅ **`content-box` (padrão)**: largura/altura **não** incluem `padding` e `border`.
- ✅ **`border-box`**: largura/altura **incluem** `padding` e `border`.
- ✅ **Exemplo**:
  - `.card { width: 200px; padding: 20px; box-sizing: border-box; }`  
    → a caixa continua com 200px de largura total.
- ✅ **Exemplos práticos (bem simples)**:
  - **Sem `border-box`**:  
    `div { width: 200px; padding: 20px; border: 5px solid; }`  
    → largura total vira **250px** (200 + 20 + 20 + 5 + 5).
  - **Com `border-box`**:  
    `div { width: 200px; padding: 20px; border: 5px solid; box-sizing: border-box; }`  
    → largura total **permanece 200px**.
  - **Aplicar no projeto todo**:  
    `* { box-sizing: border-box; }`  
    → facilita calcular tamanhos de caixas.
- ✅ **Boas práticas (mercado)**:
  - **Defina globalmente**: use `* { box-sizing: border-box; }` para previsibilidade.
  - **Seja consistente**: evite misturar `content-box` e `border-box` sem motivo claro.
  - **Componentes reutilizáveis**: documente o padrão de `box-sizing` no design system.
  - **Layouts responsivos**: prefira `border-box` para evitar “estouro” de largura/altura.

### CSS `box-sizing` 🧰

- ✅ **What it is**: defines how the browser calculates an element’s total size.
- ✅ **`content-box` (default)**: width/height **exclude** `padding` and `border`.
- ✅ **`border-box`**: width/height **include** `padding` and `border`.
- ✅ **Example**:
  - `.card { width: 200px; padding: 20px; box-sizing: border-box; }`  
    → total width stays 200px.
- ✅ **Practical examples (simple)**:
  - **Without `border-box`**:  
    `div { width: 200px; padding: 20px; border: 5px solid; }`  
    → total width becomes **250px** (200 + 20 + 20 + 5 + 5).
  - **With `border-box`**:  
    `div { width: 200px; padding: 20px; border: 5px solid; box-sizing: border-box; }`  
    → total width **stays 200px**.
  - **Apply to the whole project**:  
    `* { box-sizing: border-box; }`  
    → easier to size elements.
- ✅ **Best practices (industry)**:
  - **Set globally**: use `* { box-sizing: border-box; }` for predictable sizing.
  - **Be consistent**: avoid mixing `content-box` and `border-box` without a clear reason.
  - **Reusable components**: document the `box-sizing` standard in your design system.
  - **Responsive layouts**: prefer `border-box` to prevent overflow issues.

### Flexbox (CSS) — simples e profundo 🧭

- ✅ **O que é**: um modelo de layout em **1 dimensão** (linha ou coluna) para alinhar e distribuir itens.
- ✅ **Ideia central**: um **container flex** controla o posicionamento dos **itens flex**.
- ✅ **Eixos**:
  - **Main axis** (eixo principal): direção definida por `flex-direction`.
  - **Cross axis** (eixo cruzado): perpendicular ao eixo principal.
- ✅ **Como os eixos mudam (detalhado)**:
  - **`flex-direction: row` (padrão)**:
    - **Eixo principal**: horizontal (esquerda → direita).
    - **Eixo cruzado**: vertical (topo → baixo).
  - **`flex-direction: row-reverse`**:
    - **Eixo principal**: horizontal (direita → esquerda).
  - **`flex-direction: column`**:
    - **Eixo principal**: vertical (topo → baixo).
    - **Eixo cruzado**: horizontal (esquerda → direita).
  - **`flex-direction: column-reverse`**:
    - **Eixo principal**: vertical (baixo → topo).
- ✅ **Quando usar**: menus, cards alinhados, centralização, componentes em linha/coluna.

**Propriedades do container (todas):**
| Propriedade | Valores | Descrição |
|-------------|---------|-----------|
| `display` | `flex`, `inline-flex` | Ativa flexbox |
| `flex-direction` | `row`, `row-reverse`, `column`, `column-reverse` | Direção do eixo principal |
| `flex-wrap` | `nowrap`, `wrap`, `wrap-reverse` | Quebra de linha |
| `flex-flow` | `<direction> <wrap>` | Atalho para direction + wrap |
| `justify-content` | `flex-start`, `flex-end`, `center`, `space-between`, `space-around`, `space-evenly` | Alinha no eixo principal |
| `align-items` | `stretch`, `flex-start`, `flex-end`, `center`, `baseline` | Alinha no eixo cruzado |
| `align-content` | `stretch`, `flex-start`, `flex-end`, `center`, `space-between`, `space-around` | Alinha **múltiplas linhas** (só com `flex-wrap: wrap` e múltiplas linhas) |
| `gap` | `<row-gap> <column-gap>` | Espaçamento entre itens |

**Propriedades dos itens (todas):**
| Propriedade | Valores | Descrição |
|-------------|---------|-----------|
| `order` | número (padrão: 0) | Ordem de exibição (menor = primeiro) |
| `flex-grow` | número (padrão: 0) | Quanto cresce quando sobra espaço |
| `flex-shrink` | número (padrão: 1) | Quanto encolhe quando falta espaço |
| `flex-basis` | tamanho ou `auto` | Tamanho base antes de crescer/encolher |
| `flex` | `<grow> <shrink> <basis>` | Atalho (ex.: `flex: 1 1 auto`) |
| `align-self` | `auto`, `flex-start`, `flex-end`, `center`, `baseline`, `stretch` | Sobrescreve `align-items` para um item |

**Valores de `justify-content` (visual):**
```
flex-start:    [A][B][C]____________
flex-end:      ____________[A][B][C]
center:        ______[A][B][C]______
space-between: [A]______[B]______[C]
space-around:  __[A]____[B]____[C]__
space-evenly:  ___[A]___[B]___[C]___
```

**Valores de `align-items` (visual, em `row`):**
```
stretch:    |AAAA|  (estica para preencher altura)
flex-start: |A   |  (alinha no topo)
flex-end:   |   A|  (alinha embaixo)
center:     | A  |  (alinha no centro)
baseline:   texto alinhado pela linha de base da fonte
```

**`align-content` vs `align-items`:**
- `align-items`: alinha itens **dentro de cada linha**.
- `align-content`: distribui **as linhas** no container (só funciona com `flex-wrap: wrap` e múltiplas linhas).

**`order` — reordenando itens:**
```css
.item-a { order: 2; }  /* aparece por último */
.item-b { order: 1; }  /* aparece no meio */
.item-c { order: 0; }  /* aparece primeiro (padrão) */
```

**`flex-shrink` — como funciona:**
- Quando a soma das `basis` > largura do container, os itens **encolhem**.
- `flex-shrink: 0` → item **não** encolhe (mantém `basis`).
- `flex-shrink: 2` → encolhe **2x mais** que um item com `shrink: 1`.

**Valores comuns de `flex` (atalhos):**
| Valor | Equivalente | Uso |
|-------|-------------|-----|
| `flex: 1` | `1 1 0%` | Cresce/encolhe igualmente, ignora conteúdo |
| `flex: auto` | `1 1 auto` | Cresce/encolhe, respeita conteúdo |
| `flex: none` | `0 0 auto` | Tamanho fixo, não flexível |
| `flex: 0 1 auto` | padrão | Não cresce, pode encolher |

**Truques úteis:**
```css
/* Centralização perfeita (1 linha) */
.center { display: flex; justify-content: center; align-items: center; }

/* Último item à direita (push) */
.spacer { margin-left: auto; }

/* Rodapé fixo no fim da página */
body { display: flex; flex-direction: column; min-height: 100vh; }
main { flex: 1; }

/* Igual altura para cards */
.cards { display: flex; align-items: stretch; }
```

**Debugging Flexbox:**
- Use DevTools → inspecione o container → veja o badge "flex".
- Clique no badge para visualizar eixos e espaçamento.

### CSS do 16.html — explicação detalhada (PT-BR) 🎯

- `* { margin: 0; padding: 0; box-sizing: border-box; }`  
  → remove margens/paddings padrão do navegador e evita “estouro” ao somar borda/padding no tamanho.
- `body { background-color: black; }`  
  → define fundo escuro para destacar as caixas e o texto.
- `.container { height: 100vh; width: 100vw; display: flex; ... }`  
  → ocupa toda a tela e coloca os filhos lado a lado (linha).
- `border: 1px solid red; color: white;`  
  → borda vermelha para visualizar o container e texto branco para contraste.
- `.container > div { flex: 1; ... }`  
  → cada coluna cresce igualmente (metade da largura).
- `border: 1px solid blue; margin: 5px; padding: 5px;`  
  → borda azul para visualizar cada coluna, margem externa e respiro interno.

### 16.html CSS — detailed explanation (EN) 🎯

- `* { margin: 0; padding: 0; box-sizing: border-box; }`  
  → removes default margins/paddings and prevents size overflow when adding borders/padding.
- `body { background-color: black; }`  
  → dark background to highlight boxes and text.
- `.container { height: 100vh; width: 100vw; display: flex; ... }`  
  → fills the viewport and lays children side by side (row).
- `border: 1px solid red; color: white;`  
  → red border to visualize the container, white text for contrast.
- `.container > div { flex: 1; ... }`  
  → each column grows equally (half the width).
- `border: 1px solid blue; margin: 5px; padding: 5px;`  
  → blue border for each column, outer spacing and inner padding.

### Herança no CSS (inheritance) 🧬

- ✅ **PT-BR**: algumas propriedades são herdadas dos pais para os filhos (ex.: `color`, `font-family`).  
  - Ex.: se `.container { color: white; }`, o texto dos filhos fica branco.
- ✅ **EN**: some properties are inherited from parent to child (e.g., `color`, `font-family`).  
  - Example: if `.container { color: white; }`, child text becomes white.

### Seletor de filho direto `>` (CSS) 👶

- ✅ **PT-BR**: seleciona **apenas** filhos imediatos (não netos).  
  - Ex.: `.container > div { ... }` aplica só às `<div>` dentro da `.container`.
- ✅ **EN**: selects **only** direct children (not grandchildren).  
  - Example: `.container > div { ... }` applies only to `<div>` directly inside `.container`.

**Exemplo rápido / Quick example:**
```css
/* ...existing code... */
.container > div { border: 1px solid blue; }
/* ...existing code... */
```

### Flex shorthand (`flex: grow shrink basis`) — exemplo claro 🧭

**PT-BR (contexto do 16.html):**
- **O que cresce/encolhe?** a **largura** do item (eixo principal em `row`).
- **Cresce quando?** quando sobra espaço no container.
- **Encolhe quando?** quando falta espaço no container.
- `flex: 1 1 300px;` → base 300px; cresce 1 parte e pode encolher.
- `flex: 2 1 200px;` → base 200px; cresce 2 partes e pode encolher.
- **Exemplo detalhado (container 1000px, 2 itens):**
  - **Somatório das bases**: 300 + 200 = 500px.
  - **Espaço livre**: 1000 - 500 = 500px.
  - **Partes de crescimento**: 1 + 2 = 3 partes.
  - **Distribuição do extra**:
    - Item 1 recebe **1/3** de 500 ≈ **166,7px**.
    - Item 2 recebe **2/3** de 500 ≈ **333,3px**.
  - **Tamanho final**:
    - Item 1: 300 + 166,7 ≈ **466,7px**.
    - Item 2: 200 + 333,3 ≈ **533,3px**.
- **Resumo curto**: o `grow` define **quanto** cada item leva do espaço livre; o `basis` define o **ponto de partida**.

**EN (16.html context):**
- **What grows/shrinks?** the item’s **width** (main axis in `row`).
- **Grows when?** when there is extra space in the container.
- **Shrinks when?** when there isn’t enough space in the container.
- `flex: 1 1 300px;` → 300px base; grows by 1 part and can shrink.
- `flex: 2 1 200px;` → 200px base; grows by 2 parts and can shrink.
- **Detailed example (1000px container, 2 items):**
  - **Base sum**: 300 + 200 = 500px.
  - **Free space**: 1000 - 500 = 500px.
  - **Growth parts**: 1 + 2 = 3 parts.
  - **Extra space split**:
    - Item 1 gets **1/3** of 500 ≈ **166.7px**.
    - Item 2 gets **2/3** of 500 ≈ **333.3px**.
  - **Final sizes**:
    - Item 1: 300 + 166.7 ≈ **466.7px**.
    - Item 2: 200 + 333.3 ≈ **533.3px**.
- **Short summary**: `grow` controls **how much** extra space each item receives; `basis` is the **starting point**.

### Exercícios — Cores no CSS 🧪

1) **Harmonia de cores no CSS**  
   - Use a **Roda de Cores da Adobe** para criar uma paleta.  
   - Escolha **1 cor principal** (background) e **2 secundárias** (títulos e parágrafos).  
   - Exemplo no `style.css`:
```css
/* ...existing code... */
body { background-color: #E6F0FF; }
h1, h2 { color: #2B303A; }
p { color: #0C7C59; }
/* ...existing code... */
```

2) **Corrigindo erro de legibilidade**  
   - Problema: `background-color: #000000;` e `color: black;`  
   - Solução: trocar `color` para uma cor clara.  
```css
/* ...existing code... */
body { background-color: #000000; color: #F6F6F6; }
/* ...existing code... */
```

3) **RGB no CSS (hex)**  
   - Escolha duas cores em **hex** (fundo e texto).  
   - Exemplo:
```css
/* ...existing code... */
body { background-color: #FF5733; color: #00FF00; }
/* ...existing code... */
```

### Seletores CSS — tag, classe e id 🧩

- ✅ **Seletor de tag**: aplica a todos os elementos daquela tag.  
  - Ex.: `p { color: #333; }`
- ✅ **Seletor de classe**: aplica a elementos com `class="..."`.  
  - Ex.: `.destaque { color: #22D4FD; }`
- ✅ **Seletor de id**: aplica ao elemento com `id="..."` (idealmente único na página).  
  - Ex.: `#cabecalho { background: #000; }`

### CSS selectors — tag, class, and id 🧩

- ✅ **Tag selector**: applies to all elements of that tag.  
  - Ex.: `p { color: #333; }`
- ✅ **Class selector**: applies to elements with `class="..."`.  
  - Ex.: `.highlight { color: #22D4FD; }`
- ✅ **ID selector**: applies to the element with `id="..."` (ideally unique on the page).  
  - Ex.: `#header { background: #000; }`

### Âncora (`<a>`) no HTML 🔗

- ✅ **O que é**: elemento usado para criar links.
- ✅ **Como funciona**: o atributo `href` define o destino (URL ou seção da página).
- ✅ **Exemplo**:
  - `<a href="https://example.com">Ir para o site</a>`
  - `<a href="#contato">Ir para contato</a>` (âncora interna)

### HTML anchor (`<a>`) 🔗

- ✅ **What it is**: element used to create links.
- ✅ **How it works**: the `href` attribute defines the destination (URL or page section).
- ✅ **Example**:
  - `<a href="https://example.com">Go to site</a>`
  - `<a href="#contact">Go to contact</a>` (internal anchor)

### Reset CSS 🧼

- ✅ **O que é**: conjunto de estilos básicos para padronizar a aparência inicial entre navegadores.
- ✅ **Por que usar**: reduz diferenças de margens, paddings e fontes padrão.
- ✅ **Exemplo simples**:
  - `* { margin: 0; padding: 0; box-sizing: border-box; }`

### Box Model (modelo de caixa) 📦

- ✅ **O que é**: todo elemento é uma caixa composta por **content**, **padding**, **border** e **margin**.
- ✅ **Como funciona**:
  - **content**: área do conteúdo.
  - **padding**: espaço interno entre conteúdo e borda.
  - **border**: a borda do elemento.
  - **margin**: espaço externo entre elementos.

### CSS Reset 🧼

- ✅ **What it is**: a basic style set to normalize default styles across browsers.
- ✅ **Why use it**: reduces differences in default margins, paddings, and fonts.
- ✅ **Simple example**:
  - `* { margin: 0; padding: 0; box-sizing: border-box; }`

### Box Model 📦

- ✅ **What it is**: every element is a box made of **content**, **padding**, **border**, and **margin**.
- ✅ **How it works**:
  - **content**: content area.
  - **padding**: inner space around content.
  - **border**: element border.
  - **margin**: outer space between elements.

### Medidas no CSS (unidades) 📏

- ✅ **Unidades absolutas**: não mudam com o layout ou fonte.  
  - Exemplos: `px`, `cm`, `mm`, `in`, `pt`.
- ✅ **Unidades relativas**: variam conforme contexto (tamanho da fonte, viewport, etc.).  
  - **`%`**: relativo ao elemento pai.  
  - **`em`**: relativo ao tamanho da fonte do elemento.  
  - **`rem`**: relativo ao tamanho da fonte do `html` (raiz).  
  - **`vw` / `vh`**: relativo à largura/altura da viewport.  
  - **`vmin` / `vmax`**: menor/maior dimensão da viewport.
- ✅ **Viewport (explicação simples)**:
  - **O que é**: a área visível da página no navegador (a “tela útil”).
  - **Exemplos**:
    - Se a janela tem **1200px de largura** e **800px de altura**:
      - `100vw` = 1200px (toda a largura visível)
      - `50vw` = 600px (metade da largura)
      - `100vh` = 800px (toda a altura visível)
      - `50vh` = 400px (metade da altura)
    - Se a tela é **360px x 640px** (celular):
      - `100vw` = 360px
      - `100vh` = 640px
      - `vmin` = 360px, `vmax` = 640px
- ✅ **Quando usar**:
  - **`px`**: ajustes precisos.
  - **`rem` / `em`**: tipografia responsiva.
  - **`%` / `vw` / `vh`**: layouts fluidos.
- ✅ **Exemplos fáceis**:
  - `p { font-size: 16px; }` → texto com 16 pixels.
  - `h1 { font-size: 2rem; }` → 2x o tamanho base da página.
  - `.box { width: 50%; }` → metade da largura do elemento pai.
  - `.card { padding: 1em; }` → espaçamento interno igual ao tamanho da fonte.
  - `.hero { height: 100vh; }` → ocupa 100% da altura da tela.
  - `.sidebar { width: 30vw; }` → 30% da largura da tela.

### CSS units (measurements) 📏

- ✅ **Absolute units**: fixed regardless of layout or font.  
  - Examples: `px`, `cm`, `mm`, `in`, `pt`.
- ✅ **Relative units**: depend on context (font size, viewport, etc.).  
  - **`%`**: relative to the parent.  
  - **`em`**: relative to the element’s font size.  
  - **`rem`**: relative to the root (`html`) font size.  
  - **`vw` / `vh`**: relative to viewport width/height.  
  - **`vmin` / `vmax`**: smallest/largest viewport dimension.
- ✅ **Viewport (simple explanation)**:
  - **What it is**: the visible area of the page in the browser (the “usable screen”).
  - **Examples**:
    - If the window is **1200px wide** and **800px tall**:
      - `100vw` = 1200px (full visible width)
      - `50vw` = 600px (half width)
      - `100vh` = 800px (full visible height)
      - `50vh` = 400px (half height)
    - If the screen is **360px x 640px** (mobile):
      - `100vw` = 360px
      - `100vh` = 640px
      - `vmin` = 360px, `vmax` = 640px
- ✅ **Quando usar**:
  - **`px`**: ajustes precisos.
  - **`rem` / `em`**: tipografia responsiva.
  - **`%` / `vw` / `vh`**: layouts fluidos.
- ✅ **Exemplos fáceis**:
  - `p { font-size: 16px; }` → texto com 16 pixels.
  - `h1 { font-size: 2rem; }` → 2x o tamanho base da página.
  - `.box { width: 50%; }` → metade da largura do elemento pai.
  - `.card { padding: 1em; }` → espaçamento interno igual ao tamanho da fonte.
  - `.hero { height: 100vh; }` → ocupa 100% da altura da tela.
  - `.sidebar { width: 30vw; }` → 30% da largura da tela.

### box-sizing no CSS 🧰

- ✅ **O que é**: define como o navegador calcula o tamanho total do elemento.
- ✅ **`content-box` (padrão)**: largura/altura **não** incluem `padding` e `border`.
- ✅ **`border-box`**: largura/altura **incluem** `padding` e `border`.
- ✅ **Exemplo**:
  - `.card { width: 200px; padding: 20px; box-sizing: border-box; }`  
    → a caixa continua com 200px de largura total.
- ✅ **Exemplos práticos (bem simples)**:
  - **Sem `border-box`**:  
    `div { width: 200px; padding: 20px; border: 5px solid; }`  
    → largura total vira **250px** (200 + 20 + 20 + 5 + 5).
  - **Com `border-box`**:  
    `div { width: 200px; padding: 20px; border: 5px solid; box-sizing: border-box; }`  
    → largura total **permanece 200px**.
  - **Aplicar no projeto todo**:  
    `* { box-sizing: border-box; }`  
    → facilita calcular tamanhos de caixas.
- ✅ **Boas práticas (mercado)**:
  - **Defina globalmente**: use `* { box-sizing: border-box; }` para previsibilidade.
  - **Seja consistente**: evite misturar `content-box` e `border-box` sem motivo claro.
  - **Componentes reutilizáveis**: documente o padrão de `box-sizing` no design system.
  - **Layouts responsivos**: prefira `border-box` para evitar “estouro” de largura/altura.

### CSS `box-sizing` 🧰

- ✅ **What it is**: defines how the browser calculates an element’s total size.
- ✅ **`content-box` (default)**: width/height **exclude** `padding` and `border`.
- ✅ **`border-box`**: width/height **include** `padding` and `border`.
- ✅ **Example**:
  - `.card { width: 200px; padding: 20px; box-sizing: border-box; }`  
    → total width stays 200px.
- ✅ **Practical examples (simple)**:
  - **Without `border-box`**:  
    `div { width: 200px; padding: 20px; border: 5px solid; }`  
    → total width becomes **250px** (200 + 20 + 20 + 5 + 5).
  - **With `border-box`**:  
    `div { width: 200px; padding: 20px; border: 5px solid; box-sizing: border-box; }`  
    → total width **stays 200px**.
  - **Apply to the whole project**:  
    `* { box-sizing: border-box; }`  
    → easier to size elements.
- ✅ **Best practices (industry)**:
  - **Set globally**: use `* { box-sizing: border-box; }` for predictable sizing.
  - **Be consistent**: avoid mixing `content-box` and `border-box` without a clear reason.
  - **Reusable components**: document the `box-sizing` standard in your design system.
  - **Responsive layouts**: prefer `border-box` to prevent overflow issues.

### Flexbox (CSS) — simples e profundo 🧭

- ✅ **O que é**: um modelo de layout em **1 dimensão** (linha ou coluna) para alinhar e distribuir itens.
- ✅ **Ideia central**: um **container flex** controla o posicionamento dos **itens flex**.
- ✅ **Eixos**:
  - **Main axis** (eixo principal): direção definida por `flex-direction`.
  - **Cross axis** (eixo cruzado): perpendicular ao eixo principal.
- ✅ **Como os eixos mudam (detalhado)**:
  - **`flex-direction: row` (padrão)**:
    - **Eixo principal**: horizontal (esquerda → direita).
    - **Eixo cruzado**: vertical (topo → baixo).
  - **`flex-direction: row-reverse`**:
    - **Eixo principal**: horizontal (direita → esquerda).
  - **`flex-direction: column`**:
    - **Eixo principal**: vertical (topo → baixo).
    - **Eixo cruzado**: horizontal (esquerda → direita).
  - **`flex-direction: column-reverse`**:
    - **Eixo principal**: vertical (baixo → topo).
- ✅ **Quando usar**: menus, cards alinhados, centralização, componentes em linha/coluna.

**Propriedades do container (todas):**
| Propriedade | Valores | Descrição |
|-------------|---------|-----------|
| `display` | `flex`, `inline-flex` | Ativa flexbox |
| `flex-direction` | `row`, `row-reverse`, `column`, `column-reverse` | Direção do eixo principal |
| `flex-wrap` | `nowrap`, `wrap`, `wrap-reverse` | Quebra de linha |
| `flex-flow` | `<direction> <wrap>` | Atalho para direction + wrap |
| `justify-content` | `flex-start`, `flex-end`, `center`, `space-between`, `space-around`, `space-evenly` | Alinha no eixo principal |
| `align-items` | `stretch`, `flex-start`, `flex-end`, `center`, `baseline` | Alinha no eixo cruzado |
| `align-content` | `stretch`, `flex-start`, `flex-end`, `center`, `space-between`, `space-around` | Alinha **múltiplas linhas** (só com `flex-wrap: wrap` e múltiplas linhas) |
| `gap` | `<row-gap> <column-gap>` | Espaçamento entre itens |

**Propriedades dos itens (todas):**
| Propriedade | Valores | Descrição |
|-------------|---------|-----------|
| `order` | número (padrão: 0) | Ordem de exibição (menor = primeiro) |
| `flex-grow` | número (padrão: 0) | Quanto cresce quando sobra espaço |
| `flex-shrink` | número (padrão: 1) | Quanto encolhe quando falta espaço |
| `flex-basis` | tamanho ou `auto` | Tamanho base antes de crescer/encolher |
| `flex` | `<grow> <shrink> <basis>` | Atalho (ex.: `flex: 1 1 auto`) |
| `align-self` | `auto`, `flex-start`, `flex-end`, `center`, `baseline`, `stretch` | Sobrescreve `align-items` para um item |

**Valores de `justify-content` (visual):**
```
flex-start:    [A][B][C]____________
flex-end:      ____________[A][B][C]
center:        ______[A][B][C]______
space-between: [A]______[B]______[C]
space-around:  __[A]____[B]____[C]__
space-evenly:  ___[A]___[B]___[C]___
```

**Valores de `align-items` (visual, em `row`):**
```
stretch:    |AAAA|  (estica para preencher altura)
flex-start: |A   |  (alinha no topo)
flex-end:   |   A|  (alinha embaixo)
center:     | A  |  (alinha no centro)
baseline:   texto alinhado pela linha de base da fonte
```

**`align-content` vs `align-items`:**
- `align-items`: alinha itens **dentro de cada linha**.
- `align-content`: distribui **as linhas** no container (só funciona com `flex-wrap: wrap` e múltiplas linhas).

**`order` — reordenando itens:**
```css
.item-a { order: 2; }  /* aparece por último */
.item-b { order: 1; }  /* aparece no meio */
.item-c { order: 0; }  /* aparece primeiro (padrão) */
```

**`flex-shrink` — como funciona:**
- Quando a soma das `basis` > largura do container, os itens **encolhem**.
- `flex-shrink: 0` → item **não** encolhe (mantém `basis`).
- `flex-shrink: 2` → encolhe **2x mais** que um item com `shrink: 1`.

**Valores comuns de `flex` (atalhos):**
| Valor | Equivalente | Uso |
|-------|-------------|-----|
| `flex: 1` | `1 1 0%` | Cresce/encolhe igualmente, ignora conteúdo |
| `flex: auto` | `1 1 auto` | Cresce/encolhe, respeita conteúdo |
| `flex: none` | `0 0 auto` | Tamanho fixo, não flexível |
| `flex: 0 1 auto` | padrão | Não cresce, pode encolher |

**Truques úteis:**
```css
/* Centralização perfeita (1 linha) */
.center { display: flex; justify-content: center; align-items: center; }

/* Último item à direita (push) */
.spacer { margin-left: auto; }

/* Rodapé fixo no fim da página */
body { display: flex; flex-direction: column; min-height: 100vh; }
main { flex: 1; }

/* Igual altura para cards */
.cards { display: flex; align-items: stretch; }
```

**Debugging Flexbox:**
- Use DevTools → inspecione o container → veja o badge "flex".
- Clique no badge para visualizar eixos e espaçamento.

### CSS do 16.html — explicação detalhada (PT-BR) 🎯

- `* { margin: 0; padding: 0; box-sizing: border-box; }`  
  → remove margens/paddings padrão do navegador e evita “estouro” ao somar borda/padding no tamanho.
- `body { background-color: black; }`  
  → define fundo escuro para destacar as caixas e o texto.
- `.container { height: 100vh; width: 100vw; display: flex; ... }`  
  → ocupa toda a tela e coloca os filhos lado a lado (linha).
- `border: 1px solid red; color: white;`  
  → borda vermelha para visualizar o container e texto branco para contraste.
- `.container > div { flex: 1; ... }`  
  → cada coluna cresce igualmente (metade da largura).
- `border: 1px solid blue; margin: 5px; padding: 5px;`  
  → borda azul para visualizar cada coluna, margem externa e respiro interno.

### 16.html CSS — detailed explanation (EN) 🎯

- `* { margin: 0; padding: 0; box-sizing: border-box; }`  
  → removes default margins/paddings and prevents size overflow when adding borders/padding.
- `body { background-color: black; }`  
  → dark background to highlight boxes and text.
- `.container { height: 100vh; width: 100vw; display: flex; ... }`  
  → fills the viewport and lays children side by side (row).
- `border: 1px solid red; color: white;`  
  → red border to visualize the container, white text for contrast.
- `.container > div { flex: 1; ... }`  
  → each column grows equally (half the width).
- `border: 1px solid blue; margin: 5px; padding: 5px;`  
  → blue border for each column, outer spacing and inner padding.

### Herança no CSS (inheritance) 🧬

- ✅ **PT-BR**: algumas propriedades são herdadas dos pais para os filhos (ex.: `color`, `font-family`).  
  - Ex.: se `.container { color: white; }`, o texto dos filhos fica branco.
- ✅ **EN**: some properties are inherited from parent to child (e.g., `color`, `font-family`).  
  - Example: if `.container { color: white; }`, child text becomes white.

### Seletor de filho direto `>` (CSS) 👶

- ✅ **PT-BR**: seleciona **apenas** filhos imediatos (não netos).  
  - Ex.: `.container > div { ... }` aplica só às `<div>` dentro da `.container`.
- ✅ **EN**: selects **only** direct children (not grandchildren).  
  - Example: `.container > div { ... }` applies only to `<div>` directly inside `.container`.

**Exemplo rápido / Quick example:**
```css
/* ...existing code... */
.container > div { border: 1px solid blue; }
/* ...existing code... */
```

### Flex shorthand (`flex: grow shrink basis`) — exemplo claro 🧭

**PT-BR (contexto do 16.html):**
- **O que cresce/encolhe?** a **largura** do item (eixo principal em `row`).
- **Cresce quando?** quando sobra espaço no container.
- **Encolhe quando?** quando falta espaço no container.
- `flex: 1 1 300px;` → base 300px; cresce 1 parte e pode encolher.
- `flex: 2 1 200px;` → base 200px; cresce 2 partes e pode encolher.
- **Exemplo detalhado (container 1000px, 2 itens):**
  - **Somatório das bases**: 300 + 200 = 500px.
  - **Espaço livre**: 1000 - 500 = 500px.
  - **Partes de crescimento**: 1 + 2 = 3 partes.
  - **Distribuição do extra**:
    - Item 1 recebe **1/3** de 500 ≈ **166,7px**.
    - Item 2 recebe **2/3** de 500 ≈ **333,3px**.
  - **Tamanho final**:
    - Item 1: 300 + 166,7 ≈ **466,7px**.
    - Item 2: 200 + 333,3 ≈ **533,3px**.
- **Resumo curto**: o `grow` define **quanto** cada item leva do espaço livre; o `basis` define o **ponto de partida**.

**EN (16.html context):**
- **What grows/shrinks?** the item’s **width** (main axis in `row`).
- **Grows when?** when there is extra space in the container.
- **Shrinks when?** when there isn’t enough space in the container.
- `flex: 1 1 300px;` → 300px base; grows by 1 part and can shrink.
- `flex: 2 1 200px;` → 200px base; grows by 2 parts and can shrink.
- **Detailed example (1000px container, 2 items):**
  - **Base sum**: 300 + 200 = 500px.
  - **Free space**: 1000 - 500 = 500px.
  - **Growth parts**: 1 + 2 = 3 parts.
  - **Extra space split**:
    - Item 1 gets **1/3** of 500 ≈ **166.7px**.
    - Item 2 gets **2/3** of 500 ≈ **333.3px**.
  - **Final sizes**:
    - Item 1: 300 + 166.7 ≈ **466.7px**.
    - Item 2: 200 + 333.3 ≈ **533.3px**.
- **Short summary**: `grow` controls **how much** extra space each item receives; `basis` is the **starting point**.

### Exercícios — Cores no CSS 🧪

1) **Harmonia de cores no CSS**  
   - Use a **Roda de Cores da Adobe** para criar uma paleta.  
   - Escolha **1 cor principal** (background) e **2 secundárias** (títulos e parágrafos).  
   - Exemplo no `style.css`:
```css
/* ...existing code... */
body { background-color: #E6F0FF; }
h1, h2 { color: #2B303A; }
p { color: #0C7C59; }
/* ...existing code... */
```

2) **Corrigindo erro de legibilidade**  
   - Problema: `background-color: #000000;` e `color: black;`  
   - Solução: trocar `color` para uma cor clara.  
```css
/* ...existing code... */
body { background-color: #000000; color: #F6F6F6; }
/* ...existing code... */
```

3) **RGB no CSS (hex)**  
   - Escolha duas cores em **hex** (fundo e texto).  
   - Exemplo:
```css
/* ...existing code... */
body { background-color: #FF5733; color: #00FF00; }
/* ...existing code... */
```

### Seletores CSS — tag, classe e id 🧩

- ✅ **Seletor de tag**: aplica a todos os elementos daquela tag.  
  - Ex.: `p { color: #333; }`
- ✅ **Seletor de classe**: aplica a elementos com `class="..."`.  
  - Ex.: `.destaque { color: #22D4FD; }`
- ✅ **Seletor de id**: aplica ao elemento com `id="..."` (idealmente único na página).  
  - Ex.: `#cabecalho { background: #000; }`

### CSS selectors — tag, class, and id 🧩

- ✅ **Tag selector**: applies to all elements of that tag.  
  - Ex.: `p { color: #333; }`
- ✅ **Class selector**: applies to elements with `class="..."`.  
  - Ex.: `.highlight { color: #22D4FD; }`
- ✅ **ID selector**: applies to the element with `id="..."` (ideally unique on the page).  
  - Ex.: `#header { background: #000; }`

### Âncora (`<a>`) no HTML 🔗

- ✅ **O que é**: elemento usado para criar links.
- ✅ **Como funciona**: o atributo `href` define o destino (URL ou seção da página).
- ✅ **Exemplo**:
  - `<a href="https://example.com">Ir para o site</a>`
  - `<a href="#contato">Ir para contato</a>` (âncora interna)

### HTML anchor (`<a>`) 🔗

- ✅ **What it is**: element used to create links.
- ✅ **How it works**: the `href` attribute defines the destination (URL or page section).
- ✅ **Example**:
  - `<a href="https://example.com">Go to site</a>`
  - `<a href="#contact">Go to contact</a>` (internal anchor)

### Reset CSS 🧼

- ✅ **O que é**: conjunto de estilos básicos para padronizar a aparência inicial entre navegadores.
- ✅ **Por que usar**: reduz diferenças de margens, paddings e fontes padrão.
- ✅ **Exemplo simples**:
  - `* { margin: 0; padding: 0; box-sizing: border-box; }`

### Box Model (modelo de caixa) 📦

- ✅ **O que é**: todo elemento é uma caixa composta por **content**, **padding**, **border** e **margin**.
- ✅ **Como funciona**:
  - **content**: área do conteúdo.
  - **padding**: espaço interno entre conteúdo e borda.
  - **border**: a borda do elemento.
  - **margin**: espaço externo entre elementos.

### CSS Reset 🧼

- ✅ **What it is**: a basic style set to normalize default styles across browsers.
- ✅ **Why use it**: reduces differences in default margins, paddings, and fonts.
- ✅ **Simple example**:
  - `* { margin: 0; padding: 0; box-sizing: border-box; }`

### Box Model 📦

- ✅ **What it is**: every element is a box made of **content**, **padding**, **border**, and **margin**.
- ✅ **How it works**:
  - **content**: content area.
  - **padding**: inner space around content.
  - **border**: element border.
  - **margin**: outer space between elements.

### Medidas no CSS (unidades) 📏

- ✅ **Unidades absolutas**: não mudam com o layout ou fonte.  
  - Exemplos: `px`, `cm`, `mm`, `in`, `pt`.
- ✅ **Unidades relativas**: variam conforme contexto (tamanho da fonte, viewport, etc.).  
  - **`%`**: relativo ao elemento pai.  
  - **`em`**: relativo ao tamanho da fonte do elemento.  
  - **`rem`**: relativo ao tamanho da fonte do `html` (raiz).  
  - **`vw` / `vh`**: relativo à largura/altura da viewport.  
  - **`vmin` / `vmax`**: menor/maior dimensão da viewport.
- ✅ **Viewport (explicação simples)**:
  - **O que é**: a área visível da página no navegador (a “tela útil”).
  - **Exemplos**:
    - Se a janela tem **1200px de largura** e **800px de altura**:
      - `100vw` = 1200px (toda a largura visível)
      - `50vw` = 600px (metade da largura)
      - `100vh` = 800px (toda a altura visível)
      - `50vh` = 400px (metade da altura)
    - Se a tela é **360px x 640px** (celular):
      - `100vw` = 360px
      - `100vh` = 640px
      - `vmin` = 360px, `vmax` = 640px
- ✅ **Quando usar**:
  - **`px`**: ajustes precisos.
  - **`rem` / `em`**: tipografia responsiva.
  - **`%` / `vw` / `vh`**: layouts fluidos.
- ✅ **Exemplos fáceis**:
  - `p { font-size: 16px; }` → texto com 16 pixels.
  - `h1 { font-size: 2rem; }` → 2x o tamanho base da página.
  - `.box { width: 50%; }` → metade da largura do elemento pai.
  - `.card { padding: 1em; }` → espaçamento interno igual ao tamanho da fonte.
  - `.hero { height: 100vh; }` → ocupa 100% da altura da tela.
  - `.sidebar { width: 30vw; }` → 30% da largura da tela.

### CSS units (measurements) 📏

- ✅ **Absolute units**: fixed regardless of layout or font.  
  - Examples: `px`, `cm`, `mm`, `in`, `pt`.
- ✅ **Relative units**: depend on context (font size, viewport, etc.).  
  - **`%`**: relative to the parent.  
  - **`em`**: relative to the element’s font size.  
  - **`rem`**: relative to the root (`html`) font size.  
  - **`vw` / `vh`**: relative to viewport width/height.  
  - **`vmin` / `vmax`**: smallest/largest viewport dimension.
- ✅ **Viewport (simple explanation)**:
  - **What it is**: the visible area of the page in the browser (the “usable screen”).
  - **Examples**:
    - If the window is **1200px wide** and **800px tall**:
      - `100vw` = 1200px (full visible width)
      - `50vw` = 600px (half width)
      - `100vh` = 800px (full visible height)
      - `50vh` = 400px (half height)
    - If the screen is **360px x 640px** (mobile):
      - `100vw` = 360px
      - `100vh` = 640px
      - `vmin` = 360px, `vmax` = 640px
- ✅ **Quando usar**:
  - **`px`**: ajustes precisos.
  - **`rem` / `em`**: tipografia responsiva.
  - **`%` / `vw` / `vh`**: layouts fluidos.
- ✅ **Exemplos fáceis**:
  - `p { font-size: 16px; }` → texto com 16 pixels.
  - `h1 { font-size: 2rem; }` → 2x o tamanho base da página.
  - `.box { width: 50%; }` → metade da largura do elemento pai.
  - `.card { padding: 1em; }` → espaçamento interno igual ao tamanho da fonte.
  - `.hero { height: 100vh; }` → ocupa 100% da altura da tela.
  - `.sidebar { width: 30vw; }` → 30% da largura da tela.

### box-sizing no CSS 🧰

- ✅ **O que é**: define como o navegador calcula o tamanho total do elemento.
- ✅ **`content-box` (padrão)**: largura/altura **não** incluem `padding` e `border`.
- ✅ **`border-box`**: largura/altura **incluem** `padding` e `border`.
- ✅ **Exemplo**:
  - `.card { width: 200px; padding: 20px; box-sizing: border-box; }`  
    → a caixa continua com 200px de largura total.
- ✅ **Exemplos práticos (bem simples)**:
  - **Sem `border-box`**:  
    `div { width: 200px; padding: 20px; border: 5px solid; }`  
    → largura total vira **250px** (200 + 20 + 20 + 5 + 5).
  - **Com `border-box`**:  
    `div { width: 200px; padding: 20px; border: 5px solid; box-sizing: border-box; }`  
    → largura total **permanece 200px**.
  - **Aplicar no projeto todo**:  
    `* { box-sizing: border-box; }`  
    → facilita calcular tamanhos de caixas.
- ✅ **Boas práticas (mercado)**:
  - **Defina globalmente**: use `* { box-sizing: border-box; }` para previsibilidade.
  - **Seja consistente**: evite misturar `content-box` e `border-box` sem motivo claro.
  - **Componentes reutilizáveis**: documente o padrão de `box-sizing` no design system.
  - **Layouts responsivos**: prefira `border-box` para evitar “estouro” de largura/altura.

### CSS `box-sizing` 🧰

- ✅ **What it is**: defines how the browser calculates an element’s total size.
- ✅ **`content-box` (default)**: width/height **exclude** `padding` and `border`.
- ✅ **`border-box`**: width/height **include** `padding` and `border`.
- ✅ **Example**:
  - `.card { width: 200px; padding: 20px; box-sizing: border-box; }`  
    → total width stays 200px.
- ✅ **Practical examples (simple)**:
  - **Without `border-box`**:  
    `div { width: 200px; padding: 20px; border: 5px solid; }`  
    → total width becomes **250px** (200 + 20 + 20 + 5 + 5).
  - **With `border-box`**:  
    `div { width: 200px; padding: 20px; border: 5px solid; box-sizing: border-box; }`  
    → total width **stays 200px**.
  - **Apply to the whole project**:  
    `* { box-sizing: border-box; }`  
    → easier to size elements.
- ✅ **Best practices (industry)**:
  - **Set globally**: use `* { box-sizing: border-box; }` for predictable sizing.
  - **Be consistent**: avoid mixing `content-box` and `border-box` without a clear reason.