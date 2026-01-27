# CSS Layout Essentials: Box Model, `box-sizing` e Flexbox (PT-BR/EN)

> Documento de referência focado em: **box model**, **`box-sizing`**, **Flexbox** e **padrões responsivos** usando apenas CSS.

---

## PT-BR

### Sumário
- 1) Reset mínimo + previsibilidade
- 2) Box Model (modelo de caixa)
- 3) `box-sizing` (por que quase sempre usar `border-box`)
- 4) Flexbox: conceitos, eixos e mental model
- 5) Propriedades do container (Flex Container)
- 6) Propriedades dos itens (Flex Items) + `flex` shorthand
- 7) Padrões práticos de layout com Flexbox
- 8) Responsividade “qualquer tela” (apenas CSS): toolbox e receitas
- 9) Debug/boas práticas

---

## 1) Reset mínimo + previsibilidade

### Reset recomendado (simples e “mercado”)
```css
/* Reset mínimo e previsível */
*,
*::before,
*::after {
  box-sizing: border-box;
}

* {
  margin: 0;
}

html, body {
  height: 100%;
}

body {
  line-height: 1.5;
  -webkit-font-smoothing: antialiased;
}

img, picture, video, canvas, svg {
  display: block;
  max-width: 100%;
}

input, button, textarea, select {
  font: inherit;
}
```

#### Dissecando cada keyword (seletores/pseudo-elementos/propriedades/valores)

**Seletores e pseudo-elementos**
- `*` (**seletor universal**): seleciona **todos** os elementos. Útil em resets; use com cuidado em CSS muito grande (custo de manutenção/performance marginal, mas geralmente ok).
- `::before` e `::after` (**pseudo-elementos**): criam “elementos” gerados pelo CSS como **primeiro** e **último filho** do elemento.
  - Regras importantes:
    - Para aparecerem, normalmente precisam de `content: ""` (não usado aqui porque o objetivo é **herdar `box-sizing`**; mesmo sem `content`, você garante que quando forem usados no projeto, já estarão com `border-box`).
    - O prefixo `::` é a forma moderna (o antigo `:` também funciona por compatibilidade).
- `*::before, *::after`: significa “o pseudo-elemento `::before/::after` de qualquer elemento”.

**Propriedades e valores do reset**
- `box-sizing: border-box;`: faz `width/height` incluírem `padding` e `border` (mais previsível para layout).
- `margin: 0;`: remove margens padrão do UA stylesheet (principalmente em `body`, headings, etc.).
- `height: 100%;` (em `html, body`): permite que componentes com `%` de altura tenham referência (ex.: layouts que dependem da altura da página).
- `line-height: 1.5;`: melhora legibilidade; valor **unitless** (sem unidade) é recomendado pois escala com `font-size`.
- `-webkit-font-smoothing: antialiased;`: propriedade **vendor-prefixed** (WebKit) para suavização de fonte em alguns contextos; efeito varia por SO/navegador.
- `display: block;` (em mídia): remove comportamento inline (que cria “gap” baseline) e facilita dimensionamento.
- `max-width: 100%;`: impede imagens/vídeos de ultrapassarem o container (responsivo por padrão).
- `font: inherit;`: shorthand que força campos de formulário a herdarem fonte do `body` (evita fonte “default” do sistema em inputs).

> Observação: `font: inherit` sobrescreve também `font-size`, `font-family`, `font-weight`, etc. porque `font` é shorthand.

---

## 2) Box Model (modelo de caixa)

Todo elemento é uma “caixa” com:
- **content**: conteúdo real
- **padding**: espaço interno
- **border**: borda
- **margin**: espaço externo

### Erro comum
Definir `width` e depois somar `padding`/`border` e “estourar” o layout.

#### Dissecando keywords do Box Model
- `width`/`height`: definem tamanho da caixa (como isso “conta” depende de `box-sizing`).
- `padding`: espaço interno (entra no cálculo total em `border-box`).
- `border`: borda (entra no cálculo total em `border-box`).
- `margin`: espaço externo (não entra no cálculo do tamanho da caixa; afeta espaçamento ao redor).

---

## 3) `box-sizing` (por que quase sempre usar `border-box`)

### `content-box` (padrão)
- `width/height` **não** inclui `padding`/`border`.
- Bom quando você quer que o “content” seja exato, mas exige mais conta mental.

### `border-box` (recomendado na maioria dos projetos)
- `width/height` **inclui** `padding`/`border`.
- Layouts ficam muito mais previsíveis.

### Exemplo objetivo
```css
.card-a {
  width: 240px;
  padding: 24px;
  border: 2px solid #333;
  box-sizing: content-box; /* total: 240 + 24 + 24 + 2 + 2 = 292px */
}

.card-b {
  width: 240px;
  padding: 24px;
  border: 2px solid #333;
  box-sizing: border-box; /* total: 240px */
}
```

#### Keywords e implicações
- `box-sizing: content-box` (padrão): `width/height` contam só o **content**; `padding/border` aumentam o total.
- `box-sizing: border-box`: `width/height` passam a ser o **tamanho final**; `padding/border` são “absorvidos” dentro dele.
- `px`: unidade absoluta (pixel CSS). Bom para bordas e ajustes finos; para tipografia/layout geralmente prefira `rem`, `%`, `clamp()`.

---

## 4) Flexbox: conceitos, eixos e mental model

### O que é
Flexbox é um modelo de layout **1D** (uma dimensão por vez):
- controla alinhamento e distribuição **em linha OU coluna**.

### Termos
- **Flex container**: elemento com `display: flex` (ou `inline-flex`)
- **Flex items**: filhos diretos do container

### Eixos
- **main axis**: direção definida por `flex-direction`
- **cross axis**: perpendicular ao main axis

### Direções (o que muda)
- `flex-direction: row` → main = horizontal, cross = vertical
- `flex-direction: column` → main = vertical, cross = horizontal

---

## 5) Propriedades do container (Flex Container)

```css
.container {
  display: flex;              /* ativa Flexbox */
  flex-direction: row;        /* row | column | row-reverse | column-reverse */
  flex-wrap: nowrap;          /* nowrap | wrap | wrap-reverse */
  justify-content: flex-start;/* alinha no main axis */
  align-items: stretch;       /* alinha no cross axis (1 linha) */
  align-content: stretch;     /* alinha linhas (só com wrap + múltiplas linhas) */
  gap: 12px;                  /* espaçamento entre itens */
}
```

#### Dissecando cada propriedade/keyword do container

**`display`**
- `flex`: ativa o contexto flex (container + items).
- (relacionado) `inline-flex`: mesma ideia, mas container “inline”.

**`flex-direction`**
- `row`: main axis horizontal (L→R em LTR).
- `row-reverse`: inverte o main axis (atenção: muda ordem visual, não muda DOM; cuidado com acessibilidade/leitura).
- `column`: main axis vertical.
- `column-reverse`: inverte vertical.

**`flex-wrap`**
- `nowrap`: itens tentam caber em **uma linha** (podem encolher).
- `wrap`: permite quebrar para múltiplas linhas.
- `wrap-reverse`: quebra invertendo a “ordem” das linhas no cross axis.

**`justify-content`** (main axis)
- `flex-start`: cola no início do eixo.
- `flex-end`: cola no final.
- `center`: centraliza.
- (não usado no snippet, mas comum) `space-between/around/evenly`: distribui espaço entre itens.

**`align-items`** (cross axis, por linha)
- `stretch` (padrão): estica itens para preencher a altura/largura no cross axis (se o item não tiver tamanho fixo).
- `flex-start`, `flex-end`, `center`, `baseline`: variações de alinhamento.

**`align-content`** (distribuição de **linhas**)
- Só tem efeito quando `flex-wrap: wrap` e existem **múltiplas linhas**.
- `stretch`: “puxa” as linhas para ocupar o espaço disponível.

**`gap`**
- Espaçamento **entre itens** (e entre linhas quando há wrap).
- `12px`: valor numérico em pixels.

---

## 6) Propriedades dos itens (Flex Items) + `flex` shorthand

```css
.item {
  order: 0;            /* ordem visual */
  flex-grow: 0;        /* quanto cresce */
  flex-shrink: 1;      /* quanto encolhe */
  flex-basis: auto;    /* tamanho base */
  align-self: auto;    /* sobrescreve align-items */
}
```

### `flex` shorthand
`flex: <grow> <shrink> <basis>`

Valores comuns:
- `flex: 1;` → `1 1 0%` (divide espaço igualmente; ignora tamanho do conteúdo como base)
- `flex: auto;` → `1 1 auto` (cresce/encolhe respeitando conteúdo)
- `flex: none;` → `0 0 auto` (fixo)

#### Dissecando cada propriedade/keyword dos itens
- `order`: controla a ordem visual (número menor vem antes). Use com parcimônia (pode confundir navegação por teclado/leitores).
- `flex-grow`: quanto o item cresce quando sobra espaço (0 = não cresce).
- `flex-shrink`: quanto encolhe quando falta espaço (1 = encolhe).
- `flex-basis`:
  - `auto`: base vem do tamanho do conteúdo/`width`/`flex-basis` efetivo.
  - `260px`: base fixa em pixels (no exemplo dos cards).
- `align-self`:
  - `auto`: herda `align-items` do container.
  - Pode ser `center`, `flex-start`, etc. para um item específico.

**`flex: 1 1 0%` e o `0%`**
- `0%` como basis significa “começa do zero” para dividir espaço; ajuda a uniformizar colunas mesmo com conteúdos diferentes.
- Alternativa: `flex: 1 1 auto` respeita mais o conteúdo como base.

### Exemplo didático (cards responsivos)
```css
.cards {
  display: flex;
  flex-wrap: wrap;
  gap: 16px;
}

.card {
  flex: 1 1 260px; /* base 260px, pode crescer e quebrar em múltiplas linhas */
  min-width: 220px;
}
```

---

## 7) Padrões práticos de layout com Flexbox

### 7.1 Centralização “perfeita”
```css
.center {
  display: flex;
  justify-content: center;
  align-items: center;
}
```

### 7.2 Navbar com item “empurrado” para a direita
```css
.nav {
  display: flex;
  align-items: center;
  gap: 12px;
}

.nav .spacer {
  margin-left: auto;
}
```

### 7.3 Layout com sidebar + conteúdo (colapsa no mobile)
```css
.layout {
  display: flex;
  gap: 16px;
}

.sidebar {
  flex: 0 0 280px; /* fixa em desktop */
}

.content {
  flex: 1 1 auto;
  min-width: 0; /* importante para evitar overflow de textos longos */
}

@media (max-width: 900px) {
  .layout {
    flex-direction: column;
  }
  .sidebar {
    flex-basis: auto;
  }
}
```

### 7.4 Sticky footer (rodapé no fim)
```css
body {
  min-height: 100vh;
  display: flex;
  flex-direction: column;
}

main {
  flex: 1;
}
```

#### Keywords específicas que aparecem nos padrões

**`margin-left: auto`**
- Em flex items, `auto` em margem absorve o espaço livre naquele lado, “empurrando” o item.

**`min-height: 100vh`**
- `vh` = viewport height (1vh = 1% da altura da viewport). `100vh` ocupa a altura total da tela (com nuances em mobile; browsers modernos melhoraram, mas pode haver variações).

**`min-width: 0` (muito importante)**
- Flex items têm `min-width: auto` por padrão, o que pode impedir encolhimento e causar overflow.
- `min-width: 0` permite que texto/children quebrem/encolham corretamente.

---

## 8) Responsividade “qualquer tela” (apenas CSS): toolbox e receitas

### 8.1 Abordagem (recomendado)
- **Mobile-first**: comece simples e expanda com `@media (min-width: ...)`
- Use tamanhos fluidos com `clamp()`, `%`, `vw`, `rem`
- Prefira layouts que “se resolvem sozinhos” com `flex-wrap`, `gap`, `min/max`

### 8.2 Tipografia fluida com `clamp()`
```css
:root {
  --step-0: clamp(1rem, 0.9rem + 0.5vw, 1.125rem);
  --step-1: clamp(1.25rem, 1.1rem + 1vw, 1.75rem);
}

body { font-size: var(--step-0); }
h1 { font-size: var(--step-1); }
```

### 8.3 Espaçamentos fluidos
```css
:root {
  --space-2: clamp(0.5rem, 0.3rem + 0.8vw, 1rem);
  --space-4: clamp(1rem, 0.6rem + 1.6vw, 2rem);
}
.section { padding: var(--space-4); }
```

### 8.4 “Grid de cards” altamente responsivo com Flexbox (sem media queries)
```css
.cards {
  display: flex;
  flex-wrap: wrap;
  gap: 16px;
}

.card {
  flex: 1 1 clamp(220px, 30vw, 360px);
}
```

### 8.5 Container Queries (quando a responsividade depende do tamanho do componente)
> Útil quando o componente aparece em colunas/sidebars diferentes.

```css
.component {
  container-type: inline-size;
}

.component__row {
  display: flex;
  gap: 12px;
  flex-wrap: wrap;
}

@container (min-width: 560px) {
  .component__row {
    flex-wrap: nowrap;
    align-items: center;
  }
}
```

### 8.6 Imagens responsivas (sem distorcer)
```css
.media {
  width: 100%;
  aspect-ratio: 16 / 9;
  overflow: hidden;
}

.media > img {
  width: 100%;
  height: 100%;
  object-fit: cover;
}
```

### 8.7 Evitando overflow (muito comum em flex)
- Use `min-width: 0` no item que deve poder encolher.
```css
.row { display: flex; gap: 12px; }
.row > .text { min-width: 0; } /* evita “estouro” por strings longas */
```

#### Dissecando keywords de responsividade (unidades, funções e at-rules)

**Unidades**
- `rem`: relativo ao `font-size` do elemento raiz (`html`). Bom para tipografia e espaçamentos escaláveis.
- `vw`: 1% da largura da viewport. Útil para escalas fluidas (use com `clamp()` para limitar).
- `%`: relativo ao elemento pai (contextual).
- `px`: absoluto (bom para bordas/detalhes).

**Função `clamp(min, ideal, max)`**
- Retorna um valor “travado” entre `min` e `max`, usando `ideal` como preferido.
- Ex.: `clamp(220px, 30vw, 360px)`:
  - nunca menor que 220px,
  - tenta ser 30vw,
  - nunca maior que 360px.

**At-rule `@media (max-width: 900px)`**
- Condicional baseada na viewport.
- `max-width`: aplica estilos quando a viewport tem largura **até** 900px.

**Container Queries**
- `container-type: inline-size;`: faz o elemento virar um “container” consultável pela sua **largura**.
- `@container (min-width: 560px)`: aplica estilos quando o **container** (não a viewport) tiver pelo menos 560px.
- Diferença chave vs `@media`: `@media` olha a tela; `@container` olha o componente.

**`aspect-ratio: 16 / 9`**
- Reserva proporção fixa (ótimo para evitar “layout shift”).
- `16 / 9` é uma razão (largura/altura).

**`overflow: hidden`**
- Corta o que extrapola a caixa (útil para imagens “cover”).
- Cuidado: pode esconder sombras/menus; use apenas quando for desejado.

**`object-fit: cover`**
- Para `<img>` com `width/height` definidos: preenche a caixa cortando excesso (mantém proporção).
- Alternativas: `contain` (não corta, pode sobrar espaço), `fill` (distorce).

---

## 9) Debug/boas práticas

- Sempre valide o eixo principal: `flex-direction`.
- Use `gap` em vez de margens em itens (mais previsível).
- Lembre de `min-width: 0` em itens flex que contêm texto.
- Para múltiplas linhas: `align-content` só funciona com `flex-wrap: wrap`.
- Em “componentes”: prefira container queries quando fizer sentido.

---

---

## EN

### Table of contents
- 1) Minimal reset + predictability
- 2) Box Model
- 3) `box-sizing` (why `border-box` is usually best)
- 4) Flexbox: concepts, axes, mental model
- 5) Container properties
- 6) Item properties + `flex` shorthand
- 7) Practical layout patterns
- 8) “Any screen” responsiveness (CSS-only): toolbox + recipes
- 9) Debug/best practices

---

## 1) Minimal reset + predictability

```css
/* Minimal, predictable reset */
*,
*::before,
*::after {
  box-sizing: border-box;
}

* {
  margin: 0;
}

html, body {
  height: 100%;
}

body {
  line-height: 1.5;
  -webkit-font-smoothing: antialiased;
}

img, picture, video, canvas, svg {
  display: block;
  max-width: 100%;
}

input, button, textarea, select {
  font: inherit;
}
```

#### Dissecting every keyword (selectors/pseudo-elements/properties/values)

**Selectors & pseudo-elements**
- `*` (**universal selector**): targets **all** elements.
- `::before` / `::after` (**pseudo-elements**): generated boxes inserted as first/last child.
  - Key rules:
    - They usually need `content: ""` to render.
    - Using `::` is the modern syntax (legacy `:` still works).
- `*::before, *::after`: “the before/after pseudo-element of any element”.

**Reset properties/values**
- `box-sizing: border-box;`: width/height include padding/border → predictable layouts.
- `margin: 0;`: removes user-agent default margins.
- `height: 100%;` on `html, body`: enables percentage-based heights downstream.
- `line-height: 1.5;`: unitless line-height scales with font-size.
- `-webkit-font-smoothing: antialiased;`: vendor-prefixed smoothing; effect depends on platform.
- `display: block;` on media: avoids inline baseline gaps, easier sizing.
- `max-width: 100%;`: prevents overflow beyond container.
- `font: inherit;`: shorthand forcing form controls to inherit typography from parent.

---

## 2) Box Model

Every element is a box with:
- **content**
- **padding**
- **border**
- **margin**

Common pitfall: setting `width` and then “adding” padding/border causing overflow.

#### Box Model keywords
- `width/height`, `padding`, `border`, `margin`: how the box is measured and spaced (depends on `box-sizing`).

---

## 3) `box-sizing`

### `content-box` (default)
- `width/height` exclude `padding`/`border`.

### `border-box` (recommended)
- `width/height` include `padding`/`border`.

```css
.card-a {
  width: 240px;
  padding: 24px;
  border: 2px solid #333;
  box-sizing: content-box; /* total becomes 292px */
}

.card-b {
  width: 240px;
  padding: 24px;
  border: 2px solid #333;
  box-sizing: border-box; /* total stays 240px */
}
```

#### Keywords & implications
- `content-box` (default): width/height = content only.
- `border-box`: width/height = final box size (includes padding/border).
- `px`: absolute CSS pixel; best for borders/fine-tuning.

---

## 4) Flexbox: concepts, axes, mental model

Flexbox is a **1D** layout model:
- it distributes and aligns items in a **row OR column**.

- **Flex container**: `display: flex` / `inline-flex`
- **Flex items**: direct children

Axes:
- **main axis**: driven by `flex-direction`
- **cross axis**: perpendicular to main axis

---

## 5) Container properties

```css
.container {
  display: flex;              /* ativa Flexbox */
  flex-direction: row;        /* row | column | row-reverse | column-reverse */
  flex-wrap: nowrap;          /* nowrap | wrap | wrap-reverse */
  justify-content: flex-start;/* alinha no main axis */
  align-items: stretch;       /* alinha no cross axis (1 linha) */
  align-content: stretch;     /* alinha linhas (só com wrap + múltiplas linhas) */
  gap: 12px;                  /* espaçamento entre itens */
}
```

#### Dissecting each container property/keyword
- `flex-direction`: `row | row-reverse | column | column-reverse`
- `flex-wrap`: `nowrap | wrap | wrap-reverse`
- `justify-content`: aligns along main axis (`flex-start`, `center`, etc.)
- `align-items`: aligns items along cross axis (`stretch`, etc.)
- `align-content`: aligns lines (wrap + multiple lines only)
- `gap`: spacing between items/lines

---

## 6) Item properties + `flex` shorthand

```css
.item {
  order: 0;            /* ordem visual */
  flex-grow: 0;        /* quanto cresce */
  flex-shrink: 1;      /* quanto encolhe */
  flex-basis: auto;    /* tamanho base */
  align-self: auto;    /* sobrescreve align-items */
}
```

### `flex` shorthand
`flex: <grow> <shrink> <basis>`

Valores comuns:
- `flex: 1;` → `1 1 0%` (divide espaço igualmente; ignora tamanho do conteúdo como base)
- `flex: auto;` → `1 1 auto` (cresce/encolhe respeitando conteúdo)
- `flex: none;` → `0 0 auto` (fixo)

#### Dissecting item properties/keywords
- `order`, `flex-grow`, `flex-shrink`, `flex-basis`, `align-self`
- Why `min-width: 0` matters for shrinking text in flex items
- Meaning of `flex: 1 1 0%` vs `flex: 1 1 auto`

### Exemplo didático (cards responsivos)
```css
.cards {
  display: flex;
  flex-wrap: wrap;
  gap: 16px;
}

.card {
  flex: 1 1 260px; /* base 260px, pode crescer e quebrar em múltiplas linhas */
  min-width: 220px;
}
```

---

## 7) Practical layout patterns

Centered:
```css
.center {
  display: flex;
  justify-content: center;
  align-items: center;
}
```

Navbar with “push” item:
```css
.nav {
  display: flex;
  align-items: center;
  gap: 12px;
}

.nav .spacer {
  margin-left: auto;
}
```

Sidebar + content (collapses on mobile):
```css
.layout {
  display: flex;
  gap: 16px;
}

.sidebar {
  flex: 0 0 280px; /* fixa em desktop */
}

.content {
  flex: 1 1 auto;
  min-width: 0; /* importante para evitar overflow de textos longos */
}

@media (max-width: 900px) {
  .layout {
    flex-direction: column;
  }
  .sidebar {
    flex-basis: auto;
  }
}
```

Sticky footer:
```css
body {
  min-height: 100vh;
  display: flex;
  flex-direction: column;
}

main {
  flex: 1;
}
```

#### Keywords específicas que aparecem nos padrões

**`margin-left: auto`**
- Em flex items, `auto` em margem absorve o espaço livre naquele lado, “empurrando” o item.

**`min-height: 100vh`**
- `vh` = viewport height (1vh = 1% da altura da viewport). `100vh` ocupa a altura total da tela (com nuances em mobile; browsers modernos melhoraram, mas pode haver variações).

**`min-width: 0` (muito importante)**
- Flex items têm `min-width: auto` por padrão, o que pode impedir encolhimento e causar overflow.
- `min-width: 0` permite que texto/children quebrem/encolham corretamente.

---

## 8) “Any screen” responsiveness (CSS-only)

Recommended approach:
- Mobile-first
- Use fluid sizing (`clamp()`, `%`, `vw`, `rem`)
- Prefer self-adjusting layouts (`flex-wrap`, `gap`, `min/max`)

Fluid type:
```css
:root {
  --step-0: clamp(1rem, 0.9rem + 0.5vw, 1.125rem);
  --step-1: clamp(1.25rem, 1.1rem + 1vw, 1.75rem);
}
body { font-size: var(--step-0); }
h1 { font-size: var(--step-1); }
```

Flexbox “card grid” without media queries:
```css
.cards {
  display: flex;
  flex-wrap: wrap;
  gap: 16px;
}

.card {
  flex: 1 1 clamp(220px, 30vw, 360px);
}
```

Container queries:
```css
.component {
  container-type: inline-size;
}

.component__row {
  display: flex;
  gap: 12px;
  flex-wrap: wrap;
}

@container (min-width: 560px) {
  .component__row {
    flex-wrap: nowrap;
    align-items: center;
  }
}
```

Responsive images:
```css
.media {
  width: 100%;
  aspect-ratio: 16 / 9;
  overflow: hidden;
}

.media > img {
  width: 100%;
  height: 100%;
  object-fit: cover;
}
```

Avoiding overflow in flex:
```css
.row { display: flex; gap: 12px; }
.row > .text { min-width: 0; }
```

#### Dissecting responsiveness keywords (units/functions/at-rules)
- Units: `rem`, `vw`, `%`, `px`
- `clamp(min, preferred, max)`
- `@media (max-width: ...)`
- `container-type: inline-size` + `@container (min-width: ...)`
- `aspect-ratio`, `overflow: hidden`, `object-fit: cover`

---

## 9) Debug/best practices

- Always confirm `flex-direction` first (it defines the main axis).
- Prefer `gap` over item margins.
- Use `min-width: 0` on flex items that must shrink.
- `align-content` only matters with wrapping + multiple lines.
- Consider container queries for component-driven responsiveness.

---
